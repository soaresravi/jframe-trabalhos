package View;

import static Controller.Conexao.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class tConsultar extends javax.swing.JFrame {
    
    DefaultTableModel model;

    public void limpar(){
        tfID.setText("");
        tfNome.setText("");
        tfEndereco.setText("");
        tfEmail.setText("");
        tfTelefone.setText("");
        tfDtNasc.setText("");
        tfRg.setText("");
        tfCPF.setText("");
        tfNome.requestFocus();
    }

    public void campos(boolean acao){
        tfNome.setEditable(acao);
        tfEndereco.setEditable(acao);
        tfTelefone.setEditable(acao);
        tfEmail.setEditable(acao);
        tfDtNasc.setEditable(acao);
        tfRg.setEditable(acao);
        tfCPF.setEditable(acao);
    }
    
    public void libera(String campo){
        Color fundov = new Color(102,255,204);
        Color fundob = new Color(255,255,255);
        tfID.setText("");
        tfNome.setText("");
        tfCPF.setText("");
        switch (campo){
            case "ID" ->  {
                
                tfID.setEditable(true);
                tfID.setBackground(fundov);
                
                tfNome.setEditable(false);
                tfNome.setBackground(fundob);
                
                tfCPF.setEditable(false);
                tfCPF.setBackground(fundob);
                tfID.requestFocus();
            }
            case "Nome" ->  {
                
                tfID.setEditable(false);
                tfID.setBackground(fundob);
                
                tfNome.setEditable(true);
                tfNome.setBackground(fundov);
                
                tfCPF.setEditable(false);
                tfCPF.setBackground(fundob);
                tfNome.requestFocus();
            }
            case "CPF" ->  {
                
                tfID.setEditable(false);
                tfID.setBackground(fundob);
                
                tfNome.setEditable(false);
                tfNome.setBackground(fundob);
                
                tfCPF.setEditable(true);
                tfCPF.setBackground(fundov);
                tfCPF.requestFocus();
            }
        }
        
    }

    public tConsultar() {
        initComponents();
        Conectar();

        tbLista.getColumnModel().getColumn(0).setMaxWidth(40); //altera modo da tabela (nao vejo muita diferença)
        tbLista.getColumnModel().getColumn(1).setMaxWidth(100);
        tbLista.getColumnModel().getColumn(2).setMaxWidth(100);
        tbLista.getColumnModel().getColumn(3).setMaxWidth(100);
        tbLista.getColumnModel().getColumn(4).setMaxWidth(100);
        tbLista.getColumnModel().getColumn(5).setMaxWidth(100);
        tbLista.getColumnModel().getColumn(6).setMaxWidth(100);
        tbLista.getColumnModel().getColumn(7).setMaxWidth(100);
        model =  (DefaultTableModel) tbLista.getModel(); //DefaultTableModel: classe de tabela. ai dei a variável desse tipo chamada model. ai ela é =: pega os dsdos da tabela e os deixa como model (porque veiio genérico)
        painelTabela.setVisible(false);
        
        URL caminhoImagem = this.getClass().getClassLoader().getResource("View/images/aperto-de-mao.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
 
        setIconImage(iconeTitulo);
        setResizable(false);
        setDefaultCloseOperation(tConsultar.DO_NOTHING_ON_CLOSE);
        setBackground(Color.yellow);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grConsultar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfRg = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfDtNasc = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDt2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbID = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        rbCpf = new javax.swing.JRadioButton();
        painelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        jLabel1.setText("ID");

        tfID.setBackground(new java.awt.Color(102, 255, 204));
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("E-mail");

        jLabel6.setText("Dt. Nascimento");

        jLabel7.setText("RG");

        jLabel8.setText("CPF");

        tfNome.setEditable(false);

        tfEndereco.setEditable(false);

        tfTelefone.setEditable(false);

        tfEmail.setEditable(false);

        tfRg.setEditable(false);

        tfCPF.setEditable(false);

        tfDtNasc.setEditable(false);
        try {
            tfDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Dt. Nascimento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(tfEndereco)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfEmail)
                                .addComponent(tfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(tfRg))
                            .addComponent(tfDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfDt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grConsultar.add(rbID);
        rbID.setSelected(true);
        rbID.setText("ID");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        grConsultar.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        grConsultar.add(rbCpf);
        rbCpf.setText("CPF");
        rbCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbID)
                    .addComponent(rbNome)
                    .addComponent(rbCpf))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbID)
                .addGap(18, 18, 18)
                .addComponent(rbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCpf)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        painelTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "E-mail", "Dt. Nasc.", "RG", "CPF"
            }
        ));
        tbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLista);

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/pesquisa-qualitativa.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/deletar-usuario.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/lupa.png"))); // NOI18N
        btLimpar.setText("Nova Pesquisa");
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/perfil-de-usuario.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/pasta.png"))); // NOI18N
        btGravar.setText("Gravar Alteração");
        btGravar.setEnabled(false);
        btGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btExcluir))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btGravar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(722, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btGravar.setEnabled(false);
        tfID.setText("");
        tfNome.setText("");
        tfEndereco.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        tfDtNasc.setText("");
        tfRg.setText("");
        tfCPF.setText("");
        tfID.requestFocus();
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pesquisa=null, sql=null, table="n", dtc; //table só é "n" porque se for com o id nao aparece
        Date dt=null;
        if (rbID.isSelected()){
            pesquisa = tfID.getText();
            sql = "Select * from clientes where id = ?";
        }
        if (rbNome.isSelected()){
            table="s"; //é "s" desde o início se nao tiver essa opção com o id
            pesquisa = tfNome.getText()+"%";
            tbLista.setVisible(true);
            model.setRowCount(0); //deixa a tabela limpa
            sql = "Select * from clientes where nome like ?";
        }
        if (rbCpf.isSelected()){
            pesquisa = tfCPF.getText();
            sql = "Select * from clientes where CPF = ?";
        }

        try {
        PreparedStatement stm = con.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_SENSITIVE, 
               ResultSet.CONCUR_UPDATABLE);
        stm.setString(1, pesquisa);
        //Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery();
        if (rs.first()){
            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
            if (table.equals("s")){ //esse equals é que nem == só que para verificar objetos. entao se o valor de table for s... (porque podia ser n)
                painelTabela.setVisible(true);
                rs.previous(); //volta pra linha anterior (se nao nao funciona o while (rs.next())
                while(rs.next()){ //passa por todas as linhas de dados sql (enquanto tiver linha...)
                String[] linha= new String[] { //vetor pra pegar os dados da linha atual do result set
                    rs.getString("id"), //pega o valor da coluna id no db e retorna como uma string
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("email"),
                    rs.getString("dataNasc"),
                    rs.getString("rg"),
                    rs.getString("cpf"),
                }; // cria um vetor chamado linha que contem o resultado da pesquisa com todos os campos
        
                model.addRow(linha); //vai adicionando cada linha no model
                }                
                
            } else {
                tfID.setText(rs.getString("id"));
                tfNome.setText(rs.getString("nome"));
                tfEndereco.setText(rs.getString("endereco"));
                tfTelefone.setText(rs.getString("telefone"));
                tfEmail.setText(rs.getString("email"));
                DateFormat dtf = new SimpleDateFormat("yyyy-MM-dd"); //dtf tipo DateFormat(analisa datas) é = a: subclasse que cria formatos personalizados ai define que é aquele padrão dos EUA
                try {
                    dt = dtf.parse(rs.getString("dataNasc")); //dt é objeto Date, ele é = a:converte a string obtida em objeto Date (o rs.getString pega na coluna data do result set
                } catch (ParseException ex) {
                    
                }
                DateFormat dtbr = new SimpleDateFormat("dd/mm/yyyy"); //transforma pro padrão br
                dtc = dtbr.format(dt); //formata a data ali de cima pro br que eu que quis e joga em outra variável dtc
                tfDtNasc.setText(dtc);  //escreve a data com o que ta na variável dtc
                tfRg.setText(rs.getString("rg"));
                tfCPF.setText(rs.getString("cpf"));
                tfDt2.setText(rs.getString("dataNasc"));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dados não localizados!");
            if (rbID.isSelected()){
                tfID.setText("");
                tfID.requestFocus();
            }
            if (rbNome.isSelected()){
                tfNome.setText("");
                tfNome.requestFocus();
            }
            if (rbCpf.isSelected()){
                tfCPF.setText("");
                tfCPF.requestFocus();
            }
        }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMouseClicked
       //quando clicarem em uma linha da tabela...
        int l;
        Date dt=null;
        String dtc, id, nome, endereco, telefone, email, dtnasc, rg, cpf;
        l=tbLista.getSelectedRow(); //pega o índice da linha da tabela e guarda na variável l
        id = (String) tbLista.getValueAt(l, 0); //obtém o valor da coluna da tabela lista no índice l e armazena no campo id como string
        tfID.setText(id); //escreve o valor no campo
        nome = (String) tbLista.getValueAt(l, 1);
        tfNome.setText(nome);
        endereco = (String) tbLista.getValueAt(l, 2);
        tfEndereco.setText(endereco);
        telefone = (String) tbLista.getValueAt(l, 3);
        tfTelefone.setText(telefone);
        email = (String) tbLista.getValueAt(l, 4);
        tfEmail.setText(email);
        dtnasc = (String) tbLista.getValueAt(l, 5);
        DateFormat dtf = new SimpleDateFormat("yyyy-mm-dd");
        try {
            dt = dtf.parse(dtnasc);
        } catch (ParseException ex) {
                    
        }
        DateFormat dtbr = new SimpleDateFormat("dd/mm/yyyy");
        dtc = dtbr.format(dt);
        tfDtNasc.setText(dtc);
        rg = (String) tbLista.getValueAt(l, 6);
        tfRg.setText(rg);
        cpf = (String) tbLista.getValueAt(l, 7);
        tfCPF.setText(cpf);
        tfDt2.setText(dtnasc);
    }//GEN-LAST:event_tbListaMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int result, opcao;
        String sql;
        Object[] options = { "Sim", "Não" };
        opcao = JOptionPane.showOptionDialog(null, "Confirma a exclusão?","Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,options[1]);
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btGravar.setEnabled(false);
        if (opcao == 0){// botao sim apertado
            
            try {
                sql = "delete from clientes where id = ?";
                PreparedStatement stm = con.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                );
                stm.setString(1, tfID.getText());
                
               // result = stm.executeUpdate();
               // if (result>0) {
                boolean resultado = stm.execute();
                System.out.println(resultado);
                if (stm.execute()==false){
                    JOptionPane.showMessageDialog(null, "Dados Excluídos com Sucesso!");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir!");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro! "+ e);
            }
            
        } else { //botao nao apertado
            System.out.println("1");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        campos(true);
        btGravar.setEnabled(true);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        int result, opcao;
        String sql;
        Object[] options = { "Sim", "Não" };
        opcao = JOptionPane.showOptionDialog(null, "Gravar as alterações?","Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btGravar.setEnabled(false);
        campos(false);
        if (opcao == 0){// botao sim apertado
            
            try {
                sql = "update clientes set "
                        + "nome = ?, endereco = ?,"
                        + "telefone = ?, email = ?,"
                        + "dataNasc = ?, rg = ?, "
                        + "cpf = ? "
                        + " where id = ?";
                PreparedStatement stm = con.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                );
                LocalDate dtnascFormatada = LocalDate.parse(tfDtNasc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                stm.setString(1, tfNome.getText());
                stm.setString(2, tfEndereco.getText());
                stm.setString(3, tfTelefone.getText());
                stm.setString(4, tfEmail.getText());
                stm.setString(5, dtnascFormatada.toString());
                stm.setString(6, tfRg.getText());
                stm.setString(7, tfCPF.getText());
                stm.setString(8, tfID.getText());
                
                result = stm.executeUpdate();
                if (result>0) {
                    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar!");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro! "+ e);
            }
            
        } else { //botao nao apertado
            System.out.println("1");
        }
    }//GEN-LAST:event_btGravarActionPerformed

    private void rbCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCpfActionPerformed
        libera("CPF");
    }//GEN-LAST:event_rbCpfActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        libera("Nome");
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
        libera("ID");
    }//GEN-LAST:event_rbIDActionPerformed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup grConsultar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JRadioButton rbCpf;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfDt2;
    private javax.swing.JFormattedTextField tfDtNasc;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
