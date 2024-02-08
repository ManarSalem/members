package com.example.address.endpoints.controller;



import com.example.address.entity.Department;
import com.example.address.repo.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("departments")
public class DepartmentController {


    DepartmentRepository departmentRepository;
    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

@GetMapping("/names")
    public List<String> getAllDepartmentsNames(){

       List<String> depNames= new ArrayList<String>();
        List<Department> departments =  departmentRepository.findAll();
        for(Department obj : departments ){
           depNames.add(obj.getDepartmentName());
        }
        return depNames;
    }

    @GetMapping("/all")
    public List<Department> getAllDepartments(){

        List<Department> departments =  departmentRepository.findAll();

        return departments;
    }


    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department){

        Integer id=department.getDepartmentId();
        Optional<Department> foundedDepartment= departmentRepository.findById(id);

        if(foundedDepartment.isPresent()){
            return foundedDepartment.get();
        }

        return departmentRepository.save(department);
    }

    @PutMapping("update/manager/{depId}") @Transactional
    public Department updateManager(@PathVariable("depId") Integer depId,@RequestBody Department department){
        Optional<Department> foundedDepartment= departmentRepository.findById(depId);


        if(foundedDepartment.isPresent()){
            foundedDepartment.get().setManager(department.getManager());
            return foundedDepartment.get();
        }

        return null;//modify later
    }

    @PutMapping("update/members/{depId}") @Transactional
    public Department updateMemebers(@PathVariable("depId") Integer depId, @RequestBody Department department){
        Optional<Department> foundedDepartment= departmentRepository.findById(depId);


        if(foundedDepartment.isPresent()){
            foundedDepartment.get().setMembers(department.getMembers());
            return foundedDepartment.get();
        }
        return null;
    }




}
