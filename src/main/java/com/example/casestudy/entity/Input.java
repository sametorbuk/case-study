package com.example.casestudy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "input")
@AllArgsConstructor
@Data
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @Column(name = "city")
    @JsonProperty("city")
    private String city;

    @Column(name = "district")
    @JsonProperty("district")
    private String district;

    public Input(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public Input() {
    }

}
