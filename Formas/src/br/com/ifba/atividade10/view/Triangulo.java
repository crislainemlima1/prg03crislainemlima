/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */

 // triangulo herda de FormaBidimensional
public class Triangulo extends FormaBidimensional{
    private double altura;
    private double base;
    
    
     // construtores do triangulo
    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    
    // calculo da area 
    @Override
    public double obterArea(){
        return (base * altura) / 2;
    }
    // retorna uma discriçao
    @Override
    public String toString(){
        return "triangulo com base: " + base + " e altura" + altura;
    }
}
