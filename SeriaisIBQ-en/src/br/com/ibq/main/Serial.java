package br.com.ibq.main;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.ibq.ProductType;
import br.com.ibq.ReceiptOrderType;
import br.com.ibq.produtos.Brinel;
import br.com.ibq.produtos.Britex;
import br.com.ibq.produtos.Composto;
import br.com.ibq.produtos.Cordel;
import br.com.ibq.produtos.Estopim;
import br.com.ibq.produtos.Granulado;
import br.com.ibq.produtos.Retardo;

public class Serial {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JAXBException {

		StringBuilder seriais = new StringBuilder();

		JAXBContext context = JAXBContext.newInstance("br.com.ibq");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<ReceiptOrderType> element = (JAXBElement<ReceiptOrderType>) unmarshaller
				.unmarshal(new File("resources/serial.xml"));
		ReceiptOrderType r = element.getValue();

		List<ProductType> products = r.getProduct();
		for (ProductType product : products) {
			// System.out.println(product.getName());
			if (product.getName().equals("BRINEL")) {
				Brinel brinel = new Brinel(product);
				seriais.append(brinel.getSeriais());
			}
			if (product.getName().equals("REFORCADOR")) {
				Britex britex = new Britex(product);
				seriais.append(britex.getSeriais());
			}
			if (product.getName().equals("DIN.")) {
				Composto composto = new Composto(product);
				seriais.append(composto.getSeriais());
			}
			if (product.getName().equals("CORDEL")) {
				Cordel cordel = new Cordel(product);
				seriais.append(cordel.getSeriais());
			}

			if (product.getName().equals("RETARDO")) {
				Retardo retardo = new Retardo(product);
				seriais.append(retardo.getSeriais());
			}
			if (product.getName().equals("PIROPIM")) {
				Estopim estopim = new Estopim(product);
				seriais.append(estopim.getSeriais());
			}
			if (product.getName().equals("BRITAPIM")) {
				Estopim estopim = new Estopim(product);
				seriais.append(estopim.getSeriais());
			}
			if (product.getName().equals("ANFOMAX")) {
				Granulado granulado = new Granulado(product);
				seriais.append(granulado.getSeriais());
			}
			if (product.getName().equals("COMPOSTO")) {
				Composto composto = new Composto(product);
				seriais.append(composto.getSeriais());
			}

		}

		System.out.println(seriais.toString());

	}
}
