//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.06 �s 04:37:54 PM BRT 
//


package br.com.ibq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de embalagemType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="embalagemType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="nivel" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="tipoEmbalagem" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="quantidadeDeSubniveis" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embalagemType", propOrder = {
    "value"
})
public class EmbalagemType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "nivel")
    protected Byte nivel;
    @XmlAttribute(name = "tipoEmbalagem")
    protected Byte tipoEmbalagem;
    @XmlAttribute(name = "quantidadeDeSubniveis")
    protected Byte quantidadeDeSubniveis;

    /**
     * Obt�m o valor da propriedade value.
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
     * Obt�m o valor da propriedade nivel.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNivel() {
        return nivel;
    }

    /**
     * Define o valor da propriedade nivel.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNivel(Byte value) {
        this.nivel = value;
    }

    /**
     * Obt�m o valor da propriedade tipoEmbalagem.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    /**
     * Define o valor da propriedade tipoEmbalagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTipoEmbalagem(Byte value) {
        this.tipoEmbalagem = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeDeSubniveis.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getQuantidadeDeSubniveis() {
        return quantidadeDeSubniveis;
    }

    /**
     * Define o valor da propriedade quantidadeDeSubniveis.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setQuantidadeDeSubniveis(Byte value) {
        this.quantidadeDeSubniveis = value;
    }

}
