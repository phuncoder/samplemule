package com.phun.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import com.phun.interfaces.IHelloWorld;
import com.phun.interfaces.IService;

@WebService
public class HelloWorldImpl implements IHelloWorld {
	
	@Autowired
	IService service;

	@Override
	public String sayHi(String text) {
		return this.service.sayThis(text);
		
	}
}
