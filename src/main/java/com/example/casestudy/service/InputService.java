package com.example.casestudy.service;

import com.example.casestudy.entity.Input;
import com.example.casestudy.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InputService {

    private InputRepository inputRepository;

    @Autowired
    public InputService(InputRepository inputRepository) {
        this.inputRepository = inputRepository;
    }


    public Input save(Input data) {
        return inputRepository.save(data);
    }

    public List<Input> getAllData() {
        System.out.println(inputRepository.findAll());
        return inputRepository.findAll();
    }


}
