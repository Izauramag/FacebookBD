package view;

import facebookbd.MemoriaLocal;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.bean.Post;
import model.bean.Usuario;
import model.dao.PostDAO;
import model.dao.UsuarioDAO;


public class Perfil extends javax.swing.JFrame {

    public Perfil() {
        initComponents();
        configurarComponentesDaTela();
        
    }

    Login login = new Login();
    Usuarios usuarios = new Usuarios();
            
    DefaultListModel modeloDaListaDeAmigos;
    DefaultListModel modeloDaListaDePosts;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagemDeBoasVindasLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        facebookLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        cidadeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        muralList = new javax.swing.JList<>();
        muralLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        amigosList = new javax.swing.JList<>();
        amigosLabel = new javax.swing.JLabel();
        amigosButton = new javax.swing.JButton();
        espacoCriarPostTextField = new javax.swing.JTextField();
        publicarButton = new javax.swing.JButton();
        criarPostLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensagemDeBoasVindasLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        mensagemDeBoasVindasLabel.setText("mensagemDeBoasVindas");

        jPanel1.setBackground(new java.awt.Color(70, 98, 158));

        facebookLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        facebookLabel.setForeground(new java.awt.Color(255, 255, 255));
        facebookLabel.setText("FACEBOOK");

        sairButton.setBackground(new java.awt.Color(255, 255, 255));
        sairButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(70, 98, 158));
        sairButton.setText("SAIR");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(facebookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(facebookLabel)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairButton)
                .addContainerGap())
        );

        cidadeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        cidadeLabel.setText("cidade");

        muralList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        muralList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                muralListPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(muralList);

        muralLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        muralLabel.setText("MURAL");

        amigosList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(amigosList);

        amigosLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        amigosLabel.setText("AMIGOS");

        amigosButton.setBackground(new java.awt.Color(255, 255, 255));
        amigosButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        amigosButton.setForeground(new java.awt.Color(70, 98, 158));
        amigosButton.setText("AMIGOS");
        amigosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigosButtonActionPerformed(evt);
            }
        });

        espacoCriarPostTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacoCriarPostTextFieldActionPerformed(evt);
            }
        });

        publicarButton.setBackground(new java.awt.Color(255, 255, 255));
        publicarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        publicarButton.setForeground(new java.awt.Color(70, 98, 158));
        publicarButton.setText("PUBLICAR");
        publicarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicarButtonActionPerformed(evt);
            }
        });

        criarPostLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        criarPostLabel.setText("CRIAR POST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensagemDeBoasVindasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(cidadeLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(amigosButton)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(espacoCriarPostTextField)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                            .addComponent(muralLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(amigosLabel)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(publicarButton))))
                                    .addComponent(criarPostLabel))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensagemDeBoasVindasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(criarPostLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espacoCriarPostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muralLabel)
                    .addComponent(amigosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amigosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void amigosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigosButtonActionPerformed
        // TODO add your handling code here:
        usuarios.setVisible(true);
    }//GEN-LAST:event_amigosButtonActionPerformed

    private void muralListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_muralListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_muralListPropertyChange

    private void espacoCriarPostTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacoCriarPostTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_espacoCriarPostTextFieldActionPerformed

    private void publicarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicarButtonActionPerformed
        // TODO add your handling code here:
//        PostDAO.create(post);
        
        Post postNoMural = new Post(MemoriaLocal.usuarioLogado.getId_usuario(), "img.jpg", espacoCriarPostTextField.getText(), '1');
        PostDAO.create(postNoMural);
        this.inserirPostsNaListaDeMural(postNoMural);
    }//GEN-LAST:event_publicarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
        
        
    }
    
    private void configurarComponentesDaTela() {
        this.mensagemDeBoasVindasLabel.setText("Bem vindo " + MemoriaLocal.usuarioLogado.getNome());
        this.cidadeLabel.setText(MemoriaLocal.usuarioLogado.getCidade());
        
        this.configurarListaDeAmigos();
        this.configurarListaDePosts();
        
    }
    
    private void configurarListaDeAmigos() {
        modeloDaListaDeAmigos = new DefaultListModel();
        amigosList.setModel(modeloDaListaDeAmigos);
        
        for (Usuario usuario: UsuarioDAO.read()) {
            modeloDaListaDeAmigos.addElement(usuario.getNome()); 
        }

        // Logica para tratar toques e eventos em itens da lista.
        ListSelectionListener listener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList source = (JList)event.getSource();
                    String nome = source.getSelectedValue().toString();
                    new PerfilDoUsuario(nome).setVisible(true);
                }
            }
        };

        this.amigosList.addListSelectionListener(listener);
    }

    
    private void configurarListaDePosts(){
        modeloDaListaDePosts = new DefaultListModel();
        muralList.setModel(modeloDaListaDePosts);
        
        for(Post post : PostDAO.read()){
            this.inserirPostsNaListaDeMural(post);
        }
    }
        
    public void inserirPostsNaListaDeMural(Post post){
        modeloDaListaDePosts.addElement(post.getConteudo());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amigosButton;
    private javax.swing.JLabel amigosLabel;
    private javax.swing.JList<String> amigosList;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JLabel criarPostLabel;
    private javax.swing.JTextField espacoCriarPostTextField;
    private javax.swing.JLabel facebookLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mensagemDeBoasVindasLabel;
    private javax.swing.JLabel muralLabel;
    private javax.swing.JList<String> muralList;
    private javax.swing.JButton publicarButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
