package com.example.tasks.controllers;

import com.example.tasks.dtos.response.TasksListResponseDto;
import com.example.tasks.dtos.response.TasksResponseDto;
import com.example.tasks.services.TasksService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/tasks", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class TasksController {
    @Autowired
    private TasksService tasksService;

    @GetMapping(value = "/getAll")
    public TasksListResponseDto getAll() {
        return tasksService.getAll();
    }

    @GetMapping(value = "/getById/{id}")
    public TasksResponseDto getById(@PathVariable int id) {
        return tasksService.getById(id);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) { tasksService.deleteById(id); }
}
