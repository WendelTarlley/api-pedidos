package com.devtarlley.pedidos.dto;

import com.devtarlley.pedidos.enumerated.MetodoPagamento;
import com.devtarlley.pedidos.enumerated.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PedidoDTO {
    private Date dataPedido;

    @NotNull
    private Status status;

    @NotNull
    private BigDecimal totalPedido;

    @NotNull
    private MetodoPagamento metodoPagamento;
}
