package com.phun.interfaces;

import javax.jws.WebService;

@WebService
public interface IHelloWorld {

	public String sayHi(String text);

}
