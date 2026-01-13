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
public class Group{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupTitle;
    private String description;

    @OneToMany(mappedBy = "group")
    private List<Assignment> assignments;

    @OneToMany(mappedBy = "group")
    private List<Teacher> teacher;

    @OneToMany(mappedBy = "group")
    private List<Student> students;

}
