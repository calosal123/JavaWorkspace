package userinterface;

import core.Produto;

public class Loja {
	public static void main(String args[]) {
		Produto p1, p2;
		
		p1 = new Produto(1,"Computador","Computador master mega top da balada", 2000.0f);
		p2 = new Produto(2,"Mouse     ", "Mouse que acende luzinha - ruim pra dormir", 50.0f);
		
		System.out.println(p1.getCodigo()+"/"+p1.getNome()+" R$" +p1.getPreco());
		System.out.println(p2.getCodigo()+"/"+p2.getNome()+" R$" +p2.getPreco());
		
	}

}
