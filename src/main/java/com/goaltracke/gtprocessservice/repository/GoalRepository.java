package com.goaltracke.gtprocessservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goaltracke.gtprocessservice.entity.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, String> {

}
