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

public class Amizade {
    
    private int id_amigo;
    private int id_user_logado;
    
    
    //Gerando getters and setters
    
    public int getId_amigo() {
        return id_amigo;
    }
    
    public void setId_amigo(int id_amigo) {
        this.id_amigo = id_amigo;
    }
    
    public int getId_user_logado() {
        return id_user_logado;
    }
    
    public void setId_user_logado(int id_user_logado) {
        this.id_user_logado = id_user_logado;
    }
}