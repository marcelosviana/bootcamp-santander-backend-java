package me.dio.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_produt")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Column(precision = 10, scale = 2)
    private BigDecimal preco;

    private int estoque;

    // Getters e Setters
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Métodos adicionais
    public void adicionarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;
        } else {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
    }
}
