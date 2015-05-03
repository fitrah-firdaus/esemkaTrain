/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smk.train.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fitrahfirdaus
 */
public class DBFactory {
    
    public static Connection openConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/esemkaTrain", "root", "Password123");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
