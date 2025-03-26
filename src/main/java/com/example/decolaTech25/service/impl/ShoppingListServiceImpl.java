package com.example.decolaTech25.service.impl;

import com.example.decolaTech25.domain.model.ShoppingList;
import com.example.decolaTech25.domain.repository.ShoppingListRepository;
import com.example.decolaTech25.service.ShoppingListService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ShoppingListServiceImpl implements ShoppingListService {

    private final ShoppingListRepository shoppingListRepository;

    public ShoppingListServiceImpl(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    @Override
    public List<ShoppingList> listarTodas() {
        return shoppingListRepository.findAll();
    }

    @Override
    public ShoppingList buscarPorId(UUID id) {
        return shoppingListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista de compras não encontrada"));
    }

    @Override
    public ShoppingList salvar(ShoppingList shoppingList) {
        return shoppingListRepository.save(shoppingList);
    }

    @Override
    public void deletar(UUID id) {
        shoppingListRepository.deleteById(id);
    }
}