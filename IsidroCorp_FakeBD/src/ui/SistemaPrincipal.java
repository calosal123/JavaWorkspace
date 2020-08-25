package ui;

import core.BdAccess;
import core.InterfaceBD;
import multifaces.ClasseABC;
import multifaces.InterfaceA;
import multifaces.InterfaceB;
import multifaces.InterfaceC;

public class SistemaPrincipal {
	public static void main(String args[]) {
		
		InterfaceBD bd;
		
		bd = new BdAccess();
		
		
		// sei como utilizar o banco de dadso (só não sei qual ainda)
		bd.conectar();
		bd.executarComando("SELECT * from TABELA");
		bd.desconectar();
		
		/* exemplo da "multifaceta" dos objetos */
		ClasseABC cabc = new ClasseABC();
		cabc.metodoA1();
		cabc.metodoA2();
		cabc.metodoB1();
		cabc.metodoB2();
		cabc.metodoC2();
		cabc.metodoC2();
		
		InterfaceA ia = cabc;
		InterfaceB ib = cabc;
		InterfaceC ic = cabc;
		
		
	}

}
