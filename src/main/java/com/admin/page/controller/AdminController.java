package com.admin.page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admin.page.payload.RegistrationRequest;
import com.admin.page.service.AdminService;


@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	RestTemplate restTemplate = new RestTemplate();
	String adminurlString="http://localhost:9999/";
	
//	@GetMapping("/adminHome")
//	public String adminHomePage() {
//		String urlString=adminurlString+"adminPage";
//		ResponseEntity<String> adminEntity=restTemplate.getForEntity(urlString, String.class);
//		System.out.println("ad control");
//		return adminEntity.getBody();
//	}
	
//	@GetMapping("/adminDataPage")
//	public String adminDataPage() {
//	String urlString="http://localhost:8888/adminDataPage";
//		ResponseEntity<String> adminEntity= restTemplate.getForEntity(urlString, String.class);
//		return adminEntity.getBody();
//	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<RegistrationRequest>> getallEmployees(){
		System.out.println("Original service--->"+adminService.getRegistrations());
		return new ResponseEntity<List<RegistrationRequest>>(adminService.getRegistrations(), HttpStatus.OK);
	}
}
