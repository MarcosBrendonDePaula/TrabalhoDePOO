/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.DAO;

import java.util.LinkedList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import projetoalmanaque.normais.Funcionario;

/**
 *
 * @author MarcosB
 */
public class FuncionariosDao {

    private LinkedList<Funcionario> Funcionarios;
    /**
     * 
     * @param f Funcionario 
     */
    public void add(Funcionario f) {
        Funcionarios.add(f);
    }
    
    public FuncionariosDao() {
        Funcionarios = new LinkedList<>();
    }
    /**
     * Funçao para buscar funcionario ultilizando o nome e cargo
     * @param nome String
     * @param cargo String
     * @return Funcionario
     */
    public Funcionario buscaGet(String nome, String cargo) {
        String aux1;
        String aux2;
        for (int i = 0; i < Funcionarios.size(); i++) {
            aux1= toUpperCase(Funcionarios.get(i).getNome());
            aux2= toUpperCase(Funcionarios.get(i).getCargo());
            if (aux1.contentEquals(toUpperCase(nome)) && aux2.contentEquals(toUpperCase(cargo))) {
                return Funcionarios.get(i);
            }
        }
        return null;
    }
    /**
     *
     * Funçao para buscar funcionario ultilizando o nome
     * @param nome String
     * @return Funcionario
     */
    public Funcionario buscaGet(String nome) {
            String aux1;
            for (int i = 0; i < Funcionarios.size(); i++) {
                aux1= toUpperCase(Funcionarios.get(i).getNome());
                if (aux1.equals(toUpperCase(nome))) {
                    return Funcionarios.get(i);
                }
            }
            return null;
        }
    /**
     * Funçao para buscar funcionario ultilizando o Objeto Funcionario
     * @param funcionario Funcionario
     * @return funcioanrio || null
     */
    public Funcionario buscaGet(Funcionario funcionario) {
        for (int i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).compare(funcionario)) {
                return Funcionarios.get(i);
            }
        }
        return null;
    }
    /**
     * Funçao para pegar um funcionario ultilizando a posiçao na lista
     * @param posiçao Int
     * @return Funcionario
     */
    public Funcionario getFuncionario(int posiçao){
        return Funcionarios.get(posiçao);
    }
    /**
     * Funçao para deletar funcionario ultilizando o Objeto funcionario
     * @param f Funcionario
     */
    public void del(Funcionario f) {
        for (int i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).compare(f)) {
                Funcionarios.remove(i);
                return;
            }
        }
    }
    /**
     * Funçao para imprimir todos os funcionarios
     */
    public void imp() {
        for (int i = 0; i < Funcionarios.size(); i++) {
            System.out.println("nome: " + Funcionarios.get(i).getNome() + " cargo: " + Funcionarios.get(i).getCargo());
        }
    }
    /**
     * Funçao para ver se existe um funcionario ultilizando o objeto Funcionario
     * @param funcionario Funcionario
     * @return Boolean
     */
    public boolean Contais(Funcionario funcionario) {
        for (int i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).compare(funcionario)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Pega a quantidade de funcionarios presentes na lista
     * @return int 
     */
    public int quantidade() {
        return Funcionarios.size();
    }
    /**
     * Busca um funcionario ultilizando o cpf
     * @param cpf Srting
     * @return Funcionario||null
     */
    public Funcionario buscaCPF(String cpf){
            for (int i = 0; i < Funcionarios.size(); i++) {
                if (Funcionarios.get(i).getCPF().equalsIgnoreCase(cpf)) {
                    return Funcionarios.get(i);
                }
            }
            return null;        
    }

}
