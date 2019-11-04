/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.DAO;

import java.util.LinkedList;
import projetoalmanaque.normais.Compra;
import projetoalmanaque.normais.Dívida;

/**
 *
 * @author cliente
 */
public class VendasGeraisDAO {

    public LinkedList<Compra> compras;
    public LinkedList<Dívida> dividas;

    /**
     * metodo construtor
     */
    public VendasGeraisDAO() {
        compras = new LinkedList<>();
        dividas = new LinkedList<>();
    }
    /**
     * Funçao para adicionar uma compra na lista
     * @param compra Compra
     */
    public void addCompra(Compra compra) {
        compras.add(compra);
    }
    /**
     * Funçao para adicionar uma divida na lista
     * @param divida Dívida
     */
    public void addDivida(Dívida divida) {
        dividas.add(divida);
    }
    /**
     * Funçao para deletar sempre o primeiro elemento inserido
     */
    public void delCompras() {//
        compras.remove(0);
    }
     /**
     * Funçao para deletar sempre o primeiro elemento inserido
     */
    public void delDividas() {
        dividas.remove(0);
    }
    /**
     * Funçao para pegar a quantidade de dados enseridos na divida
     * @return int
     */
    public int quantidade(){
        return dividas.size();
    }
}
