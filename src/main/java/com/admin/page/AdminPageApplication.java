package com.admin.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminPageApplication.class, args);
	}

}
