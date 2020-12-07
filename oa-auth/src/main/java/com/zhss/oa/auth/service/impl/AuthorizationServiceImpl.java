package com.zhss.oa.auth.service.impl;

import com.zhss.oa.auth.mapper.AuthorizationMapper;
import com.zhss.oa.auth.model.Authorization;
import com.zhss.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorizationService")  
public class AuthorizationServiceImpl implements AuthorizationService {

	@Autowired
	private AuthorizationMapper authorizationMapper;
	
	public void authorize(Authorization auth) {
		System.out.println("ft/001");
		authorizationMapper.authorize(auth);
	}

	public void unauthorize(Long id) {
		authorizationMapper.unauthorize(id);
		System.out.println("");
		System.out.println("unauthorized...");
		System.out.println("another line...");
		authorizationMapper.unauthorize(id);
	}

	public Authorization findById(Long id) {
		return authorizationMapper.findById(id);
	}

}
