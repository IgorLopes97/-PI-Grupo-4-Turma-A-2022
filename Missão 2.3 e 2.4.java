package Mission;

import java.util.Scanner;

public class MissaoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cont = 0;
		String alternativa;
		String alternativa2;
		do {
			System.out.println("Considerando que as raízes de uma função do segundo grau são x e y, \n"
					+ "selecione a alternativa correta:");
			System.out.println("[A] A coordenada y do vértice pode ser obtida somando as raízes.\n"
					+ "[B] A coordenada y do vértice é dada por f ([x + y] /2).\n"
					+ "[C] A coordenada x do vértice é a imagem da média aritmética entre as raízes na função.\n"
					+ "[d] A coordenada x do vértice é dada pela fórmula: (– Delta,4 )\n" + "[e] NDA.  ");
			alternativa = input.next();

			switch (alternativa) {

			case "a", "A", "c", "C", "d", "D", "e", "E":

				System.out.println("[NARRADOR] “Resposta errada, adivinha quem sacou a arma primeiro?”");

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
			System.out.println("[NARRADOR] “Você posiciona-se a frente do delator, saca a arma que\n"
					+ "lhe foi dada junto com a missão, executa o objetivo principal da sua visita e \n"
					+ "faz com que o infeliz delator se encontre com o único mal irremediável... a morte!\n");
		
		System.out.println("\r[NARRADOR] “Problema resolvido e a sua forma de solucionar a situação chamou a atenção\n"
				+ "dos mafiosos da região, os mesmos te convidaram para se tornar o Caporegime da família.””");
		System.out.println("\rSua resposta é [Sim] ou [Não]");
		}
		alternativa2 = input.next();

		switch (alternativa2) {

		case "SIM", "sim", "Sim":
			System.out.println("[NARRADOR] Parabéns, você agora é o Caporegime da família Bianchi!\n"
					+ " Sua principal missão agora será cuidar da segurança da família do Don Bianchi.\r\n"
					+ "\r[Segue para próxima fase]\n");
			break;

		case "NÃO", "não", "Não":
			System.out.println(
					" [MAFIOSOS] Você não é páreo para esse tipo de serviço, volte para casa para assar biscoitos\n"
							+ " com a sua avó Clotilde e nunca mais se meta nessas bandas!\n" + "\r [GAME OVER]");
			break;

		}
	}
}