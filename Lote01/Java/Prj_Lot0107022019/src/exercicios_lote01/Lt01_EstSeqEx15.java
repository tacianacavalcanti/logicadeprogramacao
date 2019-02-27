/* 15.	Receba os valores de 2 catetos de um tri�ngulo ret�ngulo. Calcule e mostre a hipotenusa.
 ****************************************
 Objetivo: D�cimo quinto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx15 {
	public static void main (String args[]) {
		double cateto1, cateto2, hipotenusa;
		
		cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
		cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
		
		hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		
		JOptionPane.showMessageDialog(null, "A hipotenusa do tri�ngulo ret�ngulo �: " + hipotenusa);
	}
}
