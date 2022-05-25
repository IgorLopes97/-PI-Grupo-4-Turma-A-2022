import java.util.Scanner;
public class missão2 {
	static void introdução(){
		System.out.println("2.	Algum tempo se passou e sua vida como associado seguiu plena, até que um dia você foi chamado para cumprir uma missão no principal Cassino da cidade, todos sabem que lá a barra é pesada\n"
				+ "e que o dono é um informante da polícia, porém, dessa vez ele está querendo falar demais sobre um esquema de burlar as máquinas de caça-níquel dos salões de jogos.");
		System.out.println("Com esses dados em mãos, a polícia poderá prender todos os integrantes da família e se a informação vazar para a mídia, os investidores que ganham uma grande quantia de dinheiro com esses jogos\n"
				+ " ficariam muito irritados e uma guerra poderia se iniciar em sua cidade.");
	}
	static boolean desafio1() {
		boolean f=false;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sendo assim, encontre o vértice y para chegar ao local onde está o delator. Dado que a coordenada Xv da função f(x) = x^2 – 16x é 8.");
		System.out.println("[a] 64");
		System.out.println("[b] 32");
		System.out.println("[c] -64");
		System.out.println("[d] -32");
		System.out.println("[e] -128");
		char r=entrada.next().charAt(0);
		
		if (r=='c'||r=='C'){
			f=true;
		}else {
			f=false;
		}
		return f;
	}
	static boolean nara1(boolean a) {
		boolean f=false;
		if(a==false) {
			System.out.println("Narrador:");
			System.out.println("É amigo, sem as coordenadas corretas fica difícil achar o local onde está o delator!");
			System.out.println("Você perdeu muito tempo procurando no caminho errado e o delator fugiu!");
			f=false;
		}else {
			System.out.println("Narrador:");
			System.out.println("Parabéns, você conseguiu as coordenadas corretas com o aviãozinho do bairro, agora encaminhe-se ao Cassino e encontre o delator para ter uma conversa 'amigável' com ele.");
		System.out.println("                                      ____");
		  System.out.println("                                  _/_____ ]___");
		  System.out.println("                 (Vroom!)        |_v'_] 0[###]0]");
		  System.out.println("             ( __- -_= ) __-        `UJ-uJ—uJ ____ - ___ - ___ -___ -");
		  f=true;
		}
		  return f;
	}
	static boolean desafio2() {
		boolean f=false;
		int i=0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Narrador:");
			System.out.println("Chegando no local, você repara que o clima está tenso, há uma energia pesada no ar, parece até que todos ali sabem o que você irá fazer, um dos seguranças do local te para e pergunta:");		
			System.out.println("Segurança:");
			System.out.println("- Você que é o [nome_personagem]?");
			System.out.println("[a] Sim, sou eu mesmo!");
			System.out.println("[b] Não, não sei nem quem é!");
			char a=entrada.next().charAt(0);
			if (a!='a'&&a!='A') {
				System.out.println("- Desculpe, me enganei! Acredito que você esteja no lugar errado meu parceiro, por isso saia daqui e volte de onde veio!");
				System.out.println("Narrador:");
				System.out.println("O que você está fazendo? como vai achar o delator agora? Volte e tente novamente!");
				f=false;
			}else if(a=='a'||a=='A'){
				System.out.println("Segurança:");
				System.out.println("- Me siga, sei exatamente quem você procura!");
				f=true;
				i=1;
			}
		}while(i==0);
			return f;
	}
	static boolean desafio3() {
		boolean f=false;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Narrador:");
		System.out.println("O segurança te leva diretamente a sala dos fundos do Cassino, ao abrir a porta, você se depara com uma sala escura, com poucas cadeiras e em uma delas está o delator que você estava procurando,\n"
				+ " agora é hora da ação!");
		System.out.println("Selecione uma das opções:");
		System.out.println("[a] posicione-se a frente do delator e execute a tarefa suja a qual foi encarregado!");
		System.out.println("[b] Amarele de última hora, saia do local e volte para sua casa.");
		char a=entrada.next().charAt(0);
		if(a!='a'&&a!='A') {
			System.out.println("Narrador:");
			System.out.println("Você não é páreo para esse tipo de serviço, volte para casa para assar biscoitos com a sua avó e nunca mais se meta nessas bandas!");
			f=false;
		}else if(a=='a'||a=='A') {
			System.out.println("Narrador:");
			System.out.println("Para sacar a arma você precisa resolver o seguinte problema...");
			f=true;
		}
		return f;
	}
	static void gameover(boolean a) {
		//Metodo para encerrar o código no meio.
		if (a==false) {
			System.out.println("Game over");
			System.exit(0);
		}
	}
	public static void aguarde() { 
		Scanner s = new Scanner(System.in);		
		for (int i = 0; i < 1; i++) {
			System.out.print("Precione ENTER para continuar: ");			
			s.nextLine();
		}
	}
	public static void limpatela() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void main(String[]args){
		limpatela();
		introdução();
		aguarde();
		limpatela();
		boolean d1=desafio1();
		nara1(d1);
		gameover(d1);
		limpatela();
		boolean d2=desafio2();
		aguarde();
		limpatela();
		boolean d3=desafio3();
		gameover(d3);
		
	}
}