/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alyqamar.Contacts.bo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    private String email="";

    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    public boolean checkValidation(String email) {
        boolean bool;
        //Regular Expression   
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);
        //Create instance of matcher   
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
            this.email = email;
    }

}
