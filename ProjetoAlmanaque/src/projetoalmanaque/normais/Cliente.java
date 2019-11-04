/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.normais;


/**
 *
 * @author Diego
 */
public class Cliente implements Contato{
    private String nome, sobrenome, curso, cpf, Email, Telefone;
    private Conta conta;
    /**
     * 
     * @param nome Nome do Cliente
     * @param sobrenome Sobrenome do Cliente
     * @param curso Nome do Curso do Cliente
     */
    public Cliente(String nome, String sobrenome, String cpf, String curso, String email, String telefone){
        this.Email = email;
        this.Telefone = telefone;
        this.nome= nome;
        this.sobrenome=sobrenome;
        this.curso=curso;
        this.cpf=cpf;
        
        conta=new Conta();
    }/**
     * Retorna o CPF 
     * @return String
     */
    public String getCPF(){
        return this.cpf;
    }
    /**
     * Retorna o nome
     * @return String
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Retorna o Sobrenome
     * @return  String
     */
    public String getSobrenome(){
        return this.sobrenome;
    }
    /**
     * Retorna o Curso 
     * @return Sting
     */
    public String getCurso(){
        return this.curso;
    }
    /**
     * Retorna a Conta 
     * @return Conta
     */
    public Conta getConta(){
        return this.conta;
    }
    /**
     * Recebe o nome que sera colocado 
     * @param nome String
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    /**
     * Recebe o sobrenome que sera colocado 
     * @param sobrenome String
     */
    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }
    /**
     * Recebe o curso que sera colocado 
     * @param curso String
     */
    public void setCurso(String curso){
        this.curso=curso;
    }
    /**
     * Recebe a Conta que sera colocada 
     * @param conta Conta
     */
    public void setConta(Conta conta){
        this.conta=conta;
    }
    
    /**
     * Recebe o cpf que sera colocada 
     * @param cpf String
     */
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    /**
     * retorna o telefone
     * @return String
     */
    public String getTelefone(){
        return this.Telefone;
    }
    
    /**
     * Recebe o telefone que sera colocado
     * @param novotelefone String
     */
    public void setTelefone(String novotelefone){
        this.Telefone = novotelefone;
    }
    
    /**
     * retorna o email
     * @return String
     */
    public String getEmail(){
        return this.Email;
    }
    
    /**
     * Recebe o email que sera colocado
     * @param novoemail String
     */
    public void setEmail(String novoemail){
        this.Email = novoemail;
    }
    
   
    
    
    
}
