package com.example.decolaTech25.controller;

import com.example.decolaTech25.domain.model.Item;
import com.example.decolaTech25.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> listarTodos() {
        return itemService.listarTodos();
    }

    @GetMapping("/{id}")
    public Item buscarPorId(@PathVariable UUID id) {
        return itemService.buscarPorId(id);
    }

    @PostMapping
    public Item salvar(@RequestBody Item item) {
        return itemService.salvar(item);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        itemService.deletar(id);
    }
}
