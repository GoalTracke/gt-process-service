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
@Table(name = "goal_status")
public class GoalStatus extends BaseEntity {

    @Column(name = "cycle_period")
    private int cyclePeriod;

    @Column(name = "progress_update")
    private String progressUpdate;

    @Column(name = "last_position")
    private String lastPosition;

    private int version;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GoalStatus that = (GoalStatus) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
