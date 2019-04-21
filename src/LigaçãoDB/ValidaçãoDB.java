/*
Clase para fazer a validação de usúario e senha no SQL,
e o usúario y senha do programa
 */
package LigaçãoDB;

import Tela.Login.UsuSenha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */
public class ValidaçãoDB {
    public Connection logearConexão(){//metodo para validar db, usuario y senha em sql        
        Connection cn = null;         
        
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("Config\\conexãoDB.ini"));//path de arquivo .ini com parâmetros de conexão 

            String host,porta,base,usuario,senha, driverDB;
            host=p.getProperty("host");//nome host DB
            porta=p.getProperty("porta");//porta de red
            base=p.getProperty("base");//nomde de DB
            usuario=p.getProperty("usuario");//usuario de security DB SQL
            senha=p.getProperty("senha");//senhal de security DB SQL
            driverDB=p.getProperty("driverDB");//driver DB SQL
            
            String url = driverDB + "://" + host + ":" + porta + ";" + "databaseName=" + base; 
                        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url,usuario,senha);             
            UsuSenha usuSen = new UsuSenha();//invocar classe que tem os valores das variavels de identidade de usuario y senha

            try{                
                PreparedStatement pSt;//declaração dinâmica "=?"                
                ResultSet rs = null;
                pSt = cn.prepareStatement ("select C02IdeUsu AS Identidade, C02NomUsu AS Nome, C02SenUsu AS Senha From T02Usuarios  where  C02IdeUsu = ? AND C02SenUsu = ? ");                              
                pSt.setInt(1, usuSen.getidUsuario());//parametro idUsuario
                pSt.setString(2, usuSen.getSenha());//parametro senhaUsuario   
                pSt.executeQuery();//executar declaracao dinamica
                rs = pSt.executeQuery();//carregar o resultado da declaracao en resultSet
                
                if(!rs.next()){//se rs está vazio
                    JOptionPane.showMessageDialog(null,"Usuario e/ou Senha Inválido/s");
                    usuSen.setautorizado("Não");//Não pode ingresar                    
                }else{//rs Não esta vazio
                    if(usuSen.getautorizado()=="Não"){//só mostre esta mensagem ao efetua login
                        JOptionPane.showMessageDialog(null,"Bem-Vindo/a Senhor/a "+ rs.getString(2)+ " Ao Software CDE Cadastro");
                    }
                    usuSen.setautorizado("Sim");//pode entar ao programa
                    usuSen.setidUsuario(rs.getInt("Identidade"));//identidade do usuario
                    usuSen.setnome(rs.getString("Nome"));//nome do usuario                    
                }               
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"Há Um Erro Lógico No Código Fonte que consulta o Usuario e Senha do Programa");
            }           

        } catch (Exception e){
           JOptionPane.showMessageDialog(null,"Há Um Erro Lógico No Código Fonte que Valida Db, User, e Loggin ou Arquivo de Conexão SQL");
        }
        return cn;
    }   
}
