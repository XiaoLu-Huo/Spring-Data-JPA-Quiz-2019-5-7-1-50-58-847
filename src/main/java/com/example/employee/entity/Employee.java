package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private Integer age;

    @NotNull
    private String gender;

    @NotNull
    private Integer companyId;

    @NotNull
    private Integer salary;

}
