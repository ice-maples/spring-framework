package com.maple.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cswang on 2020/6/14
 */
@Configuration
@ComponentScan("com.maple")
//@ImportResource("classpath:spring.xml")
public class AppConfig {

//	ClassPathXmlApplicationContext cc =
//			// 这里我们通过xml配置实例化一个容器
//			new ClassPathXmlApplicationContext("classpath:application.xml");
//	MyServiceImpl luBan = (MyServiceImpl) cc.getBean("myServiceImpl");

}
