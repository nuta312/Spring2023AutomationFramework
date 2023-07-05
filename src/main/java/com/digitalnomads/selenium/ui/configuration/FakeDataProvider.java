package com.digitalnomads.selenium.ui.configuration;

import com.github.javafaker.Faker;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeEmail(){
        return faker.internet().emailAddress();
    }
    public String generateFullName(){
        return faker.name().fullName();
    }
public String generateFakeCurrentAddress(){
        return faker.address().fullAddress();

}
public String generateFakePermanentAddress(){
        return faker.address().secondaryAddress();

}

}
