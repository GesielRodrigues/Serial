package br.com.ibq.programa;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.ibq.ProdutoType;
import br.com.ibq.RecebimentoType;
import br.com.ibq.produtos.Brinel;
import br.com.ibq.produtos.Composto;
import br.com.ibq.produtos.Cordel;
import br.com.ibq.produtos.Estopim;
import br.com.ibq.produtos.Granulado;
import br.com.ibq.produtos.Retardo;

public class Programa {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JAXBException {

		StringBuilder seriais = new StringBuilder();

		JAXBContext context = JAXBContext.newInstance("br.com.ibq");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<RecebimentoType> element = (JAXBElement<RecebimentoType>) unmarshaller
				.unmarshal(new File("resources/serial.xml"));
		RecebimentoType r = element.getValue();

		List<ProdutoType> produtos = r.getProduto();
		for (ProdutoType produto : produtos) {
			if (produto.getNome().equals("BRINEL")) {
				Brinel brinel = new Brinel(produto);
				seriais.append(brinel.getSeriais());
			}
			if (produto.getNome().equals("DIN.")) {
				Composto composto = new Composto(produto);
				seriais.append(composto.getSeriais());
			}
			if (produto.getNome().equals("CORDEL")) {
				Cordel cordel = new Cordel(produto);
				seriais.append(cordel.getSeriais());
			}

			if (produto.getNome().equals("RETARDO")) {
				Retardo retardo = new Retardo(produto);
				seriais.append(retardo.getSeriais());
			}
			if (produto.getNome().equals("PIROPIM")) {
				Estopim estopim = new Estopim(produto);
				seriais.append(estopim.getSeriais());
			}
			if (produto.getNome().equals("ANFOMAX")) {
				Granulado granulado = new Granulado(produto);
				seriais.append(granulado.getSeriais());
			}
			if (produto.getNome().equals("COMPOSTO")) {
				Composto composto = new Composto(produto);
				seriais.append(composto.getSeriais());
			}

		}

		System.out.println(seriais.toString());

	}
}
