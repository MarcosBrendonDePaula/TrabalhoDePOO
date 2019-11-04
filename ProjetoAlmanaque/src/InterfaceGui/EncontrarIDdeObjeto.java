/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGui;

import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import projetoalmanaque.normais.Conta;
import projetoalmanaque.normais.Objeto;

/**
 *
 * @author Henri
 */
public class EncontrarIDdeObjeto extends JFrame {

    private JTable tabela;

    public EncontrarIDdeObjeto(String nome) {
        LinkedList<Objeto> repetidos = MainGui.Objetos.obterObjeto(nome);
        setTitle("Lista de Objetos com mesmo nome");
        setLayout(new BorderLayout());
        String[][] dados = new String[repetidos.size()][3];
        String[] colunas = new String[3];
        if (repetidos.size() < 1) {
            JOptionPane.showMessageDialog(this, "Nenhum Objeto com esse nome cadastrado.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (int i = 0; i < repetidos.size(); i++) {
                dados[i][0] = "" + repetidos.get(i).getID();
                dados[i][1] = repetidos.get(i).getNome();
                dados[i][2] = "" + repetidos.get(i).getPreco() + " R$";
            }
        }
        colunas[0] = "ID";
        colunas[1] = "NOME";
        colunas[2] = "PREÇO";
        JTable tabela = new JTable(dados, colunas);
        JScrollPane jsp = new JScrollPane(tabela);
        add(jsp, BorderLayout.CENTER);
        setSize(800, 600);
        setVisible(true);
    }
}
