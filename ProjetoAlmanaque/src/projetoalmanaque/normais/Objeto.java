/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.normais;

import InterfaceGui.MainGui;

/**
 *
 * @author Diego
 */
public class Objeto {

    private String nome;
    private double preco;
    private int id;

    /**
     *
     * @param nome Nome do Objeto (O que esta sendo vendido)
     * @param preco Preço do Objeto
     */
    public Objeto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        MainGui.gerador += 1;
        this.id = MainGui.gerador;
    }

    /**
     *retorna o nome
     * @return String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     *retorna o preço
     * @return double
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     *retorna o preço
     * @return int
     */
    public int getID() {
        return this.id;
    }

    /**
     *recebe o nome que vai ser colocado
     * @param nome String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *Recebe o preço que vai ser colocado
     * @param preco double
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *Recebe o ID que vai ser colocado
     * @param id int
     *
     */
    public void setID(int id) {
        this.id = id;
    }

}
