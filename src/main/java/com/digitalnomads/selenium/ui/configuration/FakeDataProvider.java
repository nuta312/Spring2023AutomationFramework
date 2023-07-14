package com.digitalnomads.selenium.ui.configuration;

import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.models.UserWebTablesForm;
import com.github.javafaker.Faker;

import java.util.List;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeFullName(){
        return faker.name().fullName();
    }

    public  String generateUserEmail(){
        return faker.internet().emailAddress();
    }

    public String generateCurrentAddress(){
        return  faker.address().fullAddress();
    }

    public String generatePermanentAddress(){
        return faker.address().secondaryAddress();
    }

    public String generatePassword(){
        return faker.internet().password();
    }

    public String generateFirstName(){
        return faker.name().firstName();
    }

    public String generateLastName(){
        return faker.name().lastName();
    }

    public String generateMobileNumber(){
        return faker.phoneNumber().subscriberNumber(11);
    }
//    public UserWebTablesForm generateWebTablesForm(){
//        return UserWebTablesForm.builder()
//                .firstName(faker.name().firstName())
//                .lastName(faker.name().lastName())
//                .email(faker.internet().emailAddress())
//                .age(faker.number().numberBetween(12,60))
//                .salary(faker.number().numberBetween(5000, 1000000))
//                .department("Insurance");

    }









