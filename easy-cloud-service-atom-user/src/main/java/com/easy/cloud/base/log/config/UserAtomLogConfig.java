package com.easy.cloud.base.log.config;

import org.springframework.stereotype.Component;

import com.dq.easy.cloud.model.common.log.config.DqLogConfig;
import com.easy.cloud.controller.UserController;

/**
 * 用户原子服务日志配置类
 * @author daiqi
 * @date 2018年2月21日 下午4:15:33
 */
@Component
public class UserAtomLogConfig extends DqLogConfig{
	static{
		setLogSwitchFlag(false, UserController.class.getName());
	}
}