package view;

import static controller.Conexao.*;

import javax.swing.JPanel;
import java.util.HashSet;
import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class tImovel extends javax.swing.JFrame {
    
    public String id_imovel;
    
    public void limpar() {
        tfTitulo.setText("");
        tfDescricao.setText("");
        tfID.getText();
        tfMetragem.setText("");
        cbTipoImovel.setSelectedIndex(-1);
        cbTipoNegocio.setSelectedIndex(-1);
        spQuartos.setValue(0);
        spSuites.setValue(0);
        spBanheiros.setValue(0);
        spVagas.setValue(0);
        tfValor.setText("");
        tfIPTU.setText("");
        tfCidade.setText("");
        tfBairro.setText("");
        tfEndereco.setText("");
        tfTitulo.requestFocus();
    }
    
    public void passarCamposEnter(JPanel painel){
        HashSet conj = new HashSet(painel.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER,0));
        painel.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    public tImovel() {
        initComponents();
        
        URL caminhoIcon = this.getClass().getClassLoader().getResource("images/contrato.png");
        Image iconTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcon);
        
        setIconImage(iconTitulo);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        Conectar();
        passarCamposEnter(jPanel1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfIPTU4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tfDescricao = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfMetragem = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfIPTU = new javax.swing.JTextField();
        lbIPTU = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbQuartos = new javax.swing.JLabel();
        lbMetragem = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbSuites = new javax.swing.JLabel();
        lbBanheiros = new javax.swing.JLabel();
        lbVagas = new javax.swing.JLabel();
        lbTipoImovel = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btIncluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        lbTipoNegocio = new javax.swing.JLabel();
        btSelecionarFotos = new javax.swing.JButton();
        spQuartos = new javax.swing.JSpinner();
        spSuites = new javax.swing.JSpinner();
        spBanheiros = new javax.swing.JSpinner();
        spVagas = new javax.swing.JSpinner();
        cbTipoImovel = new javax.swing.JComboBox<>();
        cbTipoNegocio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar imóvel");

        jPanel1.setMaximumSize(new java.awt.Dimension(700, 700));

        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });

        tfID.setEnabled(false);

        tfMetragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMetragemActionPerformed(evt);
            }
        });

        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        lbIPTU.setText("IPTU:");

        lbCidade.setText("Cidade:");

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        lbBairro.setText("Bairro:");

        lbEndereco.setText("Endereço:");

        lbQuartos.setText("Quartos:");

        lbMetragem.setText("Metragem:");

        lbTitulo.setText("Título:");

        lbDescricao.setText("Descrição:");

        lbID.setText("ID:");

        lbSuites.setText("Suítes:");

        lbBanheiros.setText("Banheiros:");

        lbVagas.setText("Vagas:");

        lbTipoImovel.setText("Tipo de imóvel:");

        lbValor.setText("Valor:");

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.setToolTipText("");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        lbTipoNegocio.setText("Tipo de negócio:");

        btSelecionarFotos.setText("Selecionar fotos");
        btSelecionarFotos.setEnabled(false);
        btSelecionarFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarFotosActionPerformed(evt);
            }
        });

        spQuartos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        spSuites.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spSuites.setToolTipText("");

        spVagas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        cbTipoImovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Casa", "Apartamento", "Kitnet", "Sobrado", "Galpão", "Mansão", "Sala Comercial", "Chácara", "Lote/Terreno" }));
        cbTipoImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoImovelActionPerformed(evt);
            }
        });

        cbTipoNegocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Aluguel", "Venda" }));
        cbTipoNegocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoNegocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo)
                    .addComponent(lbDescricao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTipoNegocio)
                            .addComponent(lbID)
                            .addComponent(lbBanheiros)
                            .addComponent(lbIPTU)
                            .addComponent(lbEndereco))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbTipoNegocio, javax.swing.GroupLayout.Alignment.LEADING, 0, 87, Short.MAX_VALUE)
                                        .addComponent(tfIPTU, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbQuartos)
                                    .addComponent(lbMetragem)
                                    .addComponent(lbVagas)
                                    .addComponent(lbCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMetragem, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTipoImovel)
                                    .addComponent(lbSuites)
                                    .addComponent(lbValor)
                                    .addComponent(lbBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoImovel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfBairro)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfEndereco)
                                .addGap(48, 48, 48)
                                .addComponent(btSelecionarFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMetragem)
                    .addComponent(tfMetragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoImovel)
                    .addComponent(cbTipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSuites)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbQuartos)
                        .addComponent(lbTipoNegocio)
                        .addComponent(cbTipoNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spSuites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbBanheiros)
                        .addComponent(spBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbValor)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbVagas)
                        .addComponent(spVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIPTU)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfIPTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCidade)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSelecionarFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEndereco)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Desconectar();
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
    String sql = "insert into imovel (titulo, descricao, metragem, quartos, suites, banheiros, vagas, id_tipo_imovel_subcategoria, tipo_negocio, valor, iptu, cidade, bairro, endereco)"
            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {        
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, tfTitulo.getText());
            stm.setString(2, tfDescricao.getText());
            stm.setDouble(3, Double.parseDouble(tfMetragem.getText()));
            stm.setInt(4, Integer.parseInt(spQuartos.getValue().toString()));
            stm.setInt(5, Integer.parseInt(spSuites.getValue().toString()));
            stm.setInt(6, Integer.parseInt(spBanheiros.getValue().toString()));
            stm.setInt(7, Integer.parseInt(spVagas.getValue().toString()));
            stm.setInt(8, cbTipoImovel.getSelectedIndex());
            stm.setString(9, cbTipoNegocio.getSelectedItem().toString());
            stm.setDouble(10, Double.parseDouble(tfValor.getText()));
            stm.setDouble(11, Double.parseDouble(tfIPTU.getText()));
            stm.setString(12, tfCidade.getText());
            stm.setString(13, tfBairro.getText());
            stm.setString(14, tfEndereco.getText());
            
            stm.execute();
            
            btSelecionarFotos.setEnabled(true);
            
            sql = "select * from imovel where titulo = '" + tfTitulo.getText() + "'";
            
            try {
                stm = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stm.executeQuery();
                
                if (rs != null) {
                    rs.first();
                    id_imovel = rs.getString("id");
                    JOptionPane.showMessageDialog(null, "O imóvel foi adicionado com sucesso! Por favor adicione as imagens.");
                }
                
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(null, "Erro no tipo de imóvel: " + error);
            }

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
    }//GEN-LAST:event_btIncluirActionPerformed

    
    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed

    }//GEN-LAST:event_tfTituloActionPerformed

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
  
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed

    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void cbTipoNegocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoNegocioActionPerformed

    }//GEN-LAST:event_cbTipoNegocioActionPerformed

    private void cbTipoImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoImovelActionPerformed

    }//GEN-LAST:event_cbTipoImovelActionPerformed

    private void tfMetragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMetragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMetragemActionPerformed

    private void btSelecionarFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarFotosActionPerformed
        tImagem imagem = new tImagem(id_imovel);
        imagem.setVisible(true);
    }//GEN-LAST:event_btSelecionarFotosActionPerformed

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
            java.util.logging.Logger.getLogger(tImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tImovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSelecionarFotos;
    private javax.swing.JComboBox<String> cbTipoImovel;
    private javax.swing.JComboBox<String> cbTipoNegocio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbBanheiros;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIPTU;
    private javax.swing.JLabel lbMetragem;
    private javax.swing.JLabel lbQuartos;
    private javax.swing.JLabel lbSuites;
    private javax.swing.JLabel lbTipoImovel;
    private javax.swing.JLabel lbTipoNegocio;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVagas;
    private javax.swing.JLabel lbValor;
    private javax.swing.JSpinner spBanheiros;
    private javax.swing.JSpinner spQuartos;
    private javax.swing.JSpinner spSuites;
    private javax.swing.JSpinner spVagas;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfIPTU;
    private javax.swing.JTextField tfIPTU4;
    private javax.swing.JTextField tfMetragem;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
