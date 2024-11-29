/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class KartuAnggotaFrontPrintTable {
    String[][] data;

    public KartuAnggotaFrontPrintTable(String[][] data){
        this.data = data;
    }
    private JTable createTable(){
        JTable tempTable = new JTable();
        String path = "";
        tempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Nama", "NIS", "AlamatNoTelp", "NIP", "Created", "Expired", "KepalaPerpus", "Barcode", "gambar"}
        ) 
        {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
            };
        });
        try {
            path = new File(".").getCanonicalPath()+"\\src\\uploads\\anggota\\";
        } catch (IOException ex) {
            Logger.getLogger(AnggotaTablePrintModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (String[] d : this.data) {
            ((DefaultTableModel)tempTable.getModel()).addRow(new String[]{
                d[0], 
                d[1], 
                d[2], 
                d[3] + "/" + d[4], 
                d[5], 
                d[6], 
                d[7], 
                d[8], 
                d[9],
                path + d[0] + ".jpg"
            });
        }
        return tempTable;
    }
    public DefaultTableModel getModel(){
        return (DefaultTableModel)createTable().getModel();
    }
}
