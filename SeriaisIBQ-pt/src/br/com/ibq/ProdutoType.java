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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de produtoType complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDeEmbalagem" type="{http://www.dfpc.eb.mil.br}tipoDeEmbalagemType"/>
 *         &lt;element name="itens" type="{http://www.dfpc.eb.mil.br}itensType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="codigoProdutor" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="codigoProduto" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codigoR105" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="pesoLiquido" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pesoNec" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoType", propOrder = { "tipoDeEmbalagem", "itens" })
public class ProdutoType {

	@XmlElement(required = true)
	protected TipoDeEmbalagemType tipoDeEmbalagem;
	@XmlElement(required = true)
	protected ItensType itens;
	@XmlAttribute(name = "codigoPais")
	protected Short codigoPais;
	@XmlAttribute(name = "codigoProdutor")
	protected Short codigoProdutor;
	@XmlAttribute(name = "codigoProduto")
	protected Short codigoProduto;
	@XmlAttribute(name = "nome")
	protected String nome;
	@XmlAttribute(name = "codigoR105")
	protected Short codigoR105;
	@XmlAttribute(name = "pesoLiquido")
	protected Float pesoLiquido;
	@XmlAttribute(name = "pesoNec")
	protected Float pesoNec;
	@XmlAttribute(name = "pesoBruto")
	protected Float pesoBruto;

	/**
	 * Obt�m o valor da propriedade tipoDeEmbalagem.
	 * 
	 * @return possible object is {@link TipoDeEmbalagemType }
	 * 
	 */
	public TipoDeEmbalagemType getTipoDeEmbalagem() {
		return tipoDeEmbalagem;
	}

	/**
	 * Define o valor da propriedade tipoDeEmbalagem.
	 * 
	 * @param value
	 *            allowed object is {@link TipoDeEmbalagemType }
	 * 
	 */
	public void setTipoDeEmbalagem(TipoDeEmbalagemType value) {
		this.tipoDeEmbalagem = value;
	}

	/**
	 * Obt�m o valor da propriedade itens.
	 * 
	 * @return possible object is {@link ItensType }
	 * 
	 */
	public ItensType getItens() {
		return itens;
	}

	/**
	 * Define o valor da propriedade itens.
	 * 
	 * @param value
	 *            allowed object is {@link ItensType }
	 * 
	 */
	public void setItens(ItensType value) {
		this.itens = value;
	}

	/**
	 * Obt�m o valor da propriedade codigoPais.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCodigoPais() {
		return codigoPais;
	}

	/**
	 * Define o valor da propriedade codigoPais.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCodigoPais(Short value) {
		this.codigoPais = value;
	}

	/**
	 * Obt�m o valor da propriedade codigoProdutor.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCodigoProdutor() {
		return codigoProdutor;
	}

	/**
	 * Define o valor da propriedade codigoProdutor.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCodigoProdutor(Short value) {
		this.codigoProdutor = value;
	}

	/**
	 * Obt�m o valor da propriedade codigoProduto.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCodigoProduto() {
		return codigoProduto;
	}

	/**
	 * Define o valor da propriedade codigoProduto.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCodigoProduto(Short value) {
		this.codigoProduto = value;
	}

	/**
	 * Obt�m o valor da propriedade nome.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNome() {
		return nome.split(" ")[0]; // Retorna apenas o primeiro nome.
	}

	/**
	 * Define o valor da propriedade nome.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNome(String value) {
		this.nome = value;
	}

	/**
	 * Obt�m o valor da propriedade codigoR105.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCodigoR105() {
		return codigoR105;
	}

	/**
	 * Define o valor da propriedade codigoR105.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCodigoR105(Short value) {
		this.codigoR105 = value;
	}

	/**
	 * Obt�m o valor da propriedade pesoLiquido.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getPesoLiquido() {
		return pesoLiquido;
	}

	/**
	 * Define o valor da propriedade pesoLiquido.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setPesoLiquido(Float value) {
		this.pesoLiquido = value;
	}

	/**
	 * Obt�m o valor da propriedade pesoNec.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getPesoNec() {
		return pesoNec;
	}

	/**
	 * Define o valor da propriedade pesoNec.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setPesoNec(Float value) {
		this.pesoNec = value;
	}

	/**
	 * Obt�m o valor da propriedade pesoBruto.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getPesoBruto() {
		return pesoBruto;
	}

	/**
	 * Define o valor da propriedade pesoBruto.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setPesoBruto(Float value) {
		this.pesoBruto = value;
	}

}
