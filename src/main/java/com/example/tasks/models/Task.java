package com.example.tasks.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String title;

    @Column
    public boolean completed;

    @Column
    public int priority;

    @Column(name = "unix_datetime")
    public long unixDateTime;
}
