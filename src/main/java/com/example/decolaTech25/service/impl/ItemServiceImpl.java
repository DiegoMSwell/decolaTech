package com.example.decolaTech25.service.impl;

import com.example.decolaTech25.domain.model.Item;
import com.example.decolaTech25.domain.repository.ItemRepository;
import com.example.decolaTech25.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> listarTodos() {
        return itemRepository.findAll();
    }

    @Override
    public Item buscarPorId(UUID id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));
    }

    @Override
    public Item salvar(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deletar(UUID id) {
        itemRepository.deleteById(id);
    }
}
