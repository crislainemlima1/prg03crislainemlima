/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author crisl
 */
public class PagamentoCartao implements Pagamento{
    
    // calculo da taxa de 5%
    @Override
    public double calcularPagamento(double valor){
        return valor * 1.05; // aplicando taxa
    }
    // mostrando o recibo
    @Override
    public String gerarRecibo(double valor){
        double finalValor = calcularPagamento(valor);
        
      return  "Pagamento com Cartão\n" +
               "Valor original: R$ " + String.format("%.2f", valor) +
               "\nTaxa: 5%\n" +
               "Valor final: R$ " + String.format("%.2f", finalValor);
    }
}
