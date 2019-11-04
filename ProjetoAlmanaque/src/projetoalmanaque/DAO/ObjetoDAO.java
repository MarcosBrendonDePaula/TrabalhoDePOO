/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalmanaque.DAO;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import projetoalmanaque.normais.Objeto;

/**
 *
 * @author Diego
 */
public class ObjetoDAO {

    /**
     * Lista Encadeada do tipo Objeto
     */
    private LinkedList<Objeto> objetos;

    /**
     * Construtor
     */
    public ObjetoDAO() {
        objetos = new LinkedList<>();
    }

    /**
     *Objeto a ser inserido
     * @param objetoo Objeto
     */
    public void add(Objeto objetoo) {
        objetos.add(objetoo);
    }

    /**
     *ID do objeto a ser deletado
     * @param id Int
     */
    public void del(int id) {
        for (int i = 0; i < objetos.size(); i++) {
            if (id == objetos.get(i).getID()) {
                objetos.remove(i);
            }
        }
    }

    /**
     *ID a ser buscado
     * @param id Int
     * Retorna o Objeto com o ID caso exista, e caso nao exista retorna
     * null.
     * @return Objeto or null 
     */
    public Objeto getObjeto(int id) {
        for (int i = 0; i < objetos.size(); i++) {
            if (id == (this.objetos.get(i).getID())) {
                return this.objetos.get(i);
            }
        }
        return null;
    }

    /**
     *Nome a ser buscado
     * @param nome String
     * retorna o Objeto com o ID caso exista, e caso nao exista retorna
     * null.
     * @return Objeto or null
     */
    public Objeto getObjeto(String nome) {
        for (int i = 0; i < objetos.size(); i++) {
            if (nome.equals(this.objetos.get(i).getNome())  ) {
                return this.objetos.get(i);
            }
        }
        return null;
    }
    /**
     * 
     * @param i int
     * @return Objeto
     */
    public Objeto getObjetoP(int i) {
        return objetos.get(i);
    }

    /**
     *
     * @return Retorna a quantidade de objetos cadastrados.
     */
    public int quantidade() {
        return objetos.size();
    }
    /**
     * 
     * @return Int 
     */
    public int qt_Objetos_Df() {
        LinkedList<String> objs = new LinkedList<>();
        int a = 0;
        for (int i = 0; i < objetos.size(); i++) {
            if (!objs.contains(objetos.get(i).getNome())) {
                a++;
                String nome = objetos.get(i).getNome();
                objs.add(nome);
            } else {
                continue;
            }

        }
        return a;
    }

    /**
     *
     * @param nome nome do objeto
     * @return Retorna a quantidade especifica de determinado objeto.
     */
    public int qtd_disponivel(String nome) {
        Integer contador = 0;
        for (int i = 0; i < objetos.size(); i++) {
            if ((objetos.get(i).getNome()).equals((nome))) {
                contador = contador + 1;
            }
        }
        return contador;
    }

    /**
     *
     * @param nome nome do objeto
     * @return Retorna uma lista com todos os objetos de determinado nome.
     */
    public LinkedList<Objeto> obterObjeto(String nome) {
        LinkedList<Objeto> lista = new LinkedList<>();
        for (int i = 0; i < objetos.size(); i++) {
            if (objetos.get(i).getNome().equals(nome)) {
                lista.add(objetos.get(i));
            }
        }
        if (!lista.isEmpty()) {
            return lista;
        } else {
            return null;
        }
    }
}
