/**
 * Essa é classe cidade, colocaremos nelas apenas os atributos que reprenseta a cidade para o nosso problema.
 * Nessa aplicação ela terá a função semelhante a struct que utilizamos em C
 * */
public class Cidade { //obs toda as classes em Java começam com a letra maiscula
	
	//obs todos os atributos em java começam com letra maiscula e alternam para maisucla no meio do objeto.
	//obs 2, o private antes da variável é um modificador, esse modificador "privado" indica que apenas essa classe Cidade possui acesso aos  atributos.
	private Integer codigoCidade; //A classe Integer é uma evolução do tipo primitivo int, que encontramos em C e no próprio java.
	private String nomeCidade; // A classe String é uma evolução do char da linguagem C
	private Integer quantidadeVeiculo;
	private Integer quantidadeVitimas;
	
	/**
	 * Como indicado acima os atributos são privados, porém no java desenvolvemos métodos get() e set() para cada atributo, como o modificadores public "publicos"
	 * assim outras classes de outros pacotes tem acesso ao atributos atráves desses métodos.
	 * 
	 *  Se precisarmos por exemplo pegar o valor do codigo da cidade, utilizaremos o método getCodigoCidade().
	 *  
	 *  se precisarmos atribuir valor a ess atriburo, utlizaremos o método setCodigoCidade()
	 * */
	public Integer getCodigoCidade() {
		return codigoCidade;
	}
	
	public void setCodigoCidade(Integer codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	public Integer getQuantidadeVeiculo() {
		return quantidadeVeiculo;
	}
	
	public void setQuantidadeVeiculo(Integer quantidadeVeiculo) {
		this.quantidadeVeiculo = quantidadeVeiculo;
	}
	
	public Integer getQuantidadeVitimas() {
		return quantidadeVitimas;
	}
	
	public void setQuantidadeVitimas(Integer quantidadeVitimas) {
		this.quantidadeVitimas = quantidadeVitimas;
	}

	@Override
	public String toString() {
		return "Cidade [codigoCidade=" + codigoCidade + ", nomeCidade=" + nomeCidade + ", quantidadeVeiculo="
				+ quantidadeVeiculo + ", quantidadeVitimas=" + quantidadeVitimas + "]";
	}
	

}
