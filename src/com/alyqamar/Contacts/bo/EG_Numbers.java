/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alyqamar.Contacts.bo;

/**
 *
 * @author home
 */
public class EG_Numbers {

    public EG_Numbers() {
    }

    public String getTelCompName(String number) {
        int target = Integer.parseInt(number.substring(0, 2));

        String companyName = "";
        switch (target) {
            case 10:
                companyName = "Vodafone";
                break;
            case 11:
                companyName = "Etisalat";
                break;
            case 12:
                companyName = "Orange";
                break;
            case 15:
                companyName = "We";
                break;
        }
        return companyName;
    }

    public int getTelCompKey(String companyName) {
        companyName = companyName.substring(0, companyName.indexOf(' '));

        int companyKey = 0;
        switch (companyName) {
            case "Vodafone":
                companyKey = 10;
                break;
            case "Etisalat":
                companyKey = 11;
                break;
            case "Orange":
                companyKey = 12;
                break;
            case "We":
                companyKey = 15;
                break;
        }
        return companyKey;
    }
}
