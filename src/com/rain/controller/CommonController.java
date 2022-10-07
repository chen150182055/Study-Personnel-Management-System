package com.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 为什么使用基于注解的控制器
 * 1.在基于注解的控制器类中可以编写多个处理方法，进而可以处理多个请求（动作），这就允许将相关的操作编写在同一个控制器类中，从而减少控制器类的数量，方便以后维护。
 * 2.基于注解的控制器不需要在配置文件中部署映射，仅需要使用 @RequestMapping 注解一个方法进行请求处理即可。
 */
@Controller  //该注解用于声明某类的实例是一个控制器。
public class CommonController {
	@RequestMapping(value="/{formName}")  //一个控制器内有多个处理请求的方法，
											//如 UserController 里通常有增加用户、修改用户信息、删除指定用户、
											//根据条件获取用户列表等。每个方法负责不同的请求操作，而 @RequestMapping
											//就负责将请求映射到对应的控制器方法上
	 public String loginForm(@PathVariable String formName){
		// 作为一个空方法，可以匹配任何无效输入，再跳转到404
		return formName;
//		String blank = "blank";
//		return blank;
	}
	
	@RequestMapping(value="/")
	 public String index(){
		String blank = "index";
		return blank;
	}
	@RequestMapping(value="/welcome")
	 public String welcome(){
		String blank = "welcome";
		return blank;
	}
}
