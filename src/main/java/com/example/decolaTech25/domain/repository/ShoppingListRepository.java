package com.example.decolaTech25.domain.repository;

import com.example.decolaTech25.domain.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, UUID> { }
