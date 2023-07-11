package com.digitalnomads.selenium.ui.models;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class User {

    private String fullName;
    private String firstName;
    private String lastName;
    private String gender;
    private String genderMale;
    private String genderFemale;
    private String genderOther;
    private String mobileNumber;
    private String dateOfBirth;
    private String subject;
    private String hobbies;
    private String hobbiesSport;
    private String hobbiesReading;
    private String hobbiesMusic;
    private String uploadPictures;
    private String selectState;
    private String selectCity;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;

    public User(String fullName, String firstName, String lastName, String genderMale) {

    }

    public User(String generateFakeFirstName,
                String generateFakeLastName, String generateFakeEmail,
                String generateFakeGender,
                String generateFakeCurrentAddress) {
    }

}
