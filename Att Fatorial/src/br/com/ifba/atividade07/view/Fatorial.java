/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author crisl
 */
public class Fatorial {
   
    // armazenando as viaveis
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    // calcula o fatorial de numero e monta a formula em texto
    public void valor(int n){
        num = n;
        int f = 1;
        String s = "";
        for(int i = n; i > 1; i--){
            f *= i;
            s += i + "x";
        }
        s += "1 = ";
        fat = f; 
        formula = s;
    }
    
    //retorna o valor do fatorial calculado
    public int getFatorial(){
        return fat;
    }
    //retorna a formula usada no calculo
    public String getFormula(){
        return formula;
    }
        
    }

