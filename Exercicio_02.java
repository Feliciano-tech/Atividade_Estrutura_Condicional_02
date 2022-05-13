package Exercicio_Condicional;

import java.util.Scanner;
//Importação da classe scanner para receber informações do usuario pelo console.//

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// CRIAÇÃO DO OBJETO DE LEITURA DO TIPO SCANNER.//

		String rsp;
		// CRIAÇÃO DA VARIAVEL "RSP" DO TIPO STRING.//

		System.out.print("Responda com Sim ou Não Para Saber se Foi Aprovado.");
		// UTILIZAÇÃO DA FUNÇÃO "System.out.print" PARA IMPRIMIR UMA STRING FORMATADA
		// PARA O USUARIO.//

		System.out.printf("\nVocê Foi Aprovado No Exame Psicotécnico ? ");
		rsp = ler.nextLine();
		// AQUI VARIAVEL "RSP" ESTÁ RECEBENDO "LER" COM O MÉTODO "nextLine" PARA O
		// ESCANEAMENTO DO TECLADO. //

		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nVocê Foi Aprovado No Exame de Legislação ? ");
			rsp = ler.nextLine();

		}
		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nVocê Foi Aprovado no Exame de Direção ? ");
			rsp = ler.nextLine();

		}
		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nParabéns Você Foi Aprovado!");
			rsp = ler.nextLine();

			// AQUI FORAM UTILIZADOS 3 "IF" PARA QUE SEMPRE QUE O VALOR DIGITADO PELO
			// USUARIO FOR (VERDADEIRO) O USUARIO SERA CONDUZIDO AO PROXIMO (IF). //
		} else
		// SE CASO O VALOR DIGITADO PELO USUARIO FOR (FALSO) A CHAVE DENTRO DA
		// CONDICIONAL ELSE SERA EXECUTADA. //
		{
			System.out.printf("\nVocê Não Foi Aprovado.");
			rsp = ler.next();

		}

		ler.close();
		// UTILIZAMOS O MÉTODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.//

	}

}