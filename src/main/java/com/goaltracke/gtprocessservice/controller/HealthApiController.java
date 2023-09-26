package com.goaltracke.gtprocessservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goaltracke.gtprocessservice.service.HealthService;

@RestController
public class HealthApiController {

	private HealthService healthService;

	public HealthApiController(HealthService healthService) {
		this.healthService = healthService;
	}

	@GetMapping("/health")
	public Boolean serviceStatus() {
		return healthService.serviceStatus();
	}
}
