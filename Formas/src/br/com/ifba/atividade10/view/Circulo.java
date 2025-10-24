/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */

// cisculo herda de formabidimensional
public class Circulo extends FormaBidimensional{
    private double raio;
    
    // construtores
    public Circulo(double raio){
        this.raio = raio;
    }
    
    // calculo da area do circulo
    @Override
    public double obterArea(){
        return  Math.PI * raio * raio;
    }
    
    // descriçao
    @Override
    public String toString(){
        return "circulo com raio: " + raio;
    }
}
