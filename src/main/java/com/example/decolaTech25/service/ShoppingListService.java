package com.example.decolaTech25.service;

import com.example.decolaTech25.domain.model.ShoppingList;
import java.util.List;
import java.util.UUID;

public interface ShoppingListService {

    List<ShoppingList> listarTodas();

    ShoppingList buscarPorId(UUID id);

    ShoppingList salvar(ShoppingList shoppingList);

    void deletar(UUID id);
}
