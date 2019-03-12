/* 29.	Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) 
  		e o valor do investimento. Calcule e mostre o valor corrigido
  		em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. 
 		Demais tipos n�o ser�o considerados.
 ****************************************
 Objetivo: Vig�simo nono exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx29 {
	public static void main(String args[]) {
		double tipo, valor, resultado;
		
		tipo  = Double.parseDouble(JOptionPane.showInputDialog("Digite (1) para realizar um investimento poupan�a ou (2) para renda fixa."));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido."));
		
		if (tipo == 1) {
			resultado = valor * 1.03;
			JOptionPane.showMessageDialog(null,"O investimento ap�s 30 dias ser� de " + resultado);
		}
		
		else if(tipo == 2) {
			resultado = valor * 1.05;
			JOptionPane.showMessageDialog(null,"O investimento ap�s 30 dias ser� de " + resultado);
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Tipo desconhecido. Insira 1 para poupan�a ou 2 para renda fixa.");
		}
		
	}
}
