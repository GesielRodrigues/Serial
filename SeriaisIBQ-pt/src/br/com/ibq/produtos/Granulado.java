package br.com.ibq.produtos;

import br.com.ibq.ItemType;
import br.com.ibq.ProdutoType;

public class Granulado implements Controlado {

	private ProdutoType produto;

	public Granulado(ProdutoType produto) {
		this.produto = produto;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("GRANULADO\n");

		for (ItemType item : this.produto.getItens().getItem()) {
			string.append(item.getIis());
			string.append("\n");
		}

		return string.toString();
	}
}
