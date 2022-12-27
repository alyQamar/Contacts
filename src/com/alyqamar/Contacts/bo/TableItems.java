/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alyqamar.Contacts.bo;

import com.alyqamar.Contacts.dal.dto.Contact;
import com.alyqamar.Contacts.dal.dto.ContentJTableModel;
import com.alyqamar.Contacts.view.ContactsJFrame;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;

/**
 *
 * @author home
 */

public class TableItems {
    
    public void displayTableItems(ArrayList<Contact> contactList,JTable contentJTable) {
        int rowSize = contactList.size();
        String[] columns = new String[]{"photo", "name", "number", "email", "address"};
        Object[][] obj = new Object[rowSize][5];

        for (int i = 0; i < rowSize; i++) {
            obj[i][1] = contactList.get(i).getName();
            obj[i][2] = contactList.get(i).getNumber();
            obj[i][3] = contactList.get(i).getEmail();
            obj[i][4] = contactList.get(i).getAddress();

            if (contactList.get(i).getPicture() != null) {
                ImageIcon imgIcon = new ImageIcon(contactList.get(i).getPicture());
                Image image = imgIcon.getImage().getScaledInstance(100, 120, Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(image);
                obj[i][0] = ic;
            } else {
                obj[i][0] = null;
            }
        }

        ContentJTableModel cTM = new ContentJTableModel(columns, obj);
        contentJTable.setModel(cTM);

        contentJTable.setRowHeight(150);
        contentJTable.getColumnModel().getColumn(0).setMaxWidth(150);
        contentJTable.getColumnModel().getColumn(0).setMinWidth(150);

    }

}
