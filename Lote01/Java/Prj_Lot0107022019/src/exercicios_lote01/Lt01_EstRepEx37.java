/* 37.	Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci 
  		at� o seu N�n�simo termo.
 ****************************************
 Objetivo: Trig�simo s�timo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx37 {
	public static void main(String args[]) {
		int n, valor=0, valor2, troca;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para calcular a s�rie de fibonacci at� ele."));
		
		valor2 = 1;
		
		for(int i=0;i<=n;i++) {
			JOptionPane.showMessageDialog(null,valor);
			troca = valor;
			valor = valor2;
			valor2 = troca;
			valor = valor + valor2;			
		}
	}
}