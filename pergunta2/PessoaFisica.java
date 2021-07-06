package pergunta2;

public class PessoaFisica implements Cloneable{
	  private String nome;
	  private String cpf;
	  private String dataNasc;
	  
	  public PessoaFisica clone() throws CloneNotSupportedException{
		  return (PessoaFisica)super.clone();
	  }

	public PessoaFisica(String nome, String cpf, String dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "PessoaFisica \n nome=" + nome + "\n cpf=" + cpf + "\n dataNasc=" + dataNasc;
	}
	}