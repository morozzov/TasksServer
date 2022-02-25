package com.example.tasks.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class TasksListResponseDto {
    ArrayList<TasksResponseDto> tasksList;
}
