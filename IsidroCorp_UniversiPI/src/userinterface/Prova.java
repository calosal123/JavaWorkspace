package userinterface;

import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		//int valores[];
		
		//int valores[] = new int[10];

		// int valores[] = {1,2,3,4,5,6,7,8,9,10};
		
		QuestaoSimples provinha[] = new QuestaoSimples[5];
		int pontos;
		
		QuestaoSimples q1 = new QuestaoSimples("","");
		q1 = new QuestaoComDica("","","");
		q1 = new QuestaoMultiplaEscolha("","","","","","");
		
		provinha[0] = new QuestaoSimples("Quem Descobriu o Brasa?", "PA Cabral");
		provinha[1] = new QuestaoComDica("Qual a cor do cavalo branco do Napoleao?","Marrom","Não pense na cor");
		provinha[2] = new QuestaoMultiplaEscolha("Quanto vale 1+1","2","1","2","3","4");
		provinha[3] = new QuestaoSimples("Quem revelou o Kazuo?", "XV de Jau");
		provinha[4] = new QuestaoSimples("Como se pronuncia Wilson Mano em Jauense?","Irso Manu");
		
		pontos = 0;
		String respUsuario;
		
		/* imaginando um código sem usar herança e polimorfismo 
		for (int i=0; i<provinha.length; i++) {
			if (provinha[i] instanceof QuestaoSimples) {  // provinha na posição 'i' é do tipo QuestaoSimples?
				QuestaoSimples q = provinha[i];
				System.out.println(q.getEnunciado());
			}
			else if (provinha[i] instanceof QuestaoComDica) { // provinha na posicao 'i' é do tipo QuestaoComDica?
				QuestaoComDica q = (QuestaoComDica)provinha[i];
				System.out.println(q.getEnunciado()+" Dica: "+q.getDica());
			}
			else {  // só pode ser QuestaoMultiplaEscolha
				QuestaoMultiplaEscolha q = (QuestaoMultiplaEscolha)provinha[i];
				System.out.println(q.getEnunciado()+ "\n a)"+q.getA1()+"\n b)"+q.getA2()+"\n c)"+q.getA3()+"\n d)"+q.getA4());
			}
		}
		*/
		
//		for (QuestaoSimples q: provinha) {
		for (int pos=0; pos<provinha.length; pos++) {
			QuestaoSimples q = provinha[pos];     // q vale cada questão que foi instanciada no vetor	
			System.out.println(q.aplicarQuestao());
		}
//		}
		
		System.out.println("Voce acertou um total de "+pontos+" de "+provinha.length);
	}

}
