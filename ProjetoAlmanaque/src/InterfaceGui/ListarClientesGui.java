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

/**
 *
 * @author MarcosB
 */
public class ListarClientesGui extends JFrame{
    private JTable tabela;
    public ListarClientesGui(){
        setTitle("Lista de Clientes");
        setLayout(new BorderLayout());
        String[][] dados=new String[MainGui.Clientes.quantidade()][5];
        String[] colunas =new String[5];
        if(MainGui.Clientes.quantidade()==0){
            JLabel info=new JLabel("Não existem clientes");
            JOptionPane.showMessageDialog(this, "Nao existe nenhum Cliente cadastrado", "Sem Informação", JOptionPane.INFORMATION_MESSAGE);
            add(info,BorderLayout.CENTER);
            
        }else{
        for(int i=0;i<MainGui.Clientes.quantidade();i++){
            dados[i][0]=MainGui.Clientes.getCliente(i).getCPF();
            dados[i][1]=MainGui.Clientes.getCliente(i).getNome();
            dados[i][2]=MainGui.Clientes.getCliente(i).getSobrenome();
            dados[i][3]=MainGui.Clientes.getCliente(i).getCurso();
            dados[i][4]=MainGui.Clientes.getCliente(i).getEmail();
        }
        colunas[0]="CPF";
        colunas[1]="NOME";
        colunas[2]="SOBRENOME";
        colunas[3]="CURSO";
        colunas[4]="EMAIL";
        JTable tabela = new JTable(dados,colunas);
        JScrollPane jsp = new JScrollPane(tabela);
        add(jsp,BorderLayout.CENTER);
        setSize(800 ,600);
        setVisible (true);
        }
    }
}
