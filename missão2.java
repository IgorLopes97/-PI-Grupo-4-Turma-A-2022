import java.util.Scanner;
public class miss�o2 {
	static void introdu��o(){
		System.out.println("2.	Algum tempo se passou e sua vida como associado seguiu plena, at� que um dia voc� foi chamado para cumprir uma miss�o no principal Cassino da cidade, todos sabem que l� a barra � pesada\n"
				+ "e que o dono � um informante da pol�cia, por�m, dessa vez ele est� querendo falar demais sobre um esquema de burlar as m�quinas de ca�a-n�quel dos sal�es de jogos.");
		System.out.println("Com esses dados em m�os, a pol�cia poder� prender todos os integrantes da fam�lia e se a informa��o vazar para a m�dia, os investidores que ganham uma grande quantia de dinheiro com esses jogos\n"
				+ " ficariam muito irritados e uma guerra poderia se iniciar em sua cidade.");
	}
	static boolean desafio1() {
		boolean f=false;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sendo assim, encontre o v�rtice y para chegar ao local onde est� o delator. Dado que a coordenada Xv da fun��o f(x) = x^2 � 16x � 8.");
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
			System.out.println("� amigo, sem as coordenadas corretas fica dif�cil achar o local onde est� o delator!");
			System.out.println("Voc� perdeu muito tempo procurando no caminho errado e o delator fugiu!");
			f=false;
		}else {
			System.out.println("Narrador:");
			System.out.println("Parab�ns, voc� conseguiu as coordenadas corretas com o avi�ozinho do bairro, agora encaminhe-se ao Cassino e encontre o delator para ter uma conversa 'amig�vel' com ele.");
		System.out.println("                                      ____");
		  System.out.println("                                  _/_____ ]___");
		  System.out.println("                 (Vroom!)        |_v'_] 0[###]0]");
		  System.out.println("             ( __- -_= ) __-        `UJ-uJ�uJ ____ - ___ - ___ -___ -");
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
			System.out.println("Chegando no local, voc� repara que o clima est� tenso, h� uma energia pesada no ar, parece at� que todos ali sabem o que voc� ir� fazer, um dos seguran�as do local te para e pergunta:");		
			System.out.println("Seguran�a:");
			System.out.println("- Voc� que � o [nome_personagem]?");
			System.out.println("[a] Sim, sou eu mesmo!");
			System.out.println("[b] N�o, n�o sei nem quem �!");
			char a=entrada.next().charAt(0);
			if (a!='a'&&a!='A') {
				System.out.println("- Desculpe, me enganei! Acredito que voc� esteja no lugar errado meu parceiro, por isso saia daqui e volte de onde veio!");
				System.out.println("Narrador:");
				System.out.println("O que voc� est� fazendo? como vai achar o delator agora? Volte e tente novamente!");
				f=false;
			}else if(a=='a'||a=='A'){
				System.out.println("Seguran�a:");
				System.out.println("- Me siga, sei exatamente quem voc� procura!");
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
		System.out.println("O seguran�a te leva diretamente a sala dos fundos do Cassino, ao abrir a porta, voc� se depara com uma sala escura, com poucas cadeiras e em uma delas est� o delator que voc� estava procurando,\n"
				+ " agora � hora da a��o!");
		System.out.println("Selecione uma das op��es:");
		System.out.println("[a] posicione-se a frente do delator e execute a tarefa suja a qual foi encarregado!");
		System.out.println("[b] Amarele de �ltima hora, saia do local e volte para sua casa.");
		char a=entrada.next().charAt(0);
		if(a!='a'&&a!='A') {
			System.out.println("Narrador:");
			System.out.println("Voc� n�o � p�reo para esse tipo de servi�o, volte para casa para assar biscoitos com a sua av� e nunca mais se meta nessas bandas!");
			f=false;
		}else if(a=='a'||a=='A') {
			System.out.println("Narrador:");
			System.out.println("Para sacar a arma voc� precisa resolver o seguinte problema...");
			f=true;
		}
		return f;
	}
	static void gameover(boolean a) {
		//Metodo para encerrar o c�digo no meio.
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
		introdu��o();
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