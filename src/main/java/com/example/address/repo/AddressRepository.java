package com.example.address.repo;

import com.example.address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address findAddressByDtMemberId(Integer memeberId);
}
