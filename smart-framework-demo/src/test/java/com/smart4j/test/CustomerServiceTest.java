package com.smart4j.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import com.smart4j.framework.helper.DatabaseHelper;
import com.smart4j.framework.utils.ClassUtil;

//import com.liugw.learn.helper.DatabaseHelper;

public class CustomerServiceTest {

	@Test
	public void init() throws Exception {
		String file = "sql/customer_init.sql";
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));

		String sql;
		while ((sql = reader.readLine()) != null) {
			System.out.println(sql);
			DatabaseHelper.executeUpdate(sql);
		}

	}

	@Test
	public void testClassUtil() {
		ClassUtil.getClassSet("com.liugw.learn.pojo");
		ClassUtil.getClassSet("org.junit");
	}
}
