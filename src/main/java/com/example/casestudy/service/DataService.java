package com.example.casestudy.service;
import com.example.casestudy.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.casestudy.repository.DataRepository;

import java.util.List;


@Service
public class DataService {

    private DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }


    public Data save(Data data){
       return dataRepository.save(data);
    }

    public List<Data> getAllData(){
        return dataRepository.findAll();
    }
}
