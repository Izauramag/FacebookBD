/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package view;

import facebookbd.MemoriaLocal;
import javax.swing.DefaultListModel;
import model.bean.Amizade;
import model.bean.BloqueioAmizade;
import model.bean.Post;
import model.bean.SolicAmizade;
import model.bean.Usuario;
import model.dao.AmizadeDAO;
import model.dao.BloqueioAmizadeDAO;
import model.dao.PostDAO;
import model.dao.SolicAmizadeDAO;

/**
 *
 * @author icaro
 */
public class PerfilDoUsuario extends javax.swing.JFrame {
    Usuario usuario;
    Amizade amizadeASerChecada;
    DefaultListModel modeloDaListaDePosts;
    private boolean existeBloqueio = false;
    private boolean existeSolicitacaoDeAmizade = false;
    private final BloqueioAmizade bloqueio;
    private final SolicAmizade solicitacaoDeAmizade;
    
    public PerfilDoUsuario(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        int meuId = MemoriaLocal.usuarioLogado.getId_usuario();
        int idDoPerfilVisitado = this.usuario.getId_usuario();
        
        this.bloqueio = new BloqueioAmizade(meuId, idDoPerfilVisitado);
        this.solicitacaoDeAmizade = new SolicAmizade(meuId, idDoPerfilVisitado);
        
        this.existeBloqueio = BloqueioAmizadeDAO.checkBloqueio(bloqueio);
        this.amizadeASerChecada = new Amizade(meuId, idDoPerfilVisitado);
        this.existeSolicitacaoDeAmizade = SolicAmizadeDAO.checkAmizade(solicitacaoDeAmizade);

        this.configurarComponentesDaTela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagemBoasVindasLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        bloquearOuDesbloquearButton = new javax.swing.JButton();
        addExclirOuDeletarButton = new javax.swing.JButton();
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

        bloquearOuDesbloquearButton.setBackground(new java.awt.Color(255, 255, 255));
        bloquearOuDesbloquearButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        bloquearOuDesbloquearButton.setForeground(new java.awt.Color(70, 98, 158));
        bloquearOuDesbloquearButton.setText("bloq ou desbloc");
        bloquearOuDesbloquearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloquearOuDesbloquearButtonActionPerformed(evt);
            }
        });

        addExclirOuDeletarButton.setBackground(new java.awt.Color(255, 255, 255));
        addExclirOuDeletarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        addExclirOuDeletarButton.setForeground(new java.awt.Color(70, 98, 158));
        addExclirOuDeletarButton.setText("add ou excluir");
        addExclirOuDeletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExclirOuDeletarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(addExclirOuDeletarButton)
                .addGap(18, 18, 18)
                .addComponent(bloquearOuDesbloquearButton)
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
                    .addComponent(addExclirOuDeletarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloquearOuDesbloquearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        new Perfil().setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed
    
    private void espacoPostTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacoPostTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacoPostTextfieldActionPerformed
    
    private void bloquearOuDesbloquearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloquearOuDesbloquearButtonActionPerformed
        // TODO add your handling code here
        if (this.existeBloqueio) {
            BloqueioAmizadeDAO.delete(bloqueio);
        } else {
            if (this.existeSolicitacaoDeAmizade) {
                SolicAmizadeDAO.delete(solicitacaoDeAmizade);
            }
            if (existeAmizade()) {
                deletarAmizade();
            }
            BloqueioAmizadeDAO.create(bloqueio);
        }
        
        this.existeBloqueio = !this.existeBloqueio;
        this.configurarBotaoDeBloqueio();
    }//GEN-LAST:event_bloquearOuDesbloquearButtonActionPerformed
    
    private boolean existeAmizade() {
        Amizade amizadeInversaASerChecada = new Amizade(amizadeASerChecada.getId_user_logado(), amizadeASerChecada.getId_amigo());
        return AmizadeDAO.checkAmizade(amizadeASerChecada) || AmizadeDAO.checkAmizade(amizadeInversaASerChecada);
    }
    
    private void deletarAmizade() {
        Amizade amizadeInversaASerChecada = new Amizade(amizadeASerChecada.getId_user_logado(), amizadeASerChecada.getId_amigo());
        AmizadeDAO.delete(amizadeInversaASerChecada);
        AmizadeDAO.delete(amizadeASerChecada);
    }

    private void addExclirOuDeletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExclirOuDeletarButtonActionPerformed
        // TODO add your handling code here:

        if (existeAmizade()) {
            AmizadeDAO.delete(amizadeASerChecada);
            this.configurarBotaoDeAmizade();
            return;
        }
        
        if(this.existeSolicitacaoDeAmizade){
            SolicAmizadeDAO.delete(solicitacaoDeAmizade);
        }else{
            SolicAmizadeDAO.create(solicitacaoDeAmizade);
        }
        
        this.existeSolicitacaoDeAmizade = !this.existeSolicitacaoDeAmizade;
        this.configurarBotaoDeAmizade();
    }//GEN-LAST:event_addExclirOuDeletarButtonActionPerformed
    
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
        this.configurarBotaoDeBloqueio();
        this.configurarBotaoDeAmizade();
    }

    private void configurarListaDePosts(){
        modeloDaListaDePosts = new DefaultListModel();
        muralList.setModel(modeloDaListaDePosts);
        
        for (Post post : PostDAO.read()){
            if (post.getId_user_post() != usuario.getId_usuario())
                continue;
            this.modeloDaListaDePosts.addElement(post.getConteudo());
        }
    }
    
    public void configurarBotaoDeBloqueio(){
        bloquearOuDesbloquearButton.setText(this.existeBloqueio ? "DESBLOQUEAR" : "BLOQUEAR");
        this.addExclirOuDeletarButton.setVisible(!existeBloqueio);
    }
    
    public void configurarBotaoDeAmizade(){
        if (existeAmizade()) {
            addExclirOuDeletarButton.setText("REMOVER AMIZADE");
            return;
        }

        addExclirOuDeletarButton.setText(this.existeSolicitacaoDeAmizade ? "EXCLUIR SOLICITAÇÃO" : "SOLICITAR AMIZADE");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExclirOuDeletarButton;
    private javax.swing.JLabel amigosLabel;
    private javax.swing.JList<String> amigosList;
    private javax.swing.JButton bloquearOuDesbloquearButton;
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
