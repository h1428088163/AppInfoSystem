package cn.appsys.dao;

import java.util.List;

import cn.appsys.pojo.DevUser;

/**
 * 开发者用户DAO层
 * @author lenovo
 *
 */
public interface DevUserMapper {
	/**
	 * 获取开发者用户列表(登录)
	 * @param user
	 * @return
	 */
	public List<DevUser> getDevUserList();
	/**
	 * 增加开发者用户(注册)
	 * @param user
	 * @return
	 */
	public Integer addDevUser(DevUser devuser);
	/**
	 * 根据ID查询开发者用户
	 * @param id
	 * @return
	 */
	public DevUser getDevUserById(Integer id);
}
