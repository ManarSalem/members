package com.example.address.service;


import com.example.address.dto.DTMemberDTO;
import com.example.address.entity.Department;

import java.util.List;

public interface DTMemberService {

    List<DTMemberDTO> getAllMembers();

    DTMemberDTO getDTMemberById(Integer id);

    List<DTMemberDTO> getMembersInTeam(String team);

    DTMemberDTO addDTMember(DTMemberDTO memberDTO);

    void deleteDTMember(Integer id);

    void update(Integer id, String team);

    DTMemberDTO update2(Integer id, DTMemberDTO updatedDTMemberDTO);

    DTMemberDTO updateDepartment(Integer id, Department dep);

    DTMemberDTO updateMemberCourses(Integer id, Integer courseId);
}
