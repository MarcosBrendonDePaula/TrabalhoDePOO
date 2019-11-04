/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.normais;

/**
 *
 * @author MarcosB
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private String cpf;
    
    /**
     * 
     * @param nome String 
     * @param cargo String 
     * @param cpf String 
     */
    public Funcionario(String nome, String cargo, String cpf) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf=cpf;
    }
    /**
     * O nome
     * @return String  
     */
    public String getNome() {
        return nome;
    }
    /**
     * Se refere ao novo nome que será posto 
     * @param nome String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna o Cargo
     * @return String
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Se refere ao novo cargo do funcionário que será atualizado
     * @param cargo String
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * Retorna o CPF do funcionário
     * @return String
     */
    public String getCPF(){
        return this.cpf;
    }
    /**
     * 
     * CPF novo que será atualizado
     * @param cpf String 
     */
    public void setCPF(String cpf){
       this.cpf=cpf;
    }
    /**
     * 
//     *@param funcionario Funcionario
     * @return Boolean
     */
    public boolean compare(Funcionario funcionario){
        if(this.nome.contentEquals(funcionario.getNome())&&this.cargo.contentEquals(funcionario.getCargo()))
            return true;
        return false;
    }
}
