package com.example.casestudy.repository;

import com.example.casestudy.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface InputRepository extends JpaRepository<Input, Integer> {


    @Query(value = "SELECT * FROM input i WHERE i.city = :city AND i.district = :district", nativeQuery = true)
    Optional<Input> isExist(String city , String district);




}
