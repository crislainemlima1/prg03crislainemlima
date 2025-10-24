/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */

// quadrado herda de formabidimensional
public class Quadrado extends FormaBidimensional{
    private double lado;
    
    // conatrutor recebe o lado quadrado
    public Quadrado(double lado){
        this.lado = lado;
    }

    // calculo da area 
    @Override
    public double obterArea(){
        return lado * lado;
    }
    // retorna a descriçao
    @Override
    public String toString(){
        return "quadrado com lado: " + lado;
    }
}
