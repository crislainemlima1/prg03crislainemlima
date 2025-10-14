/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author crisl
 */
public class Contas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Criando e abrindo conta de Ana
        ContaBanco contaAna = new ContaBanco();
        contaAna.setNumConta(1001);
        contaAna.setDono("Ana");
        contaAna.abrirConta("cc"); // Conta Corrente

        // Criando e abrindo conta de Carlos
        ContaBanco contaCarlos = new ContaBanco();
        contaCarlos.setNumConta(1002);
        contaCarlos.setDono("Carlos");
        contaCarlos.abrirConta("cp"); // Conta Poupança

        // Ana e Carlos fazem depósitos
        contaAna.depositar(1000);
        contaCarlos.depositar(500);

        // Saques
        contaAna.sacar(200);  
        contaCarlos.sacar(100); 

        // Pagando mensalidades
        contaAna.pagarMensalidade();
        contaCarlos.pagarMensalidade();

        // Tentando fechar conta com saldo (não deve permitir)
        contaAna.fecharConta();

        // Carlos zera a conta antes de fechar
        contaCarlos.sacar(contaCarlos.getSaldo());
        contaCarlos.fecharConta();

        // Mostrando o estado atual das contas
        contaAna.estadoAtual();
        contaCarlos.estadoAtual();
    }
    
}
