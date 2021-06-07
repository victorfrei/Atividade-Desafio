package com.skap.model;


import java.util.Date;


public class Usuario {
     private int id;
     private String nome;
     private String senha;
     private Date dataCadastro;
     private String descricao;

     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
     public String getSenha() {
          return senha;
     }
     public void setSenha(String senha) {
          this.senha = senha;
     }
     public Date getDataCadastro() {
          return dataCadastro;
     }
     public void setDataCadastro(Date dataCadastro) {
          this.dataCadastro = dataCadastro;
     }
     public String getDescricao() {
          return descricao;
     }
     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }
}
