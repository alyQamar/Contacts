/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alyqamar.Contacts.dal.dto;

import java.util.Scanner;

/**
 *
 * @author home
 */
public final class PhoneNumber {

    private final int country;
    private final int area;   // area code (3 digits)
    private final int exch;   // exchange  (3 digits)
    private final int ext;    // extension (4 digits)

    public PhoneNumber(int country, int area, int exch, int ext) {
        this.area = area;
        this.exch = exch;
        this.ext = ext;
        this.country = country;
    }

    // how you're supposed to implement equals
    public boolean equals(Object y) {
        if (y == this) {
            return true;
        }
        if (y == null) {
            return false;
        }
        if (y.getClass() != this.getClass()) {
            return false;
        }
        PhoneNumber that = (PhoneNumber) y;
        return (this.area == that.area) && (this.exch == that.exch) && (this.ext == that.ext) && (this.country == that.country);
    }

    // 0 for padding with leading 0s
    public String toString() {
        return String.format("(%03d) %03d-%04d", area, exch, ext);
    }

    // satisfies the hashCode contract
    @Override
    public int hashCode() {
        return 10007 * (area + 1009 * exch) + ext;
    }

}
