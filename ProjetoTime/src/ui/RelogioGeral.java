package ui;

import core.Time;

public class RelogioGeral {
	public static void main(String args[]) {
		
		Time t = new Time();
		t.setTime(23, 12, 38);
		
		System.out.println("Hora Universal = "+t.exibirHoraUniversal());
		System.out.println("Hora Padrao    = "+t.exibirHoraPadrao());
		t.setTime(0, 15, 2);
		System.out.println("Hora Universal = "+t.exibirHoraUniversal());
		System.out.println("Hora Padrao    = "+t.exibirHoraPadrao());
		t.setTime(8, 10, 55);
		System.out.println("Hora Universal = "+t.exibirHoraUniversal());
		System.out.println("Hora Padrao    = "+t.exibirHoraPadrao());
		t.setTime(12,14, 17);
		System.out.println("Hora Universal = "+t.exibirHoraUniversal());
		System.out.println("Hora Padrao    = "+t.exibirHoraPadrao());
		
	}

}
