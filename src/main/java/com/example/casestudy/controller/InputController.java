package com.example.casestudy.controller;


import com.example.casestudy.entity.Input;
import com.example.casestudy.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "http://localhost:5173")
public class InputController {


    private InputService inputService;

    @Autowired
    public InputController(InputService inputService) {
        this.inputService = inputService;
    }


    @GetMapping
    @ResponseBody
    public List<Input> getAllData() {
        System.out.println(inputService.getAllData());
        return inputService.getAllData();
    }

    @PostMapping("/save")
    public Input save(@RequestBody Input data) {
        return inputService.save(data);
    }

}
