/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import facebookbd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Izaura
 */
public class AmizadeDAO {
    
    public void create (){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO amizade ()VALUES()");
        } catch (SQLException ex) {
            Logger.getLogger(AmizadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
