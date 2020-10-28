/*
Produzido por: Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
package telas;

import dao.UsuariosDAO;
import javax.swing.table.DefaultTableModel;
import model.Usuarios;

/**
 *
 * @author Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
public class FrmBuscaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FrmUsuario
     */
    public FrmBuscaUsuarios() {
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

        btnbusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelausuarios = new javax.swing.JTable();
        txtbusca = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(725, 425));
        setResizable(false);
        setSize(new java.awt.Dimension(725, 425));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbusca.setText("Buscar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        tabelausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "UserName", "Senha", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelausuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 600, 220));

        txtbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 243, -1));

        jMenu1.setText("Consulta de usuários                                                                                                                                                                    ");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Editar");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Menu");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        try {
            
            UsuariosDAO dao = new UsuariosDAO();
            
            DefaultTableModel model = dao.Buscar(txtbusca.getText());
            
            tabelausuarios.setModel(model);
            txtbusca.setText(null);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnbuscaActionPerformed

    private void tabelausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelausuariosMouseClicked
        
        if(tabelausuarios.getSelectedRow() != -1){
            FrmEditaUsuarios EditaUsuarios = new FrmEditaUsuarios();
            Usuarios usuario = new Usuarios();
            
            usuario.setCod_usuario(Integer.parseInt(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 0).toString()));
            usuario.setNome(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 1).toString());
            usuario.setSenha((tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 2).toString()));
            usuario.setTipo(tabelausuarios.getValueAt(tabelausuarios.getSelectedRow(), 3).toString());
            
            EditaUsuarios.preencher(usuario);
            
            EditaUsuarios.setVisible(true);
        }
    }//GEN-LAST:event_tabelausuariosMouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            
            UsuariosDAO dao = new UsuariosDAO();
            
            DefaultTableModel model = dao.Listar();
            
            tabelausuarios.setModel(model);
            txtbusca.setText(null);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmBuscaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuscaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuscaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuscaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbusca;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelausuarios;
    private javax.swing.JTextField txtbusca;
    // End of variables declaration//GEN-END:variables
}
