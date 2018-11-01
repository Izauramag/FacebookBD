/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Izaura
 */
public class ComentarioPost {

    private int id_comentario;
    private int id_post;    
    private int id_user_coment;
    private String imagem;
    private String conteudo;

    public ComentarioPost() {
    }

    
    public ComentarioPost(int id_post, int id_user_coment, String imagem, String conteudo) {
        this.id_post = id_post;
        this.id_user_coment = id_user_coment;
        this.imagem = imagem;
        this.conteudo = conteudo;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public int getId_user_coment() {
        return id_user_coment;
    }

    public void setId_user_coment(int id_user_coment) {
        this.id_user_coment = id_user_coment;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
		
	
	
//métodos
	
    public void criarComentario(int id_comentario, int id_user_coment, int id_post, String conteudo) {
		
    }
	
    public void encontraComentario(int id_comentario) {
		
    }
	
    public void removeComentario(int id_comentario) {
	
    }
}
