/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import facebookbd.ConnectionFactory;
import facebookbd.MemoriaLocal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.BloqueioAmizade;
import model.bean.Usuario;

/**
 *
 * @author icaro
 */
public class BloqueioAmizadeDAO {
    public static void create(BloqueioAmizade bloqueioAmizade){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_bloqueio_amizade(id_user_bloqueante, id_user_bloqueado) VALUES(?, ?)");
           
            stmt.setInt(1, bloqueioAmizade.getId_user_bloqueante());
            stmt.setInt(2, bloqueioAmizade.getId_user_bloqueado()); //tirar duvida pq ambas sao PK
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static List<BloqueioAmizade> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<BloqueioAmizade> bloqueioAmizades = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_bloq_amizade");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                BloqueioAmizade bloqueioAmizade = new BloqueioAmizade();
                
                bloqueioAmizade.setId_user_bloqueante(rs.getInt("id_user_bloqueante"));
                bloqueioAmizade.setId_user_bloqueado(rs.getInt("id_user_bloqueado")); 
                bloqueioAmizades.add(bloqueioAmizade);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return bloqueioAmizades; 
    }
    
    public static void delete(BloqueioAmizade bloqueioAmizade){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_bloqueio_amizade WHERE id_user_bloqueante = ? AND id_user_bloqueado = ?");
            stmt.setInt(1, bloqueioAmizade.getId_user_bloqueante());
            stmt.setInt(2, bloqueioAmizade.getId_user_bloqueado());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static boolean checkBloqueio(int id_solicitante, int id_solicitado){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false; 
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_bloqueio_amizade WHERE id_solicitante = ? AND id_solicitado = ?");
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
