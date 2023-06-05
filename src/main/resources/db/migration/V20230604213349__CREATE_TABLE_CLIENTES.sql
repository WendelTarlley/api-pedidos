CREATE TABLE clientes (
    id uuid DEFAULT uuid_generate_v4 (),
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    numero_telefone VARCHAR(11),
    email VARCHAR(255),
    endereco VARCHAR(255),
    CONSTRAINT pk_clientes PRIMARY KEY(id)
)