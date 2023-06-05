package com.devtarlley.pedidos.service;

import com.devtarlley.pedidos.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    List<ClienteDTO> buscarTodosClientes();

    List<ClienteDTO> buscarClientesPorNome(String nome);
}
