package com.devtarlley.pedidos.controller;

import com.devtarlley.pedidos.dto.ClienteDTO;
import com.devtarlley.pedidos.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> buscarTodosClientes(){
        return ResponseEntity.ok(clienteService.buscarTodosClientes());
    }

    @GetMapping("/busca-por-nome/{nome}")
    public ResponseEntity<List<ClienteDTO>> buscarClientesPorNome(@PathVariable("nome") String nome){
        return ResponseEntity.ok(clienteService.buscarClientesPorNome(nome));
    }
}
