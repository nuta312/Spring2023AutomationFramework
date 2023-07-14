package com.digitalnomads.selenium.ui.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class UserWebTablesForm {
    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;


    }

