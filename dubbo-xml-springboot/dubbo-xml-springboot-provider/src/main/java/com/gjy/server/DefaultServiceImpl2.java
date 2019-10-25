package com.gjy.server;

import com.gjy.service.DefaultApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("defaultService2")
public class DefaultServiceImpl2 implements DefaultApiService{

	public String defaultMethod(String str) {
		return "hello  2.0 "+str;
	}
}
