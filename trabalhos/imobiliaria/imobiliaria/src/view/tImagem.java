package view;

import controller.Conexao;
import static controller.Conexao.con;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

public class tImagem extends javax.swing.JFrame {
    
    DefaultListModel listaCompleta = new DefaultListModel();
    DefaultListModel listaNome = new DefaultListModel();
    
    private String id_imovel;

    public tImagem() {
        initComponents();
    }
    
    public tImagem(String id_imovel) {
        
    this.id_imovel = id_imovel;
    initComponents();
    
    Conexao.Conectar();
    URL caminhoIcon = this.getClass().getClassLoader().getResource("images/contrato.png");
    Image iconTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcon);
        
    setIconImage(iconTitulo);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FC = new javax.swing.JFileChooser();
        tfNome = new javax.swing.JTextField();
        btProcurar = new javax.swing.JButton();
        tfCompleto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCompleta = new javax.swing.JList<>();
        btAdicionar = new javax.swing.JButton();
        btFTP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstNome = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir imagem");

        btProcurar.setText("Procurar");
        btProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstCompleta);

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btFTP.setText("FTP");
        btFTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFTPActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstNome);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btSair.setText("Sair");
        btSair.setToolTipText("");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btFTP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btProcurar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btProcurar)
                        .addGap(18, 18, 18)
                        .addComponent(tfCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFTP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarActionPerformed
        File arquivo;
        String nomeArquivo;
        BufferedImage imagem;
        FC.setFileFilter(new FileNameExtensionFilter("Image files", "png", "jpg", "webp", "jpeg"));
        FC.setAcceptAllFileFilterUsed(false);
        FC.showOpenDialog(null);
        arquivo = FC.getSelectedFile();
        nomeArquivo = FC.getName(arquivo);
        tfNome.setText(nomeArquivo);
        tfCompleto.setText(arquivo.toString());
        
        try {
            imagem = ImageIO.read(arquivo);
            ImageIcon icon = new ImageIcon(imagem.getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
            jLabel1.setIcon(icon);
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
    }//GEN-LAST:event_btProcurarActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        lstCompleta.setModel(listaCompleta);
        lstNome.setModel(listaNome);
        listaCompleta.addElement(tfCompleto.getText());
        listaNome.addElement(tfNome.getText());
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btFTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFTPActionPerformed
        int tamanho = lstNome.getModel().getSize() -1;
        
        try {
            
            for (int i=0; i <= tamanho; i++) {
                String sql = "insert into fotos (id_imovel, imagem) values (" + id_imovel +",'" + id_imovel+"_"+listaNome.getElementAt(i).toString() +"')";
                PreparedStatement stm = null;
                stm = con.prepareStatement(sql);
                stm.executeUpdate();
            }
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir imagem: " + error);
        }
        
        try {
            FTPClient ftp = new FTPClient();
            ftp.connect("localhost");
            ftp.login("usuario","usbw");
            //ftp.setBufferSize(1024 * 1024);
            ftp.setFileType( FTPClient.BINARY_FILE_TYPE);
            
            ftp.makeDirectory(id_imovel);
            ftp.changeWorkingDirectory(id_imovel);
            
            for (int i=0; i <= tamanho; i++) {
                FileInputStream arquivoEnviar = new FileInputStream(listaCompleta.getElementAt(i).toString());
                
                if (ftp.storeFile (id_imovel+"_"+listaNome.getElementAt(i), arquivoEnviar)) {
                    JOptionPane.showMessageDialog(null, "Arquivo armazenado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao encontrar arquivo.");
                }
            } 
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
        }
    }//GEN-LAST:event_btFTPActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(tImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tImagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FC;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btFTP;
    private javax.swing.JButton btProcurar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstCompleta;
    private javax.swing.JList<String> lstNome;
    private javax.swing.JTextField tfCompleto;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
