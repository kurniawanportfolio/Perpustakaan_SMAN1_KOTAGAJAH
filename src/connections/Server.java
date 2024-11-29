/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Server {
    public final Connection server() throws SQLException{
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/perpustakaan", 
                "root", 
                ""
        );
    }
}