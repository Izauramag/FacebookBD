package view;

import facebookbd.MemoriaLocal;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.bean.SolicAmizade;
import model.bean.Usuario;
import model.dao.BloqueioAmizadeDAO;
import model.dao.SolicAmizadeDAO;
import model.dao.UsuarioDAO;

public class Usuarios extends javax.swing.JFrame {
    Map<Integer, Usuario> mapaDeUsuarios = new HashMap<>();
    
    public Usuarios() {
        initComponents();
        configurarComponentesDaTela();
    }
    
    DefaultListModel modeloDaListaDeUsuarios;
    DefaultListModel modeloDaListaDeSolicitacoes;
    
    Login login = new Login();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        facecbookLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        usuariosLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosList = new javax.swing.JList<>();
        solicitacoesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        solicitacoesList = new javax.swing.JList<>();
        bloqueadosLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bloqueadosList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 98, 158));

        facecbookLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        facecbookLabel.setForeground(new java.awt.Color(255, 255, 255));
        facecbookLabel.setText("FACEBOOK");

        sairButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(70, 98, 158));
        sairButton.setText("VOLTAR");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(facecbookLabel)
                .addGap(282, 282, 282)
                .addComponent(sairButton)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(facecbookLabel)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        usuariosLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        usuariosLabel.setText("USUÁRIOS");

        usuariosList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(usuariosList);

        solicitacoesLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        solicitacoesLabel.setText("SOLICITAÇÕES");

        solicitacoesList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(solicitacoesList);

        bloqueadosLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        bloqueadosLabel.setText("USUÁRIOS BLOQUEADOS");

        bloqueadosList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(bloqueadosList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuariosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solicitacoesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(bloqueadosLabel)
                    .addComponent(jScrollPane3))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitacoesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(bloqueadosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }
    
    
    private void configurarComponentesDaTela() {
        this.configurarListaDeUsuarios();
        this.configurarListaDeSolicitacoes();
    }
    
    private void configurarListaDeUsuarios(){
        modeloDaListaDeUsuarios = new DefaultListModel();
        usuariosList.setModel(modeloDaListaDeUsuarios);
        
        int usuariosAdicionados = 0;
        for (Usuario usuario: UsuarioDAO.read()) {
            this.mapaDeUsuarios.put(usuariosAdicionados++, usuario);
            this.inserirUsuarioNaListaDeUsuarios(usuario);
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
                }
            }
        };

        this.usuariosList.addListSelectionListener(listener);
    }
    
    public void inserirUsuarioNaListaDeUsuarios(Usuario usuario){  
        modeloDaListaDeUsuarios.addElement(usuario.getNome()); 
    }
    
    private void configurarListaDeSolicitacoes(){
        modeloDaListaDeSolicitacoes = new DefaultListModel();
        solicitacoesList.setModel(modeloDaListaDeSolicitacoes);
        
        for (SolicAmizade solicitacao: SolicAmizadeDAO.read()) {
            this.inserirUsuarioNaListaDeSolicitacoes(solicitacao);
        }
    }
    
    public void inserirUsuarioNaListaDeSolicitacoes(SolicAmizade solicitacao){  
        modeloDaListaDeSolicitacoes.addElement(solicitacao.getId_user_solicitado()); 
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloqueadosLabel;
    private javax.swing.JList<String> bloqueadosList;
    private javax.swing.JLabel facecbookLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel solicitacoesLabel;
    private javax.swing.JList<String> solicitacoesList;
    private javax.swing.JLabel usuariosLabel;
    private javax.swing.JList<String> usuariosList;
    // End of variables declaration//GEN-END:variables
}
