package com.devtarlley.pedidos.service.impl;

import com.devtarlley.pedidos.dto.ClienteDTO;
import com.devtarlley.pedidos.mapper.ClienteMapper;
import com.devtarlley.pedidos.repository.ClienteRepository;
import com.devtarlley.pedidos.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteServiceImpl(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }

    @Override
    public List<ClienteDTO> buscarTodosClientes() {
        return clienteMapper.entityToDto(clienteRepository.findAll());
    }

    @Override
    public List<ClienteDTO> buscarClientesPorNome(String nome) {
        return clienteMapper.entityToDto(clienteRepository.findByNomeContainsIgnoreCase(nome));
    }
}
