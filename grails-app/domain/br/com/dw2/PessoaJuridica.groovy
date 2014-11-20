package br.com.dw2

class PessoaJuridica extends Pessoa {
	
	String nomeFantasia
	String cnpj
	
    static constraints = {
		// restricao que diz que  a string nomeFantasia tem que ter tamanho entre 5 e 20 caracteres
		nomeFantasia size:5..20
    }
}
