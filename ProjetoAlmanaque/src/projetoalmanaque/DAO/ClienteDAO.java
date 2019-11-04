/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.DAO;

import java.util.LinkedList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import projetoalmanaque.normais.Cliente;

/**
 *
 * @author cliente
 */
public class ClienteDAO {

    private LinkedList<Cliente> clientes;

    public ClienteDAO() {
        clientes = new LinkedList<>();
    }
    /**
     * 
     * @param cliente Cliente 
     */
    public void add(Cliente cliente) {
        clientes.add(cliente);
    }
    /**
     * 
     * @param pos Int
     * @return Cliente
     */
    public Cliente getCliente(int pos) {
        return clientes.get(pos);
    }
    /**
     *
     * @param nome Nome a ser buscado
     * @param sobrenome Sobrenome a ser buscado juntamente com o Nome
     * @return Retorna o Cliente caso nome buscado seja encontrado, caso
     * contrario Retorna null
     */
    public Cliente getCliente(String nome, String sobrenome) {
        String aux1,aux2;
        for (int i = 0; i < clientes.size(); i++) {
            aux1=toUpperCase(this.clientes.get(i).getNome());
            aux2=toUpperCase(this.clientes.get(i).getSobrenome());
            if (toUpperCase(nome).equalsIgnoreCase((aux1)) && toUpperCase(sobrenome).equalsIgnoreCase((aux2)) ){
                return this.clientes.get(i);
            }
        }
        return null;

    }
    /**
     * 
     * @param cpf Cpf a ser usado para Buscar Cliente
     * @return retorna null caso o cliente não seja encontrado
     */
    public Cliente getCliente(String cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (cpf.equals((this.clientes.get(i).getCPF()))) {
                return this.clientes.get(i);
            }
        }
        return null;
    }

    /**
     *Recebe o nome a ser Procurado p/ Remoção
     * @param nome String
     * Recebe o sobrenome a ser Procurado p/ Remoção
     * @param sobrenome String
     */
    public Cliente del(String nome, String sobrenome) {
        String aux1,aux2;
        for (int i = 0; i < clientes.size(); i++) {
            aux1=toUpperCase(this.clientes.get(i).getNome());
            aux2=toUpperCase(this.clientes.get(i).getSobrenome());
            if (toUpperCase(nome).equalsIgnoreCase((aux1)) && toUpperCase(sobrenome).equalsIgnoreCase((aux2))) {
                clientes.remove((this.clientes.get(i)));
            }
        }
        return null;

    }
    /**
     * CPF a ser buscado para Remoção
     * @param cpf String
     */
    public void del(String cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (cpf.equals((this.clientes.get(i).getCPF()))) {
                clientes.remove((this.clientes.get(i)));
                System.out.println("Removido Com sucesso!");
            }
        }
        System.out.println("Cliente não Encontrado!");
    }
    /**
     * Retorna o tamanho da Lista, Numero de Clientes Cadastrados
     * @return  Int
     */
    public int quantidade(){
        return clientes.size();
    }
}
