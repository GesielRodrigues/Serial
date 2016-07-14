package br.com.ibq.produtos;

import br.com.ibq.ItemType;
import br.com.ibq.ProdutoType;

public class Composto implements Controlado {

	private ProdutoType produto;

	public Composto(ProdutoType produto) {
		this.produto = produto;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("COMPOSTO\n");

		for (ItemType item : this.produto.getItens().getItem()) {
			string.append(item.getIis());
			string.append("\n");
		}

		return string.toString();
	}

}
