/*
Clase para dar cor diferente a linhas par, ímpar e seleccionada na tabela de resultados clienes pesquisa
 */
package Tela.Clientes;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */
public class TabelaCelulaRendererCor extends DefaultTableCellRenderer {
    private JLabel componente;
   
    @Override
    public JLabel getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //método que permite mudar a aparência das células
               
        if(row%2 == 0){//linha par            
            componente.setBackground(Color.white);//cor branco em linha par
        }else{//linha ímpar
            componente.setBackground(Color.LIGHT_GRAY);//cor cinzenta em linha impar
        }
        
        if (isSelected)//se seleccionou uma célula
        {
          componente.setBackground(Color.blue);//cor azul a tuda linha seleccionada
        }        
        return componente;
    } 
}
