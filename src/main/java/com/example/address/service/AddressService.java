package com.example.address.service;

import com.example.address.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<AddressDTO> getAll();

    Optional<AddressDTO> getAddress(Integer id);

    AddressDTO add(AddressDTO addressDTO);
    List<AddressDTO> addAll(   List<AddressDTO> addressDTO);


    void delete(Integer id);

    AddressDTO update(  AddressDTO addressDTO);
}


