/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.normais;

/**
 *
 * @author eric_
 */
public interface Contato {
    /**
     * Método para alterar o telefone
     * @param telefone novo telefone
     */
    public abstract void setTelefone(String telefone);
    
    /**
     * 
     * @return retornar o número de telefone
     */
    public abstract String getTelefone();
    
    /**
     * Método para alterar o emial
     * @param email  String
     */
    public abstract void setEmail(String email);
    
    /**
     * 
     * @return  retornar o email
     */
    public abstract String getEmail();
    
}
