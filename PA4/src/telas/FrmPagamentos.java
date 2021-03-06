/*
Produzido por: Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
package telas;

import dao.ClientesDAO;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.Clientes;

/**
 *
 * @author gabri
 */
public class FrmPagamentos extends javax.swing.JFrame {

    /**
     * Creates new form FrmPagamentos
     */
    public FrmPagamentos() {
        initComponents();
    }
    
    void preencher(Clientes cliente) throws ParseException {
        txtcodigo.setText(String.valueOf(cliente.getCod_cliente()));
        txtnome.setText(cliente.getNome());
        txtcredito.setText(String.valueOf(cliente.getCredito()));
        txtsaldo.setText(String.valueOf(cliente.getConta()));
        
        /*MaskFormatter ftmcpf = new MaskFormatter("###.###.###-##");
        ftmcpf.setValidCharacters(cliente.getCpf());
        ftxtcpf = new JFormattedTextField(ftmcpf);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcredito = new javax.swing.JTextField();
        ftxtcpf = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###.###.###-##");
            ftxtcpf = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPagamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menutitulo = new javax.swing.JMenu();
        menusalvar = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 40, 30));

        txtnome.setEditable(false);
        txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 280, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Crédito:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 30));

        txtcredito.setEditable(false);
        txtcredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcreditoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 30));

        ftxtcpf.setEditable(false);
        ftxtcpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(ftxtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Código:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 30));

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Valor pago:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, 30));

        txtPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Saldo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, 30));

        txtsaldo.setEditable(false);
        txtsaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldoActionPerformed(evt);
            }
        });
        getContentPane().add(txtsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, 30));

        menutitulo.setText("Pagamentos                                                      ");
        jMenuBar1.add(menutitulo);

        menusalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643774 - disk floppy save saveas saved saving.png"))); // NOI18N
        menusalvar.setText("Registrar");
        menusalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menusalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menusalvar);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764 - back backward left reply turn.png"))); // NOI18N
        jMenu4.setText("Voltar");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menusalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusalvarMouseClicked
        try {
            Clientes obj = new Clientes();

            obj.setCod_cliente(Integer.parseInt(txtcodigo.getText()));
            obj.setConta(Double.parseDouble(txtPagamento.getText()));

            if(obj.getConta() <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido");
            } else {
                ClientesDAO dao = new ClientesDAO();
                dao.AlterarSaldo(obj);

                this.dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro:" +e);
        }
    }//GEN-LAST:event_menusalvarMouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcreditoActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagamentoActionPerformed

    private void txtsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsaldoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxtcpf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menusalvar;
    private javax.swing.JMenu menutitulo;
    private javax.swing.JTextField txtPagamento;
    public javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcredito;
    public javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
