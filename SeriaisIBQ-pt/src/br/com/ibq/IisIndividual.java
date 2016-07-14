package br.com.ibq;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content", propOrder = "")
public class IisIndividual {

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
}
