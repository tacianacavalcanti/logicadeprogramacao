/* 24. Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3.
 
 ****************************************
 Objetivo: Vig�simo quarto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 04/02/2019
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx24 {
	public static void main(String args[]) {
		int x, r2, r3;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para verificar se � divis�vel por dois e tr�s."));
		
		r2 = x % 2;
		r3 = x % 3;
		
		if (r2 == 0 && r3 == 0) {
			JOptionPane.showMessageDialog(null,"Esse valor � divis�vel por 2 e por 3.");
		}
		
		else if (r2 == 0){
				JOptionPane.showMessageDialog(null,"O valor � divis�vel apenas por 2.");	
			}
			
			else if (r3 == 0) {
					JOptionPane.showMessageDialog(null,"O valor � divis�vel apenas por 3.");
				}
				
				else {
					JOptionPane.showMessageDialog(null,"O valor n�o � divis�vel por 2 e 3.");
				}
	}
}