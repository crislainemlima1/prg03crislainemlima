/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade8.view;

/**
 *
 * @author crisl
 */
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // criando perfil de usuario
        
        PerfilUsuario perfilGerente = new PerfilUsuario();
        perfilGerente.setId(1L);
        perfilGerente.setDescricao("Gerente de sistema");
        perfilGerente.setPermissoes(Arrays.asList("CADASTRAR_USUARIO", "CONSULTAR_DADOS"));
        
        // criaçao do usuario 
        
        Usuario novoUsuario = new Usuario();
        novoUsuario.setId(4L);
        novoUsuario.setPerfil(perfilGerente);
        novoUsuario.setNomeUsuario("crislaine");
        novoUsuario.setEmail("cris_dev@ifba.edu.br");
        novoUsuario.setSenha("20225241");
        novoUsuario.setUltimoLogin(LocalDateTime.now());
        novoUsuario.setAtivo(true);
        
        // criando sessao
        
        Sessao sessaoAtiva = new Sessao();
        sessaoAtiva.setId(8L);
        sessaoAtiva.setUsuario(novoUsuario);
        sessaoAtiva.setToken("token_cris123");
        
        // criaçao lod de auditoria 
        
        LogAuditoria auditoria = new LogAuditoria();
        auditoria.setId(6L);
        auditoria.setUsuario(novoUsuario);
        auditoria.setAcao("usuario acessou o sistema");
        auditoria.setDataHora(LocalDateTime.now());
        auditoria.setIp("123.365.965");
        
        System.out.println("\n-----PERFIL------");
        System.out.println(perfilGerente);
         
        System.out.println("\n-----USUARIO-------");
        System.out.println(novoUsuario);
           
        System.out.println("\n----SESSAO----");
        System.out.println(sessaoAtiva);
             
        System.out.println("\n-----LOG DE AUDITORIA-----");
        System.out.println(auditoria);
    }
    
}
