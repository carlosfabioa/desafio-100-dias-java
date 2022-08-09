use vendas;

#consulta de todos os clientes cadastrador por nome
SELECT nome FROM clientes;

#consulta de todos os vendedores cadastrador por nome
SELECT nome FROM vendedor;

#consulta de todos os pedidos realizados, incluindo os itens e o valor total de cada item (ordenado por pedido)
SELECT pedido.CodPedido, produto.Descricao,itempedido.Quantidade, produto.ValorUnitario,
	produto.ValorUnitario * itempedido.Quantidade as TOTAL 
    	FROM pedido 
		JOIN itempedido ON itempedido.CodPedido = pedido.CodPedido
		JOIN produto ON produto.CodProduto = itempedido.CodProduto
		ORDER BY pedido.CodPedido;

#consulta todos os pedidos do vendedor 1, incluindo oso itens e o valodr de cada item
SELECT pedido.CodPedido, produto.Descricao,itempedido.Quantidade, produto.ValorUnitario,
	produto.ValorUnitario * itempedido.Quantidade as TOTAL
    	FROM pedido 
		JOIN itempedido ON itempedido.CodPedido = pedido.CodPedido
		JOIN produto ON produto.CodProduto = itempedido.CodProduto
		JOIN vendedor ON vendedor.CodVendedor = pedido.CodVendedor
		WHERE vendedor.CodVendedor = 1;

#consulta do vendedor com maior salário
SELECT vendedor.Nome, MAX(vendedor.SalarioFixo) from vendedor;

#consulta dos 3 produtos mais caros
SELECT * FROM produto
ORDER BY produto.ValorUnitario DESC LIMIT 3;


