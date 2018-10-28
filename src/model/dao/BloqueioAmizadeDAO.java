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
import model.bean.BloqueioAmizade;

/**
 *
 * @author icaro
 */
public class BloqueioAmizadeDAO {
    public List<BloqueioAmizade> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<BloqueioAmizade> bloqueioAmizades = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_bloq_amizade");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                BloqueioAmizade bloqueioAmizade = new BloqueioAmizade();
                
                bloqueioAmizade.setId_amigo(rs.getInt("id_amigo"));
                bloqueioAmizade.setId_user_logado(rs.getInt("id_user_logado")); 
                bloqueioAmizades.add(bloqueioAmizade);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return bloqueioAmizades; 
    }
}
