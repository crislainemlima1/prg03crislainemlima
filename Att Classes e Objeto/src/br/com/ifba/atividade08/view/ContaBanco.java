/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

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
    public void abrirConta(String t){
       this.setTipo(t);
        this.setStatus(true);
        
        if("cc".equals(t)){
            this.setSaldo(50);
        }else if("cp".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("conta aberta.");
    }
    
    // metodos para fechar conta virificando o saldo 
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("nao pode ser fechada, ainda ha saldo em sua conta.");
        }else if(this.getSaldo() < 0){
            System.out.println("a conta nao pode ser fechada pois ainda ha debito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }
    
    // metodo para depositar dinheiro na conta
    public void depositar(float d){
        if(this.getStatus()){
         this.setSaldo(this.getSaldo() + d);
         System.out.println("deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("nao pode depositar em uma conta fechada");
        }
    }
    
    // metodo para sacar dinheiro na conta
    public void sacar(float d){
        if(this.getStatus()){
            if(this.getSaldo() >= 0){
                this.setSaldo(this.getSaldo() - d);
                System.out.println("saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("nao pode sacar em uma conta fechada");
            }
        }
    }
    
    //metodo para pagar mensalidade
    public void pagar(){
       int d = 0;
       if("cc".equals(this.getTipo())){
           d = 12;
       }else if("cp".equals(this.getTipo())){
           d = 20;
       }
     if(this.getStatus()){
         this.setSaldo(this.getSaldo() - d);
         System.out.println("mensalidade paga por " + this.getDono());
     }  else{
         System.out.println("nao pode ser pag com a conta fechada");
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
