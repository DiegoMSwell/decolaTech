package com.example.decolaTech25.domain.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity(name = "tb_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer quantidade;

    private boolean comprado = false;

    @ManyToOne
    private ShoppingList lista;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public ShoppingList getLista() {
        return lista;
    }

    public void setLista(ShoppingList lista) {
        this.lista = lista;
    }
}
