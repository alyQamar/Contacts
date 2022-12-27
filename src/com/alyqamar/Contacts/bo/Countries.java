/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alyqamar.Contacts.bo;

/**
 *
 * @author home
 */
import com.alyqamar.Contacts.dal.dto.Country;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Countries {

    private ArrayList<Country> countryList;

    public Countries() {
        setCountryList();
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    private void setCountryList() {
        ArrayList<Country> countryList = new ArrayList<Country>();
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("data\\CountryCodes.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray objList = (JSONArray) obj;

            //Iterate over employee array
            objList.forEach(cntr -> parseCountryObject((JSONObject) cntr, countryList));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.countryList = countryList;
    }

    private static void parseCountryObject(JSONObject countryObj, ArrayList<Country> countryList) {
        //Get Country name
        String countryName = (String) countryObj.get("name");

        //Get employee last name
        String countryDial_code = (String) countryObj.get("dial_code");

        //Get employee website name
        String countryCode = (String) countryObj.get("code");

        Country c = new Country(countryName, countryDial_code, countryCode);
        countryList.add(c);
    }

    public Country FindCountryInf(String Country) {
        Country c = null;
        for (Country i : countryList) {
            if (i.getName().equals(Country)) {
                c = new Country(i.getName(), i.getDial_code(), i.getCode());
            }
        }
        return c;
    }

    public void print() {
        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i).getName());
        }
    }
}
