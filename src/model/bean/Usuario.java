/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Date;

/**
 *
 * @author Izaura
 */
public class Usuario {
    private int id_usuario;
    private String nome;
    private String cidade;
    private String foto;
    private String senha;
    private String login;
    private char visibilidade;

    public Usuario(String nome, String cidade, String foto, String senha, String login, char visibilidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.foto = foto;
        this.senha = senha;
        this.login = login;
        this.visibilidade = visibilidade;
    }

    public Usuario() {
        
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getVisibilidade() {
        return String.valueOf(visibilidade);
    }

    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade.charAt(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
