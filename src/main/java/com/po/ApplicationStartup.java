package com.po;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.po.common.Constants;
import com.po.model.User;


@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent>  {

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		
	}
	 
}
