package jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WayToTheTop {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String resposta;
		System.out.println("NARRADOR::"
				+ "“Após alguns anos como Caporegime da família Fibonacci,\n"
				+ "o clima entre os mafiosos da região acaba esquentando, entre uma intriga e outra\n"
				+ "surge uma inimizade muito grande entre as famílias.\n"
				+ "Sua missão agora é ajudar o Don Nero a identificar a melhor forma de lidar com essa guerra iminente...\n"
				+ "Para tentar negociar com as famílias você precisa ir até o ponto de encontro para uma\n"
				+ "conversa com o chefe da máfia vizinha, encontre no plano cartesiano o único quadrante\n"
				+ "em que não tem nenhum ponto marcado, os pontos já marcados foram: A (2, 3), B (-1, 2), C (2, -3) e D (1, 0).“\n");
		
		List<String> alternativas = new ArrayList<String>(); //Ao iniciar uma rodada as questões serão apresentadas em uma nova ordem
		alternativas.add("[A - I]"); 
		alternativas.add("[B - II]");
		alternativas.add("[C - III]");
		alternativas.add("[D - IV]");
		
		Collections.shuffle(alternativas);
		System.out.println(alternativas);
		resposta = entrada.next();
		switch (resposta) {
		case "A":
		case "a":
		case "B": //resposta incorretas
		case "b":
		case "D":
		case "d":
			System.out.println("NARRADOR:\r\n"
					+ "“Você esta atrasado(a) paro o encontro e a máfia vizinha entende isso como uma afronta e inicou uma guerra... “\r\n"
					+ "“VOCÊ FALHOU!!“\n"
					+ "GAMER OVER");
			break;
		case "C": //resposta correta
		case "c":
			System.out.println("NARRADOR:\n"
					+ "“MUITO BOM! Você chegou até o ponto de encontro e discute o assunto com a máfia vizinha.”\r\n"
					+ "");
			System.out.println("MAFIOSO VIZINHO: \r\n"+ 
							"“Seus negócios tem crescido bastante e isso está nos afetando, como\n"
							+ "oferta de negociação para evitar problemas maiores pra vocês, peço que nos\n"
							+ "dê quatorze cassinos estratégicos. O que me diz?\r\n" + "");
			System.out.println("PERSONAGEM:\r\n" //usar varivel que guarda o nome da pesosnagem.
					+ "“Quatorze cassinos seriam o fim dos negócios do senhor Don, como eu estou neste momento representando-o,\n"
					+ " o que posso oferecer são cinco cassinos, caso não seja do seu agrado, pode iniciar a guerra que tanto\n"
					+ "deseja e veremos quem realmente sai perdendo!”\r\n" + "");
			System.out.println("MAFIOSO VIZINHO:\r\n"
					+ "“Eu aceito no mínimo dez, você acha que eu sou amador garoto? É isso ou nada feito.”\r\n ");
			System.out.println("NARRADOR: \r\n"
					+ "“O sniper que você contratou por precaução está a postos aguardando o sinal...\n"
					+ "Para dar o sinal selecione as outras duas coordenadas que representam a localização do sniper,\n"
					+ "sendo que uma das diagonais do quadrado tem extremidades A (1; 1) e C (3; 3).\n"
					+ "As coordenadas dos outros dois vértices são:“\r\n"
					+ "");
			List<String> alternativa = new ArrayList<String>(); //Ao iniciar uma rodada as questões serão apresentadas em uma nova ordem
			alternativa.add("[A - (2; 3) e (3; 2)]"); 													
			alternativa.add("[B - (3; 1) e (1; 3)]");  
			alternativa.add("[C - (3; 0) e (1; 4)]");
			alternativa.add("[D - (5; 2) e (4; 1)]");
			System.out.println(alternativa);
			resposta = entrada.next();
			
			switch(resposta) {
			case "A":
			case "a":
			case "C": //respostas incorretas
			case "c":
			case "D":
			case "d":
				
			System.out.println("NARRADOR:\r\n"
					+ "“Os seus inimigos perceberam seus olhares para o sniper no teto de uma casa abandonada e atira em seu peito. “\r\n"
					+ "VOCÊ FALHOU\n!!"
					+ "GAMER OVER\"\r\n"
					+ "");
			break;
			
			case "B": //resposta correta
			case "b":
				System.out.println("NARRADOR:\r\n"
						+ "\r\n"
						+ "“MUITO BOM!!!!\n"
						+ "O mafioso vizinho recebeu um tiro do habilidoso sniper que você contratou e morreu...\n"
						+ "Alguns dias após sua fuga do local a máfia começa a perder influência...\n"
						+ "Você está cada vez mais perto do seu objetivo, vamos para próxima missão...”\r\n"
						+ "");
				System.out.println("NARRADOR:\r\n"
						+ "“Voltando para a casa dos Fibonacci, o senhor Don anseia falar com você...”\r\n"
						+ "");
				System.out.println("DON:\r\n"
						+ "“Você está se saindo cada vez melhor (nome do personagem), é desse tipo de Caporegime" //usar variavel para guardar
																												 //o nome do personagem (menu)
						+ "que eu preciso ter ao meu lado!”\r\n"
						+ "");
				System.out.println("PERSONAGEM:" //usar varivel que guarda o nome da pesosnagem.
						+ "“Falando nisso senhor, quando eu poderei assumir um cargo como o seu?”");
				System.out.println("DON:\r\n"
						+ "“Não seja tão ambicioso, você já deve saber que o máximo que pode subir é até onde está, mais que isso"
						+ "eu teria que morrer!”\r\n"
						+ "");
				System.out.println("PERSONAGEM:" //usar varivel que guarda o nome da pesosnagem.
						+ "“Sim senhor, me desculpe, que bobagem a minha não? Posso lhe servir um copo um whiskey?”"); 
				System.out.println("NARRADOR: \r\n"
						+ "“Você prepara um copo de whiskey com gelo para o Don, como de costume, só que antes de servi-lo coloca o veneno\n"
						+ "que havia comprado... O chefe está desconfiado depois dessa conversa que você teve com ele, resolva o seguinte\n"
						+ "problema para persuadi-lo a tomar o whiskey...”\r\n"
						+ "");
				
			
				//continuação para a parte do Igor!
				
			entrada.close();
			}
		}
	}
}
