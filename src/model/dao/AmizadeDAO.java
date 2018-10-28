/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import facebookbd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Amizade;


/**
 *
 * @author Izaura
 */
public class AmizadeDAO {
    
   public List<Amizade> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Amizade> amizades = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_amizade");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                Amizade amizade = new Amizade();
                
                amizade.setId_amigo(rs.getInt("id_amigo"));
                amizade.setId_user_logado(rs.getInt("id_user_logado")); 
                amizades.add(amizade);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return amizades; 
    }
    
}
