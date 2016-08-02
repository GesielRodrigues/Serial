package br.com.ibq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = "iisIndividual")
public class IisSaco {

	@XmlElement(name = "item", required = true)
	protected List<IisIndividual> iisIndividual;
	@XmlAttribute(name = "iis")
	protected String iis;

	public String getIis() {
		return iis;
	}

	/**
	 * Define o valor da propriedade iis.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setIis(String value) {
		this.iis = value;
	}

	public List<IisIndividual> getIisIndividual() {
		if (iisIndividual == null) {
			iisIndividual = new ArrayList<IisIndividual>();
		}
		return this.iisIndividual;
	}
}
