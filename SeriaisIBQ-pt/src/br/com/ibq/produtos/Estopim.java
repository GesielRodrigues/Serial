package br.com.ibq.produtos;

import br.com.ibq.ItemType;
import br.com.ibq.ProdutoType;

public class Estopim implements Controlado {

	private ProdutoType produto;

	public Estopim(ProdutoType produto) {
		this.produto = produto;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("ESPOLETA\n");

		for (ItemType item : this.produto.getItens().getItem()) {
			string.append("0" + item.getIis());
			string.append("\n");
		}

		return string.toString();
	}

}
