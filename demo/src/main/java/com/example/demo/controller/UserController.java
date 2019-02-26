package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.User;

@Controller
public class UserController {

	@RequestMapping
	@ResponseBody
	public User hello() {
	User u=new User();
	u.setName("imooc222");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc11");
		return u;
	}
}
