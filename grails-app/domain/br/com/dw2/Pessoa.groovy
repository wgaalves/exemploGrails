package br.com.dw2

class Pessoa {
	//Relacionamento 1 para muitos com classe Contato
	static hasManyTo = [contato:Contato]
	
	//Grails reconhece  isso como um relacionamento 1 para 1
	Endereco endereco
	String emailPessoa
	
	//Aqui Ficam as constantes que podem restringir ou forcar a insercao de algum campo
	// mais exemplos na classe Pessoa Fisica e Juridica
    static constraints = {
		// restricao de formato de string forca  a colocarem um email valido
		emailPessoa email:true
    }
}
