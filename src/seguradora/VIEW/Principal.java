/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package seguradora.VIEW;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.*;                    //   INCLUIR PARA CARREGAR RELATÓRIO
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import seguradora.DAL.ModuloConexao;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Professor
 */
public class Principal extends javax.swing.JFrame {
    Connection conexao = null;  // INCLUIR PARA RELATÓRIO
  
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        conexao = ModuloConexao.conector();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdpPrincipal = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        TelaClienteCadastrar = new javax.swing.JMenuItem();
        TelaAutomovel = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenRelClientes1 = new javax.swing.JMenu();
        MenRelClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seguradora de Automóveis - SENAI 2021");
        setLocation(new java.awt.Point(0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguradora/VIEW/img_apresentação.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        JdpPrincipal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JdpPrincipalLayout = new javax.swing.GroupLayout(JdpPrincipal);
        JdpPrincipal.setLayout(JdpPrincipalLayout);
        JdpPrincipalLayout.setHorizontalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        JdpPrincipalLayout.setVerticalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Clientes");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        TelaClienteCadastrar.setText("Funcionalidades");
        TelaClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaClienteCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(TelaClienteCadastrar);

        jMenuBar1.add(jMenu1);

        TelaAutomovel.setText("Automóvel");
        TelaAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaAutomovelActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Funcionalidades");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        TelaAutomovel.add(jMenuItem1);

        jMenuBar1.add(TelaAutomovel);

        jMenu3.setText("Ocorrências");

        jMenuItem9.setText("Funcionalidades");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        MenRelClientes1.setText("Relatórios");

        MenRelClientes.setText("Clientes");
        MenRelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelClientesActionPerformed(evt);
            }
        });
        MenRelClientes1.add(MenRelClientes);

        jMenuBar1.add(MenRelClientes1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdpPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void TelaClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaClienteCadastrarActionPerformed
        // TODO add your handling code here:

        TelaCliente obj=new TelaCliente(); //TelaClienteCad foi a tela criada  para cadastro de clientes usado JINTERNALFRAME
        JdpPrincipal.add(obj); // tela principal criado dentro do Formulário USEI JPANEL DESKTOP
        obj.setVisible(true);

    }//GEN-LAST:event_TelaClienteCadastrarActionPerformed

    private void TelaAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaAutomovelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TelaAutomovelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaAutomovel obj=new TelaAutomovel(); //TelaClienteCad foi a tela criada  para cadastro de clientes usado JINTERNALFRAME
        JdpPrincipal.add(obj);       // tela principal criado dentro do Formulário USEI JPANEL DESKTOP
        obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
/* 
    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    
    ajuda
    }//GEN-LAST:event_jMenu4ActionPerformed
*/
    private void MenRelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelClientesActionPerformed
        // TODO add your handling code here:
        relClientes();
    }//GEN-LAST:event_MenRelClientesActionPerformed
  
    /**
     * @param args the command line arguments
     */
    
    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        ajuda();
    }

    public void relClientes() {
    int confirma = JOptionPane.showConfirmDialog(null, "Confirma impressão" + 
            "relatório clientes", "Atenção", JOptionPane.YES_NO_OPTION);
      if (confirma == JOptionPane.YES_OPTION){        
          try {
           JasperPrint print = JasperFillManager.fillReport("RelClientes_Aut.jrxml",null,conexao);
           JasperViewer.viewReport(print,false);                              //  tmb dá pau  jasper
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);              
          }         
      }   
    }

    public class Ajuda {
        public void Ajuda() {
            try {                         
                   String chmFile = "cmd.exe /C:/Users/Willians/Documents/NetBeansProjects/SEGURADORA/HELP-SEG.chm";
                Runtime run = Runtime.getRuntime();
                run.exec(chmFile);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JdpPrincipal;
    private javax.swing.JMenuItem MenRelClientes;
    private javax.swing.JMenu MenRelClientes1;
    private javax.swing.JMenu TelaAutomovel;
    private javax.swing.JMenuItem TelaClienteCadastrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    private void ajuda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    
    }
}
