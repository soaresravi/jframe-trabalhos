package view;

import static controller.connection.*;

import java.util.HashSet;
import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class tVendas extends javax.swing.JFrame {
    
    DefaultTableModel model, modelProduto, modelVenda;
    int estoqueAtual;
    double totalGeral = 0;

    public void passarCamposEnter(JPanel... paineis) { //porque vai passar por vários paineis. aceita vários paineis
        for (JPanel painel : paineis) { //itera sobre cada painel passado como argumento
            HashSet<AWTKeyStroke> conj = new HashSet<>(painel.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
           //com tipo genérico. só pode conter objetos desse tipo
            conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
            painel.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        }
    }
    
    public tVendas() {
        initComponents();    
        Conectar();
        passarCamposEnter(pnVenda, pnCliente, pnProdutos); //passa todos os paineis
                
        pnDescrClientes.setVisible(false);
        pnDescrProdutos.setVisible(false);
        
        tbClientes.getColumnModel().getColumn(0).setMaxWidth(40);
        tbClientes.getColumnModel().getColumn(1).setMaxWidth(100);
        tbClientes.getColumnModel().getColumn(2).setMaxWidth(100);
        tbClientes.getColumnModel().getColumn(3).setMaxWidth(100);
        tbClientes.getColumnModel().getColumn(4).setMaxWidth(100);
        tbClientes.getColumnModel().getColumn(5).setMaxWidth(100);
        
        tbProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
        tbProdutos.getColumnModel().getColumn(1).setMaxWidth(100);
        tbProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
        tbProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
        tbProdutos.getColumnModel().getColumn(4).setMaxWidth(100);
        
        model = (DefaultTableModel) tbClientes.getModel();
        modelProduto = (DefaultTableModel) tbProdutos.getModel();
        modelVenda = (DefaultTableModel) tbNovaVenda.getModel();    
        
        tfData.requestFocus();
    }
    
    public void limpar() {
        tfData.setText("");
        tfNome.setText("");
        tfIdNome.setText("");
        tfDescricao.setText("");
        tfUnidade.setText("");
        tfEstoque.setText("");
        tfValor.setText("");
        tfQtdVendida.setText("");
        tfValorTotal.setText("");
        tfValorAtual.setText("");
        modelVenda.setRowCount(0);
        modelProduto.setRowCount(0);
        model.setRowCount(0);
        tfNome.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDescrClientes = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btSelecionarClientes = new javax.swing.JButton();
        btSairClientes = new javax.swing.JButton();
        pnDescrProdutos = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btSelecionarProdutos = new javax.swing.JButton();
        btSairProdutos = new javax.swing.JButton();
        pnCliente = new javax.swing.JPanel();
        lbDadosClientes = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        btNomeConsulta = new javax.swing.JButton();
        tfIdNome = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        pnVenda = new javax.swing.JPanel();
        lbIdVenda = new javax.swing.JLabel();
        tfIdVenda = new javax.swing.JTextField();
        lbdadosVenda = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        tfData = new javax.swing.JFormattedTextField();
        pnNovaVenda = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbNovaVenda = new javax.swing.JTable();
        btNovaVenda = new javax.swing.JButton();
        tfValorAtual = new javax.swing.JTextField();
        pnProdutos = new javax.swing.JPanel();
        lbDadosProduto = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        tfUnidade = new javax.swing.JTextField();
        lbUnidade = new javax.swing.JLabel();
        lbEstoque = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        lbQtdVendida = new javax.swing.JLabel();
        tfQtdVendida = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        lbValorTotal = new javax.swing.JLabel();
        tfValorTotal = new javax.swing.JTextField();
        btDescricaoConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnDescrClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email", "CPF", "Endereço", "Telefone"
            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbClientes);

        btSelecionarClientes.setText("Selecionar");
        btSelecionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarClientesActionPerformed(evt);
            }
        });

        btSairClientes.setBackground(new java.awt.Color(255, 0, 51));
        btSairClientes.setForeground(new java.awt.Color(255, 255, 255));
        btSairClientes.setText("X");
        btSairClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDescrClientesLayout = new javax.swing.GroupLayout(pnDescrClientes);
        pnDescrClientes.setLayout(pnDescrClientesLayout);
        pnDescrClientesLayout.setHorizontalGroup(
            pnDescrClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescrClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDescrClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDescrClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSairClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSelecionarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnDescrClientesLayout.setVerticalGroup(
            pnDescrClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescrClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDescrClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSairClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSelecionarClientes)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnDescrProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Unidade", "Quantidade", "Valor"
            }
        ));
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbProdutos);

        btSelecionarProdutos.setText("Selecionar");
        btSelecionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarProdutosActionPerformed(evt);
            }
        });

        btSairProdutos.setBackground(new java.awt.Color(255, 0, 51));
        btSairProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btSairProdutos.setText("X");
        btSairProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDescrProdutosLayout = new javax.swing.GroupLayout(pnDescrProdutos);
        pnDescrProdutos.setLayout(pnDescrProdutosLayout);
        pnDescrProdutosLayout.setHorizontalGroup(
            pnDescrProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescrProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDescrProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSelecionarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDescrProdutosLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSairProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDescrProdutosLayout.setVerticalGroup(
            pnDescrProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescrProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDescrProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSairProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSelecionarProdutos)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbDadosClientes.setText("Dados do cliente");

        lbName.setText("Nome");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        btNomeConsulta.setText("jButton6");
        btNomeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomeConsultaActionPerformed(evt);
            }
        });

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbName)
                        .addGap(18, 18, 18)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfIdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbDadosClientes))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDadosClientes)
                .addGap(22, 22, 22)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfIdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbIdVenda.setBackground(new java.awt.Color(204, 204, 204));
        lbIdVenda.setText("Id Venda");

        tfIdVenda.setEnabled(false);

        lbdadosVenda.setText("Dados da venda");

        lbData.setText("Data");

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnVendaLayout = new javax.swing.GroupLayout(pnVenda);
        pnVenda.setLayout(pnVendaLayout);
        pnVendaLayout.setHorizontalGroup(
            pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdadosVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnVendaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnVendaLayout.setVerticalGroup(
            pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdadosVenda)
                .addGroup(pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnVendaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdVenda)
                            .addComponent(tfIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(pnVendaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnNovaVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbNovaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descrição", "Unidade", "Quantidade ", "Valor", "Total"
            }
        ));
        jScrollPane7.setViewportView(tbNovaVenda);

        btNovaVenda.setText("Nova venda");
        btNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaVendaActionPerformed(evt);
            }
        });

        tfValorAtual.setText("0");

        javax.swing.GroupLayout pnNovaVendaLayout = new javax.swing.GroupLayout(pnNovaVenda);
        pnNovaVenda.setLayout(pnNovaVendaLayout);
        pnNovaVendaLayout.setHorizontalGroup(
            pnNovaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNovaVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNovaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnNovaVendaLayout.createSequentialGroup()
                        .addComponent(btNovaVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7))
                .addGap(65, 65, 65))
        );
        pnNovaVendaLayout.setVerticalGroup(
            pnNovaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNovaVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNovaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovaVenda)
                    .addComponent(tfValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbDadosProduto.setText("Dados do produto");

        lbDescricao.setText("Descrição");

        lbUnidade.setText("Unidade");

        lbEstoque.setText("Qtda. Estoque");
        lbEstoque.setToolTipText("");

        lbValor.setText("Valor");

        lbQtdVendida.setText("Qtde. Vendida");

        tfQtdVendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtdVendidaActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        lbValorTotal.setText("Valor total");

        btDescricaoConsulta.setText("jButton6");
        btDescricaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescricaoConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnProdutosLayout = new javax.swing.GroupLayout(pnProdutos);
        pnProdutos.setLayout(pnProdutosLayout);
        pnProdutosLayout.setHorizontalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDadosProduto)
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescricao)
                            .addComponent(lbUnidade))
                        .addGap(18, 18, 18)
                        .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnProdutosLayout.createSequentialGroup()
                                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDescricaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lbEstoque))
                            .addGroup(pnProdutosLayout.createSequentialGroup()
                                .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbValor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(tfValor)))
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addComponent(lbQtdVendida)
                        .addGap(18, 18, 18)
                        .addComponent(tfQtdVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btAdicionar)
                        .addGap(42, 42, 42)
                        .addComponent(lbValorTotal)
                        .addGap(18, 18, 18)
                        .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnProdutosLayout.setVerticalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDadosProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstoque)
                    .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDescricaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbValor)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUnidade))
                .addGap(44, 44, 44)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQtdVendida)
                    .addComponent(tfQtdVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar)
                    .addComponent(lbValorTotal)
                    .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnNovaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnDescrClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnDescrProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pnDescrClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pnDescrProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfQtdVendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtdVendidaActionPerformed
        
    }//GEN-LAST:event_tfQtdVendidaActionPerformed

    private void btDescricaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescricaoConsultaActionPerformed
        String pesquisa = null, sql = null, table = "s";
        pesquisa = tfDescricao.getText() + "%";
        tbProdutos.setVisible(true);
        modelProduto.setRowCount(0);
        sql = "Select * from produtos where descricao like ?";
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stm.setString(1, pesquisa);
            ResultSet rs = stm.executeQuery();
            
            if (rs.first()) {           
                if (table.equals("s")) {       
                    
                    pnDescrProdutos.setVisible(true);
                    rs.previous();
                    
                    while (rs.next()) {
                        String[] linha = new String[] {
                            rs.getString("id"),
                            rs.getString("descricao"),
                            rs.getString("unidade"),
                            rs.getString("quantidade"),
                            rs.getString("valor"),
                        };
                        
                        modelProduto.addRow(linha);
                    }
                    
                } else {
                    tfDescricao.setText(rs.getString("descricao"));
                    tfUnidade.setText(rs.getString("unidade"));
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Dados não localizados!");
            }
                    
        } catch (SQLException error) {
            System.out.println("Erro: " + error);
        }
    }//GEN-LAST:event_btDescricaoConsultaActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btNomeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomeConsultaActionPerformed
        String pesquisa = null, sql = null, table = "s";
        pesquisa = tfNome.getText() + "%"; 
        tbClientes.setVisible(true);
        model.setRowCount(0);
        sql = "Select * from clientes where nome like ?";
        
        try {
            PreparedStatement stm = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stm.setString(1, pesquisa);
            ResultSet rs = stm.executeQuery();
            
            if (rs.first()) {             
                if (table.equals("s")) {
                    
                    pnDescrClientes.setVisible(true);
                    rs.previous();
                
                    while (rs.next()) {
                         String[] linha = new String[] {
                             rs.getString("id"),
                             rs.getString("nome"),
                             rs.getString("email"),
                             rs.getString("cpf"),
                             rs.getString("endereco"),
                             rs.getString("telefone"),
                        };   
                         
                        model.addRow(linha);    
                    }
                        
                 } else {
                     tfIdVenda.setText(rs.getString("id"));
                     tfNome.setText(rs.getString("nome"));
                }        
                
            } else {
                    JOptionPane.showMessageDialog(null, "Dados não localizados!");
            }
                
        } catch (SQLException error) {
            System.out.println("Erro: " + error);
        }
    }//GEN-LAST:event_btNomeConsultaActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        int linha;
        String id, nome, email, cpf, endereco, telefone;
        linha = tbClientes.getSelectedRow();
        id = (String) tbClientes.getValueAt(linha, 0);
        nome = (String) tbClientes.getValueAt(linha, 1);
        email = (String) tbClientes.getValueAt(linha, 2);
        cpf = (String) tbClientes.getValueAt(linha, 3);
        endereco = (String) tbClientes.getValueAt(linha, 4);
        telefone = (String) tbClientes.getValueAt(linha, 5);
    }//GEN-LAST:event_tbClientesMouseClicked

    private void btSelecionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarClientesActionPerformed
        //quando achar a pessoa a procura na consulta vai clicar nela e ir em selecionar
        int linha = tbClientes.getSelectedRow();
        tfIdNome.setText((String) tbClientes.getValueAt(linha, 0)); //se eu tivesse colocado em tbClientesMouseClicked que nem em aula bd clientes eria mais fácil
        tfNome.setText((String) tbClientes.getValueAt(linha, 1)); //pega o que ta na linha e na coluna 1 da tabela clientes, transforma pra string e define que vai escrever isso ai
        tfDescricao.requestFocus();
    }//GEN-LAST:event_btSelecionarClientesActionPerformed

    private void btSairClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairClientesActionPerformed
        pnDescrClientes.setVisible(false);
        tfNome.setText("");
        tfIdNome.setText("");
        tfDescricao.requestFocus();
    }//GEN-LAST:event_btSairClientesActionPerformed

    private void btSelecionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarProdutosActionPerformed
        int linha = tbProdutos.getSelectedRow();
        tfDescricao.setText((String) tbProdutos.getValueAt(linha, 1));
        tfUnidade.setText((String) tbProdutos.getValueAt(linha, 2));
        tfEstoque.setText((String) tbProdutos.getValueAt(linha, 3));
        tfValor.setText((String) tbProdutos.getValueAt(linha, 4));
        tfQtdVendida.requestFocus();
    }//GEN-LAST:event_btSelecionarProdutosActionPerformed

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        int linha;
        String id, descricao, unidade, quantidade, valor;
        linha = tbProdutos.getSelectedRow();
        id = (String) tbProdutos.getValueAt(linha, 0);
        descricao = (String) tbProdutos.getValueAt(linha, 1);
        unidade = (String) tbProdutos.getValueAt(linha, 2);
        quantidade = (String) tbProdutos.getValueAt(linha, 3);
        valor = (String) tbProdutos.getValueAt(linha, 4);
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
       double valorTotal, valor = Double.parseDouble(tfValor.getText()); //colocando numa variável double um valor em texto
       int qtdVendida = Integer.parseInt(tfQtdVendida.getText());
       estoqueAtual = Integer.parseInt(tfEstoque.getText());
       
       modelVenda.setRowCount(0);
       
       if (qtdVendida > estoqueAtual) {
           JOptionPane.showMessageDialog(null, "Estoque insuficiente");
           return; //pra parar se tiver 0
       }
       
       valorTotal = valor * qtdVendida;
       totalGeral += valorTotal;
       
       tfValorTotal.setText(String.valueOf(valorTotal)); //pra escrever um valor em double em texto tem que transformar
       tfValorAtual.setText(String.valueOf(totalGeral));

       estoqueAtual -= qtdVendida;
       tfEstoque.setText(String.valueOf(estoqueAtual));
       
       String sql, data, descricao, unidade, quantidade, valorModel, totalModel, table = "s";
       
       descricao = tfDescricao.getText();
       unidade = tfUnidade.getText();
       quantidade = tfEstoque.getText();
       valorModel = tfValor.getText();
       totalModel = tfValorTotal.getText();
       data = tfData.getText();
       
       LocalDate dataPedidoFormat = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       
       try {
           sql = "update produtos set quantidade = ? where descricao = ?";
           
           PreparedStatement stmUpdate = con.prepareStatement(sql);
           stmUpdate.setInt(1, estoqueAtual); //int porque estoqueAtual nao é string. atualizando o valor do estoque no db também
           stmUpdate.setString(2, descricao);
           stmUpdate.executeUpdate();
           
           sql = "insert into teste (descricao, unidade, quantidade, valor, total, data) values (?, ?, ?, ?, ?, ?)";
           
           PreparedStatement stm = con.prepareStatement(sql);
           stm.setString(1, descricao);
           stm.setString(2, unidade);
           stm.setString(3, quantidade);
           stm.setString(4, valorModel);
           stm.setString(5, totalModel);
           stm.setString(6, dataPedidoFormat.toString());
           
           boolean result = stm.execute();
           
           if (!result) {
               JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
               
               sql = "select * from teste order by id desc limit 1"; //padrão mysql, selecione tudo da tabela teste em ordem decrescente, só que só ele
               stm = con.prepareStatement(sql);
               ResultSet rs = stm.executeQuery();
               
               while (rs.next()) {
                   String[] linha = new String[] {
                       rs.getString("descricao"),
                       rs.getString("unidade"),
                       rs.getString("quantidade"),
                       rs.getString("valor"),
                       rs.getString("total")
                   };
                   
                   modelVenda.addRow(linha);
               }
               
           } else {
               JOptionPane.showMessageDialog(null, "Erro ao adicionar.");
           }
           
       } catch (SQLException error) {
           System.out.println("Erro: " + error);
       }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaVendaActionPerformed
        limpar();
    }//GEN-LAST:event_btNovaVendaActionPerformed

    private void btSairProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairProdutosActionPerformed
        pnDescrProdutos.setVisible(false);
        tfDescricao.setText("");
        tfUnidade.setText("");
        tfEstoque.setText("");
        tfValor.setText("");
    }//GEN-LAST:event_btSairProdutosActionPerformed
    
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
            java.util.logging.Logger.getLogger(tVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btDescricaoConsulta;
    private javax.swing.JButton btNomeConsulta;
    private javax.swing.JButton btNovaVenda;
    private javax.swing.JButton btSairClientes;
    private javax.swing.JButton btSairProdutos;
    private javax.swing.JButton btSelecionarClientes;
    private javax.swing.JButton btSelecionarProdutos;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel lbDadosClientes;
    private javax.swing.JLabel lbDadosProduto;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbIdVenda;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbQtdVendida;
    private javax.swing.JLabel lbUnidade;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lbdadosVenda;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnDescrClientes;
    private javax.swing.JPanel pnDescrProdutos;
    private javax.swing.JPanel pnNovaVenda;
    private javax.swing.JPanel pnProdutos;
    private javax.swing.JPanel pnVenda;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbNovaVenda;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfIdNome;
    private javax.swing.JTextField tfIdVenda;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfQtdVendida;
    private javax.swing.JTextField tfUnidade;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfValorAtual;
    private javax.swing.JTextField tfValorTotal;
    // End of variables declaration//GEN-END:variables
}
