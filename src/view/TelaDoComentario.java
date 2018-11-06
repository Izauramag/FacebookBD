/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import facebookbd.MemoriaLocal;
import javax.swing.DefaultListModel;
import model.bean.ComentarioPost;
import model.bean.Post;
import model.bean.RespostaComent;
import model.dao.ComentarioPostDAO;
import model.dao.RespostaComentDAO;


/**
 *
 * @author icaro
 */
public class TelaDoComentario extends javax.swing.JFrame {
    ComentarioPost comentarioPost;
    
    DefaultListModel modeloDaListaDeRespostas;
    
    public TelaDoComentario(ComentarioPost comentarioPost) {
        initComponents();
        this.comentarioPost = comentarioPost;
        
        this.configurarComponentesDaTela();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        facebookLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        comentarioLabel = new javax.swing.JLabel();
        conteudoDoComentarioLabel = new javax.swing.JLabel();
        espacoRespostaComentarioTextfield = new javax.swing.JTextField();
        responderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        respostaList = new javax.swing.JList<>();
        respostasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 98, 158));

        facebookLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        facebookLabel.setForeground(new java.awt.Color(255, 255, 255));
        facebookLabel.setText("FACEBOOK");

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(70, 98, 158));
        voltarButton.setText("VOLTAR");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(facebookLabel)
                .addGap(226, 226, 226)
                .addComponent(voltarButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(facebookLabel)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addContainerGap())
        );

        comentarioLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        comentarioLabel.setText("COMENTÁRIO");

        conteudoDoComentarioLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conteudoDoComentarioLabel.setText("conteudo comentario");

        responderButton.setBackground(new java.awt.Color(255, 255, 255));
        responderButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        responderButton.setForeground(new java.awt.Color(70, 98, 158));
        responderButton.setText("RESPONDER COMENTÁRIO");
        responderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(respostaList);

        respostasLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        respostasLabel.setText("RESPOSTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respostasLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comentarioLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(espacoRespostaComentarioTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(responderButton))
                    .addComponent(conteudoDoComentarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(comentarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conteudoDoComentarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(responderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(espacoRespostaComentarioTextfield))
                .addGap(70, 70, 70)
                .addComponent(respostasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Perfil().setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void responderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderButtonActionPerformed
        // TODO add your handling code here:
        RespostaComent respostaComent = new RespostaComent(comentarioPost.getId_comentario(), MemoriaLocal.usuarioLogado.getId_usuario(), "www.fotolinda.com", espacoRespostaComentarioTextfield.getText());
        RespostaComentDAO.create(respostaComent);
        this.inserirRespostaNoComentario(respostaComent);
        
        espacoRespostaComentarioTextfield.setText("");
    }//GEN-LAST:event_responderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDoComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoComentario(null).setVisible(true);
            }
        });
    }
    
    private void configurarComponentesDaTela() {
        this.conteudoDoComentarioLabel.setText(this.comentarioPost.getConteudo());
        this.configurarListaDeRespostas();
    }
    
    private void configurarListaDeRespostas(){
        modeloDaListaDeRespostas = new DefaultListModel();
        respostaList.setModel(modeloDaListaDeRespostas);

        for (RespostaComent respostaComent : RespostaComentDAO.read()){
            if (respostaComent.getId_comentario() != comentarioPost.getId_comentario()){
                continue;
            }
            this.inserirRespostaNoComentario(respostaComent);
        }
    }    
    
    public void inserirRespostaNoComentario(RespostaComent respostaComent){
        modeloDaListaDeRespostas.addElement(respostaComent.getConteudo() + " - Comentário de: " + respostaComent.getId_user_resp());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comentarioLabel;
    private javax.swing.JLabel conteudoDoComentarioLabel;
    private javax.swing.JTextField espacoRespostaComentarioTextfield;
    private javax.swing.JLabel facebookLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton responderButton;
    private javax.swing.JList<String> respostaList;
    private javax.swing.JLabel respostasLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
