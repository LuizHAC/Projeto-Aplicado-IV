/*
Produzido por: Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
package telas;

import dao.ProdutosDAO;
import javax.swing.JOptionPane;
import model.Produtos;

/**
 *
 * @author Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
public class FrmCadastroProdutos extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastroProdutos
     */
    public FrmCadastroProdutos() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnmenu = new javax.swing.JButton();
        btncadastrar = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        txtcusto = new javax.swing.JTextField();
        txtvenda = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de produtos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 20));

        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, -1));

        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 310, 30));

        txtcusto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtcusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, 30));

        txtvenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtvenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 80, 30));

        txtdescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 310, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Custo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Valor de venda:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Descrição:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        try {
            Produtos obj = new Produtos();

            obj.setNome(txtnome.getText());
            obj.setValorCompra(Double.parseDouble(txtcusto.getText()));
            obj.setValorVenda(Double.parseDouble(txtvenda.getText()));
            obj.setDescricao(txtdescricao.getText());

            ProdutosDAO dao = new ProdutosDAO();
            dao.Cadastrar(obj);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro:" +e);
        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void txtvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvendaActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcusto;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtvenda;
    // End of variables declaration//GEN-END:variables
}
