/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author crisl
 */
public class AttClassesEObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // abrindo contas de jubileu e creuza
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("jubileu");
        p1.abrirConta("cc");
        
         ContaBanco p2 = new ContaBanco();
         p2.setNumConta(2222);
         p2.setDono("creuza");
         p2.abrirConta("cp");
         
         p1.depositar(1000);
         p2.depositar(500);
         
         p2.sacar(50);
         p1.sacar(20);
         
         p1.sacar(20);
         p1.fecharConta();
         
         p1.pagar();
         p2.pagar();
         
         p2.fecharConta();
       
         
        // mostrando o estado atual
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
