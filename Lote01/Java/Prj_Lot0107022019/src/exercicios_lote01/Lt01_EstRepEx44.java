/* 44.	Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia.
 
 ****************************************
 Objetivo: Quadrig�simo quarto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: xx/xx/2019
 ****************************************
 */

package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstRepEx44 {
	public static void main(String[] args) {
		int base, expo, resultado;
		
		base =  Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a base."));
		expo =  Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o expoente."));
		
		resultado = base;
		
		for(int i = expo; i > 1; i--) {
			resultado = resultado * base;
		}
		
		JOptionPane.showMessageDialog(null, "Pot�ncia = " + resultado);
		
	}
}
