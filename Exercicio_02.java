package Exercicio_Condicional;

import java.util.Scanner;
//Importa��o da classe scanner para receber informa��es do usuario pelo console.//

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// CRIA��O DO OBJETO DE LEITURA DO TIPO SCANNER.//

		String rsp;
		// CRIA��O DA VARIAVEL "RSP" DO TIPO STRING.//

		System.out.print("Responda com Sim ou N�o Para Saber se Foi Aprovado.");
		// UTILIZA��O DA FUN��O "System.out.print" PARA IMPRIMIR UMA STRING FORMATADA
		// PARA O USUARIO.//

		System.out.printf("\nVoc� Foi Aprovado No Exame Psicot�cnico ? ");
		rsp = ler.nextLine();
		// AQUI VARIAVEL "RSP" EST� RECEBENDO "LER" COM O M�TODO "nextLine" PARA O
		// ESCANEAMENTO DO TECLADO. //

		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nVoc� Foi Aprovado No Exame de Legisla��o ? ");
			rsp = ler.nextLine();

		}
		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nVoc� Foi Aprovado no Exame de Dire��o ? ");
			rsp = ler.nextLine();

		}
		if (rsp.contains("sim") || rsp.contains("SIM") || rsp.contains("Sim") || rsp.contains("s")
				|| rsp.contains("S")) {
			System.out.printf("\nParab�ns Voc� Foi Aprovado!");
			rsp = ler.nextLine();

			// AQUI FORAM UTILIZADOS 3 "IF" PARA QUE SEMPRE QUE O VALOR DIGITADO PELO
			// USUARIO FOR (VERDADEIRO) O USUARIO SERA CONDUZIDO AO PROXIMO (IF). //
		} else
		// SE CASO O VALOR DIGITADO PELO USUARIO FOR (FALSO) A CHAVE DENTRO DA
		// CONDICIONAL ELSE SERA EXECUTADA. //
		{
			System.out.printf("\nVoc� N�o Foi Aprovado.");
			rsp = ler.next();

		}

		ler.close();
		// UTILIZAMOS O M�TODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.//

	}

}