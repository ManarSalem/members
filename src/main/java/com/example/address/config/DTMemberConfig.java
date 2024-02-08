package com.example.address.config;

import com.example.address.entity.DTMember;
import com.example.address.entity.Department;
import com.example.address.repo.DTMemberRepository;
import com.example.address.repo.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DTMemberConfig {

    @Bean
    CommandLineRunner commandLineRunner(DTMemberRepository repository, DepartmentRepository departmentRepository) {
        return args -> {
            DTMember Manar = new DTMember(1,
                    "Manar BinOwayid",
                    "MS");

            DTMember Tarek = new DTMember(2,
                    "Tarek Asseri",
                    "MS");

            DTMember Mohammad = new DTMember(3,
                    "Mohammad ALdress",
                    "MS");

            DTMember Faisal = new DTMember(3,
                    "Faisal ALtweely",
                    "MS");

            DTMember Ziyad = new DTMember(4,
                    "Ziyad ALmotlaq",
                    "MS");

            DTMember Abdullah = new DTMember(5,
                    "Abdullah ALmelfi",
                    "MS");

            DTMember Abdullah_Alhabib = new DTMember(6,
                    "Abdullah ALhabib",
                    "EP");

            DTMember Alwaleed = new DTMember(7,
                    "Alwaleed ALsamlaq",
                    "EP");
            DTMember Faris = new DTMember(8,
                    "Faris ALmutairi",
                    "EP");
            DTMember Mohammad_Aba = new DTMember(9,
                    "Mohammad Aba ALkhayl",
                    "EP");
            DTMember Mohammad_ALsaawi = new DTMember(10,
                    "Mohammad ALsaawi",
                    "EP");

            List<DTMember> members = List.of(Manar
                    , Tarek
                    , Mohammad
                    , Faisal
                    , Abdullah
                    , Ziyad
                    , Abdullah_Alhabib
                    , Alwaleed
                    , Faris
                    , Mohammad_ALsaawi
                    , Mohammad_Aba);


            repository.saveAll(members);

//            Department department= new Department(
//                    1
//                    ,"OCP"
//                    ,"Mohammad Alrashidi",
//                    members  );
            Department department2= new Department(1,

                    "Dev"
                  );
            Department department3= new Department(2,
                    "buisness"
            );
            Department department4= new Department(3,
                    "test"
            );


            List<Department> depList=List.of(department3,department2,department4);
           // departmentRepository.save(department);
            departmentRepository.saveAll(depList);
        };






    }

}