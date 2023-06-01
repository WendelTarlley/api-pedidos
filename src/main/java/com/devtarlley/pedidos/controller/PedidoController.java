package com.devtarlley.pedidos.controller;

import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<?> salvarPedido(@RequestBody PedidoDTO pedidoDTO){
            pedidoService.salvarPedido(pedidoDTO);
        return ResponseEntity.ok().build();
    }
}
