package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx17_Modular {
	public static void main (String args[]) {
		double qntLitros, tempo, vM, distancia = 0;
		
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso:"));
		vM = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade m�dia:"));
		
		qntLitros = Litros(distancia,tempo,vM);
		
		JOptionPane.showMessageDialog(null, "A quantidade de litros que ser�o gastos na viagem � de: " + qntLitros);
	}
	
	static double Litros(double distancia, double tempo, double vM){
		double Litros;

		distancia = tempo * vM;
		Litros = distancia/12;
		
		return Litros;
	}
}
