package cn.appsys.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appsys.service.DevUserService;

/**
 * 开发者用户控制器
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/dev/index")
public class DevUserController {
	/**
	 * 打印日志文件
	 */
	private Logger log=Logger.getLogger(DevUserController.class);
	/**
	 * 获取开发者用户服务DevUserService
	 */
	@Resource
	private DevUserService devUserService;
	
	@RequestMapping(value="/index")
	public String index(){
		log.info("正在跳转至首页页面..");
		return "dev/index";
	}
	
	
	
}
