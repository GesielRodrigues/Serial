package br.com.ibq.programa;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.ibq.ProdutoType;
import br.com.ibq.RecebimentoType;

public class Programa {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance("br.com.ibq");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<RecebimentoType> element = (JAXBElement<RecebimentoType>) unmarshaller
				.unmarshal(new File("resources/serial.xml"));
		RecebimentoType r = element.getValue();
		List<ProdutoType> xd = r.getProduto();
		for (ProdutoType produtoType : xd) {
			System.out.println(produtoType.getNome());
		}
	}
}
