package enums;

import lombok.Getter;



public enum LoginCredentials {

    johnUserName("AM"),
    johnPassword("Aigerim93!");

    @Getter

    String credential;

    LoginCredentials(String credential){
        this.credential=credential;

    }
}
