/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade8.view;

/**
 *
 * @author crisl
 */

    // registro de ssao no sitema
public class Sessao {
   
    private Long id;
    private Usuario usuario;
    private String token;
    
      // construtor com todos os dados
    public Sessao(Long id, Usuario usuario, String token){
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    Sessao() {
       
    }
    
    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
   
    
    // toString
    @Override
    
     // retorna os dados do perfil
    public String toString() {
        return "Sessao" +
                "id: " + id + "\n" +
                "usuario: " + usuario + "\n" +
                "token: '" + token + '\'' + "\n" +
                
                '}';
    }

   
}
