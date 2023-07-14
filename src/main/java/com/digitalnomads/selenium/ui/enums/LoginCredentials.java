package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum LoginCredentials {
    johnUserName("john"),
    johnPassword("HelloWorld312!");



    @Getter
    String credentials;
    LoginCredentials(String credentials){
        this.credentials =credentials;
    }
}
