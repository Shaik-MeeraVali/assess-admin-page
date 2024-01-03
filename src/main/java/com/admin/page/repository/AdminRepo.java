package com.admin.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.page.payload.RegistrationRequest;

public interface AdminRepo extends JpaRepository<RegistrationRequest, Integer>{

}
