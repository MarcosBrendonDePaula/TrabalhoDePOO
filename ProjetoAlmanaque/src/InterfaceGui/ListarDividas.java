/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import projetoalmanaque.normais.Conta;

/**
 *Janela desenvolvida para plotar informacoes das dividas
 * @author MarcosB
 */
public class ListarDividas extends JFrame{
    private JTable tabela;
    public ListarDividas(Conta contas){
        setTitle("Lista de Dividas pendentes do Clientes");
        setLayout(new BorderLayout());
        String[][] dados=new String[contas.quantidade()][4];
        String[] colunas =new String[4];
        if(contas.quantidade()==0){
            JLabel info=new JLabel("Não existem Dividas");
            JOptionPane.showMessageDialog(this, "Nao existe nenhuma Divida pendente", "Sem Informação", JOptionPane.INFORMATION_MESSAGE);
            add(info,BorderLayout.CENTER);
            
        }else{
        for(int i=0;i<contas.quantidade();i++){
            dados[i][0]=""+contas.getDi(i).getId();
            dados[i][1]=contas.getDi(i).getObjeto().getNome();
            dados[i][2]=""+contas.getDi(i).getObjeto().getPreco();
            dados[i][3]=contas.getDi(i).getDatadiv();
        }
        colunas[0]="ID";
        colunas[1]="OBJETO";
        colunas[2]="VALOR";
        colunas[3]="DATA";
        JTable tabela = new JTable(dados,colunas);
        JScrollPane jsp = new JScrollPane(tabela);
        add(jsp,BorderLayout.CENTER);
        setSize(800 ,600);
        setVisible (true);
        }
    }
}
