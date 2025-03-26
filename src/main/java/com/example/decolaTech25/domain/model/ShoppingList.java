package com.example.decolaTech25.domain.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "tb_shopping_list")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private User dono;

    @ManyToMany
    private List<User> membros;

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

    public User getDono() {
        return dono;
    }

    public void setDono(User dono) {
        this.dono = dono;
    }

    public List<User> getMembros() {
        return membros;
    }

    public void setMembros(List<User> membros) {
        this.membros = membros;
    }

}
