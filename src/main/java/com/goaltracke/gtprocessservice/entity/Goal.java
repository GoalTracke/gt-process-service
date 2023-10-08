package com.goaltracke.gtprocessservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "goal")
public class Goal {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;

	@Column
	private String name;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "progress_range")
	private String progressRange;

	@Column(name = "update_type")
	private String updateType;

	@Column(name = "current_status")
	private String currentStatus;

	@Column(name = "created_at")
	@CreationTimestamp
	private Date createdAt;

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
