package com.liugw.learn.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smart4j.framework.annotation.Aspect;
import com.smart4j.framework.annotation.Controller;
import com.smart4j.framework.proxy.AspectProxy;

/**
 * 拦截 Controller �?有方�? 只需要实现before与after方法，就可以在目标方法执行前后添加其他需�? 执行的代码了
 * 
 * @author liugaowei
 *
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

	private long begin;

	@Override
	public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
		LOGGER.debug("---------------- begin --------------------");
		LOGGER.debug(String.format("class: %s", cls.getName()));
		LOGGER.debug(String.format("method: %s", method.getName()));
		begin = System.currentTimeMillis();
	}

	@Override
	public void after(Class<?> cls, Method method, Object[] params) throws Throwable {
		LOGGER.debug(String.format("time: %d ms", System.currentTimeMillis() - begin));
		LOGGER.debug("----------------  end  --------------------");
	}

}
