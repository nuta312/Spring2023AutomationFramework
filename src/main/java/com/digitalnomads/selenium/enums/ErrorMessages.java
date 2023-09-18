package com.digitalnomads.selenium.enums;

import lombok.Getter;

public enum ErrorMessages {

    loginValidationError("Invalid username or password!");

    @Getter
    String errorMessage;

    ErrorMessages(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
