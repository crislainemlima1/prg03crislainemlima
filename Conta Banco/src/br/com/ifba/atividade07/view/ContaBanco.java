/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author crisl
 */
public class ContaBanco {
    
    
   

    // atributos da conta
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // mostrando os dados da conta
    public void estadoAtual(){
        System.out.println("==================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("=====================================");
    }
    
    // metodo de abrir conta definindo o tipo e adicionando saldo atual
    public void abrirConta(String tipo){
        
        if (this.status) {
            System.out.println("A conta já está aberta!");
            return;
        }
        
        this.setTipo(tipo);
        this.setStatus(true);
        
        if("cc".equals(tipo)){
            this.setSaldo(50);
        }else if("cp".equals(tipo)){
            this.setSaldo(150);
        }
         System.out.println("Conta de " + this.dono + " aberta com sucesso");
    }
    
    // metodos para fechar conta virificando o saldo 
    public void fecharConta(){
        
        if (!this.status) {
            System.out.println("A conta já está fechada.");
            return;
        }
        
        if(this.getSaldo() > 0){
            System.out.println("nao pode ser fechada, ainda ha saldo em sua conta.");
        }else if(this.getSaldo() < 0){
            System.out.println("a conta nao pode ser fechada pois ainda ha debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta de " + this.dono + " foi fechada com sucesso!");
        }
    }
    
    // metodo para depositar dinheiro na conta
    public void depositar(float valor){
        if (!this.status) {
            System.out.println("nao e possivel depositar em uma conta fechada");
            return;
        }

        if (valor <= 0) {
            System.out.println("Vvaloe de deposito invalido");
            return;
        }

        this.saldo += valor;
        System.out.println("deposito de R$ " + valor + " realizado na conta de " + this.dono);
    }
    
    // metodo para sacar dinheiro na conta
    public void sacar(float valor){
        if (!this.status) {
            System.out.println("nao e possivel sacar de uma conta fechada.");
            return;
        }

        if (valor <= 0) {
            System.out.println("valor para saque invalido");
            return;
        }

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta de " + this.dono);
        } else {
            System.out.println("Saldo insuficiente para saque na conta de " + this.dono);
        }
    }
    
    //metodo para pagar mensalidade
    public void pagarMensalidade(){
        int valor = 0;
        if (this.tipo.equals("cc")) {
            valor = 12;
        } else if (this.tipo.equals("cp")) {
            valor = 20;
        }

        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Mensalidade de R$ " + valor + " paga por " + this.dono);
            } else {
                System.out.println("Saldo insuficiente para pagar mensalidade.");
            }
        } else {
            System.out.println("nao e possivel pagar mensalidade com a conta fechada.");
        }
    }
    
    // contrutor da classe
    public ContaBanco() {
    this.saldo = 0;
    this.status = false;
}

    
    // getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
