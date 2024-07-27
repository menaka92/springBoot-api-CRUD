package com.menaka.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is use for AI
    private int id;
    @Column(name = "name")
    private String name;
}
