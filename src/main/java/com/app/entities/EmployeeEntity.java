package com.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private Long phone;

    private byte age;

    private double height;

    private boolean married;

    @Column(name = "date_birth")
    private LocalDate dateBirth;

    @ManyToOne(targetEntity = DepartmentEntity.class, cascade = CascadeType.PERSIST)
    private DepartmentEntity department;

}
