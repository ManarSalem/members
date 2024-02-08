package com.example.address.repo;

import com.example.address.entity.DTMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DTMemberRepository extends JpaRepository<DTMember,Integer> {

    // select * from DTMember where team=?
    @Query(value = "SELECT s FROM DTMember s WHERE s.team =?1"
            ,nativeQuery = true)
    List<DTMember> findByTeamIgnoreCase(String team);


    @Query(value="select * from DTMEMBER where name like 'M%'",nativeQuery = true)
    List<DTMember> findMembersNameStartWith();

    @Query(value="select u from DTMember u where u.name like 'A%'")
    List<DTMember> findMembersNameStartWithJPQL();
}


