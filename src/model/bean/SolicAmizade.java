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
public class SolicAmizade {
    
    private int id_user_solicitante;
    private int id_user_solicitado;
    
    //Gerando getters and setters

    public SolicAmizade(int id_user_solicitante, int id_user_solicitado) {
        this.id_user_solicitante = id_user_solicitante;
        this.id_user_solicitado = id_user_solicitado;
    }

    public SolicAmizade() {
    }

    public int getId_user_solicitante() {
        return id_user_solicitante;
    }

    public void setId_user_solicitante(int id_user_solicitante) {
        this.id_user_solicitante = id_user_solicitante;
    }

    public int getId_user_solicitado() {
        return id_user_solicitado;
    }

    public void setId_user_solicitado(int id_user_solicitado) {
        this.id_user_solicitado = id_user_solicitado;
    }   
}
