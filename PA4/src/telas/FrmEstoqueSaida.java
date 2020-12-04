/*
Produzido por: Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
package telas;

import dao.ClientesDAO;
import dao.ProdutosDAO;
import dao.VendasDAO;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.Itens;
import model.Produtos;
import model.Vendas;

/**
 *
 * @author gabri
 */
public class FrmEstoqueSaida extends javax.swing.JFrame {

    /**
     * Creates new form FrmEstoqueSaida
     */
    public FrmEstoqueSaida() {
        initComponents();
    }

    void Preencher(String codigo, String nome) {
        txtusuario.setText(codigo);
        txtnomevendedor.setText(nome);
        txtcliente.setText("1");
        txtnomecliente.setText("Consumidor Final");
        ftxtcpf.setText("XXXXXXXXXXX");
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
        txttotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaitens = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodbarra = new javax.swing.JTextField();
        btnrmvitem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtnomevendedor = new javax.swing.JTextField();
        txtqtd = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        txtnomecliente = new javax.swing.JTextField();
        ftxtcpf = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###.###.###-##");
            ftxtcpf = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jMenuBar1 = new javax.swing.JMenuBar();
        menutitulo = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menucadastrar = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Valor total:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 220, 60));

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txttotal.setText("R$0,00");
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 290, 60));

        tabelaitens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Custo Unit.", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 790, 350));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Vendedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Remover produto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        txtcodbarra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcodbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodbarraActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 140, 30));

        btnrmvitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643764 - back backward left reply turn.png"))); // NOI18N
        btnrmvitem.setText("Remover Item");
        btnrmvitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvitemActionPerformed(evt);
            }
        });
        getContentPane().add(btnrmvitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, 20));

        txtnomevendedor.setEditable(false);
        txtnomevendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomevendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtnomevendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, 30));

        txtqtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtqtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdActionPerformed(evt);
            }
        });
        getContentPane().add(txtqtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Inserir produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 20));

        txtusuario.setEditable(false);
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cliente CPF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 30));

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 30, 30));

        txtnomecliente.setEditable(false);
        txtnomecliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomecliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnomecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtnomecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 140, 30));

        ftxtcpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftxtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtcpfActionPerformed(evt);
            }
        });
        getContentPane().add(ftxtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 110, 30));

        menutitulo.setText("Telas de vendas");
        jMenuBar1.add(menutitulo);

        jMenu3.setText("                                                                                                                   ");
        jMenuBar1.add(jMenu3);

        menucadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3643737 - cart drop shop shopping trolly.png"))); // NOI18N
        menucadastrar.setText("Finalizar Venda");
        menucadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menucadastrarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menucadastrar);

        jMenu4.setText("                                                                                                                                    ");
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

    private void menucadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucadastrarMouseClicked
        try {
            double custo, qntdd, total = 0.0;
            
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
                
                total += custo * qntdd;
            }
            
            String cpf;
            cpf = ftxtcpf.getText();
            cpf = cpf.replace(".","");
            cpf = cpf.replace("-","");
            cpf = cpf.replace(" ","");
            
            ClientesDAO daoc = new ClientesDAO();
            Clientes obj_cli = new Clientes();
            
            DefaultTableModel cliente = new DefaultTableModel();
            
            if (Integer.parseInt(txtcliente.getText()) == 1) {
                obj_cli.setCod_cliente(1);
                obj_cli.setCredito(total);
                obj_cli.setConta(0);
            } else {
                cliente = daoc.Buscar(cpf, 1, false);
                obj_cli.setCod_cliente(Integer.parseInt(cliente.getValueAt(0, 0).toString()));
                obj_cli.setCredito(Double.parseDouble(cliente.getValueAt(0, 6).toString()));
                obj_cli.setConta(Double.parseDouble(cliente.getValueAt(0, 7).toString()));
            }
            
            boolean permitido = false;
            double limite = obj_cli.getCredito() + obj_cli.getConta();
            
            //garante que so retornou um cliente ou que o cliente é o consumidor final
            if (cliente.getRowCount() == 1 || obj_cli.getCod_cliente() == 1) {
                
                //se saldo + credito >= compra ---> Autoriza
                if (limite >= total || obj_cli.getCod_cliente() == 1) {
                    permitido = true;
                    
                    //cliente 1 não precisa alterar conta
                    if (obj_cli.getCod_cliente() != 1) {
                        obj_cli.setConta(-1*total);
                        daoc.AlterarSaldo(obj_cli);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Venda não autorizada, limite do cliente: RS"+limite);
                }
            }
            
            if (tabelaitens.getRowCount() > 0 && permitido) {
                
                DefaultTableModel model = (DefaultTableModel) tabelaitens.getModel();
                Vendas venda = new Vendas();
                Produtos produto = new Produtos();
                Itens item = new Itens();

                LocalDate dataDeInscricao = LocalDate.now();

                venda.setData(dataDeInscricao.toString());
                venda.setCod_cliente(Integer.parseInt(txtcliente.getText()));
                venda.setCod_usuario(Integer.parseInt(txtusuario.getText()));

                //Registra a compra
                VendasDAO daov = new VendasDAO();
                ProdutosDAO daop = new ProdutosDAO();

                daov.Cadastrar(venda);

                int nVenda = daov.NumeroVenda();
                item.setCod_CV(nVenda);
                int auxi;
                double auxd;

                for (int i = 0; i < model.getRowCount();) {

                    auxi = Integer.parseInt(model.getValueAt(0, 0).toString());
                    item.setCod_Item(auxi);
                    auxd = Double.parseDouble(model.getValueAt(0, 2).toString());
                    item.setValor(auxd);
                    auxi = Integer.parseInt(model.getValueAt(0, 3).toString());
                    item.setQuantidade(auxi);
                    
                    //Remove o produto da lista
                    model.removeRow(0);
                    
                    //Registra os itens da compra
                    daov.CadastrarItens(item);

                    //Altera o estoque dos produtos comprados
                    auxi = item.getCod_Item();
                    produto.setCod_produto(auxi);
                    auxi = item.getQuantidade();
                    produto.setQuantidade(-1*auxi);
                    daop.AlterarEstoque(produto);
                }

                JOptionPane.showMessageDialog(null, "Venda registrada com sucesso!");

                
                txtqtd.setText(null);
                txtcodbarra.setText(null);
                txtcliente.setText("1");
                txtnomecliente.setText("Consumidor Final");
                ftxtcpf.setText(null);
                txttotal.setText("R$0,00");
                tabelaitens.setModel(model);
            
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menucadastrarMouseClicked

    private void tabelaitensPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaitensPropertyChange
        Double total = 0.0, custo;
        int qntdd;

        for (int i = 0; i < tabelaitens.getRowCount(); i++) {

            custo = Double.parseDouble(tabelaitens.getValueAt(i, 2).toString());
            qntdd = Integer.parseInt(tabelaitens.getValueAt(i, 3).toString());

            tabelaitens.setValueAt(custo * qntdd, i, 4);

            total += custo * qntdd;
        }

        txttotal.setText("R$" + total.toString());
    }//GEN-LAST:event_tabelaitensPropertyChange

    private void btnrmvitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvitemActionPerformed

        if (tabelaitens.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelaitens.getModel();

            model.removeRow(tabelaitens.getSelectedRow());

            tabelaitens.setModel(model);
        }

    }//GEN-LAST:event_btnrmvitemActionPerformed

    private void txtqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdActionPerformed

    private void txtcodbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodbarraActionPerformed
        try {
            int qtd;
            try {
                qtd = Integer.parseInt(txtqtd.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor de quantidade deve ser um valor numérico");
                txtqtd.grabFocus();
                return;
            }
            
            if (qtd <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de quantidade deve ser maior que zero");
                txtqtd.grabFocus();
                return;
            }
            
            ProdutosDAO dao = new ProdutosDAO();
            
            DefaultTableModel busca = dao.Buscar(txtcodbarra.getText(), 1);
            
            if (busca.getRowCount() == 1) {
                DefaultTableModel model = (DefaultTableModel) tabelaitens.getModel();
                
                int codigo = Integer.parseInt(busca.getValueAt(0, 0).toString());
                String nome = busca.getValueAt(0, 1).toString();
                double custo = Double.parseDouble(busca.getValueAt(0, 3).toString());
                int qntdd = qtd;
                double total = qntdd * custo;
                model.addRow(new String[]{codigo+"", nome, custo+"", qntdd+"",total+""});
                tabelaitens.setModel(model);
                txtcodbarra.setText(null);
                txtqtd.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }
            
            Double total = 0.0, custo;
            int qntdd;

            for (int i = 0; i < tabelaitens.getRowCount(); i++) {

                custo = Double.parseDouble(tabelaitens.getValueAt(i, 2).toString());
                qntdd = Integer.parseInt(tabelaitens.getValueAt(i, 3).toString());

                tabelaitens.setValueAt(custo * qntdd, i, 4);

                total += custo * qntdd;
            }

            txttotal.setText("R$" + total.toString());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtcodbarraActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtnomeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeclienteActionPerformed

    private void ftxtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtcpfActionPerformed
        try {
            String cpf;
            cpf = ftxtcpf.getText();
            cpf = cpf.replace(".","");
            cpf = cpf.replace("-","");
            cpf = cpf.replace(" ","");
            
            if (cpf.length() != 11) {
                JOptionPane.showMessageDialog(null, "CPF incompleto");
                ftxtcpf.grabFocus();
                return;
            }
            
            ClientesDAO dao = new ClientesDAO();
            
            DefaultTableModel model = dao.Buscar(cpf, 1, false);
            
            if(model.getRowCount() == 1) {
                txtcliente.setText(model.getValueAt(0, 0).toString());
                txtnomecliente.setText(model.getValueAt(0, 1).toString());
                //ftxtcpf.setText(model.getValueAt(0, 3).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ftxtcpfActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEstoqueSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstoqueSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstoqueSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstoqueSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstoqueSaida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrmvitem;
    private javax.swing.JFormattedTextField ftxtcpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenu menucadastrar;
    private javax.swing.JMenu menutitulo;
    private javax.swing.JTable tabelaitens;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcodbarra;
    private javax.swing.JTextField txtnomecliente;
    private javax.swing.JTextField txtnomevendedor;
    private javax.swing.JTextField txtqtd;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}