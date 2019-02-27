/* 5.	Receba os coeficientes A, B e C de uma equa��o do 2� grau (AX�+BX+C=0). Calcule e mostre as ra�zes reais (considerar que a 
 equa��o possue 2 ra�zes).
 ****************************************
 Objetivo: Quinto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx05 {
	public static void main (String args[]) {
		double a, b, c, delta, r1, r2;
		String raizes;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A da equa��o de 2� grau:")); //2
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B da equa��o de 2� grau:")); //5
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C da equa��o de 2� grau:")); // 2

		delta = (b*b) - (4*a*c); //9
		
		r1 = (-b + Math.sqrt(delta))/(2*a);
		r2 = (-b - Math.sqrt(delta))/(2*a);				
	
		raizes = "A raizes s�o:\n" + "R1: " + r1 + "\nR2: " + r2;
		JOptionPane.showMessageDialog(null, raizes);
	}

}
