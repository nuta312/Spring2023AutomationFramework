package com.digitalnomads.selenium.ui.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    private String userFirstName;
    private String userLastName;
    private String userFullName;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;
    private String userPassword;
    private String userMobileNumber;
    private String userState;
    private String userCity;
    private String gender;

    private User(Builder builder) {
        this.userFullName = builder.userFullName;
        this.userEmail = builder.userEmail;
        this.userCurrentAddress = builder.userCurrentAddress;
        this.userPermanentAddress = builder.userPermanentAddress;
        this.userPassword = builder.userPassword;
        this.userMobileNumber = builder.userMobileNumber;
        this.userState = builder.userState;
        this.userCity = builder.userCity;
        this.userFirstName = builder.userFirstName;
        this.userLastName = builder.userLastName;
        this.gender = builder.gender;


    }

    public static class Builder {

        private String userFirstName;
        private String userLastName;
        private String userFullName;
        private String userEmail;
        private String userCurrentAddress;
        private String userPermanentAddress;
        private String userPassword;
        private String userMobileNumber;
        private String userState;
        private String userCity;
        private String gender;


        public Builder setUserFirstName(String userFirstName){
            this.userFirstName = userFirstName;
            return this;
        }

        public Builder setUserLastName(String userLastName){
            this.userLastName = userLastName;
            return this;
        }

        public Builder setUserFullName(String userFullName) {
            this.userFullName = userFullName;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setUserCurrentAddress(String userCurrentAddress) {
            this.userCurrentAddress = userCurrentAddress;
            return this;
        }

        public Builder setUserPermanentAddress(String userPermanentAddress) {
            this.userPermanentAddress = userPermanentAddress;
            return this;
        }

        public Builder setUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder setUserMobileNumber(String userMobileNumber) {
            this.userMobileNumber = userMobileNumber;
            return  this;
        }

        public Builder setUserState(String userState){
            this.userState = userState;
            return this;
        }

        public Builder setUserCity(String userCity){
            this.userCity = userCity;
            return  this;
        }

        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}

