/* 4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 ****************************************
 Objetivo: Quarto exerc�cio em java
 Programador: Bruno Pallin
 Data da Cria��o: 12/02/2019 
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;


public class Lt01_EstSeqEx04 {
	public static void main (String args[]) {
		double C, F;
		String resultado;
		C = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em graus Celsius"));
		F = (9*C+160)/5;
		resultado =  C + "�C em Fahrenheit �:" +F + "�F";
		JOptionPane.showMessageDialog(null, resultado);
	}
}
