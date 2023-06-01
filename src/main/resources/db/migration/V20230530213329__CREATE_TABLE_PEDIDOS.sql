CREATE TABLE pedidos (
    id BIGINT NOT NULL,
    data_pedido TIMESTAMP WITHOUT TIME ZONE,
    status VARCHAR(255) NOT NULL,
    total_pedido DECIMAL NOT NULL,
    metodo_pagamento VARCHAR(255),
    endereco_entrega VARCHAR(255),
    observacao VARCHAR(255),
    CONSTRAINT pk_pedidos PRIMARY KEY (ID)
);