package com.devtarlley.pedidos.dto;

import com.devtarlley.pedidos.enumerated.Status;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PedidoRetornoDTO {
    private Date dataPedido;
    private Status status;
    private BigDecimal totalPedido;

    private Date atualizadoEm;

    //TODO ajustar para a classe de usuário.
    private Long atualizadoPor;
}
