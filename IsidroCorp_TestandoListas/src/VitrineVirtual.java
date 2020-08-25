import java.util.ArrayList;
import java.util.Scanner;

public class VitrineVirtual {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		// agora não quero mais trabalhar com vetores, quero trabalhar com listas redimensionáveis
		
		// declaro um ArrayList tipificando-o como uma lista de um determinado tipo de Objeto: Produto
		ArrayList<Produto> lista;
		
		// crio a lista redimensionável:
		// o que ninguém fala: essa lista tem capacidade inicial de 10 posições. Se eu chegar na 10a posição
		// a própria VM cria um novo vetor com 50% da capacidade do vetor original, copia os valores e
		// permite que você utilize-o até a 15a posição. Isso é repetido, toda vez que alcança-se a 
		// capacidade atual da lista
		lista = new ArrayList<Produto>();
		
		
		// como fazer para adicionar novos produtos?
		lista.add(new Produto(1, "Computador     ", 2000));
		lista.add(new Produto(2, "Teclado        ", 100));
		lista.add(new Produto(3, "Mouse          ", 20));
		lista.add(new Produto(4, "Monitor        ", 500));
		lista.add(new Produto(5, "MousePad       ", 10));
		lista.add(new Produto(6, "Caixa de Som   ", 50));
		lista.add(new Produto(7, "Fone Blutute   ", 80));
		lista.add(new Produto(8, "Teclado Luzinha", 200));
		lista.add(new Produto(9, "Mouse Luzinha  ", 100));
		lista.add(new Produto(10, "Fone orelha gatinho", 500));
		lista.add(new Produto(11, "Cadeira Gamer", 1000));
		lista.add(new Produto(12, "Mousepad que cabe na mesa inteira", 100));
		
		Produto prod;
		for (int cont=0; cont<15; cont++) {
			prod = new Produto(cont, "Produto ", cont+1);
		}
		// quero forçar o bendito do GC a atuar
		System.gc();
		
		// como fazer para percorrer?????
		
		// maneira 1 - com contador de posições
//		for (int pos=0; pos<lista.size(); pos++) {
//			System.out.printf("%3d %-40s %7.2f\n", lista.get(pos).getId(), lista.get(pos).getDescricao(), lista.get(pos).getPreco());     
//		}
//		
//		// maneira 2 - com o famoso "forEACH" ou para os íntimos, for esquisito
		for (Produto p: lista) {
			System.out.printf("%3d %-40s %7.2f\n", p.getId(), p.getDescricao(), p.getPreco());
		}
		
	}

}
