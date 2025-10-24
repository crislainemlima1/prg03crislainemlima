/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author crisl
 */
public class Main {
    
    
   public static void main(String[] args){
        // criando um vetor de formas
       Forma[] f = new Forma[6];
       f[0] = new Circulo(5.0);
       f[1] = new Quadrado(4.0);
       f[2] = new Triangulo(3.0, 6.0);
       f[3] = new Cubo(2.0);
       f[4] = new Esfera(3.0);
       f[5] = new Piramide(2.0, 5.0); 
       
       // Exibindo os dados de cada forma
        for (Forma forma : f) {
            System.out.println("forma: " + forma.getClass().getSimpleName());

            if (forma instanceof FormaBidimensional) {
                FormaBidimensional forma2D = (FormaBidimensional) forma;
                System.out.println("area: " + forma2D.obterArea());
            } else if (forma instanceof FormaTridimensional) {
                FormaTridimensional forma3D = (FormaTridimensional) forma;
                System.out.println("area: " + forma3D.obterArea());
                System.out.println("volume: " + forma3D.obterVolume());
            }

            System.out.println("------------------------");
        }
    }
}