package com.goaltracke.gtprocessservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.goaltracke.gtprocessservice.dto.GoalDto;
import com.goaltracke.gtprocessservice.entity.Goal;
import com.goaltracke.gtprocessservice.repository.GoalRepository;
import com.goaltracke.gtprocessservice.service.GoalService;

@Service
public class GoalServiceImpl implements GoalService {

	private final GoalRepository goalRepository;

	public GoalServiceImpl(GoalRepository goalRepository) {
		this.goalRepository = goalRepository;
	}

	@Override
	public List<GoalDto> getGoals() {
		List<Goal> goals = goalRepository.findAll();

		return goals.stream().map(GoalDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public GoalDto createGoal(GoalDto goalDto) {
		Goal goal = goalDto.toEntity();
		Goal responseGoal = goalRepository.save(goal);
		return GoalDto.fromEntity(responseGoal);
	}

}
