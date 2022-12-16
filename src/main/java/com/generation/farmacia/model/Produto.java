package com.generation.farmacia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id ;
        @NotBlank(message = "O nome do produto não pode ser vazio")
        @Size(min = 10, max = 100, message = "O nome do produto não pode ser menor que 3 caracteres e maior que 100")
        private String nome;
        @Size(min = 10, max = 200, message = "A descrição do produto não pode ser menor que 3 caracteres e maior que 100")
        private String descricao;
        private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
