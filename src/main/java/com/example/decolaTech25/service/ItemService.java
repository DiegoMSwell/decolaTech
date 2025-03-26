package com.example.decolaTech25.service;

import com.example.decolaTech25.domain.model.Item;

import java.util.List;
import java.util.UUID;

public interface ItemService {

    List<Item> listarTodos();

    Item buscarPorId(UUID id);

    Item salvar(Item item);

    void deletar(UUID id);
}
