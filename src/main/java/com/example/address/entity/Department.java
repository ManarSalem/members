package com.example.address.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Builder
@Slf4j
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Integer departmentId;

    private String departmentName;

    private String manager;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_department_id",referencedColumnName = "departmentId")
    private List<DTMember> members ;

    public Department(Integer id, String departmentName){
        this.departmentId=id;
        this.departmentName=departmentName;
    }

    public Department(String departmentName)
    {
        this.departmentName=departmentName;
    }
}
