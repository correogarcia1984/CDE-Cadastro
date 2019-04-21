/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geral;

import java.awt.Color;

/**
 *
 * @author EDWIN
 */
public class CorFoco {
    int fundoRedF, fundoGreenF, fundoBlueF;//Caixa com Focus cor de fundo
    int fundoRedO, fundoGreenO, fundoBlueO;//Caixa Original cor de fundo
    int fundoRedD, fundoGreenD, fundoBlueD;//Caixa desativada cor de fundo
    
    int letraCaixaRedO, letraCaixaGreenO, letraCaixaBlueO;//Letra de Caixa cor Original 
    int letraCaixaRedD, letraCaixaGreenD, letraCaixaBlueD;//Letra de Caixa cor desativado
    
    Color fundoCorFoco, fundoCorOriginal, fundoCorDesativ, letraCaixaCorOriginal, letraCaixaCorDesativ;
     
    public CorFoco(){
        //cor de foco em fundo de caixa
        fundoRedF = 0;//vermelho
        fundoGreenF = 208;//verde
        fundoBlueF = 242;//azul
        
        //cor original de fundo de caixa 
        fundoRedO = 255;//vermehho
        fundoGreenO = 255;//verde
        fundoBlueO = 255;//azul
        //cor original de letra en caixa
        letraCaixaRedO = 0;//vermelho
        letraCaixaGreenO = 0;//verde
        letraCaixaBlueO = 0;//azul
        
        //cor Desativado de fundo de caixa
        fundoRedD = 204;//vermelho
        fundoGreenD = 204;//verde
        fundoBlueD = 204;//azul
        //cor Desativado de letra en caixa
        letraCaixaRedD = 104;//vermelho
        letraCaixaGreenD = 104;//verde
        letraCaixaBlueD = 104;//azul
        
        fundoCorFoco = new Color(fundoRedF, fundoGreenF, fundoBlueF);//Cor de fundo de caixa com foco 
        fundoCorOriginal = new Color(fundoRedO, fundoGreenO, fundoBlueO);//Cor original de fundo de caixa
        fundoCorDesativ = new Color(fundoRedD, fundoGreenD, fundoBlueD);//Cor de Fundo de caixa desativada
        letraCaixaCorOriginal = new Color(letraCaixaRedO, letraCaixaGreenO, letraCaixaBlueO);//Cor de letra de caixaa original
        letraCaixaCorDesativ = new Color(letraCaixaRedD, letraCaixaGreenD, letraCaixaBlueD);//Cor de letra de caixa desativada

    }   
    
    public Color getFundoCorFoco() {
        return fundoCorFoco;
    }
    public Color getFundoCorOriginal() {
        return fundoCorOriginal;
    }
    public Color getFundoCorDesativ() {
        return fundoCorDesativ;
    }

    public Color getLetraCaixaCorOriginal() {
        return letraCaixaCorOriginal;
    }

    public Color getLetraCaixaCorDesativ() {
        return letraCaixaCorDesativ;
    }
}
