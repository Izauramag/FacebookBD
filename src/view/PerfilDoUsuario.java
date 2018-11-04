/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import facebookbd.MemoriaLocal;
import javax.swing.DefaultListModel;
import model.bean.BloqueioAmizade;
import model.bean.Post;
import model.bean.SolicAmizade;
import model.bean.Usuario;
import model.dao.BloqueioAmizadeDAO;
import model.dao.PostDAO;
import model.dao.SolicAmizadeDAO;

/**
 *
 * @author icaro
 */
public class PerfilDoUsuario extends javax.swing.JFrame {
    Usuario usuario;
    DefaultListModel modeloDaListaDePosts;
    
    public PerfilDoUsuario(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.configurarComponentesDaTela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagemBoasVindasLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        bloquearButton = new javax.swing.JButton();
        adicionarButton = new javax.swing.JButton();
        cidadeLabel = new javax.swing.JLabel();
        criarPostLabel = new javax.swing.JLabel();
        espacoPostTextfield = new javax.swing.JTextField();
        muralLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        muralList = new javax.swing.JList<>();
        publicarButton = new javax.swing.JButton();
        amigosLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        amigosList = new javax.swing.JList<>();
        gruposLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gruposList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensagemBoasVindasLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        mensagemBoasVindasLabel.setText("mensagem de boas vindas");

        jPanel1.setBackground(new java.awt.Color(70, 98, 158));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FACEBOOK");

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(70, 98, 158));
        voltarButton.setText("VOLTAR");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        bloquearButton.setBackground(new java.awt.Color(255, 255, 255));
        bloquearButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        bloquearButton.setForeground(new java.awt.Color(70, 98, 158));
        bloquearButton.setText("bloq ou desbloc");
        bloquearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloquearButtonActionPerformed(evt);
            }
        });

        adicionarButton.setBackground(new java.awt.Color(255, 255, 255));
        adicionarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        adicionarButton.setForeground(new java.awt.Color(70, 98, 158));
        adicionarButton.setText("add ou excluir");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionarButton)
                .addGap(18, 18, 18)
                .addComponent(bloquearButton)
                .addGap(18, 18, 18)
                .addComponent(voltarButton)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicionarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloquearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cidadeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        cidadeLabel.setText("cidadade");

        criarPostLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        criarPostLabel.setText("CRIAR POST");

        espacoPostTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacoPostTextfieldActionPerformed(evt);
            }
        });

        muralLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        muralLabel.setText("MURAL");

        jScrollPane1.setViewportView(muralList);

        publicarButton.setBackground(new java.awt.Color(255, 255, 255));
        publicarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        publicarButton.setForeground(new java.awt.Color(70, 98, 158));
        publicarButton.setText("PUBLICAR");

        amigosLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        amigosLabel.setText("AMIGOS");

        jScrollPane2.setViewportView(amigosList);

        gruposLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        gruposLabel.setText("GRUPOS");

        jScrollPane3.setViewportView(gruposList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                .addComponent(espacoPostTextfield, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cidadeLabel)
                                .addGap(163, 163, 163)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(publicarButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gruposLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(amigosLabel)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(criarPostLabel)
                            .addComponent(muralLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(mensagemBoasVindasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(318, 373, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(mensagemBoasVindasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeLabel)
                .addGap(43, 43, 43)
                .addComponent(criarPostLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(publicarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(espacoPostTextfield))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muralLabel)
                    .addComponent(amigosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(gruposLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void espacoPostTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacoPostTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacoPostTextfieldActionPerformed

    private void bloquearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloquearButtonActionPerformed
        // TODO add your handling code here  
        BloqueioAmizade bloqueio = new BloqueioAmizade(MemoriaLocal.usuarioLogado.getId_usuario(), usuario.getId_usuario());
        BloqueioAmizadeDAO.create(bloqueio);
            
        
    }//GEN-LAST:event_bloquearButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        // TODO add your handling code here:
        SolicAmizade solicitacao = new SolicAmizade(MemoriaLocal.usuarioLogado.getId_usuario(), usuario.getId_usuario());
        SolicAmizadeDAO.create(solicitacao);
    }//GEN-LAST:event_adicionarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilDoUsuario(null).setVisible(true);
            }
        });
    }
    
    private void configurarComponentesDaTela() {
        this.mensagemBoasVindasLabel.setText(this.usuario.getNome());
        this.cidadeLabel.setText(this.usuario.getCidade());
        
        this.configurarListaDePosts();
        this.configurarBotaoDeAcordoComBloqueio();
        this.configurarBotaoDeAcordoComSolicitacao();
    }
    
    private void configurarListaDePosts(){
        modeloDaListaDePosts = new DefaultListModel();
        muralList.setModel(modeloDaListaDePosts);

        for (Post post : PostDAO.read()){
            if (post.getId_user_post() != usuario.getId_usuario())
                continue;
            this.inserirPostsNaListaDeMural(post);
        }
    }
     
    public void inserirPostsNaListaDeMural(Post post){
        modeloDaListaDePosts.addElement(post.getConteudo());
    }
    
    public void configurarBotaoDeAcordoComBloqueio(){
        int id_solicitante = MemoriaLocal.usuarioLogado.getId_usuario();
        int id_solicitado = usuario.getId_usuario();
       
        if(BloqueioAmizadeDAO.checkBloqueio(id_solicitante, id_solicitado)){
            bloquearButton.setText("BLOQUEAR");
        }else{
            bloquearButton.setText("DESBLOQUEAR");
        }
    }
    
    public void configurarBotaoDeAcordoComSolicitacao(){
        int id_solicitante = MemoriaLocal.usuarioLogado.getId_usuario();
        int id_solicitado = usuario.getId_usuario();
       
        if(SolicAmizadeDAO.checkAmizade(id_solicitante, id_solicitado)){
            adicionarButton.setText("ADICIONAR");
        }else{
            adicionarButton.setText("EXCLUIR");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JLabel amigosLabel;
    private javax.swing.JList<String> amigosList;
    private javax.swing.JButton bloquearButton;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JLabel criarPostLabel;
    private javax.swing.JTextField espacoPostTextfield;
    private javax.swing.JLabel gruposLabel;
    private javax.swing.JList<String> gruposList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mensagemBoasVindasLabel;
    private javax.swing.JLabel muralLabel;
    private javax.swing.JList<String> muralList;
    private javax.swing.JButton publicarButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
