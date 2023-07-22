package selenium.demo.demoQa.loginPageTest;

import lombok.Getter;

public enum LoginCredentials {

    userName("john"),
        password("Hello123@World");

    @Getter
    String credential;

    LoginCredentials(String credential){
        this.credential = credential;
    }
}
