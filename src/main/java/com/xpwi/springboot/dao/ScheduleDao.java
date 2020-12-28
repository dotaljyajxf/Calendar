package com.xpwi.springboot.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScheduleDao {

    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getScheduleList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
