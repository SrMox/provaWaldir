package pergunta1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qual seu nome? ");
		usuario.nome = sc.nextLine();
		
		System.out.println("Qual sua idade? ");
		usuario.idade = sc.nextInt();
		
		System.out.println("Qual seu ano de nascimento? ");
		usuario.anoNascimento = sc.nextInt();
		
		System.out.println("Qual o mês de nascimento? ");
		usuario.mesNascimento = sc.nextInt();
		
		try {
			if(usuario.idade > 0 && usuario.idade > 18 && usuario.idade < 100){
				System.out.println("Idade válida. ");
			}
			else {
				System.out.println("Idade Inválida... você não está autorizado a entrar.");
			}
		}catch(Exception ex) {
			System.out.println("Erro");
		}
		
		try {
			if(usuario.anoNascimento > 1980 && usuario.anoNascimento < data.getYear()) {
				System.out.println("Ano de Nascimento válida. ");
			}else {
				System.out.println("Ano de Nascimento Inválido... você não está autorizado a entrar.");
			}
			
		}catch(Exception ex) {
			System.out.println("Erro");
		}

		try {
			if(usuario.mesNascimento >= 1 && usuario.mesNascimento <= 12) {
				System.out.println("Mês de Nascimento válida. ");
			}else {
				System.out.println("Mês de Nascimento Inválido... você não está autorizado a entrar.");
			}
			
		}catch(Exception ex) {
			System.out.println("Erro");
		}

		try {
			if(usuario.nome.isEmpty()) {
				System.out.println("Nome não inserido... você não está autorizado a entrar.");
			}else {
				System.out.println("Nome válido. ");
			}
			
		}catch(Exception ex) {
			System.out.println("Erro");
		}
		finally {
			System.out.println("Finalizando Sistema.");
		}
	}

}
