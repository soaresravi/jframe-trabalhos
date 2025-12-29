package view;

import static controller.connection.*;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class tProdutos extends javax.swing.JFrame {
    
    public void limpar() {
        tfDescricao.setText("");
        tfUnidade.setText("");
        tfQuantidade.setText("");
        tfValor.setText("");
        tfDescricao.requestFocus();
    }
    
    public void campos(boolean acao) { //ação no caso é true/false
        tfDescricao.setEditable(acao); //tem que deixar todos esses porque são os campos
        tfUnidade.setEditable(acao);
        tfQuantidade.setEditable(acao);
        tfValor.setEditable(acao);
    }
    
    public tProdutos() {
        initComponents();
        Conectar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        lbUnidade = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        tfUnidade = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        tfQuantidade = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btGravarAlteracao = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setEnabled(false);

        lbID.setText("ID");

        lbDescricao.setText("Descrição");

        lbValor.setText("Valor");

        lbUnidade.setText("Unidade");

        lbQuantidade.setText("Quantidade");

        tfID.setEditable(false);
        tfID.setEnabled(false);
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(lbDescricao)
                    .addComponent(lbUnidade)
                    .addComponent(lbQuantidade)
                    .addComponent(lbValor))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(tfUnidade)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUnidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidade)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btGravarAlteracao.setText("Gravar alteração");
        btGravarAlteracao.setEnabled(false);
        btGravarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarAlteracaoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGravarAlteracao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConsultar)
                    .addComponent(btGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGravarAlteracao)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        boolean result;
        String sql, descricao, unidade, quantidade, valor;
        
        descricao = tfDescricao.getText();
        unidade = tfUnidade.getText();
        quantidade = tfQuantidade.getText();
        valor = tfValor.getText();
        
        try {
            sql = "insert into produtos (descricao, unidade, quantidade, valor) values (?, ?, ?, ?)";   
            System.out.println(sql);
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, descricao);
            stm.setString(2, unidade);
            stm.setString(3, quantidade);
            stm.setString(4, valor);
            
            result = stm.execute();
            
            if (!result) {
                JOptionPane.showMessageDialog(null, "Produtos gravados com sucesso!");
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao gravar produto.");
            }
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro!: " + error);
        }

    }//GEN-LAST:event_btGravarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpar();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Desconectar();
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        String pesquisa, sql;
        pesquisa = tfDescricao.getText() + "%"; //definindo que a pesquisa é o que estiver digitado no campo descrição + % (coisa do sql, quer dizer que pode ter qualquer coisa escrita depois da descrição)
        sql = "Select * from produtos where descricao like ?"; //consulta básica que é coisa do sql, não de java. selecionando todos os dados da tabela produtos quando a descriçao for tal
        
        try {
            PreparedStatement stm = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //type scroll sensitive = vc pode pular pra qualquer posição da lista (navega livremente) e veja mudanças feitas na db enquanto está com ele aberto
            //concur updatable = pode mudar os dados diretamente da lista e envie de voltas pro db
            stm.setString(1, pesquisa); //pq nao da (eu acho) pra colocar (1, tfDescricao.getText() + "%")
            ResultSet resultSet = stm.executeQuery(); //ResultSet é tipo uma tabela com os dados recuperados do db. da uma variável desse tipo e ai executa a consulta que preparei
            
            if (resultSet.first()) { //caso tenha pelo menos uma linha...
                btExcluir.setEnabled(true); //deixa ativo o botão de excluir
                btAlterar.setEnabled(true);
                
                tfID.setText(resultSet.getString("id")); //coloca na caixa de texto id o valor da coluna chamada id a linha atual do rs e converte pra string
                tfDescricao.setText(resultSet.getString("descricao"));
                tfUnidade.setText(resultSet.getString("unidade"));
                tfQuantidade.setText(resultSet.getString( "quantidade"));
                tfValor.setText(resultSet.getString("valor"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Dados não localizados");
                
                tfID.setText("");
                tfDescricao.requestFocus();
            }
            
        } catch (SQLException error){
            System.out.println("Erro" + error);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        campos(true); //todos os campos podem ser alterados
        btGravarAlteracao.setEnabled(true);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btGravarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarAlteracaoActionPerformed
        String sql;
        Object[] options = {"Sim", "Não"}; //vetor de objetos (object) que terá as opções da caixa
        
        //opção é = a: abre uma caixa de opçaõ de diálogo no centro da tela, escrito "confirma?", o título será "alteração", terá botões de sim e não, será uma caixa de pergunta, usará o ícone padrão do JOption (null), pega o vetor de opções wue criei e define que o padrão vai ser a opção da posição 0 (sim)
        int opcao = JOptionPane.showOptionDialog(null, "Confirma as alterações?", "Alteração", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
        
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btGravarAlteracao.setEnabled(false);
        campos(false); //deixa sem poder alterar nada de novo
        
        if (opcao == 0) { //se a opção for 0 (sim) (porque ta em 1°)
            
            try {
                sql = "update produtos set descricao = ?, unidade = ?, quantidade = ?, valor = ? where id = ?"; //padrão do mysql. atualize a tabela produtos colocando que descrição é tal... do id que for tal
                PreparedStatement stm = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                
                stm.setString(1, tfDescricao.getText()); //pega o texto de todos porque todos os campos podem ter sido alterados
                stm.setString(2, tfUnidade.getText());
                stm.setString(3, tfQuantidade.getText());
                stm.setString(4, tfValor.getText());
                stm.setString(5, tfID.getText());
                
                boolean result = stm.execute();
                
                if (!result) {
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar.");
                }
                
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(null, "Erro: " + error);
            }
        }
    }//GEN-LAST:event_btGravarAlteracaoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        String sql;
        
        int opcao = JOptionPane.showOptionDialog(null, "Confirma a exclusão?", "Exclusão",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]); //dessa vez deixa como padrão o não (porque ta em 2°)
        
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btGravarAlteracao.setEnabled(false);
        
        if (opcao == 0) {
            
            try {
                sql = "delete from produtos where id = ?"; //padrão do mysql. delete da tabela produtos o id que seja tal
                PreparedStatement stm = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                stm.setString(1, tfID.getText());
                
                boolean result = stm.execute();
                System.out.println(result);
                
                if (!result) {
                    JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                }
                
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(null, "Erro: " + error);
            }
            
        } else {
            System.out.println("1");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(tProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btGravarAlteracao;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbUnidade;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfUnidade;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
