package multifaces;

public class ClasseABC implements InterfaceA, InterfaceB, InterfaceC{

	@Override
	public void metodoC1() {
		System.out.println("Metodo C1");
		metodoQueFazAContaToda();
	}

	@Override
	public void metodoC2() {
		System.out.println("Metodo C2");
	}

	@Override
	public void metodoB1() {
		System.out.println("Metodo B1");
		metodoQueFazAContaToda();
	}

	@Override
	public void metodoB2() {
		System.out.println("Metodo B2");
	}

	@Override
	public void metodoA1() {
		System.out.println("Metodo A1");
		metodoQueFazAContaToda();
	}

	@Override
	public void metodoA2() {
		System.out.println("Metodo A2");
	}
	
	public void metodoQueFazAContaToda() {
		System.out.println("Aqui o bagulho é loko");
	}

}
