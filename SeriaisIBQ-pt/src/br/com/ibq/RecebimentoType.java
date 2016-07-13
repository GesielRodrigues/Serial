//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.06 �s 04:37:54 PM BRT 
//


package br.com.ibq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de recebimentoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="recebimentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produto" type="{http://www.dfpc.eb.mil.br}produtoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="dataExportacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cnpjDeVendedor" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="orderDeVendedor" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="numeroNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="serieNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="guiaDeTrafego" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="cnpjDeComprador" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recebimentoType", propOrder = {
    "produto"
})
public class RecebimentoType {

    protected List<ProdutoType> produto;
    @XmlAttribute(name = "versao")
    protected Float versao;
    @XmlAttribute(name = "dataExportacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataExportacao;
    @XmlAttribute(name = "cnpjDeVendedor")
    protected Long cnpjDeVendedor;
    @XmlAttribute(name = "orderDeVendedor")
    protected Short orderDeVendedor;
    @XmlAttribute(name = "numeroNotaFiscal")
    protected Short numeroNotaFiscal;
    @XmlAttribute(name = "serieNotaFiscal")
    protected Byte serieNotaFiscal;
    @XmlAttribute(name = "guiaDeTrafego")
    protected Float guiaDeTrafego;
    @XmlAttribute(name = "cnpjDeComprador")
    protected Long cnpjDeComprador;

    /**
     * Gets the value of the produto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdutoType }
     * 
     * 
     */
    public List<ProdutoType> getProduto() {
        if (produto == null) {
            produto = new ArrayList<ProdutoType>();
        }
        return this.produto;
    }

    /**
     * Obt�m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersao(Float value) {
        this.versao = value;
    }

    /**
     * Obt�m o valor da propriedade dataExportacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExportacao() {
        return dataExportacao;
    }

    /**
     * Define o valor da propriedade dataExportacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExportacao(XMLGregorianCalendar value) {
        this.dataExportacao = value;
    }

    /**
     * Obt�m o valor da propriedade cnpjDeVendedor.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCnpjDeVendedor() {
        return cnpjDeVendedor;
    }

    /**
     * Define o valor da propriedade cnpjDeVendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCnpjDeVendedor(Long value) {
        this.cnpjDeVendedor = value;
    }

    /**
     * Obt�m o valor da propriedade orderDeVendedor.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOrderDeVendedor() {
        return orderDeVendedor;
    }

    /**
     * Define o valor da propriedade orderDeVendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOrderDeVendedor(Short value) {
        this.orderDeVendedor = value;
    }

    /**
     * Obt�m o valor da propriedade numeroNotaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    /**
     * Define o valor da propriedade numeroNotaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroNotaFiscal(Short value) {
        this.numeroNotaFiscal = value;
    }

    /**
     * Obt�m o valor da propriedade serieNotaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSerieNotaFiscal() {
        return serieNotaFiscal;
    }

    /**
     * Define o valor da propriedade serieNotaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSerieNotaFiscal(Byte value) {
        this.serieNotaFiscal = value;
    }

    /**
     * Obt�m o valor da propriedade guiaDeTrafego.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGuiaDeTrafego() {
        return guiaDeTrafego;
    }

    /**
     * Define o valor da propriedade guiaDeTrafego.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGuiaDeTrafego(Float value) {
        this.guiaDeTrafego = value;
    }

    /**
     * Obt�m o valor da propriedade cnpjDeComprador.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCnpjDeComprador() {
        return cnpjDeComprador;
    }

    /**
     * Define o valor da propriedade cnpjDeComprador.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCnpjDeComprador(Long value) {
        this.cnpjDeComprador = value;
    }

}
