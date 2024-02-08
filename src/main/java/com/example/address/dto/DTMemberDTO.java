package com.example.address.dto;


import com.example.address.entity.Address;
import com.example.address.entity.Course;
import com.example.address.entity.Department;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DTMemberDTO {

    private Integer Id;
    private String name ;
    private String team;
    private Address address;
    private Department department;
private Integer fk_department_id;
    private List<Course> courses;

}
