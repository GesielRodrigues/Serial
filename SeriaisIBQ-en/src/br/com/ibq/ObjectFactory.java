//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.07.06 às 04:47:51 PM BRT 
//


package br.com.ibq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibq package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReceiptOrder_QNAME = new QName("http://www.itsco.com.br/ras2c/pas/receiptOrder", "receiptOrder");
    private final static QName _ItemTypeItem_QNAME = new QName("http://www.itsco.com.br/ras2c/pas/receiptOrder", "item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiptOrderType }
     * 
     */
    public ReceiptOrderType createReceiptOrderType() {
        return new ReceiptOrderType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ItemsType }
     * 
     */
    public ItemsType createItemsType() {
        return new ItemsType();
    }

    /**
     * Create an instance of {@link PackingType }
     * 
     */
    public PackingType createPackingType() {
        return new PackingType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link PackingTypeType }
     * 
     */
    public PackingTypeType createPackingTypeType() {
        return new PackingTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itsco.com.br/ras2c/pas/receiptOrder", name = "receiptOrder")
    public JAXBElement<ReceiptOrderType> createReceiptOrder(ReceiptOrderType value) {
        return new JAXBElement<ReceiptOrderType>(_ReceiptOrder_QNAME, ReceiptOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itsco.com.br/ras2c/pas/receiptOrder", name = "item", scope = ItemType.class)
    public JAXBElement<ItemType> createItemTypeItem(ItemType value) {
        return new JAXBElement<ItemType>(_ItemTypeItem_QNAME, ItemType.class, ItemType.class, value);
    }

}
