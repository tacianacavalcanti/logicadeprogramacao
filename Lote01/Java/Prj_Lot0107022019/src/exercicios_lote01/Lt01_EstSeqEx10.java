/* 10.	Receba 2 n�meros reais. Calcule e mostre a diferen�a desses valores.
 ****************************************
 Objetivo: D�cimo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx10 {
	public static void main (String args[]) {
		double num1, num2, diferenca ;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor:"));
		
		diferenca = num1 - num2;
		
		JOptionPane.showMessageDialog(null, "A diferen�a desses valores � de: " + diferenca);
	}
}
