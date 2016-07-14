package br.com.ibq.produtos;

import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Granulado implements Controlado {

	private ProductType product;

	public Granulado(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("GRANULADO\n");

		for (ItemType item : this.product.getItems().getItem()) {
			string.append(item.getIis());
			string.append("\n");
		}

		return string.toString();
	}
}
