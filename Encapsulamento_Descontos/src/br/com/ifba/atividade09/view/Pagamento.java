/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author crisl
 */
public interface Pagamento {
   
    
    double calcularPagamento(double valor); // Calcula o valor final apos os descontos ou taxas
    String gerarRecibo(double valor);  // Gera o recibo detalhado para o pagamento
}
