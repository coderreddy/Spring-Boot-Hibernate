package com.kris.aggregator.orm;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Resource
	private DaoImpl impl;
	
	@RequestMapping("/getUsers")
	public String getUsers(int id)
	{
		Users user = impl.getUser(id);
		return user.toString();
	}
	
	@RequestMapping("/getAddress")
	public String getAddress(int id)
	{
		Address adr = impl.getAddress(id);
		return adr.toString();
	}

}
