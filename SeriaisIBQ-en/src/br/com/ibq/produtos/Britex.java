package br.com.ibq.produtos;

import java.util.List;

import br.com.ibq.IisSaco;
import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Britex implements Controlado {

	private ProductType product;

	public Britex(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("BRITEX\n");

		List<ItemType> itens = this.product.getItems().getItem();
		for (ItemType itemType : itens) {
			List<IisSaco> iis = itemType.getIisSaco();
			for (IisSaco iisSaco : iis) {
				string.append(iisSaco.getIis());
				string.append("\n");
			}
		}

		return string.toString();
	}

}
