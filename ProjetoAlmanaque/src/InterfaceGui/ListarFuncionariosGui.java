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
 *Janela feita para Plotar um Painel de Funcionarios;
 * @author MarcosB
 */
public class ListarFuncionariosGui extends JFrame{
    private JTable tabela;
    public ListarFuncionariosGui(){
        setTitle("Lista de Funcionários");
        setLayout(new BorderLayout());
        String[][] dados=new String[MainGui.Funcionarios.quantidade()][3];
        String[] colunas =new String[3];
        if(MainGui.Funcionarios.quantidade()==0){
            JOptionPane.showMessageDialog(this, "Nao existe nenhum Funcionario cadastrado", "Sem Informação", JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(int i=0;i<MainGui.Funcionarios.quantidade();i++){
                dados[i][0]=MainGui.Funcionarios.getFuncionario(i).getNome();
                dados[i][1]=MainGui.Funcionarios.getFuncionario(i).getCPF();
                dados[i][2]=MainGui.Funcionarios.getFuncionario(i).getCargo();

            }
            colunas[0]="NOME";
            colunas[1]="CPF";
            colunas[2]="CARGO";
            //colunas[2]="CPF";
            JTable tabela = new JTable(dados,colunas);
            JScrollPane jsp = new JScrollPane(tabela);
            add(jsp,BorderLayout.CENTER);
            setSize(800 ,600);
            setVisible (true);
        }
    }
}
