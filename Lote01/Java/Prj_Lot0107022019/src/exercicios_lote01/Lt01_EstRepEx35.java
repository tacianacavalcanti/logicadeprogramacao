/* 35.	Receba 2 n�meros inteiros, verifique qual o maior entre
  		eles. Calcule e mostre o resultado da somat�ria dos n�meros
  		�mpares entre esses valores.

 ****************************************
 Objetivo: Trig�simo quinto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 10/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx35 {
	public static void main(String args[]) {
		int x, y, soma=0, resto;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
		
		if (x > y) {
			
			for (int c = y+1; c < x; c++) {
				
				if (c % 2 == 1){
					soma = soma + c;				
				}
			}
		}
		
		else {
			
			for (int c = x+1; c < y; c++) {
				if (c % 2 == 1){
					soma = soma + c;			
				}
			}
		}
		JOptionPane.showMessageDialog(null,"A somat�ria �: " + soma);
	}
}


