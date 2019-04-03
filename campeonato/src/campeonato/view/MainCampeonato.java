package campeonato.view;

import java.util.Scanner;

import campeonato.model.*;
import campeonato.dao.*;

public class MainCampeonato {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		TimeDAO timedao = new TimeDAO();
		JogadorDAO jogadordao = new JogadorDAO();
		JogoDAO jogodao = new JogoDAO();
		
		int opcao = -1;

		while(opcao != 0){
			System.out.println("-------MENU---------");
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir Time");
			System.out.println("2 - Inserir Jogador");		
			System.out.println("3 - Inserir Jogo");
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o codigo do time:");
				int cod = dados.nextInt();
				dados = new Scanner(System.in);
				System.out.println("Digite o nome do time:");
				String nomeTime = dados.nextLine();
				System.out.println("Digite data fundação do time:");
				String datafundacao = dados.nextLine();
				Time time = new Time(cod,nomeTime, datafundacao);
				timedao.salvar(time);
				break;
			case 2:
				System.out.println("Digite o codigo do jogador");
				int cod2 = dados.nextInt();
				dados = new Scanner(System.in);
				System.out.println("Digite o nome do jogador");
				String nomeJogador = dados.nextLine();
				System.out.println("Digite a idade do jogador");
				int idade = dados.nextInt();
				dados = new Scanner(System.in);
				System.out.println("Digite o código do time do jogador");
				int codTime = dados.nextInt();
				Jogador jogador = new Jogador(cod2,nomeJogador, idade, codTime);
				jogadordao.salvar(jogador);
				break;
			case 3:
				System.out.println("Digite o codigo do jogo");
				int cod3 = dados.nextInt();
				dados = new Scanner(System.in);
				System.out.println("Digite o resultado do jogo");
				String resultado = dados.nextLine();
				System.out.println("Digite o código do time da casa");
				int time_a = dados.nextInt();
				dados = new Scanner(System.in);
				System.out.println("Digite o código do time visitante");
				int time_b = dados.nextInt();
				Jogo jogo = new Jogo(cod3, resultado, time_a, time_b);
				jogodao.salvar(jogo);
				break;
			}
			
			
			opcao = sc.nextInt();
		}

	}

}
