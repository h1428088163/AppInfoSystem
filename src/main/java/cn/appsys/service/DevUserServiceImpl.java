package cn.appsys.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.appsys.dao.DevUserMapper;
import cn.appsys.pojo.DevUser;
/**
 * 开发者用户Service实现层
 * @author lenovo
 *
 */
@Service("devUserService")
@Transactional
public class DevUserServiceImpl implements DevUserService {
	/**
	 * 获取DevUserMapper
	 */
	@Resource
	private DevUserMapper devUserMapper;
	/**
	 * 获取开发者用户列表(登录)
	 */
	@Override
	public List<DevUser> getDevUserList() {
		return devUserMapper.getDevUserList();
	}
	/**
	 * 增加开发者用户(注册)
	 */
	@Override
	public Integer addDevUser(DevUser devUser) {
		return devUserMapper.addDevUser(devUser);
	}
	/**
	 * 根据ID查询开发者用户
	 */
	@Override
	public DevUser getDevUserById(Integer id) {
		return devUserMapper.getDevUserById(id);
	}

}
