package com.maple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.AutowireCandidateQualifier;
import org.springframework.stereotype.Component;

/**
 * Created by cswang on 2020/9/23
 */
@Component()
public class A {
	//	@Autowired
	X x;

	public void setX(X x) {
		System.out.println("set x");
		this.x = x;
	}

	public A() {
		System.out.println("no arg");
	}

	public A(X x) {
		System.out.println("x");
		System.out.printf("x = %s %n", x.toString());
	}

	public A(X x1, Y y1) {
		System.out.println("xy");
		System.out.printf("x = %s %n", x1.toString());
		System.out.printf("y = %s %n", y1.toString());
	}
}
