/* 8.	Receba o valor de um dep�sito em poupan�a. Calcule e mostre o valor ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m.
 ****************************************
 Objetivo: Oitavo exerc�cio em java
 Programador: Bruno Pallin
 Data da Cria��o: 13/02/2019 
 ****************************************
 */
package exercicios_lote01;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx08help {
	public static void main (String args[]) {
		double 	deposito, aplicado;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do dep�sito"));
		
		aplicado = deposito * 1.013;
		
		JOptionPane.showMessageDialog(null, "O valor ap�s um m�s de aplica��o �: " + aplicado);
	}
}
// Mesmo erro do 02, que d� errado o double por 0,1