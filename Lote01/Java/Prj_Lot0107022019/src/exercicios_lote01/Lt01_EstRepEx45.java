/* 1.	Calcule e mostre a s�rie 1 � 2/4 + 3/9 � 4/16 + 5/25 + ... + 15/225
 ****************************************
 Objetivo: Quadrig�simo quinto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */

package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstRepEx45 {
	public static void main(String[] args) {
		
		double x = 1, y, resultado = 0;
		
		while (x <= 15) {
			y = Math.pow(x, 2);
			
			if (x % 2 == 1) {
				resultado = resultado + (x/y);
				JOptionPane.showMessageDialog(null,"O resultado da s�rie �  " + x + "/" + y + "  =  " + resultado);
			}
			else {
				resultado = resultado - (x/y);
				JOptionPane.showMessageDialog(null,"O resultado da s�rie �  -" + x + "/" + y + "  =  " + resultado);
			}
			x++;
		}
	}
}
