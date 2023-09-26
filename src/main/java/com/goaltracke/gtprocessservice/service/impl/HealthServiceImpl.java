package com.goaltracke.gtprocessservice.service.impl;

import org.springframework.stereotype.Service;

import com.goaltracke.gtprocessservice.service.HealthService;

@Service
public class HealthServiceImpl implements HealthService {

	@Override
	public boolean serviceStatus() {
		return true;
	}

}
