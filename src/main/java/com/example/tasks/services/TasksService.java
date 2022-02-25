package com.example.tasks.services;

import com.example.tasks.dtos.TasksResponseDto;
import com.example.tasks.models.Task;
import com.example.tasks.repositories.TasksRepository;
import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TasksService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TasksRepository tasksRepository;

    public ArrayList<TasksResponseDto> getAll() {
        return (ArrayList<TasksResponseDto>) tasksRepository.findAll().stream().map(task -> modelMapper.map(task, TasksResponseDto.class)).collect(Collectors.toList());
    }

    public TasksResponseDto getById(int id){
        Task task = tasksRepository.findById(id).get();

        TasksResponseDto tasksResponseDto = modelMapper.map(task, TasksResponseDto.class);

        return tasksResponseDto;
    }

    public void deleteById(int id) {
        tasksRepository.deleteById(id);
    }
}
