package com.example.casestudy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "input")
@AllArgsConstructor
@Data
@Component
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    @Column(name = "id")
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


    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
