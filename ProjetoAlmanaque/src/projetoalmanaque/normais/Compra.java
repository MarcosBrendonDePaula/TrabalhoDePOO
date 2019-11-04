/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.normais;

/**
 * Dados da DÍVIDA extendidos
 * @author cliente
 */
public class Compra extends Dívida {

    private Funcionario Fun_Resp_Vend;
    private final String data_comp;
    /**
     * Funçao para realizar uma compra
     * @param objeto Objeto
     * @param data_div String
     * @param Fun_Resp_Vend Funcionario
     * @param data_comp String
     */
    public Compra(Objeto objeto, String data_div, Funcionario Fun_Resp_Vend, String data_comp) {
        super(objeto, data_div);
        this.Fun_Resp_Vend = Fun_Resp_Vend;
        this.data_comp = data_comp;
    }
    /**
     * Funçao para pegar o vendedor que realizou a venda
     * @return Funcionario
     */
    public Funcionario getFun_Resp_Vend() {
        return Fun_Resp_Vend;
    }
    /**
     * Funçao para setar o vendedor a Compra
     * @param Fun_Resp_Vend Funcionario
     */
    public void setFun_Resp_Vend(Funcionario Fun_Resp_Vend) {
        this.Fun_Resp_Vend = Fun_Resp_Vend;
    }

}
