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
public class Dívida {
    private static int num = 0;
    private int id;
    private Objeto Objeto;
    private String Datadiv;
    private double ValorDívida;
    
    /**
     * recebe o tipo do objeto. Ex: pastel, esfirra
     * @param objeto Objeto
     * recebe a data da compra
     * @param data String
     */
    public Dívida(Objeto objeto, String data){
        this.Objeto = objeto;
        this.Datadiv = data;
        num++;
        this.id = num;
        ValorDívida = objeto.getPreco();
    }
    /**
     * retorna o objeto
     * @return Objeto
     */
    public Objeto getObjeto() {
        return Objeto;
    }
    /**
     * mudar o objeto 
     * @param Objeto Objeto
     */
    public void setObjeto(Objeto Objeto) {
        this.Objeto = Objeto;
    }
    /**
     * retorna a data
     * @return String
     */
    public String getDatadiv() {
        return Datadiv;
    }
    /**
     * muda a data
     * @param Data String
     */
    public void setDatadiv(String Data) {
        this.Datadiv = Data;
    }
    /**
     * retorna o id
     * @return int
     */
    public int getId() {
        return id;
    }
    /**
     * muda o id
     * @param id int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * retornar o valor da dívida
     * @return double
     */
    public  double getValorDívida(){
            return ValorDívida;
    }

    /**
     * mudar o valor da dívida
     * @param ValorDívida double
     */
    public void setValorDívida(double ValorDívida) {
        this.ValorDívida = ValorDívida;
    }
    /**
     * Ver se possui dívidas iguais
     * @param divida Divida
     * @return Boolean
     */
    public boolean compare(Dívida divida) {
        if(divida.getId()==this.id && divida.getDatadiv().equalsIgnoreCase(Datadiv)){
            return true;
        }
        return false;
    }
}
