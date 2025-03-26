package com.example.decolaTech25.controller;

import com.example.decolaTech25.domain.model.ShoppingList;
import com.example.decolaTech25.service.ShoppingListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/shopping-lists")
public class ShoppingListController {

    private final ShoppingListService shoppingListService;

    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @GetMapping
    public List<ShoppingList> listarTodas() {
        return shoppingListService.listarTodas();
    }

    @GetMapping("/{id}")
    public ShoppingList buscarPorId(@PathVariable UUID id) {
        return shoppingListService.buscarPorId(id);
    }

    @PostMapping
    public ShoppingList salvar(@RequestBody ShoppingList shoppingList) {
        return shoppingListService.salvar(shoppingList);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        shoppingListService.deletar(id);
    }
}
