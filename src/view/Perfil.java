package view;

import facebookbd.MemoriaLocal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.bean.Amizade;
import model.bean.Post;
import model.bean.Usuario;
import model.dao.AmizadeDAO;
import model.dao.PostDAO;
import model.dao.UsuarioDAO;


public class Perfil extends javax.swing.JFrame {
    Map<Integer, Usuario> mapaDeUsuarios = new HashMap<>();
    Map<Integer, Post> mapaDePosts = new HashMap<>();

    public Perfil() {
        initComponents();
        configurarComponentesDaTela();
        
    }

    Login login = new Login();
            
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
        usuariosButton = new javax.swing.JButton();
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

        usuariosButton.setBackground(new java.awt.Color(255, 255, 255));
        usuariosButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        usuariosButton.setForeground(new java.awt.Color(70, 98, 158));
        usuariosButton.setText("USUÁRIOS");
        usuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosButtonActionPerformed(evt);
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
                                .addComponent(usuariosButton)
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
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(usuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void usuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosButtonActionPerformed
        // TODO add your handling code here:
        new Usuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usuariosButtonActionPerformed

    private void muralListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_muralListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_muralListPropertyChange

    private void espacoCriarPostTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacoCriarPostTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_espacoCriarPostTextFieldActionPerformed

    private void publicarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicarButtonActionPerformed
        // TODO add your handling code here:
        
        Post postNoMural = new Post(MemoriaLocal.usuarioLogado.getId_usuario(), "img.jpg", espacoCriarPostTextField.getText(), '1');
        PostDAO.create(postNoMural);
        this.inserirPostsNaListaDeMural(postNoMural);
        
        espacoCriarPostTextField.setText("");
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

        Set<Integer> conjuntoIdsDeAmizades = new HashSet<>();

        for (Amizade amizade : AmizadeDAO.read()) {
            int id = amizade.getId_amigo();
            if (id == MemoriaLocal.usuarioLogado.getId_usuario()) {
                id = amizade.getId_user_logado();
            }
            conjuntoIdsDeAmizades.add(id);
        }

        int usuariosAdicionados = 0;
        for (Usuario usuario: UsuarioDAO.read()) {
            if (conjuntoIdsDeAmizades.contains(usuario.getId_usuario())) {
                this.mapaDeUsuarios.put(usuariosAdicionados++, usuario);
                modeloDaListaDeAmigos.addElement(usuario.getNome()); 
            }
        }

        // Logica para tratar toques e eventos em itens da lista.
        ListSelectionListener listener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList source = (JList)event.getSource();
                    int indiceAtualDaLista = source.getSelectedIndex();
                    Usuario usuarioDesteIndice = mapaDeUsuarios.get(indiceAtualDaLista);
                    new PerfilDoUsuario(usuarioDesteIndice).setVisible(true);
                    dispose();
                }
            }
        };

        this.amigosList.addListSelectionListener(listener);
    }

    private void configurarListaDePosts(){
        modeloDaListaDePosts = new DefaultListModel();
        muralList.setModel(modeloDaListaDePosts);

        int postsAdicionados = 0;
        for (Post post : PostDAO.read()){
            if (post.getId_user_post() != MemoriaLocal.usuarioLogado.getId_usuario()){
                continue;
            }
            this.mapaDePosts.put(postsAdicionados++, post);
            this.inserirPostsNaListaDeMural(post);
        }
        
        ListSelectionListener listener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList source = (JList)event.getSource();
                    int indiceAtualDaLista = source.getSelectedIndex();
                    Post postsDesteIndice = mapaDePosts.get(indiceAtualDaLista);
                    
                    new TelaDoPost(postsDesteIndice).setVisible(true);
                    
                    dispose();
                }
            }
        };

        this.muralList.addListSelectionListener(listener);
    }

    public void inserirPostsNaListaDeMural(Post post){
        modeloDaListaDePosts.addElement(post.getConteudo());
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton usuariosButton;
    // End of variables declaration//GEN-END:variables
}
