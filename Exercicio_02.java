package Exercicio_Condicional;

import java.util.Scanner;
//Importa��o da classe scanner para receber informa��es do usuario pelo console.//

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// CRIA��O DO OBJETO DE LEITURA DO TIPO SCANNER.//

		String rsp;
		// CRIA��O DA VARIAVEL "RSP" DO TIPO STRING.//

		System.out.printf(
				"Responda com Sim ou Nao Para Saber se Foi Aprovado.\nVoce Foi Aprovado No Exame Psicotecnico ? ");
		rsp = ler.nextLine();
		// UTILIZA��O DA FUN��O "System.out.print" PARA IMPRIMIR UMA STRING FORMATADA
		// PARA O USUARIO.//

		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nVoce Foi Aprovado No Exame de Legislacao ? ");
			rsp = ler.nextLine();

		}
		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nVoce Foi Aprovado no Exame de Direcao ? ");
			rsp = ler.nextLine();

		}
		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nParabens Voce Foi Aprovado!");

			// AQUI FORAM UTILIZADOS 3 "IF" PARA QUE SEMPRE QUE O VALOR DIGITADO PELO
			// USUARIO FOR (VERDADEIRO) O USUARIO SERA CONDUZIDO AO PROXIMO (IF). //
		} else
		// SE CASO O VALOR DIGITADO PELO USUARIO FOR (FALSO) A CHAVE DENTRO DA
		// CONDICIONAL ELSE SERA EXECUTADA. //
		{
			System.out.printf("\nVoce Nao Foi Aprovado.");

		}

		ler.close();
		// UTILIZAMOS O M�TODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.//

	}

}