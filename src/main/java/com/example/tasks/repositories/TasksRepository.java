package com.example.tasks.repositories;

import com.example.tasks.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Task, Integer> {
}
