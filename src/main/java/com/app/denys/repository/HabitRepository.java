package com.app.denys.repository;

import com.app.denys.model.Habit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {

}
