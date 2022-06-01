package jogo;
	import java.util.Scanner;
	import java.util.concurrent.TimeUnit;

	public class Main {
		static int temp_quick= 1, temp_menu = 25, temp_dialogo = 60, reputacao = 0;

		// ********************** IGOR ***************************************************************
		public static void main(String[] args) throws Exception {
			int ret_intro = 0;
			
			ret_intro = intro();
			
			if(ret_intro == 2) {
				epilogo();
				reputacao = capitulo1();
				capitulo1_1();

				capitulo1_2();
				
				capitulo2();
				
				capitulo2_1();

				capitulo3();
				
				capitulo4();	
				gameover(false);
			}
			
		}
		
		public static void MENS(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
	        for (char caractere : mensagem.toCharArray()) {
	        System.out.print(caractere);
	        unit.sleep(tempo_mensagem);
	        }
		}
		
		public static int menu() throws Exception {
			Scanner entrada = new Scanner(System.in);
			
			int escolha=0;
			System.out.println("\n");
			System.out.println("1 - Instruções");
			System.out.println("2 - Jogar");
			System.out.println("3 - Sobre o jogo");
			System.out.println("4 - Créditos");
			System.out.println("5 - Sair");
			escolha = entrada.nextInt();
			
			switch(escolha){
				case 1:
					MENS("Instruções do jogo:"
							+"\n"+"O jogo consiste em ser um RPG textual de baixa interação, onde todos os desafios apresentarão alternativas para o usuário e seu progresso será feito de acordo com sua escolha."
							+"\n"+"Com as alternativas na tela, basta digitar a letra correspodente a que você julgar correta.",TimeUnit.MILLISECONDS,temp_quick);
					break;
					
				case 2:
					MENS("Lembre-se, só o topo importa.... \n \n",TimeUnit.MILLISECONDS,temp_quick);
					break;
					
				case 3:
					MENS("Sobre o jogo:"
							+"\n"+"Um jovem que mora em um bairro pobre da cidade está com dificuldades financeiras e não consegue sustentar a si e a sua avó trabalhando apenas na padaria de sua família."
							+"\n"+"Sem saber o que fazer, ele decide tentar a vida do crime, e com em um assalto a uma loja local, conhece Nero, um membro da família Bianchi, conhecida por comandar a máfia da região."
							+"\n"+"Agora cabe a ele decidir se quer seguir na vida do crime e conquistar o seu prinicpal objetivo, se tornar o chefe do crime em sua cidade e conquistar uma vida melhor para ele e sua avó.",TimeUnit.MILLISECONDS,temp_quick);
					break;
					
				case 4:
					MENS("A Way to the Top é um RPG Textual idealizado e desenvolvido por:\n"
							+"Bruno Lima \n"
							+"Felipe Almeida \n"
							+"Gisella Meireli \n"
							+"Igor Lopes \n"
							+"Katia Sampaio \n"
							+"Alunos do 1º Semestre do curso de Análise e Desenvolimento de Sistemas - 2022 Turma A \n",TimeUnit.MILLISECONDS,temp_quick);
					break;
				case 5:
					System.out.println("Obrigado por jogar!");
					break;
				default:
					System.out.println("Selecione uma opção válida!\n");
			};
			
		
			return (escolha);
			
		}
		
		
		public static int intro() throws Exception {
			int ret=0;
			
			MENS("************************************************* \n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("*************** A Way to the Top ****************\n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("*************************************************\n",TimeUnit.MILLISECONDS,temp_quick);
			
			MENS("Um RPG textual que mistura Matemática a máfia italiana."
				+"\n"+"Está pronto para essa aventura?"
				+"\n"+"Se sim, Selecione uma das opções abaixo:",TimeUnit.MILLISECONDS,temp_quick);
			
			do {
				ret = menu();
			}while(ret != 2 && ret != 5);
			
			return ret;
		}
		
	// ************************ GISELLA ***********************************************************	
		public static void epilogo() throws InterruptedException {
			MENS("Sua vida andava difícil e o que você recebia ajudando a sua avó na padaria da família, mal servia para sustentar você,",TimeUnit.MILLISECONDS,temp_quick);
			MENS("ela, os 3 cachorros, 2 gatos e 6 periquitos barulhentos\rque moravam no pequeno kitnet da rua 3. ",TimeUnit.MILLISECONDS,temp_quick);
			MENS("Por isso, há pouco mais de 2 anos, você resolveu entrar para a quadrilha do bairro e com o passar do tempo, devido a seu grande nível de carisma,",TimeUnit.MILLISECONDS,temp_quick);
			MENS(" constituição, destreza e agilidade conquistou o cargo de\rchefe da organização criminal do bairro e sua principal fução agora é coordenar e gerenciar os principais cassinos do local. \r\n\n",TimeUnit.MILLISECONDS,temp_quick);
			
			MENS("Durante um belo dia de verão, enquanto você caminha em seu bairro nada bonito e nada amigável, você se depara com uma discussão acalorada na viela logo a frente: \n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("- Cara, eu já te disse, a gente precisa arrumar um jeito de ganhar dinheiro, aquele cassino meia boca da rua 7 é perfeito para isso, podemos roubar a grana toda\re os caras não teriam nem tempo de reagir! \n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("- Eu sei, eu sei.... mas como que nós vamos fazer isso, parceiro?\n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("- Seguinte, no dia 10, quando todo mundo já tiver torrado o dinheiro do salário naquele buraco, a gente entra em ação!",TimeUnit.MILLISECONDS,temp_quick);
			MENS(" Logo depois do pôr do sol, vamos até lá, colocamos aquele lugar abaixo e saímos felizes e faceiros com uns milhãozinhos nas malas. Não tem como dar errado! \n\n",TimeUnit.MILLISECONDS,temp_quick);
			
			MENS("Chocado com o que ouviu, você segue seu caminho, mas antes, para não ser reconhecido, cobre a cabeça com o capuz de seu moletom, aperta o passo e sai o mais rápido possível daquele lugar. \n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("Chegando em casa, você liga para todos os seus comparsas e avisa sobre o que está prestes a acontecer, monta uma estratégia para surpreender os malandros e frustrar os planos deles. \n",TimeUnit.MILLISECONDS,temp_quick);
			
			MENS("\n",TimeUnit.MILLISECONDS,temp_quick);
			System.out.println(",,,,,,,,,,,,");
			System.out.println("(҂⌣̀_⌣́)");
			System.out.println(" |  |っ");
			MENS("\n",TimeUnit.MILLISECONDS,temp_quick);		 
		 }	
		
		public static int capitulo1() throws InterruptedException {
			Scanner entrada = new Scanner(System.in);
			
			int rep = 0, opt = 0;
			String alt ="";
			
			do {
		    MENS("Para iniciar a sua missão, primeiramente, localize o caminho que você deve percorrer para chegar ao Cassino da rua 7, saindo da sua casa localizada na rua 3. \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("Dada a função f(x) = x2 + 10x + 9, encontre o valor da soma das coordenadas do vértice da parábola representada por ela.\n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("A) 21 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("B) 26 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("C) 10 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("D) 16 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("E) 20 \n",TimeUnit.MILLISECONDS,temp_quick);
		    alt = entrada.next();
		    
		    switch(alt.toUpperCase()){
		    	case "A":
		    		MENS("Parabéns, você localizou o melhor trajeto para chegar ao cassino da rua 7 e chegou a tempo para dar uma boa lição nos malandros e mostrar quem é quem manda. \n",TimeUnit.MILLISECONDS,temp_quick);
		    		// CHECAR
		    		rep = 10;
		    		opt = 1;
		    		break;
		    		
		    	case "B":
		    	case "C":
		    	case "D":
		    	case "E":
		    		MENS("Você está muito lento, os malandros já fizeram o assalto e sua credibilidade está abaixando gradativamente! \n",TimeUnit.MILLISECONDS,temp_quick);
		    		opt = 1;
		    		// CHECAR 
		    		rep = -10;
		    		break;
		    		
		    	default:
		    		System.out.println("Desculpe não entendi a sua escolha. \n");
		    		break;
		    }
			}while(opt == 0);
			
		    return rep;
		}

		public static boolean capitulo1_1() throws InterruptedException {
			Scanner entrada = new Scanner(System.in);
			
			boolean falha = false;
			String decisao = "", decisao1="";
			int opt = 0, opt1=0;
			
			do {
				MENS("Uma surpresa aconteceu, de última hora, sua avó decidiu te visitar no trabalho, como ela descobriu onde você estava? ",TimeUnit.MILLISECONDS,temp_quick);
				MENS("Nunca saberemos, mas agora você deve lidar com essa situação do melhor jeito possível, o que você faz?”\n\n",TimeUnit.MILLISECONDS,temp_quick);
				
				MENS("A) Nada, afinal, ninguém chamou aquela velha intrometida naquele lugar, ela deveria saber que algo assim não se faz e passar por essa situação é bom para ela aprender uma lição!\n",TimeUnit.MILLISECONDS,temp_quick);
			    MENS("B) Você corre para o esconderijo e encontra sua vó prestes a entrar..."
			    		+ " “Vó Nonna, você não deveria estar aqui hoje, nós estamos passando por uma.... uma... uma dedetização, por isso hoje não é um dia bom para visitas seria horrível você continuar aqui, vamos para casa! Me dê só um minuto! “\r\n"
			    		+ "\n",TimeUnit.MILLISECONDS,temp_quick);
			    decisao = entrada.next();
		    
			    switch(decisao.toUpperCase()){
			    	case "A":
			    		MENS("Que você era um gangster todo mundo sabia, mas que também te falta um coração, é novidade! \r\n"
			    				+ "Por conta dessa atitude, a sua avó acaba se envolvendo sem querer no meio do tiroteio e falece, seus comparsas perdem o respeito por você e te rebaixam a limpador de chão.\r\n",TimeUnit.MILLISECONDS,temp_quick);
			    		opt = 1;
			    		gameover(falha);
			    		break;
			    		
			    	case "B":
			    		MENS("Após essa desculpa, você pede um minuto e vai falar com o cara que você mais confia ali, passa instruções detalhadas para o caso de outros malandros aparecerem e volta para casa com a sua avó! \n",TimeUnit.MILLISECONDS,temp_quick);
			    		MENS("Pelo seu controle, rapidez e agilidade em lidar com o problema inesperado e capacidade em dar ordens e organizar toda a ação dos seus subordinados, a missão foi um sucesso!",TimeUnit.MILLISECONDS,temp_quick);
			    		MENS("Os ladrãozinhos foram pegos e tiveram um corretivo aplicado, eles não só nunca mais irão pensar em mexer em seus negócios, como também servirão de exemplo para outros espertinhos que possam ter a mesma ideia! \n \n",TimeUnit.MILLISECONDS,temp_quick);
			    		
			    		do {
				    		MENS("Seu sucesso chamou a atenção dos mafiosos do bairro e eles te fizeram um convite para ingressar na família, seu primeiro cargo será de: ASSOCIADO. \n",TimeUnit.MILLISECONDS,temp_quick);
				    		MENS("O que você responde? \n",TimeUnit.MILLISECONDS,temp_quick);
				    		MENS("A) Claro que eu aceito essa oportunidade, muito obrigada por essa honra! \n",TimeUnit.MILLISECONDS,temp_quick);
				    		MENS("B) *Com a voz tremendo* Não, não, muito obrigado, mas eu terei que recursar! É que... é que o meu trabalho aqui como coordenador desses cassinos já me faz muito feliz! rs! \n",TimeUnit.MILLISECONDS,temp_quick);
				    		decisao1 = entrada.next();
			    		
			    		 
			    			    switch(decisao1.toUpperCase()){
			    			    	case "A":
			    			    		MENS("Claro que eu aceito essa oportunidade, muito obrigada por essa honra! \n\n",TimeUnit.MILLISECONDS,temp_quick);
			    			    		opt1 = 1;
			    			    		break;
			    			    		
			    			    	case "B":
			    			    		MENS("Com essa decisão, você se mostra um mero covarde e continua sendo apenas um gangster qualquer, mais cedo ou mais tarde, acaba sendo preso e passando o resto da vida na cadeia! \n",TimeUnit.MILLISECONDS,temp_quick);
			    			    		gameover(falha);
			    			    		break;
			    			    		
			    			    	default:
			    			    		System.out.println("Desculpe não entendi a sua escolha.\n");
			    			    		opt1 = 0;
			    			    		break;
			    			    }
			    		}while(opt1 == 0);
			    		
			    		opt = 1;
			    		break;
			    		
			    	default:
			    		System.out.println("Desculpe não entendi a sua escolha.\n");
			    		opt = 0;
			    		break;
			    }
			}while(opt == 0);
			
		    return falha;
		}
		
		public static void capitulo1_2() throws InterruptedException {
			Scanner entrada = new Scanner(System.in);
			
			boolean falha = false;
			String decisao = "";
			int opt = 0;
			
			MENS("Você precisa mostrar para os Fibonacci que realmente conhece bem a região e vai lidar com facilidade com esse novo desafio. /n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("Mostre ao Don a melhor forma chegar a localização do cassino mais lucrativo utilizando funções... /n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("Conhecendo o valor da coordenada x do vértice de uma função do segundo grau f(x), qual é a melhor maneira de encontrar a outra coordenada desse mesmo ponto? /n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("A) Usar a fórmula: – Δ/2a \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("B) Substituir o valor da coordenada x do vértice no lugar de f(x). \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("C) Encontrar a média aritmética entre x e f(x). \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("D) Substituir o valor de x do vértice na função f(x) para encontrar a imagem desse ponto, que é a coordenada y do vértice. \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("E) NDA. \n",TimeUnit.MILLISECONDS,temp_quick);
		    decisao = entrada.next();
		    
		    do {
		    switch(decisao.toUpperCase()){
		    	case "D":
		    		MENS("Parabéns, você é bom mesmo! agora é um associado da família Fibonacci!",TimeUnit.MILLISECONDS,temp_quick);
		    		opt = 1;  		
		    		break;
		    
		    	case "A":
		    	case "B":
		    	case "C":
		    	case "E":
		    		MENS("Acho que você não é tão bom assim...",TimeUnit.MILLISECONDS,temp_quick);
		    		// CHECAR
		    		reputacao = reputacao - 10;
		    		opt = 1;
		    		break;
		    	default:
		    		System.out.println("Desculpe não entendi a sua escolha.\n");
		    		opt = 0;
		    		break;
		    }
			}while(opt == 0);
		}

	// ************************ FELIPE ***********************************************************
		public static void capitulo2() throws InterruptedException {
			introducao_cap2();
			boolean d1=desafio1();
			nara1(d1);
			gameover(d1);
			boolean d2=desafio2();
			boolean d3=desafio3();
			gameover(d3);
		}
		
		static void introducao_cap2() throws InterruptedException{
			MENS("2.Algum tempo se passou e sua vida como associado seguiu plena, até que um dia você foi chamado para cumprir uma missão no principal Cassino da cidade, todos sabem que lá a barra é pesada\n"
					+ "e que o dono é um informante da polícia, porém, dessa vez ele está querendo falar demais sobre um esquema de burlar as máquinas de caça-níquel dos salões de jogos.",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n\nCom esses dados em mãos, a polícia poderá prender todos os integrantes da família e se a informação vazar para a mídia, os investidores que ganham uma grande quantia de dinheiro com esses jogos\n"
					+ " ficariam muito irritados e uma guerra poderia se iniciar em sua cidade.",TimeUnit.MILLISECONDS,temp_quick);
		}
		
		static boolean desafio1() throws InterruptedException {
			boolean f=false;
			Scanner entrada = new Scanner(System.in);
			MENS("Sendo assim, encontre o vértice y para chegar ao local onde está o delator. Dado que a coordenada Xv da função f(x) = x^2 – 16x é 8."
					+ "\n[a] 64"
					+ "\n[b] 32"
					+ "\n[c] -64"
					+ "\n[d] -32"
					+ "\n[e] -128",TimeUnit.MILLISECONDS,temp_quick);
			char r=entrada.next().charAt(0);
			
			if (r=='c'||r=='C'){
				f=true;
			}else {
				f=false;
			}
			return f;
		}
		
		static boolean nara1(boolean a) throws InterruptedException {
			boolean f=false;
			if(a==false) {
				MENS("\nÉ amigo, sem as coordenadas corretas fica difícil achar o local onde está o delator!",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\nVocê perdeu muito tempo procurando no caminho errado e o delator fugiu!",TimeUnit.MILLISECONDS,temp_quick);
				f=false;
			}else {
				MENS("\nParabéns, você conseguiu as coordenadas corretas com o aviãozinho do bairro, agora encaminhe-se ao Cassino e encontre o delator para ter uma conversa 'amigável' com ele.",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n                                      ____",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n                                  _/_____ ]___",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n                 (Vroom!)        |_v'_] 0[###]0]",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n             ( __- -_= ) __-        `UJ-uJ—uJ ____ - ___ - ___ -___ -",TimeUnit.MILLISECONDS,temp_quick);
			  f=true;
			}
			  return f;
		}
		
		static boolean desafio2() throws InterruptedException {
			boolean f=false;
			int i=0;
			Scanner entrada = new Scanner(System.in);
			do {
				MENS("\nChegando no local, você repara que o clima está tenso, há uma energia pesada no ar, parece até que todos ali sabem o que você irá fazer, um dos seguranças do local te para e pergunta:",TimeUnit.MILLISECONDS,temp_quick);		
				MENS("\nSegurança:",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n- Você que é o novato do Nero?",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n[a] Sim, sou eu mesmo!",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n[b] Não, não sei nem quem é!",TimeUnit.MILLISECONDS,temp_quick);
				char a=entrada.next().charAt(0);
				if (a!='a'&&a!='A') {
					MENS("- Desculpe, me enganei! Acredito que você esteja no lugar errado meu parceiro, por isso saia daqui e volte de onde veio!",TimeUnit.MILLISECONDS,temp_quick);
					MENS("\nO que você está fazendo? como vai achar o delator agora? Volte e tente novamente!\n",TimeUnit.MILLISECONDS,temp_quick);
					f=false;
				}else if(a=='a'||a=='A'){
					MENS("\nSegurança:",TimeUnit.MILLISECONDS,temp_quick);
					MENS("\n- Me siga, sei exatamente quem você procura!",TimeUnit.MILLISECONDS,temp_quick);
					f=true;
					i=1;
				}
			}while(i==0);
				return f;
		}
		
		static boolean desafio3() throws InterruptedException {
			boolean f=false;
			Scanner entrada = new Scanner(System.in);
			MENS("\nO segurança te leva diretamente a sala dos fundos do Cassino, ao abrir a porta, você se depara com uma sala escura, com poucas cadeiras e em uma delas está o delator que você estava procurando,\n"
					+ "agora é hora da ação!",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n Selecione uma das opções:",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n[a] posicione-se a frente do delator e execute a tarefa suja a qual foi encarregado!",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n[b] Amarele de última hora, saia do local e volte para sua casa.",TimeUnit.MILLISECONDS,temp_quick);
			char a=entrada.next().charAt(0);
			if(a!='a'&&a!='A') {
				MENS("\nVocê não é páreo para esse tipo de serviço, volte para casa para assar biscoitos com a sua avó e nunca mais se meta nessas bandas!",TimeUnit.MILLISECONDS,temp_quick);
				f=false;
			}else if(a=='a'||a=='A') {
				MENS("\nPara sacar a arma você precisa resolver o seguinte problema...\n",TimeUnit.MILLISECONDS,temp_quick);
				f=true;
			}
			return f;
		}
		
		static void gameover(boolean a) throws InterruptedException {
			//Metodo para encerrar o código no meio.
			if (a==false) {
				MENS("\n*************************************************\n",TimeUnit.MILLISECONDS,temp_quick);
				MENS("*************** GAME OVER ***********************\n",TimeUnit.MILLISECONDS,temp_quick);
				MENS("*************************************************\n",TimeUnit.MILLISECONDS,temp_quick);
				System.exit(0);
			}
		}
		
		

	//******************************** BRUNO *****************************************************	
		public static void capitulo2_1() throws InterruptedException {
			Scanner input = new Scanner(System.in);
			int cont = 0;
			String alternativa;
			String alternativa2;
			boolean falha=false;
			do {
				MENS("Considerando que as raízes de uma função do segundo grau são x e y,"
						+ "selecione a alternativa correta:\n", TimeUnit.MILLISECONDS, temp_quick);
				MENS("[A] A coordenada y do vértice pode ser obtida somando as raízes.\n"
						+ "[B] A coordenada y do vértice é dada por f ([x + y] /2).\n"
						+ "[C] A coordenada x do vértice é a imagem da média aritmética entre as raízes na função.\n"
						+ "[E] A coordenada x do vértice é dada pela fórmula: (–Δ,4 )\n" + "[E] NDA.  ",
						TimeUnit.MILLISECONDS, temp_quick);
				alternativa = input.next();

				switch (alternativa) {

				case "a", "A", "c", "C", "d", "D", "e", "E":

					MENS("[NARRADOR] “Resposta errada, adivinha quem sacou a arma primeiro?", TimeUnit.MILLISECONDS,
							temp_quick);
					gameover(falha);
					cont++;
					if (cont < 3) {
						MENS("TENTE NOVAMENTE", TimeUnit.MILLISECONDS, temp_quick);
					} else {
						
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
						+ " Sua principal missão agora será cuidar da segurança da família do Don Bianchi.\r\n", TimeUnit.MILLISECONDS, temp_quick);
				break;

			case "NÃO", "não", "Não":
				MENS(" [MAFIOSOS] Você não é páreo para esse tipo de serviço, volte para casa para assar biscoitos\n"
						+ " com a sua avó Clotilde e nunca mais se meta nessas bandas!\n" + "\r [GAME OVER]\n",
						TimeUnit.MILLISECONDS, temp_quick);
				gameover(falha);
				break;
				}
		}
	//******************************** KÁTIA *****************************************************	
		public static void capitulo3() throws Exception {
			Scanner entrada = new Scanner(System.in);
			String resposta;
			boolean falha = false;
			MENS("NARRADOR:\r"
					+"Após alguns anos como Caporegime da família Fibonacci, o clima entre os mafiosos da região acaba esquentando"
					+ ", entre uma intriga e outra surge uma inimizade muito grande entre as famílias. \n"
					+ "Sua missão agora é ajudar o Don Nero a identificar a melhor forma de lidar com essa guerra iminente... \n"
					+ "Para tentar negociar com as famílias você precisa ir até o ponto de encontro para uma conversa com o chefe da máfia vizinha,\n"
					+ "encontre no plano cartesiano o único quadrante em que não tem nenhum ponto marcado, os pontos já marcados foram: "
					+ "\n A (2, 3), B (-1, 2), C (2, -3) e D (1, 0).\n\n",TimeUnit.MILLISECONDS,temp_quick);
			
			
			MENS("[A - I]\n"
				+"[B - II]\n"
				+"[C - III]\n"
				+"[D - IV]\n",TimeUnit.MILLISECONDS,temp_quick);

			resposta = entrada.next();
			
			switch (resposta) {
			case "A":
			case "a":
			case "B": // resposta incorretas
			case "b":
			case "D":
			case "d":
				
				MENS("NARRADOR:\r\n"
						+ "Você se atrasa paro o encontro e a máfia vizinha entende isso como uma afronta e inicia uma guerra...  \n" + 
						"GAMER OVER",TimeUnit.MILLISECONDS,temp_quick);
				gameover(falha);
				
				break;
			case "C": // resposta correta
			case "c":

				
				MENS("RESPOSTA CORRETA !\n",TimeUnit.MILLISECONDS,temp_quick);
				
				
				
				MENS("NARRADOR:\r\n"
						+ "Você chega até o ponto de encontro e discute o assunto com a máfia vizinha. \n"
						+ "",TimeUnit.MILLISECONDS,temp_quick);
				MENS("MAFIOSO VIZINHO: \r\n" + 
						"Seus negócios tem crescido bastante e isso está nos afetando, como oferta de negociação para evitar problemas maiores pra vocês,"
						+ " peço que você me dê quatorze cassinos estratégicos.\n"
						+ "O que me diz?" , TimeUnit.MILLISECONDS,temp_quick);
				
			
				MENS("PERSONAGEM:\r\n" // usar varivel que guarda o nome da pesosnagem.
						+ "Quatorze cassinos seriam o fim dos negócios do senhor Don, como eu estou neste momento representando-o, o que posso oferecer são cinco cassinos,\n"
						+ " caso não seja do seu agrado, pode iniciar a guerra que tanto deseja e veremos quem realmente sai perdendo!”", TimeUnit.MILLISECONDS,temp_quick);
				
			
				MENS("MAFIOSO VIZINHO:\r\n"
						+ "“Eu aceito no mínimo dez, você acha que eu sou amador garoto? É isso ou nada feito.” ", TimeUnit.MILLISECONDS,temp_quick);
				
				
				MENS("NARRADOR: \r\n"
						+ "“O sniper que você contratou por precaução está a postos aguardando o sinal...\n"
						+ "Para dar o sinal selecione as outras duas coordenadas que representam a localização do sniper, "
						+ "sendo que uma das diagonais do quadrado tem extremidades A (1; 1) e C (3; 3).\n"
						+ "As coordenadas dos outros dois vértices são: \n", TimeUnit.MILLISECONDS,temp_quick);

				
				
				MENS("[A - (2; 3) e (3; 2)]\n"
					+"[B - (3; 1) e (1; 3)]\n"
					+"[C - (3; 0) e (1; 4)]\n"
					+"[D - (5; 2) e (4; 1)]\n",TimeUnit.MILLISECONDS,temp_quick);
				
				resposta = entrada.next();
				
				switch (resposta) {
				case "A":
				case "a":
				case "C": // respostas incorretas
				case "c":
				case "D":
				case "d":
					
					
					MENS("RESPOSTA ERRADA !\r\n\n", TimeUnit.MILLISECONDS,temp_quick);
					MENS("NARRADOR:\r\n"
						+ "Os seus inimigos percebem seus olhares para o sniper no teto de uma casa abandonada e atira em seu peito.\n" +
						"GAMER OVER\"\r\n", TimeUnit.MILLISECONDS,temp_quick);
					gameover(falha);
					break;

				case "B": // resposta correta
				case "b":
					System.out.println("\n");
					
					
					MENS("RESPOSTA CORRETA !\r\n\n", TimeUnit.MILLISECONDS,temp_quick);
					MENS("NARRADOR:"
							+ "Muito bom! \n"
						+ " mafioso vizinho recebe um tiro do habilidoso sniper que você contratou e morre e alguns dias após sua fuga do local"
						+ " a máfia começa a perder influência... "
						+ "Você está cada vez mais perto do seu objetivo, vamos para a próxima missão. \n", TimeUnit.MILLISECONDS,temp_quick);
					
					
					MENS("NARRADOR:\r\n"
						+ "Voltando para a casa dos Fibonacci, o senhor Don anseia em falar com você...", TimeUnit.MILLISECONDS,temp_quick);
					MENS("DON:\r\n" + "Você está se saindo cada vez melhor,"
							+ " é desse tipo de Caporegime que eu preciso ter ao meu lado!\n" , TimeUnit.MILLISECONDS,temp_quick);
					MENS("PERSONAGEM:\r\n\n"
						+"Falando nisso senhor, quando eu poderei assumir um cargo como o seu?\n", TimeUnit.MILLISECONDS,temp_quick);
					
					
					MENS("DON:\r\n\n"
						+"Não seja tão ambicioso, você já deve saber que o máximo que pode subir é até onde está,"
						+ " mais que isso eu teria que morrer!"+"\r\n", TimeUnit.MILLISECONDS,temp_quick);
					
					MENS("PERSONAGEM:\r\n\n" 
						+ "Sim senhor, me desculpe, que bobagem a minha não? \n", TimeUnit.MILLISECONDS,temp_quick);
					
					
					MENS("NARRADOR: \r\n\n"
						+ "Você prepara um copo de whiskey com gelo para o Don, como de costume, só que antes de servi-lo coloca o veneno "
						+ "que havia comprado... O chefe está desconfiado depois dessa conversa que você teve com ele, resolva o seguinte\n"
						+ "problema para persuadi-lo a tomar o whiskey...\r\n" , TimeUnit.MILLISECONDS,temp_quick);
				}
			}

		}

	//******************************** IGOR *****************************************************
		
		public static void capitulo4() throws Exception {
			Scanner ent = new Scanner(System.in);
			int cont = 0;
			String alternativa ="";
			
			boolean f=false;
			
			do {
		    MENS("\nEm um paralelogramo, as coordenadas de três vértices consecutivos são, respectivamente, (1, 4), (-2, 6) e (0, 8). A soma das coordenadas do quarto vértice é: \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("A) 8 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("B) 9 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("C) 10 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("D) 11 \n",TimeUnit.MILLISECONDS,temp_quick);
		    MENS("E) 12 \n",TimeUnit.MILLISECONDS,temp_quick);

		    alternativa = ent.next();
		    
			    switch(alternativa.toUpperCase()){
			    	case "B":
			    		MENS("Don aceita o copo enveneado e morre, agora com a influência e os aliados que você tem pode governar os negócios como quiser! \n\n",TimeUnit.MILLISECONDS,temp_quick);
		
			    		MENS("Tempos depois olhando os antigos documentos da Família, você encontra uma foto do Don segurando um bebê ao lado de sua avó e uma mulher bonita que parecia muito com você, \n"
			    			+"no verso havia uma mensagem que dizia:\n“Don, cuide do nosso filho, pois eu não poderei aguentar esta vida triste que você pode me dar."+
			    			"Com amor de sua eterna amante.",TimeUnit.MILLISECONDS,temp_quick);
			    		cont = 1;
			    		break;
			    		
			    	case "A":
			    	case "C":
			    	case "D":
			    	case "E":
			    		MENS("Ele recusa e insiste que você prove o drink primeiro, como você sabe que o veneno que colocou é fatal, inventa desculpas e se recusa a tomar! Acho que você já sabe que o Don está ciente dos seus planos."+"\n"+"Game Over TRAIDOR!!!"+"\n",TimeUnit.MILLISECONDS,temp_quick);
			    		cont = 1;
			    		gameover(f);
			    		break;
			    		
			    	default:
			    		System.out.println("Desculpe não entendi a sua escolha. \n");
			    		cont = 0;
			    		break;
			    }
			}while(cont == 0);

		}
		
	}


