package com.example.address.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer courseId;
    private String courseName;

    @ManyToMany(targetEntity = DTMember.class, mappedBy = "courses")

    private List<DTMember> members;
}
