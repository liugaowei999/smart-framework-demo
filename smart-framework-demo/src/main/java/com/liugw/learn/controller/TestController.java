package com.liugw.learn.controller;

import com.smart4j.framework.annotation.Action;
import com.smart4j.framework.annotation.Controller;

@Controller
public class TestController {

	static {
		System.out.println("Load Class : TestController");
	}

	public TestController() {
		System.out.println("TestController --- create instance!");
	}

	@Action(value = "get:/hello")
	public String hello() {
		return "hello world";
	}
}
