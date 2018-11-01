/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Amizade;
import model.bean.Grupo;
import model.dao.AmizadeDAO;
import model.dao.GrupoDAO;

/**
 *
 * @author icaro
 */
public final class Grupos extends javax.swing.JFrame {

    Mural mural = new Mural();
    Perfil perfil = new Perfil();
    Amigos amigos = new Amigos();
    Grupos grupos = new Grupos();
    
    public Grupos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));

        readGrupos();
    }

   public void readGrupos() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        GrupoDAO gdao = new GrupoDAO();

        for (Grupo grupo : gdao.read()) {

            modelo.addRow(new Object[]{
                grupo.getId_grupo()
            });

        }
    }
    
    public void readAmigosForName(String nome){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AmizadeDAO adao = new AmizadeDAO();
        
        for (Amizade amizade : adao.readForName(nome)) {

            modelo.addRow(new Object[]{
                amizade.getId_amigo(),
                amizade.getId_user_logado(),
            });

        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        muralButton = new javax.swing.JButton();
        perfilButton = new javax.swing.JButton();
        amigosButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BuscarGrupoTXT3 = new javax.swing.JTextField();
        BuscarGrupoButton = new javax.swing.JButton();
        CriarGrupoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(70, 98, 158));

        jLabel1.setBackground(new java.awt.Color(70, 98, 158));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACEBOOK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel1)
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        muralButton.setBackground(new java.awt.Color(70, 98, 158));
        muralButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        muralButton.setText("MURAL");
        muralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muralButtonActionPerformed(evt);
            }
        });

        perfilButton.setBackground(new java.awt.Color(70, 98, 158));
        perfilButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        perfilButton.setText("PERFIL");
        perfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilButtonActionPerformed(evt);
            }
        });

        amigosButton.setBackground(new java.awt.Color(70, 98, 158));
        amigosButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        amigosButton.setText("AMIGOS");
        amigosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigosButtonActionPerformed(evt);
            }
        });

        gruposButton.setBackground(new java.awt.Color(70, 98, 158));
        gruposButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        gruposButton.setText("GRUPOS");
        gruposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposButtonActionPerformed(evt);
            }
        });

        sairButton.setBackground(new java.awt.Color(70, 98, 158));
        sairButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        sairButton.setText("SAIR");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        jLabel2.setText("GRUPOS");

        BuscarGrupoTXT3.setText("Digite o nome do grupo");
        BuscarGrupoTXT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarGrupoTXT3ActionPerformed(evt);
            }
        });

        BuscarGrupoButton.setBackground(new java.awt.Color(67, 96, 158));
        BuscarGrupoButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BuscarGrupoButton.setText("BUSCAR");
        BuscarGrupoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarGrupoButtonActionPerformed(evt);
            }
        });

        CriarGrupoButton.setBackground(new java.awt.Color(67, 96, 158));
        CriarGrupoButton.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        CriarGrupoButton.setText("CRIAR GRUPO");
        CriarGrupoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarGrupoButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Pesquisar grupo:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Criar Grupo:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BuscarGrupoTXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarGrupoButton))
                            .addComponent(jLabel2)
                            .addComponent(CriarGrupoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gruposButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amigosButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(perfilButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muralButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sairButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(muralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(perfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amigosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gruposButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CriarGrupoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarGrupoTXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarGrupoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muralButtonActionPerformed
        // TODO add your handling code here:
        mural.setVisible(true);
    }//GEN-LAST:event_muralButtonActionPerformed

    private void perfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilButtonActionPerformed
        // TODO add your handling code here:
        perfil.setVisible(true);
    }//GEN-LAST:event_perfilButtonActionPerformed

    private void amigosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigosButtonActionPerformed
        // TODO add your handling code here:
        amigos.setVisible(true);
    }//GEN-LAST:event_amigosButtonActionPerformed

    private void gruposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposButtonActionPerformed
        // TODO add your handling code here:
        grupos.setVisible(true);
    }//GEN-LAST:event_gruposButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sairButtonActionPerformed

    private void BuscarGrupoTXT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarGrupoTXT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarGrupoTXT3ActionPerformed

    private void BuscarGrupoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarGrupoButtonActionPerformed
        // TODO add your handling code here:
        readAmigosForName(BuscarGrupoTXT3.getText());
    }//GEN-LAST:event_BuscarGrupoButtonActionPerformed

    private void CriarGrupoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarGrupoButtonActionPerformed
//        CriarGrupo criargrupos = null;
//        try {
//            criargrupos = new CriarGrupo();
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(Grupos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        criargrupos.setVisible(true);
//        criargrupos.setResizable(false);
//        dispose();
    }//GEN-LAST:event_CriarGrupoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarGrupoButton;
    private javax.swing.JTextField BuscarGrupoTXT3;
    private javax.swing.JButton CriarGrupoButton;
    private javax.swing.JButton amigosButton;
    private javax.swing.JButton gruposButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton muralButton;
    private javax.swing.JButton perfilButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
