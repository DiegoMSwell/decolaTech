package com.example.decolaTech25.service;

import com.example.decolaTech25.domain.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> listarTodos();

    User buscarPorId(UUID id);

    User salvar(User user);

    void deletar(UUID id);
}
