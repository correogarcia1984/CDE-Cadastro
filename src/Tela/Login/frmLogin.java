/*
Tela de conexão do usuario con la DB, usuario y senha
 */
package Tela.Login;

import Geral.CorFoco;
import Tela.MDI.frmMDI;
import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */
public class frmLogin extends javax.swing.JInternalFrame { 
    
    public frmLogin() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        panCentral = new javax.swing.JPanel();
        lblIdeUsu = new javax.swing.JLabel();
        txtIdeUsu = new javax.swing.JTextField();
        lblSenUsu = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtSenUsu = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();

        setResizable(true);
        setTitle("Login");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela/MDI/Imagens/FondoGris1024x1024.jpg"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sin logoGris.jpg"))); // NOI18N

        panCentral.setFocusCycleRoot(true);
        panCentral.setNextFocusableComponent(txtIdeUsu);
        panCentral.setOpaque(false);

        lblIdeUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdeUsu.setForeground(new java.awt.Color(0, 0, 51));
        lblIdeUsu.setText("Identidade:");

        txtIdeUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdeUsu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdeUsu.setToolTipText("Identidade do Usuario");
        txtIdeUsu.setNextFocusableComponent(txtSenUsu);
        txtIdeUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdeUsuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdeUsuFocusLost(evt);
            }
        });
        txtIdeUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdeUsuKeyTyped(evt);
            }
        });

        lblSenUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenUsu.setForeground(new java.awt.Color(0, 0, 51));
        lblSenUsu.setText("Senha:");

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chulo56x51.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("Entra ao Programa");
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrar.setNextFocusableComponent(btnSair);
        btnEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Equis56x51.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Sair do Programa");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setNextFocusableComponent(txtIdeUsu);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        txtSenUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenUsu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenUsu.setToolTipText("Senha do Usuario");
        txtSenUsu.setNextFocusableComponent(btnEntrar);
        txtSenUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenUsuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenUsuFocusLost(evt);
            }
        });
        txtSenUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenUsuKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panCentralLayout = new javax.swing.GroupLayout(panCentral);
        panCentral.setLayout(panCentralLayout);
        panCentralLayout.setHorizontalGroup(
            panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCentralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdeUsu)
                    .addComponent(lblSenUsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        panCentralLayout.setVerticalGroup(
            panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCentralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdeUsu))
                .addGap(30, 30, 30)
                .addGroup(panCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenUsu)
                    .addComponent(txtSenUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela/Login/Imagens/Usuario71x67.png"))); // NOI18N
        lblTitulo.setText("Login Usuario");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTitulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jcMousePanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        this.setSize(400, 400);
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtIdeUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdeUsuKeyTyped
        //para saber o numero de digitos e pasar o focus
        if(txtIdeUsu.getText().length()==10){//maximo 10 digitos
            evt.consume();//termina o evento atual, limita o numero de digitos
            txtSenUsu.requestFocus();//envair foco a caixa senha
        }

        //para validar só numeros
        if ((evt.getKeyChar() >= evt.VK_0 && evt.getKeyChar() <= evt.VK_9) || evt.getKeyChar() == evt.VK_ENTER ) {            
            if(evt.getKeyChar() == evt.VK_ENTER){//se é o enter
                txtSenUsu.requestFocus();//pasar foco a caixa senha
            }
        }else{//nao é numero nem enter
            evt.consume();//termine evento tecla presionada
        }         
    }//GEN-LAST:event_txtIdeUsuKeyTyped

    private void txtSenUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenUsuKeyTyped
       if(txtSenUsu.getPassword().length==10){//máximo 10 digitos
            evt.consume();//termina o evento atual, limita o numero de digitos
            btnEntrar.requestFocus();//pasar focus ao button entrar
        }
        
        if(evt.getKeyChar() == evt.VK_ENTER){//se apertaram tecla enter
            btnEntrar.requestFocus();//pasar focus ao button entrar
        }
    }//GEN-LAST:event_txtSenUsuKeyTyped

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE || evt.getKeyChar() == evt.VK_BACK_SPACE) {
            btnEntrar.doClick();//para dar efeito visual de pressionar o button 
            pressionouButtonEntrar();//metodo que executa sentencas ao pressionar button ingresar ao programa
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        pressionouButtonEntrar();////metodo que executa sentencas ao pressionar button ingresar ao programa       
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        frmMDI.btnIniciarSes.setEnabled(true);
        dispose();//fechar tela login
    }//GEN-LAST:event_btnSairMouseClicked

    private void txtIdeUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdeUsuFocusGained
        InputMap map = txtIdeUsu.getInputMap(txtIdeUsu.WHEN_FOCUSED);//desativar opção para colar texto
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); //para desactivar opção para colar texto
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com fuco
        txtIdeUsu.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtIdeUsuFocusGained

    private void txtIdeUsuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdeUsuFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor original da caixa
        txtIdeUsu.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtIdeUsuFocusLost

    private void txtSenUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenUsuFocusGained
        InputMap map = txtSenUsu.getInputMap(txtIdeUsu.WHEN_FOCUSED);//desativar opção para colar texto
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); //para desactivar opção para colar texto
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtSenUsu.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtSenUsuFocusGained

    private void txtSenUsuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenUsuFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor original da caixa
        txtSenUsu.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtSenUsuFocusLost

    public void pressionouButtonEntrar(){//método que executa sentencas ao pressionar button entrar ao programa
        if(txtIdeUsu.getText().length()==0){//se nao há nenhum em caixa identidade dusuario
            JOptionPane.showMessageDialog(null,"Você Deve Inserir Uma Identidade de Usuário");
            this.moveToFront();//enviar ao frente
            txtIdeUsu.requestFocus();//foco no caixa identidade do usuario
        }else{//se há escito na caixa de identidade usuario
            this.setVisible(false);//esconder tela login
            ButtonEntrar b = new ButtonEntrar();//classe com sentenças para ingresar
            b.entrar();//invocar medodo da classe ButtonEntrar
            UsuSenha usuSen = new UsuSenha();//classe
            if (usuSen.getautorizado() == "Sim"){//variável que indica que a entrada no programa deu certo, fechar tela login
                dispose();//fechar tela login  
            }else{
                this.setVisible(true);//mostrar tela login
            }   
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEntrar;
    public static javax.swing.JButton btnSair;
    public static jcMousePanel.jcMousePanel jcMousePanel1;
    public static javax.swing.JLabel lblIdeUsu;
    public static javax.swing.JLabel lblSenUsu;
    public static javax.swing.JLabel lblTitulo;
    public static javax.swing.JPanel panCentral;
    public static javax.swing.JTextField txtIdeUsu;
    public static javax.swing.JPasswordField txtSenUsu;
    // End of variables declaration//GEN-END:variables
}
