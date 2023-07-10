package com.digitalnomads.selenium.ui.configuration;

import com.digitalnomads.selenium.ui.models.User;
import com.github.javafaker.Faker;

import java.util.List;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeEmail() {

        return faker.internet().emailAddress();
    }

    public String generateFullName() {

        return faker.name().fullName();
    }

    public String generateFakeCurrentAddress() {
        return faker.address().fullAddress();

    }

    public String generateFakePermanentAddress() {
        return faker.address().secondaryAddress();

}

    public String generateFakeFirstName() {
        return faker.name().firstName();
    }
    public String generateFakeLastName(){
        return faker.name().lastName();
    }

    public String generateFakePhoneNumber(){
        return faker.phoneNumber().cellPhone();

    }
    public String generateFakeSubject(){
        return faker.educator().course();
    }
    public User generateStudent(){
        return User.builder()
                .gender("Male")
                .dateOfBirth("02/08/1996")
//                .subject(List.of("m", "s", "p"))
//                .hobbies(List.of("Sports", "Reading", "Music"))
                .build();
    }

    public String generateFakeGender(){
        String firstName = faker.name().firstName();
        boolean isMale = firstName.endsWith("o") || firstName.endsWith("us") || firstName.endsWith("r");
        String gender = isMale ? "Male" : "Female";
        return gender;
    }



}
