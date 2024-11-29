/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class BukuTablePrintModel {
    JTable table;
    Object[][] data;
    public BukuTablePrintModel(JTable table) {
        this.table = table;
        createTable();
    }
    public BukuTablePrintModel(Object[][] data){
        this.data = data;
    }
    private JTable createTable(){
        JTable tempTable = new JTable();
        tempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"NO BUKU", "JUDUL BUKU", "NO ISBN", "PENGARANG", "PENERBIT"}
        ) 
        {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class
            };
        });
        
        if(data == null){
            for(int i = 0; i < this.table.getRowCount(); i++){
                ((DefaultTableModel)tempTable.getModel()).addRow(new Object[]{
                    this.table.getValueAt(i, 0),
                    this.table.getValueAt(i, 1),
                    this.table.getValueAt(i, 2),
                    this.table.getValueAt(i, 3),
                    this.table.getValueAt(i, 4)
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
                data1[4]});
        }
        return tempTable;
    }
    public DefaultTableModel getModel(){
        return (DefaultTableModel)createTable().getModel();
    }
}
