package br.com.ibq.produtos;

import java.util.List;

import br.com.ibq.IisIndividual;
import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Brinel implements Controlado {

	private ProductType product;

	public Brinel(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("BRINEL\n");

		List<ItemType> itens = this.product.getItems().getItem();
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