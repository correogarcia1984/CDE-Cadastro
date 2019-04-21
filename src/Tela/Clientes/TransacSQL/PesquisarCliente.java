/*
Clase para pequisar clientes na DB y enviar resultados a tabela organizada com 
formato personalizado
 */
package Tela.Clientes.TransacSQL;

import LigaçãoDB.ValidaçãoDB;
import static Tela.Clientes.frmClientes.tblResultados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */

public class PesquisarCliente {
    Connection cn  = new ValidaçãoDB().logearConexão();//invocar método Conexão login ao sql
   
    public void pesquisar(int numRegi, String nomCliente, String cpf){//método que pesquia cliente    
        try{                
            PreparedStatement pSt;//sentença dinâmica "=?"                
            ResultSet rs = null;
            DefaultTableModel modeloTabela = new DefaultTableModel(){//+criar tabela modelo+
                //+este bloco só é para bloquear edição de célula+
                    @Override
                    public boolean isCellEditable(int linha, int coluna) {                        
                        return false;//desativa edição de tudas as células                         
                    }                    
                //-este bloco só é para bloquear edição de célula-                    
            };//-criar tabela modelo-
            
            modeloTabela.setColumnIdentifiers(new Object[]{"","Número Registro", "Ativo", "Data Cadastro", "Cliente", "Sexo", "Data Nascimento", "RNE", "CPF", "Endereço", "CEP", "Observações"});//Criação dum vetor para as colunas, 
                        
            if(numRegi == 0){//se não escreveram nada no número de registro
                pSt = cn.prepareStatement ("Select C01NumReg as Registro, C01Ati as Ativo, C01DatCad as Cadastro, C01Nom as Cliente, C01Sex as Sexo, C01DatNac as Nascimento, C01Rg as RNE, C01Cpf as CPF, C01End as Endereço, C01Cep as CEP, C01Obs as Observação From T01Clientes Where C01Nom like ? AND C01Cpf like ? Order by C01DatCad");                              
                pSt.setString(1, "%" + nomCliente + "%");//nome do cliente 
                pSt.setString(2, "%" + cpf + "%");//Cpf do cliente 
            }else{//se escreveram o número de registro
                pSt = cn.prepareStatement ("Select C01NumReg as Registro, C01Ati as Ativo, C01DatCad as Cadastro, C01Nom as Cliente, C01Sex as Sexo, C01DatNac as Nascimento, C01Rg as RNE, C01Cpf as CPF, C01End as Endereço, C01Cep as CEP, C01Obs as Observação From T01Clientes Where C01NumReg like '%" + numRegi + "%' and C01Nom like ? AND C01Cpf like ? Order by C01DatCad");                                               
                pSt.setString(1, "%" + nomCliente + "%");//nome do cliente 
                pSt.setString(2, "%" + cpf + "%");//cpf do cliente 
            }            
            pSt.executeQuery();//executar sentença dinâmica 
            rs = pSt.executeQuery();//carregar o resultado da sentença em resultSet
            
            if(!rs.next()){//se rs está vazio, é que não há dados
                JOptionPane.showMessageDialog(null,"Nenhum Cliente Corresponde a Sua Pesquisa");
                modeloTabela.addRow(new Object[] {"", "", "", "", "", "", "", "", "", "", "", ""});//primeiro registro
                tblResultados.setModel(modeloTabela);//trazer o que a tabela modelo tem para a tabela original                    
            }else{//rs não está vazio, encontrado dados                
                try{
                    modeloTabela.addRow(new Object[] {"", rs.getInt("Registro"), rs.getString("Ativo"), rs.getString("Cadastro"), rs.getString("Cliente"), rs.getString("Sexo"),rs.getString("Nascimento"),rs.getString("RNE"), rs.getString("CPF"), rs.getString("Endereço"), rs.getString("CEP"), rs.getString("Observação")});//primeiro registro
                    while (rs.next()){
                        modeloTabela.addRow(new Object[] {"", rs.getInt("Registro"), rs.getString("Ativo"), rs.getString("Cadastro"), rs.getString("Cliente"), rs.getString("Sexo"),rs.getString("Nascimento"),rs.getString("RNE"), rs.getString("CPF"), rs.getString("Endereço"), rs.getString("CEP"), rs.getString("Observação")});//outros registros                        
                    }
                    
                    //+Para ordenar os registros da tabela, pressionando clique acima da header da columna+
                    TableRowSorter<TableModel> ordena = new TableRowSorter<TableModel>(modeloTabela);
                    tblResultados.setRowSorter(ordena);
                    //-Para ordenar os registros da tabela, pressionando clique em cima da header da columna-
                    
                    tblResultados.setModel(modeloTabela);//trazer o que a tabela modelo tem para a tabela original                    
                }catch(Exception e){
                
                }
            }               
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Há Um Erro lògico no Código Fonte Que Consulta O Usuario e Senha do Programa");
        }
    }    
}
