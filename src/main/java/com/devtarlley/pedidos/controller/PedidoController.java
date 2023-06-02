package com.devtarlley.pedidos.controller;

import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.dto.PedidoRetornoDTO;
import com.devtarlley.pedidos.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoDTO pedidoDTO){
            pedidoService.salvarNovoPedido(pedidoDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/atualizar-status/em-processamento/{id}")
    public ResponseEntity<PedidoRetornoDTO> atualizarStatusPedidoEmProcessamento(@PathVariable("id") Long pedidoID){
        return ResponseEntity.ok().body(pedidoService.atualizarPedidoEmProcessamento(pedidoID));
    }

    @PutMapping("/atualizar-status/enviado/{id}")
    public ResponseEntity<PedidoRetornoDTO> atualizarStatusPedidoEnviado(@PathVariable("id") Long pedidoID){
        return ResponseEntity.ok().body(pedidoService.atualizarPedidoEnviado(pedidoID));
    }

    @PutMapping("/atualizar-status/entregue/{id}")
    public ResponseEntity<PedidoRetornoDTO> atualizarStatusPedidoEntregue(@PathVariable("id") Long pedidoID){
        return ResponseEntity.ok().body(pedidoService.atualizarPedidoEntregue(pedidoID));
    }

    @PutMapping("/atualizar-status/cancelado/{id}")
    public ResponseEntity<PedidoRetornoDTO> atualizarStatusPedidoCancelado(@PathVariable("id") Long pedidoID){
        return ResponseEntity.ok().body( pedidoService.atualizarPedidoCancelado(pedidoID));
    }
}
