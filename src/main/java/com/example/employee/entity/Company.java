package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String companyName;

    @NotNull
    private Integer employeesNumber;
}
