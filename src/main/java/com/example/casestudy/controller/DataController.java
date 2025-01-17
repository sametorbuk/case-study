package com.example.casestudy.controller;

import com.example.casestudy.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.casestudy.service.DataService;

import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "http://localhost:5173")
public class DataController {


    private DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @GetMapping
    public List<Data> getAllData() {
        return dataService.getAllData();
    }

    @PostMapping("/save")
    public Data save(Data data) {
        return dataService.save(data);
    }

}
