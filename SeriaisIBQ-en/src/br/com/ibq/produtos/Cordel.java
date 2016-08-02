package br.com.ibq.produtos;

import java.util.List;

import br.com.ibq.IisSaco;
import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Cordel extends ProductType implements Controlado {

	private ProductType product;

	public Cordel(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("CORDEL\n");

		List<ItemType> itens = this.product.getItems().getItem();
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
