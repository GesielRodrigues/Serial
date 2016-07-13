package br.com.ibq.main;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.ibq.ProductType;
import br.com.ibq.ReceiptOrderType;

public class Serial {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance("br.com.ibq");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<ReceiptOrderType> element = (JAXBElement<ReceiptOrderType>) unmarshaller
				.unmarshal(new File("resources/serial.xml"));
		ReceiptOrderType r = element.getValue();
		List<ProductType> xd = r.getProduct();
		for (ProductType produtoType : xd) {
			System.out.println(produtoType.getName());
		}
	}
}
