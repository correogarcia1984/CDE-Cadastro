/*
Clase para ingresar ao programa
 */
package Tela.Login;

import LigaçãoDB.ValidaçãoDB;
import Tela.Clientes.frmClientes;
import static Tela.Clientes.frmClientes.txtPesqRegi;
import Tela.MDI.frmMDI;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */
public class ButtonEntrar {
    
    public void entrar(){//método que valida usuario e seha da DB e do Programa   
        ValidaçãoDB conectar = new ValidaçãoDB();//instancia de classe que valida acesso à DB SQL
        UsuSenha usuSen = new UsuSenha();//instancia de classe que valida acesso ao progama
       
        String ideUsuario = frmLogin.txtIdeUsu.getText();//extrair cadeia de texto 
        int numero = Integer.parseInt(ideUsuario);//converter a integer a cadeia extraida
        usuSen.setidUsuario(numero);//extrair identidade do usuario
        
        char[] senhaUsuario = frmLogin.txtSenUsu.getPassword();//converter string a char senhaUsuario
        String pas = new String(senhaUsuario);//extrair texto de senhaUsuario tipo password
        usuSen.setSenha(pas);//extrair senha do Usuario     
        
        conectar.logearConexão();//invocação do metodo da classe, para validar conexão à db, ideUsuario e senhaUsuario do programa
        if(usuSen.getautorizado() == "Sim" ){//se os login de conexão á db e ao programa estão ok             
            frmMDI.lblUsuarioLogeado.setText(usuSen.getnome());//Carregar nome do usuario na etla mdi
            abrirClientes();//mètodo que abre tela de clientes 
        }
    }
    
    public void abrirClientes(){//mètodo que abre tela de clientes
        frmMDI.btnFecharSes.setEnabled(true);//habiltar button fechar sessão            
        frmClientes m = new frmClientes();//instância tela a invocar                       
        frmMDI.desktopPane.add(m);//adicionar tela instanciado ao desktoppanel do MDI           
        m.toFront();//coloque tela ao frente
        m.setVisible(true);//mostrar tela clientes               
        txtPesqRegi.requestFocus();//focus no txt identidade do usuario
        try {
            m.setMaximum(true);                
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
