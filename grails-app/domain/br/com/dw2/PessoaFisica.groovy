package br.com.dw2

class PessoaFisica extends Pessoa{
	
	String nome
	String cpf
	int anoNascimento
	
    static constraints = {
		//essa restrição nao vai deixar  o campo nome ficar em branco ou ser nulo
		nome blank:false ,nullable:false
		//essa restricao nao deixa cadastrar anoNascimento maior que 2014 e exibe aquela mensagem de erro
		anoNascimento validator: {
			if (anoNascimento>2014) return ['Ano de Nascimento  superior ao Atual']
			 }
    }
}
