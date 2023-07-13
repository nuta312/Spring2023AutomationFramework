package selenium.demo.nambaFoodHomeWork.aidinHomeWork.enums;

import lombok.Getter;

public enum LoginCredentials {
    aidinUserName("aidin"),
    aidinPassword("Aidin123*");
    @Getter
    String credential;
    LoginCredentials(String credential){
        this.credential = credential;
    }
}
