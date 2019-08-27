package cn.appsys.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.appsys.dao.BackendUserMapper;
import cn.appsys.pojo.BackendUser;
/**
 * 后台用户Service实现层
 * @author lenovo
 *
 */
@Service("backendUserService")
@Transactional
public class BackendUserServiceImpl implements BackendUserService{
	/**
	 * 获取后台用户Mapper
	 */
	@Resource
	private BackendUserMapper backendUserMapper;
	/**
	 * 获取后台用户列表(登录)
	 */
	@Override
	public List<BackendUser> getBackendUserList() {
		return backendUserMapper.getBackendUserList();
	}
	/**
	 * 增加后台用户(注册)
	 */
	@Override
	public Integer addBackendUser(BackendUser backendUser) {
		return backendUserMapper.addBackendUser(backendUser);
	}
	/**
	 * 根据ID查询后台用户
	 */
	@Override
	public BackendUser getBackendUserById(Integer id) {
		return backendUserMapper.getBackendUserById(id);
	}

}
