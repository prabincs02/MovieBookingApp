package com.example.prabin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prabin.dto.RegisterRequestDTO;
import com.example.prabin.entity.User;
import com.example.prabin.service.AuthService;

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

	@Autowired
	private AuthService authService;
	
	@PostMapping("/registeradminuser")
	public ResponseEntity<User> registerAdminUser(@RequestBody RegisterRequestDTO registerRequestDTO) {

		return ResponseEntity.ok(authService.registerAdminUser(registerRequestDTO));
	}
	
}
