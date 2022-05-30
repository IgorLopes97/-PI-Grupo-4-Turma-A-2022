import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class miss�o2 {
	static int temp_quick= 1, temp_menu = 25, temp_dialogo = 60, reputacao = 0;
	
	public static void MENS(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
	}
	
	static void introdu��o() throws InterruptedException{
		MENS("2.Algum tempo se passou e sua vida como associado seguiu plena, at� que um dia voc� foi chamado para cumprir uma miss�o no principal Cassino da cidade, todos sabem que l� a barra � pesada\n"
				+ "e que o dono � um informante da pol�cia, por�m, dessa vez ele est� querendo falar demais sobre um esquema de burlar as m�quinas de ca�a-n�quel dos sal�es de jogos.",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\nCom esses dados em m�os, a pol�cia poder� prender todos os integrantes da fam�lia e se a informa��o vazar para a m�dia, os investidores que ganham uma grande quantia de dinheiro com esses jogos\n"
				+ " ficariam muito irritados e uma guerra poderia se iniciar em sua cidade.",TimeUnit.MILLISECONDS,temp_quick);
	}
	
	static boolean desafio1() throws InterruptedException {
		boolean f=false;
		Scanner entrada = new Scanner(System.in);
		MENS("Sendo assim, encontre o v�rtice y para chegar ao local onde est� o delator. Dado que a coordenada Xv da fun��o f(x) = x^2 � 16x � 8."
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
			MENS("\n� amigo, sem as coordenadas corretas fica dif�cil achar o local onde est� o delator!",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\nVoc� perdeu muito tempo procurando no caminho errado e o delator fugiu!",TimeUnit.MILLISECONDS,temp_quick);
			f=false;
		}else {
			MENS("\nParab�ns, voc� conseguiu as coordenadas corretas com o avi�ozinho do bairro, agora encaminhe-se ao Cassino e encontre o delator para ter uma conversa 'amig�vel' com ele.",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n                                      ____",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n                                  _/_____ ]___",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n                 (Vroom!)        |_v'_] 0[###]0]",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n             ( __- -_= ) __-        `UJ-uJ�uJ ____ - ___ - ___ -___ -",TimeUnit.MILLISECONDS,temp_quick);
		  f=true;
		}
		  return f;
	}
	
	static boolean desafio2() throws InterruptedException {
		boolean f=false;
		int i=0;
		Scanner entrada = new Scanner(System.in);
		do {
			MENS("\nChegando no local, voc� repara que o clima est� tenso, h� uma energia pesada no ar, parece at� que todos ali sabem o que voc� ir� fazer, um dos seguran�as do local te para e pergunta:",TimeUnit.MILLISECONDS,temp_quick);		
			MENS("\nSeguran�a:",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n- Voc� que � o [nome_personagem]?",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n[a] Sim, sou eu mesmo!",TimeUnit.MILLISECONDS,temp_quick);
			MENS("\n[b] N�o, n�o sei nem quem �!",TimeUnit.MILLISECONDS,temp_quick);
			char a=entrada.next().charAt(0);
			if (a!='a'&&a!='A') {
				MENS("- Desculpe, me enganei! Acredito que voc� esteja no lugar errado meu parceiro, por isso saia daqui e volte de onde veio!",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\nO que voc� est� fazendo? como vai achar o delator agora? Volte e tente novamente!\n",TimeUnit.MILLISECONDS,temp_quick);
				f=false;
			}else if(a=='a'||a=='A'){
				MENS("\nSeguran�a:",TimeUnit.MILLISECONDS,temp_quick);
				MENS("\n- Me siga, sei exatamente quem voc� procura!",TimeUnit.MILLISECONDS,temp_quick);
				f=true;
				i=1;
			}
		}while(i==0);
			return f;
	}
	
	static boolean desafio3() throws InterruptedException {
		boolean f=false;
		Scanner entrada = new Scanner(System.in);
		MENS("\n O seguran�a te leva diretamente a sala dos fundos do Cassino, ao abrir a porta, voc� se depara com uma sala escura, com poucas cadeiras e em uma delas est� o delator que voc� estava procurando,\n"
				+ " agora � hora da a��o!",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\n Selecione uma das op��es:",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\n [a] posicione-se a frente do delator e execute a tarefa suja a qual foi encarregado!",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\n[b] Amarele de �ltima hora, saia do local e volte para sua casa.",TimeUnit.MILLISECONDS,temp_quick);
		char a=entrada.next().charAt(0);
		if(a!='a'&&a!='A') {
			MENS("\nVoc� n�o � p�reo para esse tipo de servi�o, volte para casa para assar biscoitos com a sua av� e nunca mais se meta nessas bandas!",TimeUnit.MILLISECONDS,temp_quick);
			f=false;
		}else if(a=='a'||a=='A') {
			MENS("\nPara sacar a arma voc� precisa resolver o seguinte problema...",TimeUnit.MILLISECONDS,temp_quick);
			f=true;
		}
		return f;
	}
	
	static void gameover(boolean a) throws InterruptedException {
		//Metodo para encerrar o c�digo no meio.
		if (a==false) {
			MENS("\n*************************************************\n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("*************** GAME OVER ***********************\n",TimeUnit.MILLISECONDS,temp_quick);
			MENS("*************************************************\n",TimeUnit.MILLISECONDS,temp_quick);
			System.exit(0);
		}
	}
	
	public static void aguarde() throws InterruptedException { 
		Scanner s = new Scanner(System.in);		
		for (int i = 0; i < 1; i++) {
			MENS("\nPrecione ENTER para continuar: ",TimeUnit.MILLISECONDS,temp_quick);			
			s.nextLine();
		}
	}
	
	public static void limpatela() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void main(String[]args) throws InterruptedException{
		introdu��o();
		aguarde();
		boolean d1=desafio1();
		nara1(d1);
		gameover(d1);
		boolean d2=desafio2();
		aguarde();
		boolean d3=desafio3();
		gameover(d3);
		
	}
}