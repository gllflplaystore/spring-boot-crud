package com.crud.spring_boot_crud.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "users")  // ✅ Avoid using reserved keywords like "user"
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
