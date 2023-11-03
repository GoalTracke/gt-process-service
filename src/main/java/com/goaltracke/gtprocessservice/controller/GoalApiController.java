package com.goaltracke.gtprocessservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goaltracke.gtprocessservice.dto.GoalDto;
import com.goaltracke.gtprocessservice.service.GoalService;

@RestController
@RequestMapping("/goals")
public class GoalApiController {

	private final GoalService goalService;

	public GoalApiController(GoalService goalService) {
		this.goalService = goalService;
	}

	@GetMapping()
	public List<GoalDto> getGoals() {
		return goalService.getGoals();
	}

	@PostMapping()
	public GoalDto insert(@RequestBody GoalDto goal) {
		return goalService.createGoal(goal);
	}
}
