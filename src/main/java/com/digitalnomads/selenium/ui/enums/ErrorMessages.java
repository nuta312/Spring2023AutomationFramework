package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum ErrorMessages {
    loginValidtion("Invalid username or password!");
    @Getter
    String errorMessage;
    ErrorMessages(String errorMessog){
        this.errorMessage=errorMessog;
    }
}
