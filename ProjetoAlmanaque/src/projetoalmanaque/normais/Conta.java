/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.normais;

import java.util.LinkedList;

/**
 *Cada Cliente tem uma divida separada dos demais
 * @author MarcosB
 */
public class Conta {
   private LinkedList<Dívida> dividas;
   private double total = 0;
   /**
    * metodo construtor
    */
   public Conta(){
       dividas = new LinkedList<>();
   }
   /**
    * Procura uma divida especifica nas dividas do cliente
    * @param data String
    * @param id int
    * @return Dívida
    */
   public Dívida getDivida(String data,int id){
       for(int i=0;i<dividas.size();i++){
           if(dividas.get(i).getDatadiv().equalsIgnoreCase(data)&&dividas.get(i).getId()==id){
               return dividas.get(i);
           }
       }
       return null;
   }
   /**
    * Adiciona uma divida na lista de dividas do cliente
    * @param divida Divida
    */
   public void add(Dívida divida){
       dividas.add(divida);
   }
   /**
    * remove uma divida da lista do cliente
    * @param divida Divida
    */
   public void remove(Dívida divida){
       for(int i=0;i<dividas.size();i++){
           if(divida.compare(dividas.get(i))){
                dividas.remove(i);
                return;
           }
       }
   }
   /**
    * remove uma divida da lista do cliente
    * @param valor double
    */
   public void deldivida(double valor){
       for(int i=0;i<dividas.size();i++){
           if(dividas.get(i).getValorDívida() == valor){
               dividas.remove(i);
               return;
           }
       }
   }
   /**
    * Apaga todas as dividas do cliente
    */
   public void delall(){
       dividas.clear();
   }
   /**
    * Verifica se contem um objeto igual ao divida
    * @param divida Dívida
    * @return boolean
    */
   public boolean contais(Dívida divida){
       for(int i=0;i<dividas.size();i++){
           if(dividas.get(i).compare(divida)){
               return true;
           }
       }
       return false;
   }   
   /**
    * Retorna a quantidade de dividas que o cliente possue
    *@return int 
    */
   public int quantidade(){
       return dividas.size();
   }
  /**
   * Soma as dividas
   * @return double
   */
   public double gettotal(){
       total = 0;
       for(int i=0;i<dividas.size();i++){
           total = total + dividas.get(i).getValorDívida();
       }
       return total;
   }
   /**
    * Pega uma divida especifica
    * @param i int 
    * @return Dívida
    */
       public Dívida getDi(int i){
        return dividas.get(i);
    }
   

}
