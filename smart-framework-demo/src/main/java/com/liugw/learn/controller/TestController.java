package com.liugw.learn.controller;

import com.smart4j.framework.annotation.Action;
import com.smart4j.framework.annotation.Controller;
import com.smart4j.framework.beans.Data;
import com.smart4j.framework.beans.View;

@Controller
public class TestController {

	static {
		System.out.println("Load Class : TestController");
	}

	public TestController() {
		System.out.println("TestController --- create instance!");
	}

	@Action(value = "get:/hello")
	public Data hello() {
		Data result = new Data("Hello world");
		return result;
	}

	@Action(value = "get:/hello1")
	public Data hello(String aaa) {
		Data result = new Data("Hello " + aaa);
		return result;
	}

	@Action(value = "get:/index")
	public View toIndex() {
		View view = new View("index.jsp");
		return view;
	}
}
