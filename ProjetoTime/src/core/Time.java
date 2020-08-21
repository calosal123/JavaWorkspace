package core;

public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minu = m;
		this.segu = s;
	}
	
	public String exibirHoraUniversal() {
		String horaSTR;
		horaSTR = formata(this.hora)+":"+formata(this.minu)+":"+formata(this.segu);
		return horaSTR;
	}
	
	public String exibirHoraPadrao() {
		String horaSTR, sufixo;
		
		if (hora == 0) {  // meia noite
			horaSTR = "12";
			sufixo  = "AM";
		}
		else if (hora == 12) {
			horaSTR = "12";
			sufixo  = "PM";
		}
		else if (hora >= 1 && hora <= 11) {
			horaSTR = formata(hora);
			sufixo  = "AM";
		}
		else {
			horaSTR = formata(hora-12);
			sufixo  = "PM";
		}
		horaSTR = horaSTR + ":" + formata(minu)+ ":" + formata(segu)+ sufixo;
		return horaSTR;
	}
	
	private String formata(int valor) {
		if (valor < 10) {
			return "0"+valor;
		}
		else {
			return String.valueOf(valor);
		}
	}

}
