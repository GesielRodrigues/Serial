//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.07.06 às 04:47:51 PM BRT 
//


package br.com.ibq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de packingType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="packingType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="packingType" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="subPackageCount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packingType", propOrder = {
    "value"
})
public class PackingType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "level")
    protected Byte level;
    @XmlAttribute(name = "packingType")
    protected Byte packingType;
    @XmlAttribute(name = "subPackageCount")
    protected Float subPackageCount;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtém o valor da propriedade level.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * Define o valor da propriedade level.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setLevel(Byte value) {
        this.level = value;
    }

    /**
     * Obtém o valor da propriedade packingType.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPackingType() {
        return packingType;
    }

    /**
     * Define o valor da propriedade packingType.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPackingType(Byte value) {
        this.packingType = value;
    }

    /**
     * Obtém o valor da propriedade subPackageCount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubPackageCount() {
        return subPackageCount;
    }

    /**
     * Define o valor da propriedade subPackageCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubPackageCount(Float value) {
        this.subPackageCount = value;
    }

}
