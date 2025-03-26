package com.example.decolaTech25.controller;

import com.example.decolaTech25.domain.model.User;
import com.example.decolaTech25.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> listarTodos() {
        return userService.listarTodos();
    }

    @GetMapping("/{id}")
    public User buscarPorId(@PathVariable UUID id) {
        return userService.buscarPorId(id);
    }

    @PostMapping
    public User salvar(@RequestBody User user) {
        return userService.salvar(user);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        userService.deletar(id);
    }
}
