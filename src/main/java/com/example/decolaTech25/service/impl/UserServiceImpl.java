package com.example.decolaTech25.service.impl;

import com.example.decolaTech25.domain.model.User;
import com.example.decolaTech25.domain.repository.UserRepository;
import com.example.decolaTech25.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listarTodos() {
        return userRepository.findAll();
    }

    @Override
    public User buscarPorId(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @Override
    public User salvar(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deletar(UUID id) {
        userRepository.deleteById(id);
    }
}
