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
public class BloqueioAmizade {
    
    private int id_user_bloqueante;
    private int id_user_bloqueado;

    public BloqueioAmizade(int id_user_bloqueante, int id_user_bloqueado) {
        this.id_user_bloqueante = id_user_bloqueante;
        this.id_user_bloqueado = id_user_bloqueado;
    }

    public BloqueioAmizade() {
    }
   
    
    public int getId_user_bloqueado() {
        return id_user_bloqueado;
    }

    public void setId_user_bloqueado(int id_user_bloqueado) {
        this.id_user_bloqueado = id_user_bloqueado;
    }

    public int getId_user_bloqueante() {
        return id_user_bloqueante;
    }

    public void setId_user_bloqueante(int id_user_bloqueante) {
        this.id_user_bloqueante = id_user_bloqueante;
    }  
    
}
