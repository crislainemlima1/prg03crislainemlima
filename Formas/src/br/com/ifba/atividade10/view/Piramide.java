/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */

// piramede herda de formatrimendisional
public class Piramide extends FormaTridimensional{
   private double base;
   private double altura;
   
   // construtes que define base e altura
   public Piramide(double base, double altura){
       this.altura = altura;
       this.base = base;
   }
   
   // area da piramide
   @Override
   public double obterArea(){
       return base * base + 2 * base * altura;
   }
   // volume
   @Override
   public double obterVolume(){
       return (base * base * altura) / 3;
   }
   
    // descriçao
    @Override
   public String toString(){
      return "piramide com base: " + base + "e altura: " + altura;
   }
}
