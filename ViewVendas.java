/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasCliente;
import controller.ControllerVendasProdutos;
import controller.Controllercliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendas;
import model.ModelVendasCliente;
import model.ModelVendasProdutos;
import model.Modelcliente;
import util.BLDatas;

/**
 *
 * @author User
 */
public class ViewVendas extends javax.swing.JFrame {
    Controllercliente controllercliente = new Controllercliente();
    Modelcliente modelCliente = new Modelcliente();
    ArrayList<Modelcliente> listaModelCliente = new ArrayList<>();
    ControllerProdutos controllerProduto = new ControllerProdutos();
    ModelProdutos modelProduto = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProduto = new ArrayList<>();
    ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList<>();
    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    BLDatas blDatas = new BLDatas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
            /**
     * Creates new form ViewVendas
     */
    public ViewVendas() {
        initComponents();
        listarClientes();
        listarProdutos();
        setLocationRelativeTo(null);
        carregarVendas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoCli = new javax.swing.JTextField();
        jcbNomeCliente = new componentes.UJComboBox();
        jLabel2 = new javax.swing.JLabel();
        jtfNumeroVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigoPro = new javax.swing.JTextField();
        jcbNomeProduto = new componentes.UJComboBox();
        jLabel5 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jbAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutosVenda = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jtfValorTotal = new javax.swing.JTextField();
        jtfDesconto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtfPesquisar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setResizable(false);

        jLabel1.setText("C??digo Cli.");

        jtfCodigoCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoCliFocusLost(evt);
            }
        });

        jcbNomeCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbNomeClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("N??mero da Venda:");

        jLabel4.setText("C??digo Pro.");

        jtfCodigoPro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoProFocusLost(evt);
            }
        });

        jcbNomeProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbNomeProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setText("Quantidade:");

        jtfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuantidadeActionPerformed(evt);
            }
        });

        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        tbProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Prod.", "Nome Produto", "Quant.", "Valor Un.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdutosVenda);
        if (tbProdutosVenda.getColumnModel().getColumnCount() > 0) {
            tbProdutosVenda.getColumnModel().getColumn(0).setMinWidth(70);
            tbProdutosVenda.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbProdutosVenda.getColumnModel().getColumn(0).setMaxWidth(70);
            tbProdutosVenda.getColumnModel().getColumn(2).setMinWidth(70);
            tbProdutosVenda.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbProdutosVenda.getColumnModel().getColumn(2).setMaxWidth(70);
            tbProdutosVenda.getColumnModel().getColumn(3).setMinWidth(90);
            tbProdutosVenda.getColumnModel().getColumn(3).setPreferredWidth(90);
            tbProdutosVenda.getColumnModel().getColumn(3).setMaxWidth(90);
            tbProdutosVenda.getColumnModel().getColumn(4).setMinWidth(90);
            tbProdutosVenda.getColumnModel().getColumn(4).setPreferredWidth(90);
            tbProdutosVenda.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorTotalActionPerformed(evt);
            }
        });

        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jtfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescontoActionPerformed(evt);
            }
        });

        jLabel6.setText("Desconto:");

        jLabel7.setText("Valor Total:");

        jLabel9.setText("Nome do Produto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfCodigoPro)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jtfCodigoCli)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNumeroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(428, 428, 428)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumeroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jLabel8.setText("Pesquisar:");

        jbPesquisar.setText("Pesquisar");

        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Nome Cliente", "Date"
            }
        ));
        jScrollPane2.setViewportView(tbVendas);
        if (tbVendas.getColumnModel().getColumnCount() > 0) {
            tbVendas.getColumnModel().getColumn(0).setMinWidth(110);
            tbVendas.getColumnModel().getColumn(0).setPreferredWidth(110);
            tbVendas.getColumnModel().getColumn(0).setMaxWidth(110);
            tbVendas.getColumnModel().getColumn(2).setMinWidth(110);
            tbVendas.getColumnModel().getColumn(2).setPreferredWidth(110);
            tbVendas.getColumnModel().getColumn(2).setMaxWidth(110);
        }

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar/Excluir/Alterar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeClienteActionPerformed

    private void jtfCodigoCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoCliFocusLost
        // TODO add your handling code here:
        modelCliente = controllercliente.getclienteController(Integer.parseInt(jtfCodigoCli.getText()));
        jcbNomeCliente.setSelectedItem(modelCliente.getCliNome());
    }//GEN-LAST:event_jtfCodigoCliFocusLost

    private void jcbNomeClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeClientePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if(jcbNomeCliente.isPopupVisible()){
            modelCliente = controllercliente.getclienteController(jcbNomeCliente.getSelectedItem().toString());
            jtfCodigoCli.setText(String.valueOf(modelCliente.getId_cliente()));
        }
    }//GEN-LAST:event_jcbNomeClientePopupMenuWillBecomeInvisible

    private void jcbNomeProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if(jcbNomeProduto.isPopupVisible()){
            modelProduto = controllerProduto.retornarProdutoController(jcbNomeProduto.getSelectedItem().toString());
            jtfCodigoPro.setText(String.valueOf(modelProduto.getIdProduto()));
        }
    }//GEN-LAST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible

    private void jtfCodigoProFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoProFocusLost
        // TODO add your handling code here:
        modelProduto = controllerProduto.retornarProdutoController(Integer.parseInt(jtfCodigoPro.getText()));
        jcbNomeProduto.setSelectedItem(modelProduto.getProNome());
    }//GEN-LAST:event_jtfCodigoProFocusLost

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linha = tbVendas.getSelectedRow();
        int codigoVenda = (int) tbVendas.getValueAt(linha, 0);
        listaModelProduto = new ArrayList<>();
        listaModelProdutosVendasProdutos =  controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);
        for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++){
            modelProduto = new ModelProdutos();
            modelProduto.setIdProduto(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto());
            modelProduto.setProEstoque(
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProEstoque()
                    +
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade());
            listaModelProduto.add(modelProduto);
        }
        if (controllerProduto.alterarEstoqueProdutoController(listaModelProduto)){
            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if(controllerVendas.excluirVendasController(codigoVenda)){
                JOptionPane.showMessageDialog(this, "Venda excluida com sucesso", "Aten????o", JOptionPane.WARNING_MESSAGE);
                this.carregarVendas();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao excluir Venda", "Erro", JOptionPane.ERROR_MESSAGE);
             }
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir Venda", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        // TODO add your handling code here:
        if(jtfQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Voc?? deve preencher todos os campos!","Aten????o",JOptionPane.WARNING_MESSAGE);
        }else{
            modelProduto = controllerProduto.retornarProdutoController(Integer.parseInt(jtfCodigoPro.getText()));
            //adicionar linha na tabela
            DefaultTableModel modelo = (DefaultTableModel) tbProdutosVenda.getModel();
            int cont = 0;
            double quantidade=0;
            quantidade = Double.parseDouble(jtfQuantidade.getText());
            for (int i = 0; i < cont; i++){
                modelo.setNumRows(0);
            }
            
            modelo.addRow(new Object[]{
            modelProduto.getIdProduto(),
                modelProduto.getProNome(),
                jtfQuantidade.getText(),
                modelProduto.getProValor(),
                quantidade * modelProduto.getProValor()
            });
            somarValorTotalProdutos();
        }
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        // TODO add your handling code here:
        somarValorTotalProdutos();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        limparFormulario();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        int codigovenda = 0, codigoProduto = 0;
        double desconto = 0;
        listaModelVendasProdutos = new ArrayList<>();
        
        if(jtfDesconto.getText().equals("")){
            desconto = 0;
        }else{
            desconto = Double.parseDouble(jtfDesconto.getText());
        }
        
        modelVendas.setCliente(Integer.parseInt(jtfCodigoCli.getText()));
        try{
            modelVendas.setVenDataVenda(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        }catch(Exception e){
        }
        modelVendas.setVenValorLiquido(Double.parseDouble(jtfValorTotal.getText()));
        modelVendas.setVenValorBruto(Double.parseDouble(jtfValorTotal.getText()) + desconto);
        
        modelVendas.setVenDesconto(desconto);
        
        // salvar venda
        codigovenda = controllerVendas.salvarVendasController(modelVendas);
        if(codigovenda>0){
                JOptionPane.showMessageDialog(this, "Venda salva com sucesso", "Aten????o", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
                limparFormulario();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar a Venda", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        int cont = tbProdutosVenda.getRowCount();
        for(int i = 0; i < cont; i++){
            codigoProduto = (int) tbProdutosVenda.getValueAt(i,0);
            modelVendasProdutos = new ModelVendasProdutos();
            modelProduto = new ModelProdutos();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVendas(codigovenda); 
            modelVendasProdutos.setVenProValor((double) tbProdutosVenda.getValueAt(i, 3));
            modelVendasProdutos.setVenProQuantidade(Integer.parseInt(tbProdutosVenda.getValueAt(i, 2).toString())); 
            
            modelProduto.setIdProduto(codigoProduto);
            modelProduto.setProEstoque(controllerProduto.retornarProdutoController(codigoProduto).getProEstoque()
                    -Integer.parseInt(tbProdutosVenda.getValueAt(i, 2).toString()));
            listaModelVendasProdutos.add(modelVendasProdutos);
            listaModelProduto.add(modelProduto);
        }
        if(controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)){
            controllerProduto.alterarEstoqueProdutoController(listaModelProduto);
            JOptionPane.showMessageDialog(this, "Produtos da Venda salva com sucesso", "Aten????o", JOptionPane.WARNING_MESSAGE);
            carregarVendas();
            limparFormulario();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar a produtos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorTotalActionPerformed

    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescontoActionPerformed

    private void jtfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendas().setVisible(true);
            }
        });
    }
    /**
     * preencher o combox com todos os clientes
     */
    private void listarClientes(){
        listaModelCliente = controllercliente.getListaclienteController();
        jcbNomeCliente.removeAllItems();
        for (int i = 0; i < listaModelCliente.size(); i++){
            jcbNomeCliente.addItem(listaModelCliente.get(i).getCliNome());
        }
    }
    //preecher o combox com todos os produtos
    private void listarProdutos(){
        listaModelProduto = controllerProduto.retornarListaProdutoController();
        jcbNomeProduto.removeAllItems();
        for (int i = 0; i < listaModelProduto.size(); i++){
            jcbNomeProduto.addItem(listaModelProduto.get(i).getProNome());
        }
    }
    
    private void aplicarDescontos(){
        try{
            jtfValorTotal.setText(String.valueOf(
                Double.parseDouble(jtfValorTotal.getText()) - Double.parseDouble(jtfDesconto.getText())));
        }catch (NumberFormatException e) {
        }
    }
   
    // somar todos os produtos da venda
    private void somarValorTotalProdutos(){
        double soma = 0, valor;
        int cont = tbProdutosVenda.getRowCount();
            for (int i = 0; i < cont; i++){
                valor = (double) tbProdutosVenda.getValueAt(i, 4);
                soma = soma + valor;
            }
            jtfValorTotal.setText(String.valueOf(soma));
            aplicarDescontos();
    }
    
    private void carregarVendas(){
        DefaultTableModel modelo = (DefaultTableModel) tbVendas.getModel();
        listaModelVendasCliente = controllerVendasCliente.getListaVendasClienteController();
        int cont = listaModelVendasCliente.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
            listaModelVendasCliente.get(i).getModelVendas().getIdVendas(),
            listaModelVendasCliente.get(i).getModelCliente().getCliNome(),
            listaModelVendasCliente.get(i).getModelVendas().getVenDataVenda()
            });
        }
    }
    
    private void limparFormulario(){
        jtfQuantidade.setText("");
        jtfDesconto.setText("");
        jtfValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tbProdutosVenda.getModel();
        modelo.setNumRows(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private componentes.UJComboBox jcbNomeCliente;
    private componentes.UJComboBox jcbNomeProduto;
    private javax.swing.JTextField jtfCodigoCli;
    private javax.swing.JTextField jtfCodigoPro;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfNumeroVenda;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorTotal;
    private javax.swing.JTable tbProdutosVenda;
    private javax.swing.JTable tbVendas;
    // End of variables declaration//GEN-END:variables
}
