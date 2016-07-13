//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.06 �s 04:37:54 PM BRT 
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

    private final static QName _Recebimento_QNAME = new QName("http://www.dfpc.eb.mil.br", "recebimento");
    private final static QName _ItemTypeItem_QNAME = new QName("http://www.dfpc.eb.mil.br", "item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecebimentoType }
     * 
     */
    public RecebimentoType createRecebimentoType() {
        return new RecebimentoType();
    }

    /**
     * Create an instance of {@link ProdutoType }
     * 
     */
    public ProdutoType createProdutoType() {
        return new ProdutoType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link TipoDeEmbalagemType }
     * 
     */
    public TipoDeEmbalagemType createTipoDeEmbalagemType() {
        return new TipoDeEmbalagemType();
    }

    /**
     * Create an instance of {@link EmbalagemType }
     * 
     */
    public EmbalagemType createEmbalagemType() {
        return new EmbalagemType();
    }

    /**
     * Create an instance of {@link ItensType }
     * 
     */
    public ItensType createItensType() {
        return new ItensType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecebimentoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dfpc.eb.mil.br", name = "recebimento")
    public JAXBElement<RecebimentoType> createRecebimento(RecebimentoType value) {
        return new JAXBElement<RecebimentoType>(_Recebimento_QNAME, RecebimentoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dfpc.eb.mil.br", name = "item", scope = ItemType.class)
    public JAXBElement<ItemType> createItemTypeItem(ItemType value) {
        return new JAXBElement<ItemType>(_ItemTypeItem_QNAME, ItemType.class, ItemType.class, value);
    }

}
