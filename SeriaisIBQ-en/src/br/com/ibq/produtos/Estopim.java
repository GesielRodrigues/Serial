package br.com.ibq.produtos;

import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Estopim implements Controlado {

	private ProductType product;

	public Estopim(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("ESPOLETA\n");

		for (ItemType item : this.product.getItems().getItem()) {
			string.append("0" + item.getIis());
			string.append("\n");
		}

		return string.toString();
	}

}
