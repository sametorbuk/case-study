package com.example.casestudy.service;

import com.example.casestudy.entity.Input;
import com.example.casestudy.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Service
public class InputService {

    private InputRepository inputRepository;

    @Autowired
    public InputService(InputRepository inputRepository) {
        this.inputRepository = inputRepository;
    }


    public Input save(Input data) {
      if(isExist(data)){
          return null;
      }else{
          return inputRepository.save(data);
      }
    }


    public boolean isExist(Input input){
       Optional<Input> foundInput = inputRepository.isExist(input.getCity(),input.getDistrict());
       if (foundInput.isPresent()){
           return true;
       }else {
           return false;
       }
    }






    public List<Input> getAllData() {
        System.out.println(inputRepository.findAll());
        return inputRepository.findAll();
    }


}
