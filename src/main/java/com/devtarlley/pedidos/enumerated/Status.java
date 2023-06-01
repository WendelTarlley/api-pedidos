package com.devtarlley.pedidos.enumerated;

public enum Status {
    PENDENTE("PENDENTE"),
    EM_PROCESSAMENTO("EM_PROCESSAMENTO"),
    ENVIADO("ENVIADO"),
    ENTREGUE("ENTREGUE"),
    CANCELADO("CANCELADO");


    Status(String descricao) {
    }
}
