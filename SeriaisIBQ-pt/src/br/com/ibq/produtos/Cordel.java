package br.com.ibq.produtos;

import java.util.List;

import br.com.ibq.IisSaco;
import br.com.ibq.ItemType;
import br.com.ibq.ProdutoType;

public class Cordel extends ProdutoType implements Controlado {

	private ProdutoType produto;

	public Cordel(ProdutoType produto) {
		this.produto = produto;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("CORDEL\n");

		List<ItemType> itens = this.produto.getItens().getItem();
		for (ItemType itemType : itens) {
			List<IisSaco> iis = itemType.getIisSaco();
			for (IisSaco iisIndividual : iis) {
				string.append(iisIndividual.getIis());
				string.append("\n");
			}
		}

		return string.toString();
	}

}
