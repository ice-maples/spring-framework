package com.maple.service;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by cswang on 2020/6/22
 */
@Component
public class BeanService {
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
