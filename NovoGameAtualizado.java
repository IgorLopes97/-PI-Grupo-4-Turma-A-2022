package Mission;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NovoGameAtualizado {
	static int temp_quick = 1, temp_menu = 25, temp_dialogo = 60;

	public static void MENS(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {

		for (char caractere : mensagem.toCharArray()) {
			System.out.println(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int cont = 0;
		String alternativa;
		String alternativa2;
		
		do {
			MENS("Considerando que as ra�zes de uma fun��o do segundo grau s�o x e y,"
					+ "selecione a alternativa correta:", TimeUnit.MILLISECONDS, temp_quick);
			MENS("[A] A coordenada y do v�rtice pode ser obtida somando as ra�zes.\n"
					+ "[B] A coordenada y do v�rtice � dada por f ([x + y] /2).\n"
					+ "[C] A coordenada x do v�rtice � a imagem da m�dia aritm�tica entre as ra�zes na fun��o.\n"
					+ "[d] A coordenada x do v�rtice � dada pela f�rmula: (� Delta,4 )\n" + "[e] NDA.  ",
					TimeUnit.MILLISECONDS, temp_quick);
			alternativa = input.next();

			switch (alternativa) {

			case "a", "A", "c", "C", "d", "D", "e", "E":

				MENS("Resposta errada, adivinha quem sacou a arma primeiro?", TimeUnit.MILLISECONDS,
						temp_quick);

				cont++;
				if (cont < 3) {
					MENS("TENTE NOVAMENTE", TimeUnit.MILLISECONDS, temp_quick);
				} else {
					MENS("GAME OVER!", TimeUnit.MILLISECONDS, temp_quick);

				}
				break;
			
			}
		} while (!alternativa.equalsIgnoreCase("b") && !alternativa.equalsIgnoreCase("B") && cont < 3);

		switch (alternativa) {

		case "b", "B":
			MENS("Voc� posiciona-se a frente do delator, saca a arma que\n"
					+ "lhe foi dada junto com a miss�o, executa o objetivo principal da sua visita e \n"
					+ "faz com que o infeliz delator se encontre com o �nico mal irremedi�vel... a morte!\n",
					TimeUnit.MILLISECONDS, temp_quick);

			MENS("Problema resolvido e a sua forma de solucionar a situa��o chamou a aten��o dos mafiosos\n"
					+ "da regi�o, os mesmos te convidaram para se tornar o Caporegime da fam�lia.\n",
					TimeUnit.MILLISECONDS, temp_quick);
			MENS("\rSua resposta � [Sim] ou [N�o]", TimeUnit.MILLISECONDS, temp_quick);
		}
		alternativa2 = input.next();

		switch (alternativa2) {

		case "SIM", "sim", "Sim":
			MENS("Parab�ns, voc� agora � o Caporegime da fam�lia Bianchi!\n"
					+ " Sua principal miss�o agora ser� cuidar da seguran�a da fam�lia do Don Bianchi.\r\n"
					+ "\r[Segue para pr�xima fase]\n", TimeUnit.MILLISECONDS, temp_quick);
			break;

		case "N�O", "n�o", "N�o":
			MENS(" [MAFIOSOS] Voc� n�o � p�reo para esse tipo de servi�o, volte para casa para assar biscoitos\n"
					+ " com a sua av� Clotilde e nunca mais se meta nessas bandas!\n" + "\r [GAME OVER]\n",
					TimeUnit.MILLISECONDS, temp_quick);
			break;
			}
		}
	}
}
