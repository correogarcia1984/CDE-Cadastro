/*
Clase para verificar se cliente existe, inserir, modificar ou eliminar um 
cliente da DB
 */
package Tela.Clientes.TransacSQL;

import java.sql.Connection;
import LigaçãoDB.ValidaçãoDB;
import Tela.Clientes.frmClientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */

public class CriarCliente {
    Connection cn = new ValidaçãoDB().logearConexão();
    public static String existeCliente = "Não";//Variável para saber si o RNE ou CPF do cliente existe    
    
    public void consecutivo(){//metodo para extrair consecutivo do cliente
        try{
            PreparedStatement pSt;
            ResultSet rs = null;
            pSt = cn.prepareStatement("select max(C01NumReg) as consec from T01Clientes");
            pSt.executeQuery();//Executar sentença
            rs = pSt.executeQuery();
            if(!rs.next()){//se rs está vazio, é que Não há nenhum cliente na DB               
                frmClientes.txtEdiNumRegi.setText("1");//cosecutivo de primeiro cliente
            }else{//rs Não está vazio,foi encontrado dados                
                frmClientes.txtEdiNumRegi.setText(Integer.toString(rs.getInt("consec")+1));//novo consecutivo de cliente
            } 
        }catch(Exception e){
        
        }
    }
    
    public String verificarExisteCliente(String rne, String cpf, int numRegi){//método para verificar se o RNE uo CPF do cliente existe
        try{            
            PreparedStatement pSt;
            ResultSet rs = null;
            pSt = cn.prepareStatement("select C01Rg as RNE from T01Clientes Where C01Rg = ? And C01NumReg <> ? ");
            pSt.setString(1, rne);//identidade RNE cliente
            pSt.setInt(2, numRegi);//número de registro do cliente
            pSt.executeQuery();//Executar sentença
            rs = pSt.executeQuery();
            if(!rs.next()){//se rs está vazio, é que Não há identidade RNE mesma                
                pSt = cn.prepareStatement("select C01Cpf as CPF from T01Clientes Where C01Cpf = ? And C01NumReg <> ? ");
                pSt.setString(1, cpf);//cpf cliente
                pSt.setInt(2, numRegi);//número de registro do cliente
                pSt.executeQuery();//Executar sentença
                rs = pSt.executeQuery();
                if(!rs.next()){//se rs está vazio, é que Não há CPF mesmo
                    existeCliente = "Não";//Não existen clientes como esse cpf  
                }else{
                    JOptionPane.showMessageDialog(null,"Há Um Cliente Com Mesmo CPF : " + rs.getString("CPF") + ", Não Pode Haver dois Clientes Com o Mesmo CPF, Cliente Não Criado");
                    existeCliente = "Sim";//existe a mesma identidade
                }                             
            }else{//rs Não está vazio, encontrado dados                                      
                JOptionPane.showMessageDialog(null,"Há Um Cliente Com Mesma Identidade RNE : " + rs.getString("RNE") + ", Não Pode Haver dois Clientes Com a Mesma Identidade RNE, Cliente Não Criado");
                existeCliente = "Sim";//existe a mesma identidade RNE
            }           
        }catch(Exception e){
        
        }
        return existeCliente;        
    }
    
    public void inserirCliente(String numReg, String rne, String cpf, String nome, String sexo, Date nascimento, String cep, String  endereço, String ativo, String observ, Date cadastro){//método que isira o  cliente na db
        try{                     
            PreparedStatement pSt;            
            ResultSet rs = null;           
            pSt = cn.prepareStatement("Insert into T01Clientes values (?,?,?,?,?,?,?,?,?,?,?)");                        
            pSt.setString(1, numReg);//numero de registro cliente
            pSt.setString(2, rne);//identidade RNE
            pSt.setString(3, cpf);//cpf
            pSt.setString(4, nome);//nome
            pSt.setString(5, sexo);//sexo
            pSt.setDate(6, (java.sql.Date) nascimento);//data de nascimento
            pSt.setString(7, cep);//cep endereço
            pSt.setString(8, endereço);//endereço
            pSt.setString(9, ativo);//ativo
            pSt.setString(10, observ);//observação
            pSt.setDate(11, (java.sql.Date) cadastro);//data de cadastro
            JOptionPane.showMessageDialog(null,"Cliente " + nome + " Criado Corretamente");
            pSt.executeQuery();//Executar sentença           
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Há Um Erro Lógico a Inserir Cliente");
        }
    }
    
    public void modificarCliente(String rne, String cpf, String nome, String sexo, Date nascimento, String cep, String  endereço, String ativo, String observ, Date cadastro, String rne2){//método que modifica cliente na db
        try{                     
            PreparedStatement pSt;            
            ResultSet rs = null;           
            pSt = cn.prepareStatement("Update T01Clientes Set C01Rg = ?, C01Cpf = ?, C01Nom = ?, C01Sex = ?, C01DatNac = ?, C01Cep = ?, C01End = ?, C01Ati = ?, C01Obs = ?, C01DatCad = ? Where C01NumReg = ? ");                        
            pSt.setString(1, rne);//identidade
            pSt.setString(2, cpf);//cpf
            pSt.setString(3, nome);//nome
            pSt.setString(4, sexo);//sexo
            pSt.setDate(5, (java.sql.Date) nascimento);//data de nascimento
            pSt.setString(6, cep);//cep endereço
            pSt.setString(7, endereço);//endereço
            pSt.setString(8, ativo);//ativo
            pSt.setString(9, observ);//observação
            pSt.setDate(10, (java.sql.Date) cadastro);//data de cadastro
            pSt.setString(11, rne2);//número de registro
            JOptionPane.showMessageDialog(null,"Cliente " + nome + " Modificado Corretamente");
            pSt.executeQuery();//Executar sentença           
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Há Um Erro Lógico a Modificar Cliente");
        }
    }
    
    public void eliminarCliente(int numReg, String nome){//método que elimina o  cliente da db
        try{                     
            PreparedStatement pSt;            
            ResultSet rs = null;           
            pSt = cn.prepareStatement("Delete From T01Clientes Where C01NumReg = ? ");                        
            pSt.setInt(1, numReg);//número de registro           
            JOptionPane.showMessageDialog(null,"Cliente " + nome + " Eliminado da Base de Dados");
            pSt.executeQuery();//Executar sentença           
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Há Um Erro Lógico a Modificar Cliente");
        }
    }
}
