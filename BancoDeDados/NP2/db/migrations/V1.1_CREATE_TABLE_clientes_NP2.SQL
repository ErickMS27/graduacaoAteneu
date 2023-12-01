CREATE TABLE clientes (
    CPF VARCHAR(11) PRIMARY KEY,
    Nome VARCHAR(100),
    DataNascimento DATE,
    Endereco VARCHAR(255),
    CEP VARCHAR(8),
    Bairro VARCHAR(100),
    Cidade VARCHAR(100),
    UF VARCHAR(2)
);
