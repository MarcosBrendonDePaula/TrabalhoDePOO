/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGui;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Janela desenvolvida para plotar informacoes de Objetos;
 *
 * @author MarcosB
 */
public class ListarObjetosGui extends JFrame {

    private JTable tabela;

    public ListarObjetosGui() {
        setTitle("Lista de Objetos");
        setLayout(new BorderLayout());
        Boolean flag = false;
        Integer seila = MainGui.Objetos.quantidade();
        String[][] dados = new String[seila][4];
        String[] colunas = new String[4];
        if (MainGui.Objetos.quantidade() == 0) {
            JOptionPane.showMessageDialog(this, "Nao existe nenhum Objeto cadastrado", "Sem Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Integer ajuste = 0;
            for (int i = 0; i < MainGui.Objetos.quantidade(); i++) {
                flag = false;
                if (MainGui.Objetos.qtd_disponivel(MainGui.Objetos.getObjetoP(i).getNome()) > 1) {
                    flag = true;
                }
                if (flag == false) {
                    dados[i - ajuste][0] = " " + MainGui.Objetos.getObjetoP(i).getID();
                    dados[i - ajuste][1] = MainGui.Objetos.getObjetoP(i).getNome();
                    dados[i - ajuste][2] = " " + MainGui.Objetos.getObjetoP(i).getPreco() + " R$";
                    dados[i - ajuste][3] = " " + MainGui.Objetos.qtd_disponivel(MainGui.Objetos.getObjetoP(i).getNome());
                } else {
                    flag = false;
                    for (int j = 0; j < i; j++) {
                        if (MainGui.Objetos.getObjetoP(i).getNome().equals(dados[j][1])) {
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        dados[i - ajuste][0] = " " + MainGui.Objetos.getObjetoP(i).getID();
                        dados[i - ajuste][1] = MainGui.Objetos.getObjetoP(i).getNome();
                        dados[i - ajuste][2] = " " + MainGui.Objetos.getObjetoP(i).getPreco() + " R$";
                        dados[i - ajuste][3] = " " + MainGui.Objetos.qtd_disponivel(MainGui.Objetos.getObjetoP(i).getNome());
                    } else {
                        ajuste = ajuste + 1;
                    }
                }
            }
            colunas[0] = "ID";
            colunas[1] = "NOME";
            colunas[2] = "PREÇO";
            colunas[3] = "QUANTIDADE";
            JTable tabela = new JTable(dados, colunas);
            JScrollPane jsp = new JScrollPane(tabela);
            add(jsp, BorderLayout.CENTER);
            setSize(800, 600);
            setVisible(true);
        }
    }
}
