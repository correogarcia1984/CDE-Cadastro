/*
Tela para a pesquisa, criação, modificação e eliminação de clientes na Base de Dados
 */
package Tela.Clientes;

import Geral.CorFoco;
import Tela.Clientes.TransacSQL.CriarCliente;
import Tela.Clientes.TransacSQL.PesquisarCliente;
import Tela.MDI.frmMDI;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENAO
 */
public class frmClientes extends javax.swing.JInternalFrame {    
    String autorizarSalvar = "Sim";//variável que controla se os Campos obrigatórios do cliente estão completos
    Date dataConvertida;//variavel que salva as datas string convertidas a tipo data
    int regCliente;//variavel que salva a identidade string do cliente convertidas a tipo int
    int confirme;//variavel que salva se confirme que quer savar o registro
    public static String ação;//variavel que salva a ação de criar ou modificar cliente

    public frmClientes() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        lblTitulo = new javax.swing.JLabel();
        panPesquisa = new javax.swing.JPanel();
        lblPesqNome = new javax.swing.JLabel();
        txtPesqNome = new javax.swing.JTextField();
        txtPesqRegi = new javax.swing.JTextField();
        lblPesqRegi = new javax.swing.JLabel();
        lblPesqCpf = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtfPesCpf = new javax.swing.JFormattedTextField();
        panResPesquisa = new javax.swing.JPanel();
        btnExpandir = new javax.swing.JButton();
        btnReduzir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        panEdiDados = new javax.swing.JPanel();
        lblEdiNumRegi = new javax.swing.JLabel();
        lblEdiNomClient = new javax.swing.JLabel();
        lblEdiRne = new javax.swing.JLabel();
        lblEdiCpf = new javax.swing.JLabel();
        lblEdiDatNasci = new javax.swing.JLabel();
        txtEdiNumRegi = new javax.swing.JTextField();
        txtEdiNomClient = new javax.swing.JTextField();
        lblEdiSexo = new javax.swing.JLabel();
        lblEdiEndere = new javax.swing.JLabel();
        txtEdiEndere = new javax.swing.JTextField();
        lblEdiCep = new javax.swing.JLabel();
        lblEdiAtivo = new javax.swing.JLabel();
        cmbEdiAtivo = new javax.swing.JComboBox<>();
        cmbEdiSexo = new javax.swing.JComboBox<>();
        lblEdiDatCadas = new javax.swing.JLabel();
        lblEdiObser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaEdiObeser = new javax.swing.JTextArea();
        txtfEdiDatCadas = new javax.swing.JFormattedTextField();
        txtfEdiDatNasci = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtfEdiCpf = new javax.swing.JFormattedTextField();
        txtfEdiCep = new javax.swing.JFormattedTextField();
        txtfEdiRne = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes28x25.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 586));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FondoVerde977x971.jpg"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sin logVerde.png"))); // NOI18N
        jcMousePanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela/Clientes/Imagens/Clientes71x67.png"))); // NOI18N
        lblTitulo.setText("Clientes");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblTitulo.setPreferredSize(new java.awt.Dimension(957, 67));

        panPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        panPesquisa.setForeground(new java.awt.Color(0, 0, 51));
        panPesquisa.setFocusCycleRoot(true);
        panPesquisa.setNextFocusableComponent(txtPesqRegi);
        panPesquisa.setOpaque(false);
        panPesquisa.setPreferredSize(new java.awt.Dimension(956, 86));

        lblPesqNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPesqNome.setForeground(new java.awt.Color(0, 0, 51));
        lblPesqNome.setText("Nome:");

        txtPesqNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesqNome.setToolTipText("Nome do Cliente");
        txtPesqNome.setNextFocusableComponent(txtfPesCpf);
        txtPesqNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesqNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesqNomeFocusLost(evt);
            }
        });
        txtPesqNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesqNomeKeyTyped(evt);
            }
        });

        txtPesqRegi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesqRegi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesqRegi.setToolTipText("Número de Registro do Cliente");
        txtPesqRegi.setNextFocusableComponent(txtPesqNome);
        txtPesqRegi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesqRegiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesqRegiFocusLost(evt);
            }
        });
        txtPesqRegi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesqRegiKeyTyped(evt);
            }
        });

        lblPesqRegi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPesqRegi.setForeground(new java.awt.Color(0, 0, 51));
        lblPesqRegi.setText("Número de Registro:");

        lblPesqCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPesqCpf.setForeground(new java.awt.Color(0, 0, 51));
        lblPesqCpf.setText("CPF:");

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buscar28x25.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Pesquisar Cliente");
        btnPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisar.setNextFocusableComponent(btnExpandir);
        btnPesquisar.setPreferredSize(new java.awt.Dimension(85, 63));
        btnPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyPressed(evt);
            }
        });

        txtfPesCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfPesCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfPesCpf.setNextFocusableComponent(btnPesquisar);
        txtfPesCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfPesCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfPesCpfFocusLost(evt);
            }
        });
        txtfPesCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfPesCpfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panPesquisaLayout = new javax.swing.GroupLayout(panPesquisa);
        panPesquisa.setLayout(panPesquisaLayout);
        panPesquisaLayout.setHorizontalGroup(
            panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesquisaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesqRegi)
                    .addGroup(panPesquisaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPesqRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106)
                .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesqNome)
                    .addComponent(txtPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfPesCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesqCpf))
                .addGap(73, 73, 73)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panPesquisaLayout.setVerticalGroup(
            panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesquisaLayout.createSequentialGroup()
                .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPesquisaLayout.createSequentialGroup()
                        .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPesqNome)
                            .addComponent(lblPesqRegi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesqRegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panPesquisaLayout.createSequentialGroup()
                        .addComponent(lblPesqCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfPesCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panResPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados de Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        panResPesquisa.setOpaque(false);
        panResPesquisa.setPreferredSize(new java.awt.Dimension(956, 161));

        btnExpandir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mas28x25.png"))); // NOI18N
        btnExpandir.setText("Expandir");
        btnExpandir.setToolTipText("Expandir Tabela de Resultados");
        btnExpandir.setEnabled(false);
        btnExpandir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExpandir.setNextFocusableComponent(btnReduzir);
        btnExpandir.setPreferredSize(new java.awt.Dimension(85, 53));
        btnExpandir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExpandir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExpandirMouseClicked(evt);
            }
        });

        btnReduzir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Menos28x25.png"))); // NOI18N
        btnReduzir.setText("Reduzir");
        btnReduzir.setToolTipText("Reducir Tabela de Resultados");
        btnReduzir.setEnabled(false);
        btnReduzir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReduzir.setNextFocusableComponent(txtEdiNumRegi);
        btnReduzir.setPreferredSize(new java.awt.Dimension(85, 53));
        btnReduzir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReduzir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReduzirMouseClicked(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número de Registro", "Ativo", "Data de Cadastro", "Cliente", "Sexo", "Data Nascimento", "Identidade", "CPF", "Endereço", "CEP", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultados.setToolTipText("Resultados da Pesquisa, Pressione Duplo Click Para Carregar o Cliente no Panel \"Dados de Cliente\" ");
        tblResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblResultados.setOpaque(false);
        tblResultados.setRowHeight(20);
        tblResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblResultados);

        javax.swing.GroupLayout panResPesquisaLayout = new javax.swing.GroupLayout(panResPesquisa);
        panResPesquisa.setLayout(panResPesquisaLayout);
        panResPesquisaLayout.setHorizontalGroup(
            panResPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResPesquisaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panResPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReduzir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpandir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panResPesquisaLayout.setVerticalGroup(
            panResPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panResPesquisaLayout.createSequentialGroup()
                        .addComponent(btnExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(panResPesquisaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        panEdiDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        panEdiDados.setOpaque(false);
        panEdiDados.setPreferredSize(new java.awt.Dimension(956, 228));

        lblEdiNumRegi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiNumRegi.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiNumRegi.setText("* Número Registro:");

        lblEdiNomClient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiNomClient.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiNomClient.setText("* Nome:");

        lblEdiRne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiRne.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiRne.setText("* Identidade(RNE):");

        lblEdiCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiCpf.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiCpf.setText("* CPF:");

        lblEdiDatNasci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiDatNasci.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiDatNasci.setText("* Data de Nascimento:");

        txtEdiNumRegi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEdiNumRegi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdiNumRegi.setToolTipText("Número de Registro do Cliente");
        txtEdiNumRegi.setEnabled(false);
        txtEdiNumRegi.setNextFocusableComponent(cmbEdiAtivo);

        txtEdiNomClient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEdiNomClient.setToolTipText("Nome do Cliente");
        txtEdiNomClient.setEnabled(false);
        txtEdiNomClient.setNextFocusableComponent(cmbEdiSexo);
        txtEdiNomClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdiNomClientFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdiNomClientFocusLost(evt);
            }
        });
        txtEdiNomClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdiNomClientKeyTyped(evt);
            }
        });

        lblEdiSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiSexo.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiSexo.setText("* Sexo:");

        lblEdiEndere.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiEndere.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiEndere.setText("  Endereço:");

        txtEdiEndere.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEdiEndere.setToolTipText("Endereço do Cliente");
        txtEdiEndere.setEnabled(false);
        txtEdiEndere.setNextFocusableComponent(txtfEdiCep);
        txtEdiEndere.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdiEndereFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdiEndereFocusLost(evt);
            }
        });
        txtEdiEndere.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdiEndereKeyTyped(evt);
            }
        });

        lblEdiCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiCep.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiCep.setText("* CEP:");

        lblEdiAtivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiAtivo.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiAtivo.setText("* Ativo:");

        cmbEdiAtivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEdiAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        cmbEdiAtivo.setToolTipText("Cliente Ativo?");
        cmbEdiAtivo.setEnabled(false);
        cmbEdiAtivo.setNextFocusableComponent(txtfEdiDatCadas);
        cmbEdiAtivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbEdiAtivoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbEdiAtivoFocusLost(evt);
            }
        });

        cmbEdiSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEdiSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "" }));
        cmbEdiSexo.setSelectedIndex(2);
        cmbEdiSexo.setToolTipText("Sexo do Cliente");
        cmbEdiSexo.setEnabled(false);
        cmbEdiSexo.setNextFocusableComponent(txtfEdiDatNasci);
        cmbEdiSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbEdiSexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbEdiSexoFocusLost(evt);
            }
        });

        lblEdiDatCadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiDatCadas.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiDatCadas.setText("* Data de Cadastro:");

        lblEdiObser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEdiObser.setForeground(new java.awt.Color(0, 0, 51));
        lblEdiObser.setText("  Observação:");

        txtaEdiObeser.setColumns(20);
        txtaEdiObeser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtaEdiObeser.setRows(5);
        txtaEdiObeser.setToolTipText("Observação do Cliente");
        txtaEdiObeser.setEnabled(false);
        txtaEdiObeser.setNextFocusableComponent(btnCriar);
        txtaEdiObeser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaEdiObeserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaEdiObeserFocusLost(evt);
            }
        });
        txtaEdiObeser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaEdiObeserKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtaEdiObeser);

        txtfEdiDatCadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfEdiDatCadas.setToolTipText("Data de Cadastro do Cliente");
        txtfEdiDatCadas.setEnabled(false);
        txtfEdiDatCadas.setNextFocusableComponent(txtEdiNomClient);

        txtfEdiDatNasci.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfEdiDatNasci.setToolTipText("Data de Nascimento do Cliente");
        txtfEdiDatNasci.setEnabled(false);
        txtfEdiDatNasci.setNextFocusableComponent(txtfEdiRne);
        txtfEdiDatNasci.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfEdiDatNasciFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfEdiDatNasciFocusLost(evt);
            }
        });
        txtfEdiDatNasci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfEdiDatNasciKeyTyped(evt);
            }
        });

        jPanel1.setOpaque(false);

        btnCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mas22x20.png"))); // NOI18N
        btnCriar.setText("Criar");
        btnCriar.setToolTipText("Criar Novo Cliente na Base de Dados");
        btnCriar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCriar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCriar.setNextFocusableComponent(btnModificar);
        btnCriar.setPreferredSize(new java.awt.Dimension(100, 29));
        btnCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriarMouseClicked(evt);
            }
        });
        btnCriar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCriarKeyPressed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actualizar22x20.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modificar os Dados do Cliente");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnModificar.setNextFocusableComponent(btnEliminar);
        btnModificar.setPreferredSize(new java.awt.Dimension(100, 29));
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnModificarKeyPressed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Equis22x20.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar Cliente da Base de Dados");
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setNextFocusableComponent(btnLimpar);
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 29));
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEliminarKeyPressed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpiar22x20.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpar Campos");
        btnLimpar.setEnabled(false);
        btnLimpar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpar.setNextFocusableComponent(btnCancelar);
        btnLimpar.setPreferredSize(new java.awt.Dimension(100, 29));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        btnLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimparKeyPressed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atras22x20.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar Edição de Dados do Cliente");
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setNextFocusableComponent(btnSalvar);
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 29));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar28x25.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setNextFocusableComponent(btnSair);
        btnSalvar.setPreferredSize(new java.awt.Dimension(85, 63));
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Apagar28x25.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setNextFocusableComponent(txtPesqRegi);
        btnSair.setPreferredSize(new java.awt.Dimension(83, 63));
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtfEdiCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfEdiCpf.setEnabled(false);
        txtfEdiCpf.setNextFocusableComponent(txtEdiEndere);
        txtfEdiCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfEdiCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfEdiCpfFocusLost(evt);
            }
        });
        txtfEdiCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfEdiCpfKeyTyped(evt);
            }
        });

        txtfEdiCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfEdiCep.setEnabled(false);
        txtfEdiCep.setNextFocusableComponent(txtaEdiObeser);
        txtfEdiCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfEdiCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfEdiCepFocusLost(evt);
            }
        });
        txtfEdiCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfEdiCepKeyTyped(evt);
            }
        });

        txtfEdiRne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfEdiRne.setEnabled(false);
        txtfEdiRne.setNextFocusableComponent(txtfEdiCpf);
        txtfEdiRne.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfEdiRneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfEdiRneFocusLost(evt);
            }
        });
        txtfEdiRne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfEdiRneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panEdiDadosLayout = new javax.swing.GroupLayout(panEdiDados);
        panEdiDados.setLayout(panEdiDadosLayout);
        panEdiDadosLayout.setHorizontalGroup(
            panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEdiDadosLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEdiDadosLayout.createSequentialGroup()
                        .addComponent(lblEdiNumRegi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdiNumRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEdiDadosLayout.createSequentialGroup()
                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdiEndere)
                            .addComponent(lblEdiObser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdiNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdiRne))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panEdiDadosLayout.createSequentialGroup()
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panEdiDadosLayout.createSequentialGroup()
                                        .addComponent(txtEdiNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panEdiDadosLayout.createSequentialGroup()
                                        .addComponent(txtfEdiRne, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)))
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdiAtivo)
                                    .addComponent(lblEdiSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEdiCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panEdiDadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbEdiSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbEdiAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEdiDadosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtfEdiCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEdiDatCadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEdiDatNasci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfEdiDatCadas, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txtfEdiDatNasci)))
                            .addComponent(jScrollPane1)
                            .addGroup(panEdiDadosLayout.createSequentialGroup()
                                .addComponent(txtEdiEndere, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lblEdiCep)
                                .addGap(18, 18, 18)
                                .addComponent(txtfEdiCep, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        panEdiDadosLayout.setVerticalGroup(
            panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEdiDadosLayout.createSequentialGroup()
                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEdiDadosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEdiDadosLayout.createSequentialGroup()
                                    .addComponent(lblEdiAtivo)
                                    .addGap(10, 10, 10))
                                .addGroup(panEdiDadosLayout.createSequentialGroup()
                                    .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEdiNumRegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEdiNumRegi))
                                    .addGap(5, 5, 5)))
                            .addComponent(cmbEdiAtivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panEdiDadosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEdiDatCadas)
                                    .addComponent(txtfEdiDatCadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panEdiDadosLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEdiCpf)
                                        .addComponent(txtfEdiCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtfEdiRne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panEdiDadosLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEdiNomClient)
                                    .addComponent(txtEdiNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEdiSexo)
                                    .addComponent(cmbEdiSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEdiDatNasci)
                                    .addComponent(txtfEdiDatNasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(lblEdiRne)))
                        .addGap(8, 8, 8)
                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdiEndere, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdiEndere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdiCep)
                            .addComponent(txtfEdiCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(panEdiDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdiObser)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                        .addComponent(panEdiDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                        .addComponent(panResPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panResPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panEdiDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jcMousePanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
            pressionaramButtonPesquisar();//método que executa sentenças ao pressionar button pesquisar
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnExpandirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandirMouseClicked
        pressionaramButtonExpandir();//método que expande tabela de resultados
    }//GEN-LAST:event_btnExpandirMouseClicked

    private void btnReduzirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReduzirMouseClicked
        pressionaramButtonReduzir();//método que reduze tabela de resultados
    }//GEN-LAST:event_btnReduzirMouseClicked

    private void txtPesqRegiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesqRegiFocusGained
        InputMap map = txtPesqRegi.getInputMap(txtPesqRegi.WHEN_FOCUSED);//desativar opção para colar texto
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); //para desativar opção para colar texto
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com fuco
        txtPesqRegi.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtPesqRegiFocusGained

    private void txtPesqRegiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesqRegiFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor original de fundo da caixa
        txtPesqRegi.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtPesqRegiFocusLost

    private void txtPesqRegiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqRegiKeyTyped
        //para saber o número de dígitos e passar o foco
        if(txtPesqRegi.getText().length()==10){//tamanho máximo da caixa número de registro
            evt.consume();//termina o evento atual, número limite de dìgitos
            txtPesqNome.requestFocus();//passar foco a caixa nome
        }

        //para validar só números e tecla enter
        if ((evt.getKeyChar() >= evt.VK_0 && evt.getKeyChar() <= evt.VK_9) || evt.getKeyChar() == evt.VK_ENTER ) {
            //para permitir números e o enter
            if(evt.getKeyChar() == evt.VK_ENTER){//se é tecla ener, enviar foco a caixa nome
                txtPesqNome.requestFocus();//passar foco a caixa nome
            }
        }else{//não é número nem enter
            evt.consume();//terminar evento tecla pressionada
        }       
    }//GEN-LAST:event_txtPesqRegiKeyTyped

    private void txtPesqNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesqNomeFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com fuco
        txtPesqNome.setBackground(c.getFundoCorFoco());//cor de fundo da caixa com foco
    }//GEN-LAST:event_txtPesqNomeFocusGained

    private void txtPesqNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesqNomeFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor original da caixa
        txtPesqNome.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtPesqNomeFocusLost

    private void txtPesqNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqNomeKeyTyped
       //para saber o número de dígitos e passar o foco
        if(txtPesqNome.getText().length()==50){//se digitos é máximo 50, enviar foco a caixa cpf
            evt.consume();//termina o evento atual, numero limite de dígitos
            txtfPesCpf.requestFocus();//passar foco a caixa cpf
        }
    }//GEN-LAST:event_txtPesqNomeKeyTyped

    private void tblResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseClicked
        if(evt.getClickCount()==2){//se pressiono dupla click em tabela de resultados pesquisa cientes          
           int linhaSeleccionada;//capturar número de linha seleccionada
           linhaSeleccionada = tblResultados.getSelectedRow();//numero de linha seleccionada
           
           Integer numRegCliente = (Integer)tblResultados.getValueAt(linhaSeleccionada, 1);//capturar número de registro do cliente
           txtEdiNumRegi.setText(Integer.toString(numRegCliente));//trazer numero registro cliente da tabela à caixa de texto
                           
           String ativo = (String)tblResultados.getValueAt(linhaSeleccionada, 2);//capturar ativo
           cmbEdiAtivo.setSelectedItem(ativo);//trazer ativo ao comboBox
           
           String dataCadastro = (String)tblResultados.getValueAt(linhaSeleccionada, 3);//capturar data de cadastro           
           txtfEdiDatCadas.setText(dataCadastro);//trazer data de cadastro à caixa de texto
           
           String nomeCliente = (String)tblResultados.getValueAt(linhaSeleccionada, 4);//capturar nome
           txtEdiNomClient.setText(nomeCliente);//trazer nome do cliente à caixa de texto
     
           String sexo = (String)tblResultados.getValueAt(linhaSeleccionada, 5);//capturar sexo
           cmbEdiSexo.setSelectedItem(sexo);//trazer sexo ao comboBox
           
           String dataNacimento = (String)tblResultados.getValueAt(linhaSeleccionada, 6);//capturar data de nacimento
           txtfEdiDatNasci.setText(dataNacimento);//trazer data de nacimento à caixa de texto
                      
           String identidade = (String)tblResultados.getValueAt(linhaSeleccionada, 7);//capturar identidade
           txtfEdiRne.setText(identidade);//trazer identidade à caixa de texto

           String cpf = (String)tblResultados.getValueAt(linhaSeleccionada, 8);//capturar cpf
           txtfEdiCpf.setText(cpf);//trazer cpf à caixa de texto

           String endereço = (String)tblResultados.getValueAt(linhaSeleccionada, 9);//capturar endereço
           txtEdiEndere.setText(endereço);//trazer endereço à caixa de texto

           String cep = (String)tblResultados.getValueAt(linhaSeleccionada, 10);//capturar cep
           txtfEdiCep.setText(cep);//trazer cep à caixa de texto
           
           String observação = (String)tblResultados.getValueAt(linhaSeleccionada, 11);//capturar observação
           txtaEdiObeser.setText(observação);//trazer observação à caixa de texto
                                 
           btnModificar.setEnabled(true);//ativar button modifcar
           btnEliminar.setEnabled(true);//ativar button eliminar
           
           if(btnReduzir.isEnabled()){//se button reduzir está ativado
               pressionaramButtonReduzir();//Método reduzir vista de resultados al pressionar button reduzir
           }           
        }
    }//GEN-LAST:event_tblResultadosMouseClicked

    private void btnCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMouseClicked
        pressionaramButtonCriar();//método que executa sentencas de criar ao pressionar button ingresar ao programa
    }//GEN-LAST:event_btnCriarMouseClicked

    private void txtaEdiObeserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaEdiObeserKeyTyped
        //para saber o número de dígitos e passar o foco
        if(evt.getKeyChar() == evt.VK_TAB){//se pressinaram tecla TAB
            btnLimpar.requestFocus();//passar foco a button limpar
        }
        
        if(txtaEdiObeser.getText().length()==200){//se é o máximo de 200 letras, enviar o foco a button criar
            evt.consume();//termina o evento atual, numero limite de letras
            btnCriar.requestFocus();//enviar foco a button criar
        }
    }//GEN-LAST:event_txtaEdiObeserKeyTyped

    private void txtaEdiObeserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaEdiObeserFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtaEdiObeser.setBackground(c.getFundoCorOriginal());//cor de fundo original
        formatoTexto(txtaEdiObeser);//método que da formato a um texto, primerira letra en maiúsculas e outras en minúsculas         
    }//GEN-LAST:event_txtaEdiObeserFocusLost

    private void txtaEdiObeserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaEdiObeserFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtaEdiObeser.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtaEdiObeserFocusGained

    private void cmbEdiSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEdiSexoFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        cmbEdiSexo.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_cmbEdiSexoFocusLost

    private void cmbEdiSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEdiSexoFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        cmbEdiSexo.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_cmbEdiSexoFocusGained

    private void cmbEdiAtivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEdiAtivoFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        cmbEdiAtivo.setBackground(c.getFundoCorOriginal());//cor de Original foco
    }//GEN-LAST:event_cmbEdiAtivoFocusLost

    private void cmbEdiAtivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEdiAtivoFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        cmbEdiAtivo.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_cmbEdiAtivoFocusGained

    private void txtEdiEndereKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdiEndereKeyTyped
        //para saber o número de dígitos e passar o foco
        if(txtEdiEndere.getText().length()==50){//se endereço é o número máximo de 50 letras, enviar foco a caixa cep
            evt.consume();//termina o evento atual, numero limite de letras
            txtfEdiCep.requestFocus();//enviar foco a caixa cep
        }
    }//GEN-LAST:event_txtEdiEndereKeyTyped

    private void txtEdiEndereFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdiEndereFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtEdiEndere.setBackground(c.getFundoCorOriginal());//cor de fundo original
        formatoTexto(txtEdiEndere);//método que da formato a um texto, primerira letra en maiúsculas e outras en minúsculas         
    }//GEN-LAST:event_txtEdiEndereFocusLost

    private void txtEdiEndereFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdiEndereFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtEdiEndere.setBackground(c.getFundoCorFoco());//cor de fundo foco        
    }//GEN-LAST:event_txtEdiEndereFocusGained

    private void txtEdiNomClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdiNomClientKeyTyped
        //para saber o número de dígitos e passar o foco
        if(txtEdiNomClient.getText().length()==50){//se nome é o máximo de letras, enviar foco a comboBox sexo
            evt.consume();//termina o evento atual, numero limite de letras
            cmbEdiSexo.requestFocus();//passar foco a combo sexo
        }
    }//GEN-LAST:event_txtEdiNomClientKeyTyped

    private void txtEdiNomClientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdiNomClientFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com fuco
        txtEdiNomClient.setBackground(c.getFundoCorOriginal());//cor de fundo foco
        formatoTexto(txtEdiNomClient);//método que da formato a um texto, primerira letra en maiúsculas e outras en minúsculas         
    }//GEN-LAST:event_txtEdiNomClientFocusLost

    private void txtEdiNomClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdiNomClientFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com fuco
        txtEdiNomClient.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtEdiNomClientFocusGained

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        pressionaramButtonSalvar();//mètod que salva um cliente na Base de dados 
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void txtfEdiDatNasciFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiDatNasciFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtfEdiDatNasci.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtfEdiDatNasciFocusGained

    private void txtfEdiDatNasciFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiDatNasciFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor da caixa com foco
        txtfEdiDatNasci.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtfEdiDatNasciFocusLost

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        pressionaramButtonModificar();//método para modificar um cliente
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        pressionaramButtonEliminar();//mètodo para eliminar um cliente        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        limparObjetos();//métod que limpa tudos os objetos
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        pressionaramButtonCancelar();//método para cancelar edição do cliente       
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtfEdiRneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiRneFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtfEdiRne.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtfEdiRneFocusGained

    private void txtfEdiRneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiRneFocusLost
        txtfEdiRne.setText(txtfEdiRne.getText().toUpperCase());//tudas as string a maiúsculas
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtfEdiRne.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtfEdiRneFocusLost

    private void txtfEdiRneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfEdiRneKeyTyped
        enviarFocoCaixaComMascara(txtfEdiRne, txtfEdiCpf, 9);//método que valida caixas com mascara, se tem tamanho máximo envia foco a próximo objeto         
    }//GEN-LAST:event_txtfEdiRneKeyTyped

    private void txtfEdiCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiCpfFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtfEdiCpf.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtfEdiCpfFocusGained

    private void txtfEdiCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiCpfFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtfEdiCpf.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtfEdiCpfFocusLost

    private void txtfEdiCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfEdiCpfKeyTyped
        enviarFocoCaixaComMascara(txtfEdiCpf, txtEdiEndere, 14);//método que valida caixas com mascara, se tem tamanho máximo envia foco a próximo objeto         
    }//GEN-LAST:event_txtfEdiCpfKeyTyped

    private void txtfEdiCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiCepFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor da caixa com foco
        txtfEdiCep.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtfEdiCepFocusGained

    private void txtfEdiCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfEdiCepFocusLost
        CorFoco c = new CorFoco();//classe que dá o cor de fundo da caixa com foco
        txtfEdiCep.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtfEdiCepFocusLost

    private void txtfEdiCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfEdiCepKeyTyped
        enviarFocoCaixaComMascara(txtfEdiCep, txtaEdiObeser, 9);//método que valida caixas com mascara, se tem tamanho máximo envia foco a próximo objeto         
    }//GEN-LAST:event_txtfEdiCepKeyTyped

    private void txtfPesCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfPesCpfFocusGained
        CorFoco c = new CorFoco();//classe que dá o cor da caixa com fuco
        txtfPesCpf.setBackground(c.getFundoCorFoco());//cor de fundo foco
    }//GEN-LAST:event_txtfPesCpfFocusGained

    private void txtfPesCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfPesCpfFocusLost
       CorFoco c = new CorFoco();//classe que dá o cor original da caixa
       txtfPesCpf.setBackground(c.getFundoCorOriginal());//cor de fundo original
    }//GEN-LAST:event_txtfPesCpfFocusLost

    private void txtfPesCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfPesCpfKeyTyped
        enviarFocoCaixaComMascara(txtfPesCpf, txtfPesCpf, 14);//método que valida caixas com mascara, se tem tamanho máximo envia foco a próximo objeto         
    }//GEN-LAST:event_txtfPesCpfKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        tblResultados.getTableHeader().setReorderingAllowed(false);//trancar troca de posição de colunas da tabela
        mascarasTextFields();//para dar formato a caixas com mascaras 
        this.moveToFront();//tela clientes ao frente
        txtPesqRegi.requestFocus();//focus no caixa identidade do usuario
        desativarObjetos();//método para desativar tudos os botones con formato pessoal
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            btnPesquisar.doClick();//para dar efeito visual de pressionar o button 
            pressionaramButtonPesquisar();//método que executa sentencas de pesquisa ao pressionar button pesquisar
        }
    }//GEN-LAST:event_btnPesquisarKeyPressed

    private void btnCriarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCriarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            btnCriar.doClick();//para dar efeito visual de pressionar o button 
            pressionaramButtonCriar();//método que executa sentencas de criar ao pressionar button
        }
    }//GEN-LAST:event_btnCriarKeyPressed

    private void btnModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnModificarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            btnModificar.doClick();//para dar efeito visual de pressionar o button 
            pressionaramButtonModificar();//método que executa sentencas de modificar ao pressionar button
        }
    }//GEN-LAST:event_btnModificarKeyPressed

    private void btnEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            btnEliminar.doClick();//para dar efeito visual de pressionar o button 
            pressionaramButtonEliminar();//método que executa sentencas de eliminar ao pressionar button
        }
    }//GEN-LAST:event_btnEliminarKeyPressed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            limparObjetos();//método que limpa tudos os objetos
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            pressionaramButtonCancelar();//mètodo para cancelar edição do cliente   
        }
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER || evt.getKeyChar() == evt.VK_SPACE) {//se pressionaram tecla enter ou space executar sentenças
            pressionaramButtonSalvar();//método que salva um cliente na Base de dados
        }       
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        dispose();//fechar tela clientes
        frmMDI.btnClientes.setEnabled(true);//ativar button clientes
    }//GEN-LAST:event_btnSairMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        frmMDI.btnClientes.setEnabled(true);//ativar button clientes
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtfEdiDatNasciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfEdiDatNasciKeyTyped
        enviarFocoCaixaComMascara(txtfEdiDatNasci, txtfEdiRne, 10);//método que valida caixas com mascara, se tem tamanho máximo envia foco a próximo objeto         
    }//GEN-LAST:event_txtfEdiDatNasciKeyTyped

     public void pressionaramButtonPesquisar(){//Médoto que executa sentencias ao pressionar button pesquisar
        
        if(txtPesqRegi.getText().isEmpty()){//se não escreveram numero de registro
            regCliente = 0;
        }else{//se escreveram numero de registro
            regCliente = Integer.parseInt(txtPesqRegi.getText());//converter a integer
        }
        
        //bloco para extraer o escrito na caixa cpf, sem a mascara _
        String cpf = "";//variavel que terá cpf escrito na caixa
        int tamanho = txtfPesCpf.getText().length();//tamanho da cpf escrito
        for(int i = 0;i <= tamanho - 1; i++){//ciclo para passar cada letra 
            char a = txtfPesCpf.getText().charAt(i);//capturar letra a validar            
            if(a == '_'){//se char a é = '_', não adicionar caracter a variavel cpf                
                i = 14;//teminar for
            }else{//se char a é diferente de '_', adicionar carcater a variavel cpf
                cpf = cpf + a;//adicionar caracter a variavel cpf
            }
        }    
        
        PesquisarCliente pesquisarCliente = new PesquisarCliente();//clase que pesquisa clientes  na db        
        pesquisarCliente.pesquisar(regCliente, txtPesqNome.getText(), cpf);//metodo da classe que pesquisa  cliente
        tblResultados.setDefaultRenderer(Object.class, new TabelaCelulaRendererCor());//invoca classe TabelaCelulaRendererCor, crieada para dar formato visual as células da tabela
        tblResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 13));//fonte da letra da header da tabela
        tblResultados.getColumnModel().getColumn(0).setPreferredWidth(5);//largura header de linha
        tblResultados.getColumnModel().getColumn(0).setResizable(false);//desativar modificar tamanho
        tblResultados.getColumnModel().getColumn(1).setPreferredWidth(50);//larguara coluna número registro
        tblResultados.getColumnModel().getColumn(2).setPreferredWidth(50);//largura de coluna ativo       
        tblResultados.getColumnModel().getColumn(3).setPreferredWidth(90);//largura de coluna data de cadastro
        tblResultados.getColumnModel().getColumn(4).setPreferredWidth(200);//largura de coluna nome
        tblResultados.getColumnModel().getColumn(5).setPreferredWidth(70);//largura de coluna sexo
        tblResultados.getColumnModel().getColumn(6).setPreferredWidth(90);//largura de coluna data nacimento
        tblResultados.getColumnModel().getColumn(7).setPreferredWidth(100);//largura de coluna identidade
        tblResultados.getColumnModel().getColumn(8).setPreferredWidth(100);//largura de coluna cpf
        tblResultados.getColumnModel().getColumn(9).setPreferredWidth(150);//largura de coluna endereço
        tblResultados.getColumnModel().getColumn(10).setPreferredWidth(100);//largura de coluna cep
        tblResultados.getColumnModel().getColumn(11).setPreferredWidth(300);//largura de coluna observação
        tblResultados.getColumnModel().getColumn(0).setCellRenderer(tblResultados.getTableHeader().getDefaultRenderer());//dar formato de header da coluna, à fila zero              
        
        //bloco para ativar o desativar button expandir
        if(tblResultados.getRowCount()>2){//se tabela resultados tiem mais de 2 registros
            btnExpandir.setEnabled(true);//ativar button expandir
        }else{//se tabela resultados tem menos de 3 registros
            btnExpandir.setEnabled(false);//desativar buyton expandir
        }           }   
    
    public void pressionaramButtonExpandir(){//método que expande tabela de resultados
        if(btnExpandir.isEnabled()){//se button expandir está ativado
            panEdiDados.setVisible(false);//ocular panel edição cliente         
            panResPesquisa.setSize(panResPesquisa.getWidth(), panResPesquisa.getHeight()+300);//aumentar alto do panel de resultados
            tblResultados.setSize(tblResultados.getWidth(), 400);//aumentar largura de tabela de resultados       
            jScrollPane2.setSize(jScrollPane2.getWidth(), panResPesquisa.getHeight() - 40);//aumentar largura de scroll da tabela      
            btnExpandir.setEnabled(false);//desativar button expandir
            btnReduzir.setEnabled(true);//ativar button reduzir 
        }
    } 
    
    public void pressionaramButtonReduzir(){//método que reduze tabela de resultados
        if(btnReduzir.isEnabled()){//se button reduzir está ativado
            panEdiDados.setVisible(true);//mostrar panel edição cliente         
            panResPesquisa.setSize(panResPesquisa.getWidth(), panResPesquisa.getHeight()-300);//reduzir alto do panel de resultados
            tblResultados.setSize(tblResultados.getWidth(), 100);//reduzir largura de tabela de resultados       
            jScrollPane2.setSize(jScrollPane2.getWidth(), 100);//reduzir largura de scroll da tabela      
            btnExpandir.setEnabled(true);//ativar button expandir
            btnReduzir.setEnabled(false);//desativar button reduzir 
        }
    } 
     
    public void pressionaramButtonCriar(){//mètodo para criar um novo cliente
         if(btnCriar.isEnabled()){//se button criar está ativado
            ação = "criar";//ação de criar novo cliente na db
            CriarCliente cc = new CriarCliente();//instância classe criar cliente
            cc.consecutivo();//invocar método que traze o consecutivo de novo cliente
            ativarObjetos();//método para ativar objetos 
            limparObjetos();//método para limpar objetos 
            txtEdiNomClient.requestFocus();//foco em nome cliente
            
            //bloco para recarregar a data atual em caixa data de cadastro
            SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String dataAtual = dataFormat.format(date); //capturar data atual           
            txtfEdiDatCadas.setText(dataAtual);//trazer data atual a caixa data de cadastro
            
            btnCriar.setEnabled(false);//desativar button criar            
            btnModificar.setEnabled(false);//desativar button modificar
            btnEliminar.setEnabled(false);//desativar button eliminar
            btnLimpar.setEnabled(true);//ativar button limpar
            btnCancelar.setEnabled(true);//ativar button cancelar
            btnSalvar.setEnabled(true);//ativar button savar            
        }
    }
     
    public void pressionaramButtonModificar(){//mèetodo para modificar um cliente
        if(btnModificar.isEnabled()){//se button modificar é ativo
            ação = "modificar";//ação de modificar cliente na db
            ativarObjetos();//métod que ativa os objetos
            
            btnLimpar.setEnabled(true);//ativar button limpar
            btnCancelar.setEnabled(true);//ativar button cancelar
            btnSalvar.setEnabled(true);//ativar button salvar
            btnModificar.setEnabled(false);//desativar button modificar
        }
    }
    
    public void pressionaramButtonEliminar(){//método para eliminar um cliente
        if(btnEliminar.isEnabled()){//se button eliminar está ativo
            confirme = JOptionPane.showConfirmDialog(null, "Confirme Que Deseja Eliminar o Cliente " + txtEdiNomClient.getText() + " ?", "Confirme Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirme == 0){//0= se deseja eliminar o registro    
                CriarCliente cc = new CriarCliente();//instância da classe                
                cc.eliminarCliente(Integer.parseInt(txtEdiNumRegi.getText()), txtEdiNomClient.getText());//método para eliminar registros
                btnModificar.setEnabled(false);//desativar button modificar
                btnEliminar.setEnabled(false);//desativar button eliminar
                txtEdiNumRegi.setText("");//limpar número de registro
                txtfEdiDatCadas.setText("");//limpar data de cadastro
                limparObjetos();//método para limpar tudos os objetos
                desativarObjetos();//método para desativar tudos os objetos
                pressionaramButtonPesquisar();//para upgrade a lista de registros
            }else{
                JOptionPane.showMessageDialog(null,"Você Cancelou a Eliminação do Cliente, Cliente Não Eliminado ");
            }
        }
    }
    
    public void pressionaramButtonCancelar(){//mètodo para cancelar edição do cliente
        txtEdiNumRegi.setText("");//limpar número de registro do cliente
        txtfEdiDatCadas.setText("");//limpar data de cadastro
        limparObjetos();//método que limpa tudos os objetos
        desativarObjetos();//método que dativa tudos os objetos
        btnCriar.setEnabled(true);//ativar button criar
        btnModificar.setEnabled(false);//desativar button modificar
        btnEliminar.setEnabled(false);//desativar button eliminar
        btnLimpar.setEnabled(false);//desativar button limpar
        btnCancelar.setEnabled(false);//desativar button cancelar        
        btnSalvar.setEnabled(false);//desativar button salvar
        txtPesqRegi.requestFocus();//foco em caixa pesquisa nume regi
    }
    
    public void pressionaramButtonSalvar(){//método que salva um cliente na Base de dados
        if(btnSalvar.isEnabled()){//se button salvar está ativado            
            validarCamposObrigatorios();//validar que campos obrigatórios não fiquen vazios
            if(autorizarSalvar == "Sim"){//true, se tudos os campos están cheios                
                CriarCliente cc = new CriarCliente();//instância da classe                
                cc.verificarExisteCliente(txtfEdiRne.getText(), txtfEdiCpf.getText(), Integer.parseInt(txtEdiNumRegi.getText()));//método para verificar se a identidade ou cpf do cliente existe (Return existeCliente)
                if (cc.existeCliente == "Não"){//se variavel (retornada pelo método verificarExisteCliente) é Não existe cliente
                    if(ação == "criar")     confirme = JOptionPane.showConfirmDialog(null, "Confirme Que Deseja Criar o Cliente " + txtEdiNomClient.getText() + " ?", "Confirme Criar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(ação == "modificar") confirme = JOptionPane.showConfirmDialog(null, "Confirme Que Deseja Modificar o Cliente " + txtEdiNomClient.getText() + " ?", "Confirme Modificar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirme == 0){//0= se deseja salvar o registro    
                        convertirStringEmData(txtfEdiDatCadas.getText());//método que convierte string a data
                        Date dataCadastro = dataConvertida;//capturar data convertida em mètodo convertirStringEmData
                        convertirStringEmData(txtfEdiDatNasci.getText());//método que convierte string a data
                        Date dataNacimento = dataConvertida;//capturar data convertida em método convertirStringEmData
                        if(ação == "criar"){//se ação é criar novo cliente                              
                            cc.inserirCliente(txtEdiNumRegi.getText(), txtfEdiRne.getText(), txtfEdiCpf.getText(), txtEdiNomClient.getText(), cmbEdiSexo.getSelectedItem().toString(), dataNacimento, txtfEdiCep.getText(), txtEdiEndere.getText(), cmbEdiAtivo.getSelectedItem().toString(), txtaEdiObeser.getText(), dataCadastro);//método que insira client
                        }
                        if(ação == "modificar"){//se ação é modificar cliente                            
                            cc.modificarCliente(txtfEdiRne.getText(), txtfEdiCpf.getText(), txtEdiNomClient.getText(), cmbEdiSexo.getSelectedItem().toString(), dataNacimento, txtfEdiCep.getText(), txtEdiEndere.getText(), cmbEdiAtivo.getSelectedItem().toString(), txtaEdiObeser.getText(), dataCadastro, txtEdiNumRegi.getText());//mpetodo que modifica o cliente
                        }
                        desativarObjetos();//método que desativa tudos os objetos
                        pressionaramButtonPesquisar();//para upgrade a lista de registros
                        btnSalvar.setEnabled(false);//desativar button salvar
                        btnLimpar.setEnabled(false);//desativar button limpar
                        btnCancelar.setEnabled(false);//desativar button cancelar
                        btnCriar.setEnabled(true);//ativar button criar
                        btnModificar.setEnabled(true);//ativar button modificar
                        btnEliminar.setEnabled(true);//ativar button eliminar
                    }else{//Não deseja savar o registro
                        JOptionPane.showMessageDialog(null,"Não Foi Salvo o Registro");            
                    }
                }
            }            
        } 
    }
     
    public void ativarObjetos(){//método para ativar objetos                
        CorFoco cf = new CorFoco();//Clase que dá cor de letra e fundo de caixa ativa
        cf.getFundoCorOriginal();//método da clase que dá cor original caixa ativa
        
        cmbEdiAtivo.setEnabled(true);//ativar combo ativo       
        cmbEdiAtivo.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        cmbEdiAtivo.setForeground(cf.getLetraCaixaCorOriginal());//cor de letra desativada
        
        txtEdiNomClient.setEnabled(true);//ativar nome cliente 
        txtEdiNomClient.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtEdiNomClient.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa

        cmbEdiSexo.setEnabled(true);//ativar combo sexo 
        cmbEdiSexo.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        cmbEdiSexo.setForeground(cf.getLetraCaixaCorOriginal());//cor de letra desativada
        
        txtfEdiDatNasci.setEnabled(true);//ativar data nacimento  
        txtfEdiDatNasci.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtfEdiDatNasci.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa

        txtfEdiRne.setEnabled(true);//ativar número identidade RNE
        txtfEdiRne.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtfEdiRne.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa

        txtfEdiCpf.setEnabled(true);//ativar cpf   
        txtfEdiCpf.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtfEdiCpf.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa

        txtEdiEndere.setEnabled(true);//ativar endereço
        txtEdiEndere.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtEdiEndere.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa
        
        txtfEdiCep.setEnabled(true);//ativar cep  
        txtfEdiCep.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtfEdiCep.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa

        txtaEdiObeser.setEnabled(true);//ativar observação  
        txtaEdiObeser.setBackground(cf.getFundoCorOriginal());//cor de fundo ativo
        txtaEdiObeser.setDisabledTextColor(cf.getLetraCaixaCorOriginal());//cor de letra ativa
    } 
    
    public void desativarObjetos(){//método para desativar objetos                
        CorFoco cf = new CorFoco();
        cf.getFundoCorDesativ();

        txtEdiNumRegi.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtEdiNumRegi.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada
                
        cmbEdiAtivo.setEnabled(false);//desativar combo ativo 
        cmbEdiAtivo.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        cmbEdiAtivo.setForeground(cf.getLetraCaixaCorDesativ());//cor de letra desativada
        
        txtfEdiDatCadas.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtfEdiDatCadas.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada

        txtEdiNomClient.setEnabled(false);//desativar nome cliente 
        txtEdiNomClient.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtEdiNomClient.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada
        
        cmbEdiSexo.setEnabled(false);//desativar combo sexo       
        cmbEdiSexo.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        cmbEdiSexo.setForeground(cf.getLetraCaixaCorDesativ());//cor de letra desativada
        
        txtfEdiDatNasci.setEnabled(false);//desativar data nacimento
        txtfEdiDatNasci.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtfEdiDatNasci.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada
                
        txtfEdiRne.setEnabled(false);//desativar número identidade RNE 
        txtfEdiRne.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtfEdiRne.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada
        
        txtfEdiCpf.setEnabled(false);//desativar cpf   
        txtfEdiCpf.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtfEdiCpf.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada

        txtEdiEndere.setEnabled(false);//desativar endereço 
        txtEdiEndere.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtEdiEndere.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada

        txtfEdiCep.setEnabled(false);//desativar cep 
        txtfEdiCep.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtfEdiCep.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada

        txtaEdiObeser.setEnabled(false);//desativar observação
        txtaEdiObeser.setBackground(cf.getFundoCorDesativ());//cor de fundo desativado
        txtaEdiObeser.setDisabledTextColor(cf.getLetraCaixaCorDesativ());//cor de letra desativada

    } 
    
    public void limparObjetos(){//método para limpar objetos
       
        cmbEdiAtivo.setSelectedIndex(0);//limpar combo ativo = Sim       
        txtEdiNomClient.setText("");//limpar nome cliente       
        cmbEdiSexo.setSelectedIndex(2);//limpar combo sexo       
        txtfEdiDatNasci.setText("");//limpar data nacimento        
        txtfEdiRne.setText("");//limpar número identidade RNE              
        txtfEdiCpf.setText("");//limpar CPF               
        txtEdiEndere.setText("");//limpar endereço        
        txtfEdiCep.setText("");//limpar CEP                
        txtaEdiObeser.setText("");//limpar observação 
        
    } 
    
    public void validarCamposObrigatorios(){//método para validar campos obrigatórios
        //validar nome do cliente
        if(txtEdiNomClient.getText().length()==0){//se nome está vazio
            JOptionPane.showMessageDialog(null,"Nome do Cliente Não Pode Ser Vazio");
            txtEdiNomClient.requestFocus();//foco nome do cliente
            autorizarSalvar = "Não";//Não pode salvar
            return;//terminar método
        }else{
            autorizarSalvar = "Sim";//Sim pode salvar
        } 
        
        //validar sexo do cliente
        if(cmbEdiSexo.getSelectedIndex()==2){//se sexo está vazio
            JOptionPane.showMessageDialog(null,"Sexo do Cliente Não Pode Ser Vazio");
            cmbEdiSexo.requestFocus();//foco sexo do cliente
            autorizarSalvar = "Não";//Não pode salvar
            return;//terminar método
        }else{
            autorizarSalvar = "Sim";//Sim pode salvar
        } 
        
        //validar data nascimento do cliente
        int tamanho = txtfEdiDatNasci.getText().length();//tamanho da string
        for(int i = 0;i <= tamanho - 1; i++){//ciclo para passar cada letra 
            char a = txtfEdiDatNasci.getText().charAt(i);//capturar letra a validar            
            if(a == '_'){//se letra é '_'
                JOptionPane.showMessageDialog(null,"Data de Nascimento do Cliente Não Pode Ser Vazio Nem Estar Incompleta");
                txtfEdiDatNasci.requestFocus();//foco em data nascimento
                autorizarSalvar = "Não";//Não pode salvar                
                return;//terminar método
            }else{
                autorizarSalvar = "Sim";//Sim pode salvar
            }
        }
        
        //validar RNE
        int tamanho2 = txtfEdiRne.getText().length();//tamanho da string
        for(int i = 0;i <= tamanho2 - 1; i++){//ciclo para passar cada letra 
            char a = txtfEdiRne.getText().charAt(i);//capturar letra a validar            
            if(a == '_'){//se letra é '_'
                JOptionPane.showMessageDialog(null,"Identidade RNE do Cliente Não Pode Ser Vazio Nem Estar Incompleta");
                txtfEdiRne.requestFocus();//foco em RNE
                autorizarSalvar = "Não";//Não pode salvar                
                return;//terminar método
            }else{
                autorizarSalvar = "Sim";//Sim pode salvar
            }
        }
        
        //validar CPF
        int tamanho3 = txtfEdiCpf.getText().length();//tamanho da string
        for(int i = 0;i <= tamanho3 - 1; i++){//ciclo para passar cada letra 
            char a = txtfEdiCpf.getText().charAt(i);//capturar letra a validar            
            if(a == '_'){//se letra é '_'
                JOptionPane.showMessageDialog(null,"CPF do Cliente Não Pode Ser Vazio Nem Estar Incompleto");
                txtfEdiCpf.requestFocus();//foco em CPF
                autorizarSalvar = "Não";//Não pode salvar                
                return;//terminar método
            }else{
                autorizarSalvar = "Sim";//Sim pode salvar
            }
        }        
        
        //validar CEP
        int tamanho4 = txtfEdiCep.getText().length();//tamanho da string
        for(int i = 0;i <= tamanho4 - 1; i++){//ciclo para passar cada letra 
            char a = txtfEdiCep.getText().charAt(i);//capturar letra a validar            
            if(a == '_'){//se letra é '_'
                JOptionPane.showMessageDialog(null,"CEP do Cliente Não Pode Ser Vazio Nem Estar Incompleto");
                txtfEdiCep.requestFocus();//foco em CEP
                autorizarSalvar = "Não";//Não pode salvar                
                return;//terminar método
            }else{
                autorizarSalvar = "Sim";//Sim pode salvar
            }
        }            
    }
    
    public Date convertirStringEmData(String dataString){ //mètodo para convertir um string a tipo data
        try {       
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");//formato de data
            String dat = dataString;//strign data a convertir 
            Date dat1 = formato.parse(dat);
            java.sql.Date dataConvert = new java.sql.Date (dat1.getTime());//string data convertido a Date
            dataConvertida = dataConvert;//capturar data convertida em formato válido
        } catch (ParseException ex) {
            Logger.getLogger(frmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(dataConvertida);
    }
    
    public void mascarasTextFields(){//métod para dar formato a las mascaras das caixas
       try {
           //mascara para CPF pesquisa
            MaskFormatter mascara6 = new MaskFormatter("###.###.###-##");            
            mascara6.setPlaceholderCharacter('_');            
            mascara6.install(txtfPesCpf);
           
            //Mascar para data de cadastro
            MaskFormatter mascara = new MaskFormatter("####-##-##");
            mascara.setPlaceholderCharacter('_');
            mascara.install(txtfEdiDatCadas);
            
            //mascara para data de nascimento
            MaskFormatter mascara2 = new MaskFormatter("####-##-##");            
            mascara2.setPlaceholderCharacter('_');            
            mascara2.install(txtfEdiDatNasci);
            
            //mascara para RNE
            MaskFormatter mascara3 = new MaskFormatter("A######-A");            
            mascara3.setPlaceholderCharacter('_');            
            mascara3.install(txtfEdiRne);
            
            //mascara para CPF edição
            MaskFormatter mascara4 = new MaskFormatter("###.###.###-##");            
            mascara4.setPlaceholderCharacter('_');            
            mascara4.install(txtfEdiCpf);
            
            //mascara para CEP
            MaskFormatter mascara5 = new MaskFormatter("#####-###");            
            mascara5.setPlaceholderCharacter('_');            
            mascara5.install(txtfEdiCep);
            
        } catch (ParseException ex) {
            Logger.getLogger(frmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void formatoTexto(JTextComponent texto){//método que da formato a um texto, primeira letra en maiúsculas e outras en minúsculas 
        if(texto.getText().length()!=0){//se caixa não é vazia       
            texto.setText(texto.getText().trim());//elimina espaços em branco ao começo e ao final
            texto.setText(texto.getText().toLowerCase());//convertir tudo string a minúsculas
            int tamanho = texto.getText().length();//tamanho da string
            String nome = ""; //variavel que captura cada letra do string
            
            for(int i = 0;i <= tamanho - 1; i++){//ciclo para passar cada letra 
                char a = texto.getText().charAt(i);//capturar letra a validar  
                if (i==0) a = Character.toUpperCase(a);//convertir primeira letra em maiúsculas
                nome = nome + a;//concatenar string letra por letra
                if(a == ' '){//se char a é espaço vazio
                    while(texto.getText().charAt(i) == ' '){//para eliminar mais de um espaço vazio
                        i = i + 1;//se é espaço vazio, pase à próxima letra
                    }                    
                    
                    a = texto.getText().charAt(i);//capturar letra de string 
                    a = Character.toUpperCase(a);//convertir letra a maiúsculas
                    nome = nome + a;//adicionar letra maiúscula a string                
                }                
            }
            texto.setText(nome);//caixa texto trazer string com formato primeira letra en maiúsculas e outras en minúsculas          
        }
    }
    
    public void enviarFocoCaixaComMascara(JTextComponent caixa, JTextComponent nextFoco, int maximo){//método para caixas com mascara, se o tamanho é máximo enviar foco a next caixa
        //para saber o número de dígitos e passar o foco
        char b = ' ';//variable tipo char para controlar o envio do foco
        int tamanho = caixa.getText().length();//tamanho da string
        for(int i = 0;i <= tamanho - 1; i++){//ciclo para passar cada letra 
            char a = caixa.getText().charAt(i);//capturar letra a validar            
            if(a == '_'){//se letra é = '_', não pode enviar o foco
                b = a;//obter valor de a
                return;//terminar método
            }
        }
        
        if(caixa.getText().length()== maximo && b != '_'){//enviar foco se é o tamanho  máximo é não há nenhum char = '_'            
            nextFoco.requestFocus();//passar foco a txt cpf
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCriar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnExpandir;
    public static javax.swing.JButton btnLimpar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JButton btnPesquisar;
    public static javax.swing.JButton btnReduzir;
    public static javax.swing.JButton btnSair;
    public static javax.swing.JButton btnSalvar;
    public static javax.swing.JComboBox<String> cmbEdiAtivo;
    public static javax.swing.JComboBox<String> cmbEdiSexo;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static jcMousePanel.jcMousePanel jcMousePanel1;
    public static javax.swing.JLabel lblEdiAtivo;
    public static javax.swing.JLabel lblEdiCep;
    public static javax.swing.JLabel lblEdiCpf;
    public static javax.swing.JLabel lblEdiDatCadas;
    public static javax.swing.JLabel lblEdiDatNasci;
    public static javax.swing.JLabel lblEdiEndere;
    public static javax.swing.JLabel lblEdiNomClient;
    public static javax.swing.JLabel lblEdiNumRegi;
    public static javax.swing.JLabel lblEdiObser;
    public static javax.swing.JLabel lblEdiRne;
    public static javax.swing.JLabel lblEdiSexo;
    public static javax.swing.JLabel lblPesqCpf;
    public static javax.swing.JLabel lblPesqNome;
    public static javax.swing.JLabel lblPesqRegi;
    public static javax.swing.JLabel lblTitulo;
    public static javax.swing.JPanel panEdiDados;
    public static javax.swing.JPanel panPesquisa;
    public static javax.swing.JPanel panResPesquisa;
    public static javax.swing.JTable tblResultados;
    public static javax.swing.JTextField txtEdiEndere;
    public static javax.swing.JTextField txtEdiNomClient;
    public static javax.swing.JTextField txtEdiNumRegi;
    public static javax.swing.JTextField txtPesqNome;
    public static javax.swing.JTextField txtPesqRegi;
    public static javax.swing.JTextArea txtaEdiObeser;
    public static javax.swing.JFormattedTextField txtfEdiCep;
    public static javax.swing.JFormattedTextField txtfEdiCpf;
    public static javax.swing.JFormattedTextField txtfEdiDatCadas;
    public static javax.swing.JFormattedTextField txtfEdiDatNasci;
    public static javax.swing.JFormattedTextField txtfEdiRne;
    public static javax.swing.JFormattedTextField txtfPesCpf;
    // End of variables declaration//GEN-END:variables
}
