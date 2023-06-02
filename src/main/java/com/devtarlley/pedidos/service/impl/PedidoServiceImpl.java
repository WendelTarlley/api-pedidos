package com.devtarlley.pedidos.service.impl;

import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.dto.PedidoRetornoDTO;
import com.devtarlley.pedidos.mapper.PedidoMapper;
import com.devtarlley.pedidos.model.Pedido;
import com.devtarlley.pedidos.repository.PedidoRepository;
import com.devtarlley.pedidos.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;

import static com.devtarlley.pedidos.enumerated.Status.*;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PedidoMapper pedidoMapper;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, PedidoMapper pedidoMapper) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoMapper = pedidoMapper;
    }

    private Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public void salvarNovoPedido(PedidoDTO pedidoDTO) {
        pedidoDTO.setDataPedido(new Date());
        pedidoDTO.setStatus(PENDENTE);
        salvarPedido(pedidoMapper.dtoToEntity(pedidoDTO));
    }

    @Override
    public PedidoRetornoDTO atualizarPedidoEmProcessamento(Long pedidoID) {
        Pedido pedido = buscarPorId(pedidoID);
        pedido.setStatus(EM_PROCESSAMENTO);
        return salvarAtualizacaoPedido(pedido);
    }

    private PedidoRetornoDTO salvarAtualizacaoPedido(Pedido pedido) {
        pedido.setAtualizadoEm(new Date());
        //TODO ajustar para pegar o usuário do TOKEN
        pedido.setAtualizadoPor(1l);
        return pedidoMapper.entityToPedidoRetornoDTO(salvarPedido(pedido));
    }

    @Override
    public PedidoRetornoDTO atualizarPedidoEnviado(Long pedidoID) {
        Pedido pedido = buscarPorId(pedidoID);
        pedido.setStatus(ENVIADO);
        return salvarAtualizacaoPedido(pedido);
    }
    @Override
    public PedidoRetornoDTO atualizarPedidoEntregue(Long pedidoID) {
        Pedido pedido = buscarPorId(pedidoID);
        pedido.setStatus(ENTREGUE);
        return salvarAtualizacaoPedido(pedido);
    }
    @Override
    public PedidoRetornoDTO atualizarPedidoCancelado(Long pedidoID) {
        Pedido pedido = buscarPorId(pedidoID);
        pedido.setStatus(CANCELADO);
        return salvarAtualizacaoPedido(pedido);
    }

    public Pedido buscarPorId(Long pedidoID){
        return pedidoRepository.findById(pedidoID).orElseThrow( () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Pedido não encontrado para o id :"+ pedidoID));
    }
}
