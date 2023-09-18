package com.digitalnomads.selenium.enums;

import lombok.Getter;

public enum LoginCredentials {

        johnUserName("john"),
        johnPassword("HelloWorld312!");
        @Getter
        String credential;
        LoginCredentials(String credential) {
            this.credential = credential;
        }
}
