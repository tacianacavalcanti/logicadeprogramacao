/* 18. Receba dois valores inteiros. Calcule e mostre o resultado da diferen�a do maior pelo menor.
 ****************************************
 Objetivo: D�cimo oitavo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 26/02/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx18 {
	public static void main(String args[]) {
		
		int x, y, df;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y."));
		
		if (x >= y) {
			
			df = x-y;	
		}
		
		else {
			
			df = y-x;
		}
		
		JOptionPane.showMessageDialog(null,"A diferen�a do maior pelo menor � de " + df);
	}
}
