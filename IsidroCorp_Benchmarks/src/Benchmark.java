import java.util.HashMap;

public class Benchmark {
	public static void main(String args[]) {

		/* TESTE COM ARRAYLISTS */
		
		/*
		ArrayList<Produto> lista = new ArrayList<Produto>();

		// vou popular esta lista
		for (int id = 1; id < 1000000; id++) {
			lista.add(new Produto(id, "Produto" + id, id));
		}

		int idBusca = -1;

		long ini = System.currentTimeMillis();
		for (int vezes = 0; vezes < 1000; vezes++) {
			// como fazer uma busca?
			for (int pos = 0; pos < lista.size(); pos++) {
				if (lista.get(pos).getId() == idBusca) {
					System.out.println("Achei!!!");
					break;
				}
			}
		}
		long fim = System.currentTimeMillis();
		
		System.out.println("Demorou "+(fim-ini)+" milésimos");
		*/
		
		
		
		/* TESTE COM HASH MAPS */
		
		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer,Produto>();
		
		// vamos preencher esse mapa com os mesmos objetos
		for (int id=1; id<10000; id++) {
			mapa.put(id, new Produto(id, "Produto"+id, id));
		}
		int idBusca = -1;
		
        long ini = System.currentTimeMillis();
		for (int vezes = 0; vezes < 10000; vezes++) {
			Produto p = mapa.get(idBusca);
			if (p != null) {
				System.out.println("Achei!");
			}
		}
		long fim = System.currentTimeMillis();
		
		System.out.println("Demorou "+ (fim-ini)+" milésimos");
		
	}

}
