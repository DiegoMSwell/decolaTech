package com.example.decolaTech25.domain.repository;

import com.example.decolaTech25.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> { }
