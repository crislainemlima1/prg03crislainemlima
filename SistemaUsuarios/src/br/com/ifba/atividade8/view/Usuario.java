/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade8.view;

import java.time.LocalDateTime;

/**
 *
 * @author crisl
 */

// registro de usuario no sitema
public class Usuario {
    
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;
    
    // construtor com todos os dados
    
    public Usuario(long id, PerfilUsuario perfil, String email, String senha, String senhaSegura123, LocalDateTime ultimoLogin, boolean par1){
        
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha =  senha;
        this.ultimoLogin = ultimoLogin;
        this.ativo = ativo;
        
        // getters e setters
         
    }

    Usuario() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    
    @Override
    
     // retorna os dados do perfil
    public String toString() {
        return """
               Usuario {
                   id: %d
                   perfil: %s
                   nomeUsuario: '%s'
                   email: '%s'
                   senha: '%s'
                   ultimoLogin: %s
                   ativo: %s
               }
               """.formatted(
                   id,
                   perfil != null ? perfil.getDescricao() : "Sem perfil",
                   nomeUsuario,
                   email,
                   "********", // Oculta senha no log
                   ultimoLogin != null ? ultimoLogin : "Nunca logou",
                   ativo ? "Ativo" : "Inativo"
               );
    }

}
