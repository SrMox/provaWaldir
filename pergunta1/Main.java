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
		
		System.out.println("Qual o m�s de nascimento? ");
		usuario.mesNascimento = sc.nextInt();
		
		try {
			if(usuario.idade > 0 && usuario.idade > 18 && usuario.idade < 100){
				System.out.println("Idade v�lida. ");
			}
			else {
				System.out.println("Idade Inv�lida... voc� n�o est� autorizado a entrar.");
			}
		}catch(Exception ex) {
			System.out.println("Erro");
		}
		
		try {
			if(usuario.anoNascimento > 1980 && usuario.anoNascimento < data.getYear()) {
				System.out.println("Ano de Nascimento v�lida. ");
			}else {
				System.out.println("Ano de Nascimento Inv�lido... voc� n�o est� autorizado a entrar.");
			}
			
		}catch(Exception ex) {
			System.out.println("Erro");
		}

		try {
			if(usuario.mesNascimento >= 1 && usuario.mesNascimento <= 12) {
				System.out.println("M�s de Nascimento v�lida. ");
			}else {
				System.out.println("M�s de Nascimento Inv�lido... voc� n�o est� autorizado a entrar.");
			}
			
		}catch(Exception ex) {
			System.out.println("Erro");
		}

		try {
			if(usuario.nome.isEmpty()) {
				System.out.println("Nome n�o inserido... voc� n�o est� autorizado a entrar.");
			}else {
				System.out.println("Nome v�lido. ");
			}
			
		}catch(Exception ex) {
			System.out.println("Erro");
		}
		finally {
			System.out.println("Finalizando Sistema.");
		}
	}

}
