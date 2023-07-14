package enums;

import lombok.Getter;

public enum ErrorMessage {

    loginValidationError("Invalid username of password");


    @Getter

    String errorMessage;

    ErrorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
    }
}

