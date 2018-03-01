package com.phun.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface IService {
	
	public default String sayThis(String saying) {
		return "From the Iservice, I am saying  + " + saying;
	}

}
