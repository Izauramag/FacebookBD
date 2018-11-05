package view;

import facebookbd.MemoriaLocal;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.bean.BloqueioAmizade;
import model.bean.SolicAmizade;
import model.bean.Usuario;
import model.dao.BloqueioAmizadeDAO;
import model.dao.SolicAmizadeDAO;
import model.dao.UsuarioDAO;

public class Usuarios extends javax.swing.JFrame {
    private Map<Integer, Usuario> mapaDeUsuariosPorIndiceNaLista;
    private Map<Integer, Usuario> mapaDeUsuariosPorId;

    public Usuarios() {
        initComponents();
        mapaDeUsuariosPorIndiceNaLista = new HashMap<>();
        mapaDeUsuariosPorId = new HashMap<>();
        configurarComponentesDaTela();
    }
    
    private DefaultListModel modeloDaListaDeUsuarios;
    private DefaultListModel modeloDaListaDeSolicitacoesRecebidas;
    private DefaultListModel modeloDaListaDeBloqueio;
    
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
        solicitacoesRecebidasList = new javax.swing.JList<>();
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
                .addContainerGap(355, Short.MAX_VALUE)
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
        usuariosLabel.setText("TODOS OS USUÁRIOS");

        usuariosList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(usuariosList);

        solicitacoesLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        solicitacoesLabel.setText("SOLICITAÇÕES RECEBIDAS");

        solicitacoesRecebidasList.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(solicitacoesRecebidasList);

        bloqueadosLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        bloqueadosLabel.setText("USUÁRIOS BLOQUEADOS POR MIM");

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuariosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solicitacoesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloqueadosLabel))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitacoesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(bloqueadosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        new Perfil().setVisible(true);
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
        this.configurarListaDeSolicitacoesRecebidas();
        this.congifurarListaDeBloqueios();
    }

    private void configurarListaDeUsuarios(){
        modeloDaListaDeUsuarios = new DefaultListModel();
        usuariosList.setModel(modeloDaListaDeUsuarios);

        int usuariosAdicionados = 0;
        for (Usuario usuario: UsuarioDAO.read()) {
            if (usuarioSouEu(usuario) || estouBloqueadoPor(usuario)) continue;

            this.mapaDeUsuariosPorIndiceNaLista.put(usuariosAdicionados++, usuario);
            this.mapaDeUsuariosPorId.put(usuario.getId_usuario(), usuario);
            this.modeloDaListaDeUsuarios.addElement(usuario.getNome()); 
        }

        // Logica para tratar toques e eventos em itens da lista.
        ListSelectionListener listener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList source = (JList)event.getSource();
                    int indiceAtualDaLista = source.getSelectedIndex();
                    Usuario usuarioDesteIndice = mapaDeUsuariosPorIndiceNaLista.get(indiceAtualDaLista);
                    new PerfilDoUsuario(usuarioDesteIndice).setVisible(true);
                    dispose();
                }
            }
        };

        this.usuariosList.addListSelectionListener(listener);
    }
    
    private void configurarListaDeSolicitacoesRecebidas(){
        modeloDaListaDeSolicitacoesRecebidas = new DefaultListModel();
        solicitacoesRecebidasList.setModel(modeloDaListaDeSolicitacoesRecebidas);
       
        for (SolicAmizade solicitacao : SolicAmizadeDAO.read()) {
            if (solicitacao.getId_user_solicitado() != MemoriaLocal.usuarioLogado.getId_usuario())
                continue;
            Usuario usuarioSolicitadoParaInserirNaLista = mapaDeUsuariosPorId.get(solicitacao.getId_user_solicitante());
            modeloDaListaDeSolicitacoesRecebidas.addElement(usuarioSolicitadoParaInserirNaLista.getNome());
        }
        
        //logica para tratar toques e eventos em itens da lista
        ListSelectionListener listener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList source = (JList)event.getSource();
                    int indiceAtualDaLista = source.getSelectedIndex();
                    Usuario usuarioDesteIndice = mapaDeUsuariosPorIndiceNaLista.get(indiceAtualDaLista);
                    SolicAmizade solicitacaoDesteIndice = new SolicAmizade(usuarioDesteIndice.getId_usuario(), MemoriaLocal.usuarioLogado.getId_usuario());
                    new AceitarSolicitacaoDeAmizade(solicitacaoDesteIndice).setVisible(true);
                    dispose();
                }
            }
        };

        this.solicitacoesRecebidasList.addListSelectionListener(listener);
    }

    public void congifurarListaDeBloqueios(){
        modeloDaListaDeBloqueio =  new DefaultListModel();
        bloqueadosList.setModel(modeloDaListaDeBloqueio);
        
        for (BloqueioAmizade bloqueio : BloqueioAmizadeDAO.read()) {
            if (bloqueio.getId_user_bloqueante() != MemoriaLocal.usuarioLogado.getId_usuario())
                continue;
            Usuario usuarioBloqueadoParaInserirNaLista = mapaDeUsuariosPorId.get(bloqueio.getId_user_bloqueado());
            modeloDaListaDeBloqueio.addElement(usuarioBloqueadoParaInserirNaLista.getNome()); 
        }
    }
    
    private boolean usuarioSouEu(Usuario usuario) {
        return usuario.getId_usuario() == MemoriaLocal.usuarioLogado.getId_usuario();
    }
    
    private boolean estouBloqueadoPor(Usuario usuario) {
        return BloqueioAmizadeDAO.checkBloqueio(new BloqueioAmizade(usuario.getId_usuario(), MemoriaLocal.usuarioLogado.getId_usuario()));
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
    private javax.swing.JList<String> solicitacoesRecebidasList;
    private javax.swing.JLabel usuariosLabel;
    private javax.swing.JList<String> usuariosList;
    // End of variables declaration//GEN-END:variables
}
