package br.com.ibq.produtos;

import java.util.List;

import br.com.ibq.IisIndividual;
import br.com.ibq.ItemType;
import br.com.ibq.ProdutoType;

public class Retardo implements Controlado {

	private ProdutoType produto;

	public Retardo(ProdutoType produto) {
		this.produto = produto;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("RETARDO\n");

		List<ItemType> itens = this.produto.getItens().getItem();
		for (ItemType itemType : itens) {
			List<IisIndividual> iis = itemType.getIisIndividual();
			for (IisIndividual iisIndividual : iis) {
				string.append(iisIndividual.getIis());
				string.append("\n");
			}
		}

		return string.toString();
	}

}
