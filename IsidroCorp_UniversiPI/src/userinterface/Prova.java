package userinterface;

import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples provinha[] = new QuestaoSimples[5];
		int pontos;
		
		provinha[0] = new QuestaoSimples("Quem Descobriu o Brasa?", "PA Cabral");
		provinha[1] = new QuestaoComDica("Qual a cor do cavalo branco do Napoleao?","Marrom","Não pense na cor");
		provinha[2] = new QuestaoMultiplaEscolha("Quanto vale 1+1","2","1","2","3","4");
		provinha[3] = new QuestaoSimples("Quem revelou o Kazuo?", "XV de Jau");
		provinha[4] = new QuestaoSimples("Como se pronuncia Wilson Mano em Jauense?","Irso Manu");
		
		pontos = 0;
		String respUsuario;
		
//		for (QuestaoSimples q: provinha) {
		for (int pos=0; pos<provinha.length; pos++) {
			QuestaoSimples q = provinha[pos];     // q vale cada questão que foi instanciada no vetor
            		
			System.out.println(q.aplicarQuestao());
			respUsuario = teclado.nextLine();
			if (q.corrigir(respUsuario)) {
				pontos++;
			}
		}
//		}
		
		System.out.println("Voce acertou um total de "+pontos+" de "+provinha.length);
	}

}
