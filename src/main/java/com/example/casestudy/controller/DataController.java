package com.example.casestudy.controller;

import com.example.casestudy.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.casestudy.service.DataService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DataController {


    private DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @GetMapping
    public List<Data> getAllData(){
        return dataService.getAllData();
    }

    @PostMapping
    public Data save(Data data){
      return  dataService.save(data);
    }

}
