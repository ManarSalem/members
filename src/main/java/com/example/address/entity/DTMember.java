package com.example.address.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Builder
@Slf4j
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="DTMember")


public class DTMember  implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Integer Id;

    private String name ;
    private String team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    //    @ManyToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name="department_id")
//    private Department department;
//
    private Integer fk_department_id;




    @ManyToMany(targetEntity = Course.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name="member_courses",
            joinColumns = @JoinColumn(name="memberId"),
            inverseJoinColumns = @JoinColumn(name="courseId")
    )
    private List<Course> courses;


    public DTMember(String name, String team)
    {
        // department.setDepId(depId);
        this.name=name;
        this.team=team;


    }

    public DTMember(int id, String name, String team)
    {
        // department.setDepId(depId);
        this.Id=id;
        this.name=name;
        this.team=team;


    }




}
