/* 14.	Receba 2 �ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo.
 ****************************************
 Objetivo: D�cimo Quarto exerc�cio em java
 Programador: Bruno Pallin
 Data da Cria��o: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx14 {
	public static void main (String args[]) {
		double ang1, ang2, angX;
	
		ang1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro �ngulo do tri�ngulo"));
		ang2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo �ngulo do tri�ngulo"));
		
		angX = 180 - ang1 - ang2;
		
		JOptionPane.showMessageDialog(null, "O terceiro �ngulo �: " + angX);
	}
}
