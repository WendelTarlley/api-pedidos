package com.devtarlley.pedidos.service;

import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.dto.PedidoRetornoDTO;

public interface PedidoService {

    void salvarNovoPedido(PedidoDTO pedidoDTO);

    PedidoRetornoDTO atualizarPedidoEmProcessamento(Long pedidoID);

    PedidoRetornoDTO atualizarPedidoEnviado(Long pedidoID);

    PedidoRetornoDTO atualizarPedidoEntregue(Long pedidoID);

    PedidoRetornoDTO atualizarPedidoCancelado(Long pedidoID);
}
