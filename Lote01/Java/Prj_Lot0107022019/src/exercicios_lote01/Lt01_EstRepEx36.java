
/* 36.	Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
 ****************************************
 Objetivo: Trig�simo sexto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */
package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx36 {
	public static void main(String args[]) {
		double n, x, fatorial, serie;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para caluclar a s�rie."));
		
		n = n+1;
		x = 1;
		fatorial = 1;
		serie = 1;
		
		while(x <= n) {
			fatorial = fatorial * x;
			x++;
			JOptionPane.showMessageDialog(null,serie);
			serie = serie + 1/fatorial;
		}
	}
}