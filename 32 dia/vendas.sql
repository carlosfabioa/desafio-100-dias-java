DROP DATABASE vendas;

CREATE DATABASE IF NOT EXISTS vendas;

USE vendas;

CREATE TABLE IF NOT EXISTS vendedor(
	CodVendedor INT(4) AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(45) NOT NULL,
    SalarioFixo DECIMAL(10,2) NOT NULL,
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
    ValorUnitario DECIMAL(10,2) NOT NULL
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

#inserindo os vendedores
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Maria", 1500, "C");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Jose", 1400, "D");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Beatriz", 3590, "A");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Joaquim", 1900, "C");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Paulo", 3490, "B");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Marcos", 1950, "C");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Francisco", 1500, "C");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Gustavo", 1400, "D");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Kleyton", 1349, "A");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Camila", 2345, "D");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Gabriela", 4323, "C");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Giovana", 3452, "B");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("João", 3289, "A");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Jonas", 2345, "D");
INSERT INTO vendedor(nome, SalarioFixo, FaixaComissao) VALUES ("Henrique",5900, "B");

#inserindo clientes na tabela
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Cristina", "rua rio das antas", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Katia", "rua A", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Muriel", "rua B", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Mirela", "rua D", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Patricia", "rua E", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Eduardo", "rua F", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Cristian", "rua G", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Leonardo", "rua H", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Rueida", "rua I", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Leandro", "rua J", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Julio", "rua K", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Ana", "rua L", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Monica", "rua M", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Kelly", "rua N", "maringá", "87033-100", "PR", "12345");
INSERT INTO clientes(nome, endereco, cidade, cep, uf, ie) VALUES("Clemente", "rua O", "maringá", "87033-100", "PR", "12345");

#inserir produtos
INSERT INTO produto(descricao, valorUnitario) VALUES("lapiz", 3.2);
INSERT INTO produto(descricao, valorUnitario) VALUES("caneta", 7.42);
INSERT INTO produto(descricao, valorUnitario) VALUES("caderno", 43.42);
INSERT INTO produto(descricao, valorUnitario) VALUES("borracha", 0.8);
INSERT INTO produto(descricao, valorUnitario) VALUES("giz de cera", 1.2);
INSERT INTO produto(descricao, valorUnitario) VALUES("apagador", 16.22);
INSERT INTO produto(descricao, valorUnitario) VALUES("estojo", 32.45);
INSERT INTO produto(descricao, valorUnitario) VALUES("pincel", 3.9);
INSERT INTO produto(descricao, valorUnitario) VALUES("papel", 1.7);
INSERT INTO produto(descricao, valorUnitario) VALUES("cartolina", 2.2);
INSERT INTO produto(descricao, valorUnitario) VALUES("tinta cache", 7.26);
INSERT INTO produto(descricao, valorUnitario) VALUES("bloco de notas", 24.2);
INSERT INTO produto(descricao, valorUnitario) VALUES("mochila", 63.52);
INSERT INTO produto(descricao, valorUnitario) VALUES("cola", 5.5);
INSERT INTO produto(descricao, valorUnitario) VALUES("elastico", 13.5);


#inserindo pedidos
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220819, NOW(), 10, 1);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220829, NOW(), 10, 1);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220809, NOW(), 10, 1);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220811, NOW(), 10, 2);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220816, NOW(), 10, 2);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220811, NOW(), 10, 3);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220816, NOW(), 10, 3);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220826, NOW(), 10, 3);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220811, NOW(), 10, 4);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220830, NOW(), 10, 4);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220804, NOW(), 10, 4);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220828, NOW(), 10, 5);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220818, NOW(), 10, 5);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220819, NOW(), 10, 5);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220908, NOW(), 10, 6);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220817, NOW(), 10, 6);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220829, NOW(), 10, 6);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220827, NOW(), 10, 7);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220817, NOW(), 10, 7);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220819, NOW(), 10, 7);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220828, NOW(), 10, 8);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220909, NOW(), 10, 8);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220811, NOW(), 10, 8);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220812, NOW(), 10, 9);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220813, NOW(), 10, 9);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220815, NOW(), 10, 9);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220816, NOW(), 10, 10);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220817, NOW(), 10, 10);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220811, NOW(), 10, 10);
INSERT INTO pedido (PrazoEntrega, DataPedido, CodCliente, CodVendedor) VALUES (20220817, NOW(), 10, 11);

#cadastrar itens dos pedidos
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (1, 2, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (1, 6, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (1, 12, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (2, 4, 2);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (2, 6, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (2, 2, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (3, 2, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (3, 6, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (3, 12, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (3, 2, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (3, 6, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (3, 12, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (4, 2, 12);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (4, 13, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (4, 2, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (5, 12, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (5, 6, 23);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (5, 2, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (6, 2, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (6, 1, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (6, 1, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (7, 6, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (7, 6, 23);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (7, 2, 14);


INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (8, 10, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (8, 9, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (8, 1, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (9, 1, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (9, 3, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (9, 1, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (10, 12, 1);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (10, 5, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (10, 11, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (11, 1, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (11, 4, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (11, 12, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (12, 1, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (12, 9, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (12, 11, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (13, 12, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (13, 7, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (13, 1, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (14, 9, 1);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (14, 6, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (14, 1, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (15, 10, 4);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (15, 9, 31);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (15, 11, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (16, 1, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (16, 15, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (16, 1, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (17, 1, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (17, 6, 14);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (17, 3, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (17, 11, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (18, 3, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (18, 15, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (19, 7, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (19, 11, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (20, 4, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (20, 2, 11);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (21, 7, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (21, 13, 4);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (22, 6, 13);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (22, 1, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (23, 1, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (23, 6, 14);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (24, 2, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (24, 15, 1);

INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (25, 1, 3);
INSERT INTO itempedido(CodPedido, CodProduto, Quantidade) VALUES (25, 1, 4);
