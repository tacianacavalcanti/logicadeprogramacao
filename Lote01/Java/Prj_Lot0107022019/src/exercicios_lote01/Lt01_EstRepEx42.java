
/* x. descricao do exercicio
 ****************************************
 Objetivo: Quadrig�simo segundo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstRepEx42 {
	public static void main(String[] args) {
		double x, y, resultado = 0;
		
		x = 1;
		
		while (x <= 50) {
			y = (x*2)-1;
			resultado = resultado + (x/y);
			x++;
			
			JOptionPane.showMessageDialog(null, "Resultado da s�rie: " + resultado);
		}
	}	
}




