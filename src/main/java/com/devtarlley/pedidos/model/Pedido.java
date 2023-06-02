package com.devtarlley.pedidos.model;

import com.devtarlley.pedidos.enumerated.MetodoPagamento;
import com.devtarlley.pedidos.enumerated.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Date dataPedido;

    @Enumerated(EnumType.STRING)
    private Status status;

    private BigDecimal totalPedido;

    @Enumerated(EnumType.STRING)
    private MetodoPagamento metodoPagamento;

    private Date atualizadoEm;

    //TODO Implementar classe de usuário
    private Long atualizadoPor;

}