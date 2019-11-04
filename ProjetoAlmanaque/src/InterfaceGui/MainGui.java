/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGui;

import InterfaceGui.Ajuda.MainGuiA;
import java.awt.Color;
import projetoalmanaque.DAO.ClienteDAO;
import projetoalmanaque.DAO.FuncionariosDao;
import projetoalmanaque.DAO.ObjetoDAO;
import projetoalmanaque.DAO.VendasGeraisDAO;
import projetoalmanaque.normais.Cliente;
import projetoalmanaque.normais.Funcionario;
import projetoalmanaque.normais.Objeto;

/**
 *
 * @author MarcosB
 */
public class MainGui extends javax.swing.JFrame {
    public static ClienteDAO Clientes = new ClienteDAO();
    public static FuncionariosDao Funcionarios = new FuncionariosDao();
    public static ObjetoDAO Objetos = new ObjetoDAO();
    public static VendasGeraisDAO vendas = new VendasGeraisDAO();
    public static Integer gerador = -1;//variavel para gerar ID's de objetos

    /**
     * Creates new form MainGui
     */
    public MainGui() {
        //Aqui troca a cor do fundo, Color.(nome da cor desejada)
        getContentPane().setBackground(Color.DARK_GRAY);
        //Iniciar alguns dados
        Objeto pastel = new Objeto("Pastel 1real", 1.00);
        Objeto pastel2 = new Objeto("Pastel 1real", 1.00);
        Objeto pastel3 = new Objeto("Pastel 2reais", 2.00);
        Objeto coxinha = new Objeto("Coxinha", 2.50);
        Objeto esfirra = new Objeto("Esfirra", 2.50);
        Objeto cocacola = new Objeto("Coca Cola 250ml", 3.50);
        Objeto cocacola2 = new Objeto("Coca Cola 250ml", 3.50);
        Objeto cocacola3 = new Objeto("Coca Cola 250ml", 3.50);
        Objeto cafe = new Objeto("Café 50cent", 0.50);
        Objeto cafeteste = new Objeto("Café 50cent", 0.50);
        Objeto cafe1 = new Objeto("Café 1real", 1.00);
        Objetos.add(cafe1);
        Objetos.add(cafeteste);
        Objetos.add(pastel);
        Objetos.add(pastel2);
        Objetos.add(pastel3);
        Objetos.add(coxinha);
        Objetos.add(esfirra);
        Objetos.add(cafe);
        Objetos.add(cocacola);
        Objetos.add(cocacola2);
        Objetos.add(cocacola3);

        System.out.println("" + Objetos.quantidade());
        Cliente c1 = new Cliente("Bruce", "Wayne", "40028922", "Matemática", "Bat_Man@bats.com", "67998765432");
        Cliente c2 = new Cliente("Barbara", "Gordon", "4319462", "Pedagogia", "Bat_Woman@bats.com", "67998759431");
        Cliente c3 = new Cliente("Naruto", "Uzumaki", "0568914", "Ciencia da Computação", "Fox_Demon@foxs.com", "40228922145");
        Clientes.add(c1);
        Clientes.add(c2);
        Clientes.add(c3);
        Funcionario f1 = new Funcionario("Damien", "Vendedor", "45789034");
        Funcionario f2 = new Funcionario("Alfred", "Gerente", "098765342");
        Funcionarios.add(f1);
        Funcionarios.add(f2);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto POO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(531, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(523, 400));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Exit_100px.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 270, 243, 109);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Customer_100px_1.png"))); // NOI18N
        jButton2.setText("ListarClientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 10, 243, 109);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(529, 248, 0, 451);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Employee_100px.png"))); // NOI18N
        jButton4.setText("Lista funcionario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 140, 240, 109);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Box_100px.png"))); // NOI18N
        jButton3.setText("Lista Objetos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 10, 243, 109);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGui/Kon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 130, 90, 100);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Combo_Chart_50px.png"))); // NOI18N
        jButton5.setText("Grafico de vendas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(270, 140, 240, 110);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Customer_30px.png"))); // NOI18N
        jMenu1.setText("Cliente");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Add_30px.png"))); // NOI18N
        jMenuItem1.setText("Adicionar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Trash_30px.png"))); // NOI18N
        jMenuItem3.setText("Deletar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Available_Updates_30px.png"))); // NOI18N
        jMenuItem4.setText("Atualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Search_30px.png"))); // NOI18N
        jMenuItem6.setText("Buscar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Employee_30px.png"))); // NOI18N
        jMenu4.setText("Funcionário");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Add_30px.png"))); // NOI18N
        jMenuItem7.setText("Adicionar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Trash_30px.png"))); // NOI18N
        jMenuItem8.setText("Deletar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Available_Updates_30px.png"))); // NOI18N
        jMenuItem9.setText("Atualizar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Search_30px.png"))); // NOI18N
        jMenuItem10.setText("Buscar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_3D_Object_30px.png"))); // NOI18N
        jMenu5.setText("Objeto");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Add_30px.png"))); // NOI18N
        jMenuItem11.setText("Adicionar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Trash_30px.png"))); // NOI18N
        jMenuItem14.setText("Deletar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Available_Updates_30px.png"))); // NOI18N
        jMenuItem12.setText("Atualizar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Search_30px.png"))); // NOI18N
        jMenuItem13.setText("Buscar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Help_30px.png"))); // NOI18N
        jMenu2.setText("Ajuda");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CriaConta criarconta = new CriaConta();
        criarconta.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        DeletarCliente deletaconta = new DeletarCliente();
        deletaconta.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        AtualizarCliente updateconta = new AtualizarCliente();
        updateconta.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        BuscarCliente buscaconta = new BuscarCliente();
        buscaconta.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ListarClientesGui gui = new ListarClientesGui();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        EasterEGG gui = new EasterEGG();
        gui.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        CriaObjeto novoObjeto = new CriaObjeto();
        novoObjeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ListarObjetosGui obj = new ListarObjetosGui();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        AtualizarObjeto atObjeto = new AtualizarObjeto();
        atObjeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ListarFuncionariosGui fun = new ListarFuncionariosGui();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        DeletarObjeto delObjeto = new DeletarObjeto();
        delObjeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        DeletarFuncionario fun = new DeletarFuncionario();
        fun.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        BuscarObjeto buscaObjeto = new BuscarObjeto();
        buscaObjeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    //Funcionário
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CriaFuncionario criafuncionario = new CriaFuncionario();
        criafuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        EditarFuncionario fun = new EditarFuncionario();
        fun.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        InterfaceGui.Ajuda.MainGuiA a = new MainGuiA();
        a.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        BuscarFuncionario bc = new BuscarFuncionario();
        bc.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Grafico n=new Grafico();
        n.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}