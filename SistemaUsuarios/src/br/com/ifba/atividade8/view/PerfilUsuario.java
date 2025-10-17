/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade8.view;


import java.util.List;

/**
 *
 * @author crisl
 */
// registro de perfil no sistema
public class PerfilUsuario {
    private Long id;
    private String descricao;
    private List<String> permissoes;
    
    // construtor com todos os dados
    public PerfilUsuario(Long id, String descricao, List<String> permissoes){
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    PerfilUsuario() {
    
    }
    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    
    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    

    
    @Override

    // retorna os dados do perfil
    public String toString(){
        return "PerfilUsuario{" +
                "id: " + id + "\n" +
                "descricao: '" + descricao + '\'' + "\n" +
                "permissoes: " + permissoes + "\n" +
                '}';
    }

}
