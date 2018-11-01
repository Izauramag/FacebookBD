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
    public void create(Amizade amizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_amizade(id_amigo, id_user_logado) VALUES(?, ?)");
           
            stmt.setInt(1, amizade.getId_amigo());
            stmt.setInt(2, amizade.getId_user_logado()); //tirar duvida pq ambas sao PK
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
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
   
   public void delete(Amizade amizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_amizade WHERE id_amigo = ? AND id_user_logado = ?");
            stmt.setInt(1, amizade.getId_amigo());
            stmt.setInt(2, amizade.getId_user_logado());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
   
   public List<Amizade> readForName(String nome){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Amizade> amizades = new ArrayList<>();
            
        try {
            //procurando os amigos pelo nome deles
            stmt = con.prepareStatement("SELECT * FROM tb_amizade WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
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
