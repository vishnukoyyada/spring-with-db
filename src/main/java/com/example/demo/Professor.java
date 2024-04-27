package com.example.demo;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Professor")
public class Professor {
    @Id
    @Column(name = "ID")
    private int id;;
    @Column(name = "NAME")
    private String name;
}
