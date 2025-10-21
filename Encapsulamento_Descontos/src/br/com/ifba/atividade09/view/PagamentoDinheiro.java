/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author crisl
 */
public class PagamentoDinheiro implements Pagamento {
    
    @Override
    public double calcularPagamento(double valor){
        return valor * 0.9; // aplicando desconto
    }
    
    // gerando o recibo
    @Override
    public String gerarRecibo(double valor){
        double finalValor = calcularPagamento(valor);
        return """
              Pagamento em Dinheiro
              Valor original: R$ """ + String.format("%.2f", valor) +
               "\nDesconto: 10%\n" +
               "Valor final: R$ " + String.format("%.2f", finalValor);
    }
}
