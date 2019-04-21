/*
 Tela principal do programa que conterá tudas as outras telas
 */
package Tela.MDI;

import Geral.IniciarPrograma;
import Geral.frmAbout;
import Tela.Login.ButtonEntrar;
import Tela.Login.UsuSenha;
import Tela.Login.frmLogin;
import javax.swing.JFrame;

/** 
 * @author ENGENHEIRO EDWIN BELY GARCIA HENAO
 */
public class frmMDI extends javax.swing.JFrame {

    public frmMDI() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        btnIniciarSes = new javax.swing.JButton();
        btnFecharSes = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblUsuarioLogeado = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CDE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela/MDI/Imagens/FondoGris1024x1024.jpg"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Tela/MDI/Imagens/CDE207x122.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1658, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        desktopPane.setLayer(jcMousePanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        jPanel1.setFocusCycleRoot(true);
        jPanel1.setNextFocusableComponent(btnIniciarSes);

        btnIniciarSes.setText("Iniciar Sessão");
        btnIniciarSes.setToolTipText("Abrir Tela Login");
        btnIniciarSes.setEnabled(false);
        btnIniciarSes.setNextFocusableComponent(btnFecharSes);
        btnIniciarSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesMouseClicked(evt);
            }
        });

        btnFecharSes.setText("Fechar Sessão");
        btnFecharSes.setToolTipText("Fechar Sessão");
        btnFecharSes.setEnabled(false);
        btnFecharSes.setNextFocusableComponent(btnClientes);
        btnFecharSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharSesMouseClicked(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes28x25.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setToolTipText("Abrir Tela Cliente");
        btnClientes.setEnabled(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setNextFocusableComponent(btnSair);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Apagar28x25.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Fechar Programa");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setNextFocusableComponent(btnIniciarSes);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        lblUsuarioLogeado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuarioLogeado.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFecharSes, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnIniciarSes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(lblUsuarioLogeado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 808, Short.MAX_VALUE)
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIniciarSes)
                            .addComponent(lblUsuarioLogeado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharSes))
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Program");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Info");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.setToolTipText("");
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseClicked(evt);
            }
        });
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);//sair do programa
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        frmLogin f = new frmLogin();        
        desktopPane.add(f); //adicionar a tela login ao mdi          
        f.setVisible(true); //mostrar tela login 
        f.setLocation((desktopPane.getSize().width / 2) - f.getSize().width/2, (desktopPane.getSize().height / 2) - f.getSize().height/2);//localizar no centro do mdi
        f.txtIdeUsu.requestFocus();//foco a caixa usuario
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//iniciar maximizado
    }//GEN-LAST:event_formWindowOpened

    private void btnIniciarSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesMouseClicked
        if(btnIniciarSes.isEnabled()){//se o button está ativado            
            frmLogin f = new frmLogin();        
            desktopPane.add(f); //adicionar a tela login ao mdi          
            f.setVisible(true); //mostar tela login 
            f.setLocation((desktopPane.getSize().width / 2) - f.getSize().width/2, (desktopPane.getSize().height / 2) - f.getSize().height/2);//localize no centro do mdi
            f.txtIdeUsu.requestFocus();//focus na caixa identidade usuario
            btnIniciarSes.setEnabled(false);//desativar button inicar sessão
        }
    }//GEN-LAST:event_btnIniciarSesMouseClicked

    private void btnFecharSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharSesMouseClicked
        if(btnFecharSes.isEnabled()){//se button fechar sessão está ativado
            UsuSenha usuCla = new UsuSenha();
            usuCla.setautorizado("Não");//Reinicie o valor autorizado no programa
            dispose();//fechar tela MDI
            IniciarPrograma.main (null);//invocar main principal para reinicar programa         
        }
    }//GEN-LAST:event_btnFecharSesMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
       System.exit(0);//fechar programa
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        if(btnClientes.isEnabled()){//se buton cliente está ativado
            ButtonEntrar be = new ButtonEntrar();//instância de classe
            be.abrirClientes();//método que abre tela clienes
            btnClientes.setEnabled(false);//desativa button clientes
        }
    }//GEN-LAST:event_btnClientesMouseClicked

    private void aboutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseClicked
        
    }//GEN-LAST:event_aboutMenuItemMouseClicked

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        frmAbout fa = new frmAbout();//instância tela aboout                       
        frmMDI.desktopPane.add(fa);//adicionar tela about ao desktoppanel do MDI           
        fa.setLocation((desktopPane.getSize().width / 2) - fa.getSize().width/2, (desktopPane.getSize().height / 2) - fa.getSize().height/2);//localizar no centro do mdi
        fa.toFront();//coloque tela about ao frente
        fa.setVisible(true);//mostrar tela about 
    }//GEN-LAST:event_aboutMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem aboutMenuItem;
    public static javax.swing.JButton btnClientes;
    public static javax.swing.JButton btnFecharSes;
    public static javax.swing.JButton btnIniciarSes;
    public static javax.swing.JButton btnSair;
    public static javax.swing.JDesktopPane desktopPane;
    public static javax.swing.JMenuItem exitMenuItem;
    public static javax.swing.JMenu fileMenu;
    public static javax.swing.JMenu helpMenu;
    public static javax.swing.JPanel jPanel1;
    public static jcMousePanel.jcMousePanel jcMousePanel1;
    public static javax.swing.JLabel lblUsuarioLogeado;
    public static javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
