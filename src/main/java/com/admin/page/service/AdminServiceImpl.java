package com.admin.page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.page.payload.RegistrationRequest;
import com.admin.page.repository.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepo adminRepo;

	@Override
	public List<RegistrationRequest> getRegistrations() {
		return adminRepo.findAll();
	}
	
	

}
