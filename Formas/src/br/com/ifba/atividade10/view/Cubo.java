/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */

//cubo herda de formatrimensional
public class Cubo extends FormaTridimensional{
    private double lado;
    
    // construtores
    public Cubo(double lado){
        this.lado = lado;
    }
    
    // area total do cubp
    @Override
    public double obterArea(){
        return 6 * lado * lado;
    }
    
    // volume do cubo
    @Override
    public double obterVolume(){
        return lado * lado * lado;
    }
    
    // descriçao
    @Override
    public String toString(){
        return "cubo com lado: " + lado; 
    }
}
