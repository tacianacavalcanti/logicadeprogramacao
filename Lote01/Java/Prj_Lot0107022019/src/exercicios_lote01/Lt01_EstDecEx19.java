/* 19.	Receba 2 valores reais. Calcule e mostre o maior deles.
 ****************************************
 Objetivo: d�cimo nono exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 26/02/2019
 ****************************************
 */
package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx19 {
	public static void main(String args[]) {
		double x, y;
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x."));
		y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y."));
		
		if (x >= y) {
			JOptionPane.showMessageDialog(null,"O maior valor � " + x);
		}
		
		else {
			JOptionPane.showMessageDialog(null,"O maior valor � " + y);
		}
	}
}
