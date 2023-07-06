package com.digitalnomads.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode


public class User {

    private String userFullName;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;


}
