package com.kubernates.kuberDemo.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private int Id;
    private String name;
    private String surname;
}
