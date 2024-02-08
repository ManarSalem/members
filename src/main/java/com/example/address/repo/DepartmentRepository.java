package com.example.address.repo;

import com.example.address.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository
        extends JpaRepository<Department,Integer> {

    Department findByDepartmentName(String name);
}
