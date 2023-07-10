package com.digitalnomads.selenium.ui.config;

import com.github.javafaker.Faker;

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





}
