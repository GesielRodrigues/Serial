//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.06 �s 04:47:51 PM BRT 
//

package br.com.ibq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java de itemType complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://www.itsco.com.br/ras2c/pas/receiptOrder}itemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="iis" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lot" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="produced" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = { "iisIndividual" })
public class ItemType {

	@XmlElement(name = "item", required = true)
	protected List<IisIndividual> iisIndividual;
	@XmlAttribute(name = "iis")
	protected BigInteger iis;
	@XmlAttribute(name = "lot")
	protected Integer lot;
	@XmlAttribute(name = "produced")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar produced;

	/**
	 * Gets the value of the content property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the content property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getContent().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link ItemType }{@code >} {@link String }
	 * 
	 * 
	 */
	public List<IisIndividual> getIisIndividual() {
		if (iisIndividual == null) {
			iisIndividual = new ArrayList<IisIndividual>();
		}
		return this.iisIndividual;
	}

	/**
	 * Obt�m o valor da propriedade iis.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getIis() {
		return iis;
	}

	/**
	 * Define o valor da propriedade iis.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setIis(BigInteger value) {
		this.iis = value;
	}

	/**
	 * Obt�m o valor da propriedade lot.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLot() {
		return lot;
	}

	/**
	 * Define o valor da propriedade lot.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLot(Integer value) {
		this.lot = value;
	}

	/**
	 * Obt�m o valor da propriedade produced.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getProduced() {
		return produced;
	}

	/**
	 * Define o valor da propriedade produced.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setProduced(XMLGregorianCalendar value) {
		this.produced = value;
	}

}
