package com.digitalnomads.selenium.ui.models;

import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    public String firstName;
    public String lastName;
    public String fullName;
    public String password;
    public String email;
    public String currentAddress;
    public String permanentAddress;
    public String age;
    public String salary;
    public String department;
}
