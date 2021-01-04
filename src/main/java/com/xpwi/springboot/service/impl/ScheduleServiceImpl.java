package com.xpwi.springboot.service.impl;

import com.xpwi.springboot.dao.ScheduleDao;
import com.xpwi.springboot.dao.ScheduleUserDao;
import com.xpwi.springboot.dto.ScheduleParam;
import com.xpwi.springboot.mbg.mapper.ScheduleMapper;
import com.xpwi.springboot.mbg.mapper.ScheduleUserMapper;
import com.xpwi.springboot.mbg.model.Schedule;
import com.xpwi.springboot.mbg.model.ScheduleExample;
import com.xpwi.springboot.mbg.model.ScheduleUser;
import com.xpwi.springboot.mbg.model.ScheduleUserExample;
import com.xpwi.springboot.service.QueueService;
import com.xpwi.springboot.service.ScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;


@Service
public class ScheduleServiceImpl implements ScheduleService {

    Logger logger = LoggerFactory.getLogger(ScheduleServiceImpl.class);

    @Resource
    private ScheduleMapper scheduleMapper;
    @Resource
    private ScheduleDao scheduleDao;
    @Resource
    private ScheduleUserDao scheduleUserDao;
    @Resource
    private ScheduleUserMapper scheduleUserMapper;
    @Resource
    private QueueService queueService;

    /**
     * 1:普通日程  2：会议日程 3：重复每日 4:每周重复 5：每月重复
     * @param schedule
     * @return
     */
    @Override
    public int createSchedule(ScheduleParam schedule) {

        //TODO 添加通知,会议室占用
        List<Schedule> listSchedule = new ArrayList<>();
        int repeatNum = schedule.getRepeatNum();
        int maxEndUnix = schedule.getEndUnix();
        if (schedule.getType() >= 3) {
            String uuid = UUID.randomUUID().toString();
            for (int i = 0;i < repeatNum;i++) {
                Schedule schedule1 = new Schedule();
                BeanUtils.copyProperties(schedule,schedule1);
                switch (schedule.getType()) {
                    case 3: {
                        schedule1.setBeginUnix(schedule.getBeginUnix() + i * 86400);
                        schedule1.setEndUnix(schedule.getEndUnix() + i * 86400);
                        break;
                    }
                    case 4: {
                        schedule1.setBeginUnix(schedule.getBeginUnix() + i * 7 * 86400);
                        schedule1.setEndUnix(schedule.getEndUnix() + i * 7 * 86400);
                        break;
                    }
                    case 5: {
                        schedule1.setBeginUnix(schedule.getBeginUnix() + i * 30 * 86400);
                        schedule1.setEndUnix(schedule.getEndUnix() + i * 30 * 86400);
                        break;
                    }
                }
                schedule1.setRepeatUuid(uuid);
                schedule1.setLaunchUid(1);
                listSchedule.add(schedule1);
                maxEndUnix = schedule1.getEndUnix();
            }
        }else {
            Schedule schedule1 = new Schedule();
            BeanUtils.copyProperties(schedule,schedule1);
            schedule1.setLaunchUid(1);
            schedule1.setRepeatUuid("");
            listSchedule.add(schedule1);
        }
        logger.info("createSchedule_schedule",listSchedule);
        scheduleDao.insertSchedules(listSchedule);

        queueService.AddMessage(listSchedule);
        List<ScheduleUser> scheduleUsers = new ArrayList<>();
        for ( Schedule sc : listSchedule ) {
            for (Integer uid : schedule.getNotifyUsers()) {
                ScheduleUser scheduleUser = new ScheduleUser();
                scheduleUser.setsId(sc.getId());
                scheduleUser.setBeginUnix(schedule.getBeginUnix());
                scheduleUser.setUserId(uid);
                scheduleUser.setEndUnix(maxEndUnix);

                scheduleUsers.add(scheduleUser);
            }
        }
        logger.info("createSchedule_scheduleUser",listSchedule);
        return scheduleUserDao.insertScheduleUsers(scheduleUsers);
    }

    @Override
    public List<Schedule> getSchedule(int beginUnix, int endUnix, List<Integer> uids) {

        ScheduleUserExample scheduleUserExample = new ScheduleUserExample();
        scheduleUserExample.createCriteria().andUserIdIn(uids).andBeginUnixBetween(beginUnix,endUnix).andIsDeletedEqualTo(false);
        List<ScheduleUser>  retBegin  = scheduleUserMapper.selectByExample(scheduleUserExample);
        scheduleUserExample.clear();

        scheduleUserExample.createCriteria().andUserIdIn(uids).andEndUnixBetween(beginUnix,endUnix).andIsDeletedEqualTo(false);
        List<ScheduleUser>  retEnd  = scheduleUserMapper.selectByExample(scheduleUserExample);

        Set<Integer> scheduleIds = new HashSet<>();
        for (ScheduleUser u : retBegin) {
            scheduleIds.add(u.getsId());
        }
        for (ScheduleUser u : retEnd) {
            scheduleIds.add(u.getsId());
        }
        ScheduleExample scheduleExample = new ScheduleExample();
        scheduleExample.createCriteria().andIdIn(new ArrayList<>(scheduleIds)).andIsDeletedEqualTo(false);
        return scheduleMapper.selectByExample(scheduleExample);
    }

    @Override
    public int ScheduleDetail(int scheduleId) {
        return 0;
    }

    @Override
    public int ScheduleDelete(int scheduleId) {

        ScheduleUserExample scheduleUserExample = new ScheduleUserExample();
        scheduleUserExample.createCriteria().andSIdEqualTo(scheduleId);
        ScheduleUser scheduleUser = new ScheduleUser();
        scheduleUser.setIsDeleted(true);
        scheduleUserMapper.updateByExample(scheduleUser,scheduleUserExample);


        Schedule s = new Schedule();
        s.setIsDeleted(true);
        s.setId(scheduleId);
        return scheduleMapper.updateByPrimaryKey(s);
    }
}
