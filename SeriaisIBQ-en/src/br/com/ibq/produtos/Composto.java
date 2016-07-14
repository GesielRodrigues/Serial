package br.com.ibq.produtos;

import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Composto implements Controlado {

	private ProductType product;

	public Composto(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("COMPOSTO\n");

		for (ItemType item : this.product.getItems().getItem()) {
			string.append(item.getIis());
			string.append("\n");
		}

		return string.toString();
	}

}
