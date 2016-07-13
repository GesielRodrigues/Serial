//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.06 �s 04:37:54 PM BRT 
//


package br.com.ibq;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de itemType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://www.dfpc.eb.mil.br}itemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="iis" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="produzido" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="lote" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
    "content"
})
public class ItemType {

    @XmlElementRef(name = "item", namespace = "http://www.dfpc.eb.mil.br", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "iis")
    protected BigInteger iis;
    @XmlAttribute(name = "produzido")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar produzido;
    @XmlAttribute(name = "lote")
    protected Integer lote;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Obt�m o valor da propriedade iis.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIis() {
        return iis;
    }

    /**
     * Define o valor da propriedade iis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIis(BigInteger value) {
        this.iis = value;
    }

    /**
     * Obt�m o valor da propriedade produzido.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProduzido() {
        return produzido;
    }

    /**
     * Define o valor da propriedade produzido.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProduzido(XMLGregorianCalendar value) {
        this.produzido = value;
    }

    /**
     * Obt�m o valor da propriedade lote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLote() {
        return lote;
    }

    /**
     * Define o valor da propriedade lote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLote(Integer value) {
        this.lote = value;
    }

}
