package com.example.address.repo;

import com.example.address.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends
        JpaRepository<Course,Integer> {


}
