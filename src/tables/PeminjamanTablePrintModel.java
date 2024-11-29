/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class PeminjamanTablePrintModel {
    JTable table;
    Object[][] data;
    
    public PeminjamanTablePrintModel(JTable table) {
        this.table = table;
    }
    public PeminjamanTablePrintModel(Object[][] data){
        this.data = data;
    }
    private JTable createTable(){
        JTable tempTable = new JTable();
        tempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"NAMA", "NO INDUK", "KELAS", "NO BUKU", "JUDUL BUKU", "PENGARANG", "TANGGAL KEMBALI"}
        ) 
        {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class, String.class, String.class
            };
        });
        if(this.data == null){
            List<String> arrays = arrayGenerator(table);
            for(int i = 0; i < arrays.size(); i++){
                ((DefaultTableModel)tempTable.getModel()).addRow(new Object[]{
                    arrays.get(i).split(",")[1],
                    arrays.get(i).split(",")[0],
                    arrays.get(i).split(",")[2],
                    arrays.get(i).split(",")[3],
                    arrays.get(i).split(",")[4],
                    arrays.get(i).split(",")[5],
                    arrays.get(i).split(",")[6]
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
                data1[6]});
        }
        
        return tempTable;
    }
    public List <String> arrayGenerator(JTable table){
        List<String> arrays = new ArrayList<>();
        for(int i = 0; i < table.getRowCount(); i++){
            arrays.add(
                table.getValueAt(i, 2)+","+
                table.getValueAt(i, 1)+","+
                table.getValueAt(i, 3)+","+
                table.getValueAt(i, 4)+","+
                table.getValueAt(i, 5)+","+
                table.getValueAt(i, 6)+","+
                (table.getValueAt(i, 9).toString().split(" ")[0].trim().equals("masih")?
                        " ":table.getValueAt(i, 9).toString().split(" ")[0]));
        }
        return arrays.stream().sorted().collect(Collectors.toList());
    }
    public DefaultTableModel getModel(){
        return (DefaultTableModel)this.createTable().getModel();
    }
}
