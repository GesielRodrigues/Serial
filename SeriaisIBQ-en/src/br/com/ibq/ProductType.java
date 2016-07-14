//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.06 �s 04:47:51 PM BRT 
//

package br.com.ibq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de productType complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="productType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packingType" type="{http://www.itsco.com.br/ras2c/pas/receiptOrder}packingTypeType"/>
 *         &lt;element name="items" type="{http://www.itsco.com.br/ras2c/pas/receiptOrder}itemsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="countryCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="producerCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="productCode" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productType", propOrder = { "packingType", "items" })
public class ProductType {

	@XmlElement(required = true)
	protected PackingTypeType packingType;
	@XmlElement(required = true)
	protected ItemsType items;
	@XmlAttribute(name = "countryCode")
	protected Short countryCode;
	@XmlAttribute(name = "producerCode")
	protected Short producerCode;
	@XmlAttribute(name = "productCode")
	protected Short productCode;
	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "family")
	protected Short family;
	@XmlAttribute(name = "weight")
	protected Float weight;
	@XmlAttribute(name = "length")
	protected Float length;

	/**
	 * Obt�m o valor da propriedade packingType.
	 * 
	 * @return possible object is {@link PackingTypeType }
	 * 
	 */
	public PackingTypeType getPackingType() {
		return packingType;
	}

	/**
	 * Define o valor da propriedade packingType.
	 * 
	 * @param value
	 *            allowed object is {@link PackingTypeType }
	 * 
	 */
	public void setPackingType(PackingTypeType value) {
		this.packingType = value;
	}

	/**
	 * Obt�m o valor da propriedade items.
	 * 
	 * @return possible object is {@link ItemsType }
	 * 
	 */
	public ItemsType getItems() {
		return items;
	}

	/**
	 * Define o valor da propriedade items.
	 * 
	 * @param value
	 *            allowed object is {@link ItemsType }
	 * 
	 */
	public void setItems(ItemsType value) {
		this.items = value;
	}

	/**
	 * Obt�m o valor da propriedade countryCode.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCountryCode() {
		return countryCode;
	}

	/**
	 * Define o valor da propriedade countryCode.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCountryCode(Short value) {
		this.countryCode = value;
	}

	/**
	 * Obt�m o valor da propriedade producerCode.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getProducerCode() {
		return producerCode;
	}

	/**
	 * Define o valor da propriedade producerCode.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setProducerCode(Short value) {
		this.producerCode = value;
	}

	/**
	 * Obt�m o valor da propriedade productCode.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getProductCode() {
		return productCode;
	}

	/**
	 * Define o valor da propriedade productCode.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setProductCode(Short value) {
		this.productCode = value;
	}

	/**
	 * Obt�m o valor da propriedade name.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name.split(" ")[0]; // Retorna apenas o primeiro nome.
	}

	/**
	 * Define o valor da propriedade name.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Obt�m o valor da propriedade family.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getFamily() {
		return family;
	}

	/**
	 * Define o valor da propriedade family.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setFamily(Short value) {
		this.family = value;
	}

	/**
	 * Obt�m o valor da propriedade weight.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getWeight() {
		return weight;
	}

	/**
	 * Define o valor da propriedade weight.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setWeight(Float value) {
		this.weight = value;
	}

	/**
	 * Obt�m o valor da propriedade length.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLength() {
		return length;
	}

	/**
	 * Define o valor da propriedade length.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLength(Float value) {
		this.length = value;
	}

}
