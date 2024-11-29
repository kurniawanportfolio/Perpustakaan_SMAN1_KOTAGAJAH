/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class FormPendaftaranTablePrintModel {
    String[][] data;
    
    public FormPendaftaranTablePrintModel(String[][] data){
        this.data = data;
    }
    
    private JTable createTable(){
        JTable tempTable = new JTable();
        tempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"KEP", "NIP", "TP", "Year"}
        ) 
        {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
            };
        });
        String year = new SimpleDateFormat("yyyy").format((Date)Calendar.getInstance().getTime());
        for (String[] d : this.data) {
            ((DefaultTableModel)tempTable.getModel()).addRow(new String[]{
                d[0],
                d[1],
                d[2], 
                year
                });
        }
        return tempTable;
    }
    public DefaultTableModel getModel(){
        return (DefaultTableModel)createTable().getModel();
    }
}
