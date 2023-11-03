package com.goaltracke.gtprocessservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "goal")
public class Goal extends BaseEntity {

	@Column
	private String name;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "target_position")
	private String targetPosition;

	@Column(name = "start_position")
	private String startPosition;

	@Column(name = "checkpoint_habit")
	private String checkpointHabit;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ToString.Exclude
	private List<GoalStatus> goalStatus;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Goal goal = (Goal) o;
		return getId() != null && Objects.equals(getId(), goal.getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
