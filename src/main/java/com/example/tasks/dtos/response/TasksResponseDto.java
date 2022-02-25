package com.example.tasks.dtos.response;
import lombok.Data;

@Data
public class TasksResponseDto {
    public int id;
    public String title;
    public boolean completed;
    public int priority;
    public long unixDateTime;
}
