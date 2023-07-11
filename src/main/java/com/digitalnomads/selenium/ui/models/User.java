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

    private String userFirstName;
    private String userLastName;
    private String password;
    private String userFullName;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;


}
