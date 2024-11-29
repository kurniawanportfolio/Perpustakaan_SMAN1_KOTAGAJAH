/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Model extends connections.Server{
    protected int records;
    protected DefaultTableModel dtm;
    
    public Model(){
    }
    
    public void setTable(JTable table){
        this.dtm = (DefaultTableModel)table.getModel();
    }
    
    public DefaultTableModel table(){
        return this.dtm;
    }
    
    public int getRecord(){
        return this.records;
    }
}
