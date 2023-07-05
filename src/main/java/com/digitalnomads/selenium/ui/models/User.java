package com.digitalnomads.selenium.ui.models;

import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userFullName;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;


}
