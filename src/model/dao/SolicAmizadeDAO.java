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
import model.bean.SolicAmizade;

/**
 *
 * @author icaro
 */
public class SolicAmizadeDAO {
    public List<SolicAmizade> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<SolicAmizade> solicAmizades = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_solicit_amizade");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                SolicAmizade solicAmizade = new SolicAmizade();
                
                solicAmizade.setId_amigo(rs.getInt("id_amigo"));
                solicAmizade.setId_user_logado(rs.getInt("id_user_logado")); 
                solicAmizades.add(solicAmizade);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return solicAmizades; 
    }
}
