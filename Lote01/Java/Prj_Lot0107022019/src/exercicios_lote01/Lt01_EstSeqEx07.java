/* 7.	Receba os valores do comprimento, largura e altura de um paralelep�pedo. Calcule e mostre seu volume.
 ****************************************
 Objetivo: S�timo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx07 {
	public static void main (String args[]) {
		double comprimento, largura, altura, volume; 
		
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do paralelep�pedo"));
		largura = Double.parseDouble(JOptionPane.showInputDialog("Insira o largura do paralelep�pedo"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Insira o altura do paralelep�pedo"));
		
		volume = comprimento * largura * altura;
		
		JOptionPane.showMessageDialog(null, "O volume do paralelep�pedo �: " + volume);
	}
}
