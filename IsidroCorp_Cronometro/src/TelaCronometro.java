import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCronometro extends JFrame implements Runnable{
	
	JLabel txtTempo;
	int tempo = 20;
	boolean continua;
	public TelaCronometro() {
		setSize(640, 480);
		setTitle("Cronometro do Isidro");
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		txtTempo = new JLabel("00:00");
		//txtTempo.setSize(150, 100);
		txtTempo.setFont(new Font("Arial", 0, 48));
		txtTempo.setBounds(100, 100, 300, 200);
		getContentPane().add(txtTempo);
		continua = true;
		repaint();
		new Thread(this).start();
	}
	

	public String formataTxt(int valor) {
		if (valor < 10 ) {
			return "0"+valor;
		}
		else {
			return String.valueOf(valor);
		}
	}
	
	// metodo para rodar em Background
	public void run() {
		while (continua) {
			try {
				tempo--;
				if (tempo <=0) {
					tempo = 0;
					continua = false;
				}
				Thread.sleep(1000);
				txtTempo.setText("00:"+formataTxt(tempo));
			}
			catch(Exception ex) {
				System.out.println("Deu ruim");
			}
		}
		
	}
}
