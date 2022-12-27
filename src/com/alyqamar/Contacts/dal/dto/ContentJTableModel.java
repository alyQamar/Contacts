package com.alyqamar.Contacts.dal.dto;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class ContentJTableModel extends AbstractTableModel {

    private String[] column;
    private Object[][] row;

    public ContentJTableModel() {
    }

    public ContentJTableModel(String[] column, Object[][] row) {
        this.column = column;
        this.row = row;
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Icon.class;
        } else{
            return getValueAt(0, columnIndex).getClass();
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.column[columnIndex];
    }

    @Override
    public int getRowCount() {
        return this.row.length;
    }

    @Override
    public int getColumnCount() {
        return this.column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
               return this.row[rowIndex][columnIndex];
    }

}
