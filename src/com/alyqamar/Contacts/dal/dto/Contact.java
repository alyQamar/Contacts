/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alyqamar.Contacts.dal.dto;

import javax.swing.ImageIcon;

public class Contact {

    private int code;
    private String name;
    private int number;
    private byte[] picture;
    private String email;
    private String address;

    private String country;
    private String countryCode;
    private String phoneCountryCode;
    private String telComp;

    public Contact() {
    }

    public Contact(int code, String name, int number, byte[] picture) {
        this.code = code;
        this.name = name;
        this.number = number;
        this.picture = picture;
    }

    public Contact(int code, String name, int number, byte[] picture, String email, String address, String country, String countryCode, String phoneCountryCode, String telComp) {
        this.code = code;
        this.name = name;
        this.number = number;
        this.picture = picture;
        this.email = email;
        this.address = address;
        this.country = country;
        this.countryCode = countryCode;
        this.phoneCountryCode = phoneCountryCode;
        this.telComp = telComp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ImageIcon getImg() {
        return new ImageIcon(picture);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getTelComp() {
        return telComp;
    }

    public void setTelComp(String telComp) {
        this.telComp = telComp;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", number=" + number + ", picture=" + picture + '}';
    }

}
