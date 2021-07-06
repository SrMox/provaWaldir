package pergunta2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		PessoaFisica pf1 = new PessoaFisica("Vitor", "123456789-09", "01-01-2000");
		System.out.println("Original: " + pf1);
		
		PessoaFisica pf1Cloned;
		
		pf1Cloned = pf1.clone();
		System.out.println("Clone: " + pf1Cloned);
	}
}
