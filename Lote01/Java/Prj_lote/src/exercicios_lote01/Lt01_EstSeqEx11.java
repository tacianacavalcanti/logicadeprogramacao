/* 11.	Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da circunfer�ncia.
 ****************************************
 Objetivo: D�cimo primeiro exerc�cio em java
 Programador: Bruno Pallin
 Data da Cria��o: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx11 {
	public static void main (String args[]) {
		double raio, circunference;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do c�rculo"));
		
		circunference = 2*Math.PI*raio;
		
		JOptionPane.showMessageDialog(null, "A circunfer�ncia do c�rculo �: " + circunference);
	}
}
