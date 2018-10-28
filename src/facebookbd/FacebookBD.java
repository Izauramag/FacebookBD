/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookbd;

import model.bean.Usuario;
import model.dao.UsuarioDAO;

public class FacebookBD {

    public static void main(String[] args) {
        Usuario icaro = new Usuario("Caio", "12/08/1993", "www.fotos.com", "abc", "caioboy", '1');
        UsuarioDAO tempDAO = new UsuarioDAO();
        tempDAO.create(icaro);
    }
    
}
