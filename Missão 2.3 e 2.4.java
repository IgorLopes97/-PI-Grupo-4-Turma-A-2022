package Mission;

import java.util.Scanner;

public class MissaoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cont = 0;
		String alternativa;
		String alternativa2;
		do {
			System.out.println("Considerando que as ra�zes de uma fun��o do segundo grau s�o x e y, \n"
					+ "selecione a alternativa correta:");
			System.out.println("[A] A coordenada y do v�rtice pode ser obtida somando as ra�zes.\n"
					+ "[B] A coordenada y do v�rtice � dada por f ([x + y] /2).\n"
					+ "[C] A coordenada x do v�rtice � a imagem da m�dia aritm�tica entre as ra�zes na fun��o.\n"
					+ "[d] A coordenada x do v�rtice � dada pela f�rmula: (� Delta,4 )\n" + "[e] NDA.  ");
			alternativa = input.next();

			switch (alternativa) {

			case "a", "A", "c", "C", "d", "D", "e", "E":

				System.out.println("[NARRADOR] �Resposta errada, adivinha quem sacou a arma primeiro?�");

				cont++;
				if (cont < 3) {
					System.out.println("TENTE NOVAMENTE");
				} else {
					System.out.println("GAME OVER!");
					
				}
				break;

			}
		} while (!alternativa.equalsIgnoreCase("b")&& !alternativa.equalsIgnoreCase("B")&& cont < 3);

		switch (alternativa) {

		case "b", "B":
			System.out.println("[NARRADOR] �Voc� posiciona-se a frente do delator, saca a arma que\n"
					+ "lhe foi dada junto com a miss�o, executa o objetivo principal da sua visita e \n"
					+ "faz com que o infeliz delator se encontre com o �nico mal irremedi�vel... a morte!\n");
		
		System.out.println("\r[NARRADOR] �Problema resolvido e a sua forma de solucionar a situa��o chamou a aten��o\n"
				+ "dos mafiosos da regi�o, os mesmos te convidaram para se tornar o Caporegime da fam�lia.��");
		System.out.println("\rSua resposta � [Sim] ou [N�o]");
		}
		alternativa2 = input.next();

		switch (alternativa2) {

		case "SIM", "sim", "Sim":
			System.out.println("[NARRADOR] Parab�ns, voc� agora � o Caporegime da fam�lia Bianchi!\n"
					+ " Sua principal miss�o agora ser� cuidar da seguran�a da fam�lia do Don Bianchi.\r\n"
					+ "\r[Segue para pr�xima fase]\n");
			break;

		case "N�O", "n�o", "N�o":
			System.out.println(
					" [MAFIOSOS] Voc� n�o � p�reo para esse tipo de servi�o, volte para casa para assar biscoitos\n"
							+ " com a sua av� Clotilde e nunca mais se meta nessas bandas!\n" + "\r [GAME OVER]");
			break;

		}
	}
}