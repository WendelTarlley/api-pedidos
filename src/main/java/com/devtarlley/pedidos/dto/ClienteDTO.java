package com.devtarlley.pedidos.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ClienteDTO {

    private UUID id;

    private String nome;

    private String endereco;
}
