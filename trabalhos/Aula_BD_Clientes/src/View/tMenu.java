package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class tMenu extends javax.swing.JFrame {

    public tMenu() {
        initComponents();
        //colocando uma imagem pequena quando abrir o formulário
        //variável com o caminho da imagem tipo objeto url é = a: pega a classe atual em execução, busca o recurso (cria a imagem) dentro desse caminho que eu dei
        URL caminhoImagem = this.getClass().getClassLoader().getResource("View/images/aperto-de-mao.png"); 
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem); //variável que armazena a imagem do tipo Image é = a: usa o toolkit padrão para carregar a imagem que está no caminho que defini acima
 
        setIconImage(iconeTitulo); //define o ícone da janela usando a imagem carregada
        setResizable(false); //janela não pode ser redimensionada
        setDefaultCloseOperation(tMenu.EXIT_ON_CLOSE); //faz com que toda a aplicação seja encerrada quando o menu for fechado
        setSize(800, 600);
        setLocationRelativeTo(null); //deixa no centro da tela
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        grBotoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btIncluir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnIncluir = new javax.swing.JMenuItem();
        mnConsultar = new javax.swing.JMenuItem();
        mnAlterar = new javax.swing.JMenuItem();
        mnExcluir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/adicionar-usuario.png"))); // NOI18N
        btIncluir.setText("Adicionar");
        grBotoes.add(btIncluir);
        btIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/lupa.png"))); // NOI18N
        btConsultar.setText("Consultar");
        grBotoes.add(btConsultar);
        btConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/perfil-de-usuario.png"))); // NOI18N
        btAlterar.setText("   Alterar   ");
        grBotoes.add(btAlterar);
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/deletar-usuario.png"))); // NOI18N
        btExcluir.setText("   Excluir   ");
        grBotoes.add(btExcluir);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/sair.png"))); // NOI18N
        btSair.setText("      Sair      ");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btIncluir)
            .addComponent(btConsultar)
            .addComponent(btAlterar)
            .addComponent(btExcluir)
            .addComponent(btSair)
        );

        jMenu1.setMnemonic('C');
        jMenu1.setText("Cadastro");

        mnIncluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/adicionar-usuario.png"))); // NOI18N
        mnIncluir.setMnemonic('I');
        mnIncluir.setText("Incluir");
        mnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIncluirActionPerformed(evt);
            }
        });
        jMenu1.add(mnIncluir);

        mnConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnConsultar.setMnemonic('o');
        mnConsultar.setText("Consultar");
        mnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(mnConsultar);

        mnAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnAlterar.setMnemonic('a');
        mnAlterar.setText("Alterar");
        jMenu1.add(mnAlterar);

        mnExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnExcluir.setText("Excluir");
        jMenu1.add(mnExcluir);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('F');
        jMenu2.setText("Finalizar");

        mnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu2.add(mnSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0); //fecha todas as janelas abertas do programa. o 0 quer dizer que foi executado perfeitamente
    }//GEN-LAST:event_btSairActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        btSair.doClick(); //simula um clique no botão sair, que no caso está programado o System.exit(0)
    }//GEN-LAST:event_mnSairActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        tIncluir incluir = new tIncluir(); //criando um novo objeto incluir. chama a tela de incluir
        incluir.setVisible(true);
    }//GEN-LAST:event_btIncluirActionPerformed

    private void mnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIncluirActionPerformed
        btIncluir.doClick();
    }//GEN-LAST:event_mnIncluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        tConsultar consultar = new tConsultar();
        consultar.setVisible(true);
    }//GEN-LAST:event_btConsultarActionPerformed

    private void mnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultarActionPerformed
        btConsultar.doClick();
    }//GEN-LAST:event_mnConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        tConsultar consultar = new tConsultar();
        consultar.setVisible(true);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        tConsultar consultar = new tConsultar();
        consultar.setVisible(true);
    }//GEN-LAST:event_btExcluirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup grBotoes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuItem mnAlterar;
    private javax.swing.JMenuItem mnConsultar;
    private javax.swing.JMenuItem mnExcluir;
    private javax.swing.JMenuItem mnIncluir;
    private javax.swing.JMenuItem mnSair;
    // End of variables declaration//GEN-END:variables
}
