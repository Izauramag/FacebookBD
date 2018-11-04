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
    public static void create(SolicAmizade solicAmizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_solicit_amizade(id_user_solicitante, id_user_solicitado) VALUES(?, ?)");
           
            stmt.setInt(1, solicAmizade.getId_user_solicitante());
            stmt.setInt(2, solicAmizade.getId_user_solicitado()); //tirar duvida pq ambas sao PK
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static List<SolicAmizade> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<SolicAmizade> solicAmizades = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_solicit_amizade");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                SolicAmizade solicAmizade = new SolicAmizade();
                
                solicAmizade.setId_user_solicitante(rs.getInt("id_user_solicitante"));
                solicAmizade.setId_user_solicitado(rs.getInt("id_user_solicitado")); 
                solicAmizades.add(solicAmizade);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return solicAmizades; 
    }
    
    public static void delete(SolicAmizade solicAmizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_solicit_amizade WHERE id_user_solicitante = ? AND id_user_solicitado = ?");
            stmt.setInt(1, solicAmizade.getId_user_solicitante());
            stmt.setInt(2, solicAmizade.getId_user_solicitado());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static boolean checkAmizade(int id_solicitante, int id_solicitado){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_solicit_amizade WHERE id_solicitante = ? AND id_solicitado = ?");
            stmt.setInt(1, id_solicitante);
            stmt.setInt(2, id_solicitado);
            
            rs = stmt.executeQuery(); 
            
            if(rs.next()){
                check = true; 
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check; 
    }
}
