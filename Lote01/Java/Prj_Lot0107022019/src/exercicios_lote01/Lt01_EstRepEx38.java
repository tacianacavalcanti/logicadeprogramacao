/* 38.	38.	Receba 100 n�meros inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 ****************************************
 Objetivo: Trig�simo oitavo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 13/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx38 {
	public static void main(String args[]){
		int n, maior=0, menor = 0;
		
		for (int i=0;i<100;i++){

			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero real positivo."));
			
			if (i==0) {
				maior = n;
				menor = n;
			} else {
				if (n > maior) {
					maior = n;
				} else if (n < menor){
					menor = n;
				}
			}
			
		}
		
		JOptionPane.showMessageDialog(null,"menor: " + menor);
		JOptionPane.showMessageDialog(null,"maior: " + maior);
	}
}