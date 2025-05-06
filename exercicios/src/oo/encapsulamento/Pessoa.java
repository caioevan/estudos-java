package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobrenome;
	
	public Pessoa(String nome,String sobrenome,int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Getter (lê um atributo
	public int getIdade() {
		return idade;
	}
	
	//Setter (altera um atributo)
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >=0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}
	
	public String toString() {
		return "Olá, eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}
}
