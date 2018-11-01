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
    public void create(SolicAmizade solicAmizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_solicit_amizade(id_amigo, id_user_logado) VALUES(?, ?)");
           
            stmt.setInt(1, solicAmizade.getId_amigo());
            stmt.setInt(2, solicAmizade.getId_user_logado()); //tirar duvida pq ambas sao PK
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
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
    
    public void delete(SolicAmizade solicAmizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_solicit_amizade WHERE id_amigo = ? AND id_user_logado = ?");
            stmt.setInt(1, solicAmizade.getId_amigo());
            stmt.setInt(2, solicAmizade.getId_user_logado());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
