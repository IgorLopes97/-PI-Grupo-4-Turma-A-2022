import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class missão2 {
	static int temp_quick= 1, temp_menu = 25, temp_dialogo = 60, reputacao = 0;
	
	public static void MENS(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
	}
	
	static void introdução() throws InterruptedException{
		MENS("2.Algum tempo se passou e sua vida como associado seguiu plena, até que um dia você foi chamado para cumprir uma missão no principal Cassino da cidade, todos sabem que lá a barra é pesada\n"
				+ "e que o dono é um informante da polícia, porém, dessa vez ele está querendo falar demais sobre um esquema de burlar as máquinas de caça-níquel dos salões de jogos.",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\nCom esses dados em mãos, a polícia poderá prender todos os integrantes da família e se a informação vazar para a mídia, os investidores que ganham uma grande quantia de dinheiro com esses jogos\n"
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
			MENS("\n- Você que é o [nome_personagem]?",TimeUnit.MILLISECONDS,temp_quick);
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
		MENS("\n O segurança te leva diretamente a sala dos fundos do Cassino, ao abrir a porta, você se depara com uma sala escura, com poucas cadeiras e em uma delas está o delator que você estava procurando,\n"
				+ " agora é hora da ação!",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\n Selecione uma das opções:",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\n [a] posicione-se a frente do delator e execute a tarefa suja a qual foi encarregado!",TimeUnit.MILLISECONDS,temp_quick);
		MENS("\n[b] Amarele de última hora, saia do local e volte para sua casa.",TimeUnit.MILLISECONDS,temp_quick);
		char a=entrada.next().charAt(0);
		if(a!='a'&&a!='A') {
			MENS("\nVocê não é páreo para esse tipo de serviço, volte para casa para assar biscoitos com a sua avó e nunca mais se meta nessas bandas!",TimeUnit.MILLISECONDS,temp_quick);
			f=false;
		}else if(a=='a'||a=='A') {
			MENS("\nPara sacar a arma você precisa resolver o seguinte problema...",TimeUnit.MILLISECONDS,temp_quick);
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
		introdução();
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