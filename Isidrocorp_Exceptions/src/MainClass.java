import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String txt;
		int id;
		String desc;
		float preco;
		int opcao = 1;

		do {
			try {
				Produto p = new Produto();
				System.out.println("Digite o ID do produto");
				txt = teclado.nextLine();
				id = Integer.parseInt(txt);
				p.setId(id);

				System.out.println("Digite a Descricao");
				desc = teclado.nextLine();
				p.setDescricao(desc);

				System.out.println("Digite o preço");
				txt = teclado.nextLine();
				preco = Float.parseFloat(txt);
				p.setPreco(preco);

				System.out.println("CADASTRADO COM SUCESSO " + p);

				System.out.println("Continua? (1-sim / -1-não)");
				txt = teclado.nextLine();
				opcao = Integer.parseInt(txt);
			}
			catch(IsiException e) {
				System.out.println("ô meu/minha querido/a.. num quebra minhas perna! ");
				System.out.println(e.getMessage());
			}
			catch(NumberFormatException e) {
				System.out.println("Digite valores numericos");
			}
			catch(RuntimeException e) {
				System.out.println("ERRO de Cadastro "+e.getMessage());
			}
			catch (Exception ex) {
				System.out.println("Erro desconhecido"+ex.getMessage());
				System.out.println("Origem: "+ex.getClass().getName());
			}
		} while (opcao != -1);

	}

}
