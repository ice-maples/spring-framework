package com.maple.test;

import com.maple.config.AppConfig;
import com.maple.service.B;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by cswang on 2020/9/28
 */
public class BeanDefinitionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(B.class);
		bd.setScope("singleton");
		ac.registerBeanDefinition("xxx", bd);
		ac.refresh();
		/**
		 * spring 容器
		 *
		 * 1.扫描
		 * 2.解析 parse
		 * 3.验证 validate
		 * 4.life
		 */

		B bean = ac.getBean(B.class);
		System.out.println(bean.toString());

	}
}
