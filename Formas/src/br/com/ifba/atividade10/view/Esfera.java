/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */
// esfera herda de formatrimidensional
public class Esfera extends FormaTridimensional{
  private double raio;

   // construtores
    public Esfera(double raio){
        this.raio = raio;
    }  
    
    // area da suoerfise da esfera
  @Override
    public double obterArea(){
        return 4 * Math.PI * raio * raio;
    }
    
  // volume 
  @Override
    public double obterVolume(){
        return (4.0/3.0) * Math.PI * raio * raio * raio;
    }
    
    // descriçao
  @Override
    public String toString(){
        return "esfera com raio: " + raio;
    }
}
