/*
Produzido por: Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
package telas;

import dao.ComprasDAO;
import dao.FornecedoresDAO;
import dao.ProdutosDAO;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Compras;
import model.Itens;
import model.Produtos;

/**
 *
 * @author Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
public class FrmEstoqueEntrada extends javax.swing.JFrame {

    /**
     * Creates new form FrmEstoqueEntrada
     */
    public FrmEstoqueEntrada() {
        initComponents();
    }

    void Preencher(String codigo) {
        txtusuario.setText(codigo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtfornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaitens = new javax.swing.JTable();
        btnrmvitem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelafornecedores = new javax.swing.JTable();
        ftxtdata = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-##-##");
            ftxtdata = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaprodutos = new javax.swing.JTable();
        btnadcitem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menutitulo = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menucadastrar = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor total:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, -1, 30));

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttotal.setText("R$");
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID Usuário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fornecedor selecionado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, 30));

        txtusuario.setEditable(false);
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 80, 30));

        txtfornecedor.setEditable(false);
        txtfornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfornecedorMouseClicked(evt);
            }
        });
        txtfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtfornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, 80, 30));

        tabelaitens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Custo Unit.", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaitens.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelaitensPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaitens);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 470, 190));

        btnrmvitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643736 - back backward left mark sign.png"))); // NOI18N
        btnrmvitem.setText("Remover Item");
        btnrmvitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvitemActionPerformed(evt);
            }
        });
        getContentPane().add(btnrmvitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 360, 140, 70));

        tabelafornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Empresa", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelafornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelafornecedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelafornecedores);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 420, 120));

        ftxtdata.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(ftxtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, 30));

        tabelaprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cod. Barra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaprodutos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 190));

        btnadcitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643735 - forward mark next right sign.png"))); // NOI18N
        btnadcitem.setText("Adicionar Item");
        btnadcitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadcitemActionPerformed(evt);
            }
        });
        getContentPane().add(btnadcitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 140, 70));

        menutitulo.setText("Entrada de estoque (Compras)");
        jMenuBar1.add(menutitulo);

        jMenu3.setText("                                                                                     ");
        jMenuBar1.add(jMenu3);

        menucadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643737 - cart drop shop shopping trolly.png"))); // NOI18N
        menucadastrar.setText("Finalizar compra");
        menucadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menucadastrarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menucadastrar);

        jMenu4.setText("                                                                                                                                     ");
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643769 - building home house main menu start.png"))); // NOI18N
        jMenu5.setText("Menu");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrmvitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvitemActionPerformed

        if (tabelaitens.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelaitens.getModel();

            model.removeRow(tabelaitens.getSelectedRow());

            tabelaitens.setModel(model);
        }

    }//GEN-LAST:event_btnrmvitemActionPerformed

    private void menucadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucadastrarMouseClicked
        try {
            double custo;
            int qntdd;
            
            for (int i = 0; i < tabelaitens.getRowCount(); i++) {
                try {
                    custo = Double.parseDouble(tabelaitens.getValueAt(i, 2).toString());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor de custo do item "+(i+1)+" deve ser um valor numérico");
                    tabelaitens.grabFocus();
                    return;
                }

                try {
                    qntdd = Integer.parseInt(tabelaitens.getValueAt(i, 3).toString());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor de quantidade do item "+(i+1)+" deve ser um valor numérico");
                    tabelaitens.grabFocus();
                    return;
                }

                if (custo <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor de custo do item "+(i+1)+" deve ser maior que zero");
                    tabelaitens.grabFocus();
                    return;
                }

                if (qntdd <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor de quantidade do item "+(i+1)+" deve ser maior que zero");
                    tabelaitens.grabFocus();
                    return;
                }
            }

            DefaultTableModel model = (DefaultTableModel) tabelaitens.getModel();
            Compras compra = new Compras();
            Produtos produto = new Produtos();
            Itens item = new Itens();

            compra.setData(ftxtdata.getText());
            compra.setCod_fornecedor(Integer.parseInt(txtfornecedor.getText()));
            compra.setCod_usuario(Integer.parseInt(txtusuario.getText()));

            //Registra a compra
            ComprasDAO daoc = new ComprasDAO();
            ProdutosDAO daop = new ProdutosDAO();

            daoc.Cadastrar(compra);

            int nCompra = daoc.NumeroCompra();
            item.setCod_CV(nCompra);
            int auxi;
            double auxd;

            for (int i = 0; i < model.getRowCount(); i++) {

                auxi = Integer.parseInt(model.getValueAt(i, 0).toString());
                item.setCod_Item(auxi);
                auxd = Double.parseDouble(model.getValueAt(i, 2).toString());
                item.setValor(auxd);
                auxi = Integer.parseInt(model.getValueAt(i, 3).toString());
                item.setQuantidade(auxi);

                //Registra os itens da compra
                daoc.CadastrarItens(item);

                //Altera o estoque dos produtos comprados
                auxi = item.getCod_Item();
                produto.setCod_produto(auxi);
                auxi = item.getQuantidade();
                produto.setQuantidade(auxi);
                daop.AlterarEstoque(produto);
            }

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            this.dispose();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_menucadastrarMouseClicked

    private void txtfornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfornecedorMouseClicked

    }//GEN-LAST:event_txtfornecedorMouseClicked

    private void txtfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfornecedorActionPerformed

    private void tabelafornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelafornecedoresMouseClicked
        if (tabelafornecedores.getSelectedRow() != -1) {
            txtfornecedor.setText(tabelafornecedores.getValueAt(tabelafornecedores.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tabelafornecedoresMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            FornecedoresDAO dao = new FornecedoresDAO();
            DefaultTableModel model = dao.Listar();
            tabelafornecedores.setModel(model);
        } catch (Exception e) {
        }

        try {
            ProdutosDAO dao = new ProdutosDAO();
            DefaultTableModel model = dao.Listar();
            tabelaprodutos.setModel(model);
        } catch (Exception e) {
        }

        txttotal.setText("R$");
    }//GEN-LAST:event_formWindowOpened

    private void btnadcitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadcitemActionPerformed

        if (tabelaprodutos.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelaitens.getModel();

            String codigo = tabelaprodutos.getValueAt(tabelaprodutos.getSelectedRow(), 0).toString();
            String nome = tabelaprodutos.getValueAt(tabelaprodutos.getSelectedRow(), 1).toString();

            model.addRow(new String[]{codigo, nome, "0.0", "0", "0.0"});
            tabelaitens.setModel(model);
        }
    }//GEN-LAST:event_btnadcitemActionPerformed

    private void tabelaitensPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaitensPropertyChange
        Double total = 0.0, custo = 0.0;
        int qntdd = 0;
        boolean perm;

        for (int i = 0; i < tabelaitens.getRowCount(); i++) {
            perm = true;
            
            try {
                custo = Double.parseDouble(tabelaitens.getValueAt(i, 2).toString());
            } catch (NumberFormatException e) {
                perm = false;
            }

            try {
                qntdd = Integer.parseInt(tabelaitens.getValueAt(i, 3).toString());
            } catch (NumberFormatException e) {
                perm = false;
            }
            
            if (perm) {
                tabelaitens.setValueAt(custo * qntdd, i, 4);
                total += custo * qntdd;
            }
        }

        txttotal.setText("R$" + total.toString());
    }//GEN-LAST:event_tabelaitensPropertyChange

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(FrmEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstoqueEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadcitem;
    private javax.swing.JButton btnrmvitem;
    private javax.swing.JFormattedTextField ftxtdata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu menucadastrar;
    private javax.swing.JMenu menutitulo;
    private javax.swing.JTable tabelafornecedores;
    private javax.swing.JTable tabelaitens;
    private javax.swing.JTable tabelaprodutos;
    private javax.swing.JTextField txtfornecedor;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
