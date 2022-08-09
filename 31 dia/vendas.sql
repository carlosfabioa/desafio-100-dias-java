DROP DATABASE vendas;

CREATE DATABASE IF NOT EXISTS vendas;

USE vendas;

CREATE TABLE IF NOT EXISTS vendedor(
	CodVendedor INT(4) AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(45) NOT NULL,
    SalarioFixo DECIMAL(10.2) NOT NULL,
    FaixaComissao ENUM("A", "B", "C", "D")
);

CREATE TABLE IF NOT EXISTS clientes(
	CodCliente INT(4) AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(45) NOT NULL,
    Endereco VARCHAR(45) NOT NULL,
    Cidade VARCHAR(45) NOT NULL,
    Cep VARCHAR(11),
    Uf CHAR(2),
    Ie VARCHAR(12)
);

CREATE TABLE IF NOT EXISTS produto(
	CodProduto INT(4) AUTO_INCREMENT PRIMARY KEY,
    Descricao VARCHAR(45) NOT NULL,
    ValorUnitario DECIMAL(10.2) NOT NULL
);

CREATE TABLE IF NOT EXISTS Pedido(
	CodPedido INT(4) AUTO_INCREMENT PRIMARY KEY,
    PrazoEntrega DATE,
    DataPedido DATE NOT NULL,
    CodCliente INT(4) NOT NULL,
    CodVendedor INT(4) NOT NULL,
    CONSTRAINT fkClientePedido FOREIGN KEY(CodCliente) REFERENCES clientes(CodCliente),
    CONSTRAINT fkVendedorPedido FOREIGN KEY(CodVendedor) REFERENCES vendedor(CodVendedor)
);

CREATE TABLE IF NOT EXISTS ItemPedido(
	CodItemPedido INT(4) AUTO_INCREMENT PRIMARY KEY,
    CodPedido INT(4) NOT NULL,
    CodProduto INT(4) NOT NULL,
    Quantidade INT(5) NOT NULL,
    CONSTRAINT fkPedidoItemPedido FOREIGN KEY(CodPedido) REFERENCES pedido(CodPedido),
    CONSTRAINT fkProdutoItemPedido FOREIGN KEY(CodProduto) REFERENCES produto(CodProduto)
);
