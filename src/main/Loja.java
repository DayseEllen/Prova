package main;

import entidades.Cliente;
import entidades.CompraAPrazoDialogo;
import entidades.ConexaoBD;
import entidades.Facade;
import entidades.Gerente;
import entidades.Livro;
import entidades.PagamentoAPrazo;
import entidades.PagamentoAbstrato;
import entidades.Produto;

public class Loja {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Noemi","22222222222","Premium");
		Produto produto = new Livro(1,"Um Amor Para Recordar",20.00,"Nicholas Sparks","Drama");

		PagamentoAbstrato pagamento = new CompraAPrazoDialogo(new PagamentoAPrazo());
		Facade usuario = new Facade();
		
		usuario.registrarcompra(cliente.getNome(), cliente.getCpf(), cliente.getTipo());
		usuario.comprar(produto, cliente.getCpf(), pagamento);
		usuario.encerrarCompra();
		
		Facade gerente = new Facade("Dayse", "Noemi");
		
		gerente.PrepararTorta("Garanhuns", "doce");
		gerente.addProdutoNoBanco(produto);
		
	}

}
