import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		Pessoa p1,p2,p3,p4;
		p1 = new Pessoa(1, "Isidro", "isi@isi.com", "987654321", "Rua IV", 10, "Bl 1 ap 1", "Oz-asco","Centro", "SP", "01001-000", true);
		p2 = new Pessoa(2, "Jose", "joe@joe.com", "912345678", "Rua II", 20, "Casa B", "Jau", "Centro", "SP", "11111-111", false);
	    
	    p3 = new Pessoa(3, "Isidro simplificado", "isidro@simple.com", "98716253");
	    
	    p4 = p1;
	    // fiz uma cópia de p1 em p4?
	    
	    System.out.println("Pessoa 1 = "+p1.getNome()+" / "+p1.getTelefone()+" - "+p1.getEmail());
	    p4.setNome("Fernando");
	    System.out.println("Pessoa 4 = "+p4.getNome()+" / "+p4.getTelefone()+" - "+p4.getEmail());
	    System.out.println("Pessoa 1 = "+p1.getNome()+" / "+p1.getTelefone()+" - "+p1.getEmail());
	    
	    
	   
	}

}