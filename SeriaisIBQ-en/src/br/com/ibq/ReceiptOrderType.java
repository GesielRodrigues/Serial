//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.07.06 às 04:47:51 PM BRT 
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
 * <p>Classe Java de receiptOrderType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="receiptOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://www.itsco.com.br/ras2c/pas/receiptOrder}productType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="exportationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="sellerCnpj" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sellerOrder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buyerCnpj" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="invoiceSeries" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="trafficGuide" type="{http://www.w3.org/2001/XMLSchema}short" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiptOrderType", propOrder = {
    "product"
})
public class ReceiptOrderType {

    protected List<ProductType> product;
    @XmlAttribute(name = "version")
    protected Float version;
    @XmlAttribute(name = "exportationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exportationDate;
    @XmlAttribute(name = "sellerCnpj")
    protected Long sellerCnpj;
    @XmlAttribute(name = "sellerOrder")
    protected String sellerOrder;
    @XmlAttribute(name = "buyerCnpj")
    protected Long buyerCnpj;
    @XmlAttribute(name = "invoiceNumber")
    protected Short invoiceNumber;
    @XmlAttribute(name = "invoiceSeries")
    protected Byte invoiceSeries;
    @XmlAttribute(name = "trafficGuide")
    protected Short trafficGuide;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersion(Float value) {
        this.version = value;
    }

    /**
     * Obtém o valor da propriedade exportationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportationDate() {
        return exportationDate;
    }

    /**
     * Define o valor da propriedade exportationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportationDate(XMLGregorianCalendar value) {
        this.exportationDate = value;
    }

    /**
     * Obtém o valor da propriedade sellerCnpj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellerCnpj() {
        return sellerCnpj;
    }

    /**
     * Define o valor da propriedade sellerCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellerCnpj(Long value) {
        this.sellerCnpj = value;
    }

    /**
     * Obtém o valor da propriedade sellerOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerOrder() {
        return sellerOrder;
    }

    /**
     * Define o valor da propriedade sellerOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerOrder(String value) {
        this.sellerOrder = value;
    }

    /**
     * Obtém o valor da propriedade buyerCnpj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuyerCnpj() {
        return buyerCnpj;
    }

    /**
     * Define o valor da propriedade buyerCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuyerCnpj(Long value) {
        this.buyerCnpj = value;
    }

    /**
     * Obtém o valor da propriedade invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define o valor da propriedade invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInvoiceNumber(Short value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtém o valor da propriedade invoiceSeries.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getInvoiceSeries() {
        return invoiceSeries;
    }

    /**
     * Define o valor da propriedade invoiceSeries.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setInvoiceSeries(Byte value) {
        this.invoiceSeries = value;
    }

    /**
     * Obtém o valor da propriedade trafficGuide.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTrafficGuide() {
        return trafficGuide;
    }

    /**
     * Define o valor da propriedade trafficGuide.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTrafficGuide(Short value) {
        this.trafficGuide = value;
    }

}
