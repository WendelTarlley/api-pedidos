package com.devtarlley.pedidos.service.impl;

import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.mapper.PedidoMapper;
import com.devtarlley.pedidos.repository.PedidoRepository;
import com.devtarlley.pedidos.service.PedidoService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PedidoMapper pedidoMapper;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, PedidoMapper pedidoMapper) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoMapper = pedidoMapper;
    }

    @Override
    public void salvarPedido(PedidoDTO pedidoDTO) {

        pedidoDTO.setDataPedido(new Date());
        pedidoRepository.save(pedidoMapper.dtoToEntity(pedidoDTO));
    }
}
