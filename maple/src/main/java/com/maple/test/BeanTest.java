package com.maple.test;

import com.maple.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cswang on 2020/6/14
 */
public class BeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		System.out.println("哈哈哈哈");
		System.out.println("哈哈哈哈");
		ac.register(AppConfig.class);
		ac.refresh();
	}
}
