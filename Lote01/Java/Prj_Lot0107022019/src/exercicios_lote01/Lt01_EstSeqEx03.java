/* 3.	Receba a base e a altura de um tri�ngulo. Calcule e mostre a sua �rea.
 ****************************************
 Objetivo: Terceiro exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx03 {
	public static void main (String args[]) {
		double base, altura, area;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do Tri�ngulo:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do tri�ngulo"));
		
		area = (base*altura)/2;
	
		JOptionPane.showMessageDialog(null, "A �rea do quadrado �: " + area);
		
	}
}
