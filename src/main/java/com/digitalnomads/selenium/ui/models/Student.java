package com.digitalnomads.selenium.ui.models;


import lombok.Builder;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Data
@Builder
public class Student {

    private String firstName;
    private String lastName;
    private String userEmail;
    private String mobileNumber;
    private String dateOfBirth;
    private String currentAddress;
    private String gender;
    private String picturePath;
    private String state;
    private String city;
    private List<String> subjects;
    private List<String> hobbies;

    public String getFormattedDateOfBirth() {
        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM,yyyy", Locale.ENGLISH);

        try {
            Date date = inputFormat.parse(dateOfBirth);
            return outputFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}