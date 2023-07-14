package enums;

import lombok.Getter;

public enum WebTableFormCredentials {

    studentFirstName("Aigerim"),
    studentLastName("Moldomusaeva"),
    studentEmail("moldomusaeva@gmail.com"),
    studentAge("29"),
    studentSalary("20000000"),
    studentDepartment("Insurance");

    @Getter

    String credentials;

    WebTableFormCredentials(String credentials){
        this.credentials=credentials;
    }
    }


