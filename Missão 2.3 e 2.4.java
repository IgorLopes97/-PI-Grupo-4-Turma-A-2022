package Mission;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MissionTest2 {
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
			MENS("Considerando que as raízes de uma função do segundo grau são x e y,"
					+ "selecione a alternativa correta:", TimeUnit.MILLISECONDS, temp_quick);
			MENS("[A] A coordenada y do vértice pode ser obtida somando as raízes.\n"
					+ "[B] A coordenada y do vértice é dada por f ([x + y] /2).\n"
					+ "[C] A coordenada x do vértice é a imagem da média aritmética entre as raízes na função.\n"
					+ "[d] A coordenada x do vértice é dada pela fórmula: (– Delta,4 )\n" + "[e] NDA.  ",
					TimeUnit.MILLISECONDS, temp_quick);
			alternativa = input.next();

			switch (alternativa) {

			case "a", "A", "c", "C", "d", "D", "e", "E":

				MENS("[NARRADOR] “Resposta errada, adivinha quem sacou a arma primeiro?", TimeUnit.MILLISECONDS,
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
			MENS("[NARRADOR] “Você posiciona-se a frente do delator, saca a arma que\n"
					+ "lhe foi dada junto com a missão, executa o objetivo principal da sua visita e \n"
					+ "faz com que o infeliz delator se encontre com o único mal irremediável... a morte!\n",
					TimeUnit.MILLISECONDS, temp_quick);

			MENS("\r[NARRADOR] “Problema resolvido e a sua forma de solucionar a situação chamou a atenção\n"
					+ "dos mafiosos da região, os mesmos te convidaram para se tornar o Caporegime da família.\n",
					TimeUnit.MILLISECONDS, temp_quick);
			MENS("\rSua resposta é [Sim] ou [Não]", TimeUnit.MILLISECONDS, temp_quick);
		}
		alternativa2 = input.next();

		switch (alternativa2) {

		case "SIM", "sim", "Sim":
			MENS("[NARRADOR] Parabéns, você agora é o Caporegime da família Bianchi!\n"
					+ " Sua principal missão agora será cuidar da segurança da família do Don Bianchi.\r\n"
					+ "\r[Segue para próxima fase]\n", TimeUnit.MILLISECONDS, temp_quick);
			break;

		case "NÃO", "não", "Não":
			MENS(" [MAFIOSOS] Você não é páreo para esse tipo de serviço, volte para casa para assar biscoitos\n"
					+ " com a sua avó Clotilde e nunca mais se meta nessas bandas!\n" + "\r [GAME OVER]\n",
					TimeUnit.MILLISECONDS, temp_quick);
			break;
			}
		}
	}

}
