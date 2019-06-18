package br.com.ibq.produtos;

import java.util.List;

import br.com.ibq.IisIndividual;
import br.com.ibq.IisSaco;
import br.com.ibq.ItemType;
import br.com.ibq.ProductType;

public class Retardo implements Controlado {

	private ProductType product;

	public Retardo(ProductType product) {
		this.product = product;
	}

	@Override
	public String getSeriais() {

		StringBuilder string = new StringBuilder("RETARDO\n");

		List<ItemType> itens = this.product.getItems().getItem();
		for (ItemType itemType : itens) {
			List<IisSaco> iis = itemType.getIisSaco();
			for (IisSaco iisSaco : iis) {
				List<IisIndividual> iisIndividuais = iisSaco.getIisIndividual();
				for (IisIndividual iisIndividual : iisIndividuais) {
					string.append(iisIndividual.getIis());
					string.append("\n");
				}
			}
		}

		return string.toString();
	}

}
