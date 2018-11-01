/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookbd;

import model.bean.ComentarioPost;
import model.bean.Post;
import model.bean.Usuario;
import model.dao.ComentarioPostDAO;
import model.dao.UsuarioDAO;

public class FacebookBD {

    public static void main(String[] args) {
        Usuario icaro = new Usuario("Icaro", "12/08/1993", "www.fotos.com", "abc", "caioboy", '1');
        Post postDoIcaro = new Post(icaro.getId_usuario(), "url::imageDoPost.jpg", "Oi meninas hoje estamos fazendo tutorial de makes", '1');
        
        
        Usuario caio = new Usuario("Caio", "12/08/1993", "www.fotos.com.br/fotodecaio.jpg", "abc", "caioboy", '1');
        
        ComentarioPost comentarioDeCaioNoPostDeIcaro = new ComentarioPost(postDoIcaro.getId_post(), caio.getId_usuario(), "www.imagequecaiopostou.jpg", "E ai, jair se acostumando melhor");
        
        (new ComentarioPostDAO()).create(comentarioDeCaioNoPostDeIcaro);
//        (new ComentarioPostDAO()).update(comentarioDeCaioNoPostDeIcaro);
//        UsuarioDAO tempDAO = new UsuarioDAO();
//        tempDAO.create(icaro);
    }
    
}
