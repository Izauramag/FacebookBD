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
import model.bean.Usuario;

/**
 *
 * @author icaro
 */
public class UsuarioDAO {
    
    public void create(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_usuario(nome, data_nascimento, foto, senha, login, visibilidade) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getData_nascimento());
            stmt.setString(3, usuario.getFoto());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getVisibilidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Usuario> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                
                usuario.setId_usuario(rs.getInt(""));
                usuario.setNome(rs.getString("nome"));
                usuario.setData_nascimento(rs.getString("data_nascimento"));
                usuario.setFoto(rs.getString("foto"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setLogin(rs.getString("login"));
                usuario.setVisibilidade(rs.getString("Visibilidade"));
                usuarios.add(usuario);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios; 
    }
    
}
