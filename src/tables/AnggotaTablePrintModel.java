/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class AnggotaTablePrintModel {
    JTable table;
    Object[][] data;
    public AnggotaTablePrintModel(JTable table) {
        this.table = table;
        createTable();
    }
    public AnggotaTablePrintModel(Object[][] data){
        this.data = data;
    }
    private JTable createTable(){
        JTable tempTable = new JTable();
        tempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"nama", "nis", "jenis_kelamin", "alamat", "kode_pos", "no_telp", "gambar"}
        ) 
        {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class, String.class, String.class
            };
        });
        if(data == null){
            for(int i = 0; i < this.table.getRowCount(); i++){
                ((DefaultTableModel)tempTable.getModel()).addRow(new Object[]{
                    this.table.getValueAt(i, 1),
                    this.table.getValueAt(i, 2),
                    this.table.getValueAt(i, 4),
                    this.table.getValueAt(i, 5),
                    this.table.getValueAt(i, 6),
                    this.table.getValueAt(i, 7),
                });
            }

            return tempTable;
        }
        
        for (Object[] data1 : this.data) {
            ((DefaultTableModel)tempTable.getModel()).addRow(new Object[]{
                data1[0], 
                data1[1], 
                data1[2], 
                data1[3], 
                data1[4], 
                data1[5],
            });
        }
        
        return tempTable;
    }
    public DefaultTableModel getModel(){
        return (DefaultTableModel)createTable().getModel();
    }
}
