/* 17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l. Receber o tempo de percurso e a velocidade m�dia.
 ****************************************
 Objetivo: D�cimo s�timo exerc�cio em java
 Programador: Bruno Pallin
 Data da Cria��o: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx17 {
	public static void main (String args[]) {
		double qntLitros, tempo, vM, distancia;
		
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso:"));
		vM = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade m�dia:"));
		
		distancia = tempo * vM;
		
		qntLitros = distancia/12;
		
		JOptionPane.showMessageDialog(null, "A quantidade de litros que ser�o gastos na viagem � de: " + qntLitros);
	}
}
