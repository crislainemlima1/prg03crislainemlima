/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author crisl
 */
public class Fatorial {
   
    // armazenando as viaveis
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    // calcula o fatorial de numero e monta a formula em texto
    public void valor(int num){
        numero = num;
        int f = 1;
        String s = "";
        for(int i = num; i > 1; i--){
            f *= i;
            s += i + "x";
        }
        s += "1 = ";
        fatorial = f; 
        formula = s;
    }
    
    //retorna o valor do fatorial calculado
    public int getFatorial(){
        return fatorial;
    }
    //retorna a formula usada no calculo
    public String getFormula(){
        return formula;
    }
        
    }

