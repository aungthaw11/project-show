package com.example.projectshow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private int assignmentId;
    private String assignmentProblem;


    @ManyToOne
    @JoinColumn(name = "assigned_by")
    private Teacher teacher;


    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @OneToMany
    @JoinColumn(name = "ass_id")
    private List<Assignment> assignment;



}
