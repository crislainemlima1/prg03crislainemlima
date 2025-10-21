/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author crisl
 */
public class PagamentoPix implements Pagamento{
    
    @Override
    public double calcularPagamento(double valor){
        return valor * 0.98; // aplicando o desconto
    }
    
    // gerando o recibo
    @Override
    public String gerarRecibo(double valor){
        double finalValor = calcularPagamento(valor);
        return """
               Pagamento via Pix
               Valor original: R$ """ + String.format("%.2f", valor) +
               "\nCashback: 2%\n" +
               "Valor final: R$ " + String.format("%.2f", finalValor);
    }
    
}
