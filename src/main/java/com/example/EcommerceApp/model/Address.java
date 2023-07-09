package com.example.EcommerceApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String addressName;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;


    @OneToOne
    @JoinColumn(name = "fk_userid")
    private User user;



}
