/* 2.	Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de 15%.
 ****************************************
 Objetivo: Segundo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 12/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx02 {
	public static void main (String args[]) {
		double salario, salarioNovo;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o sal�rio:"));
		salarioNovo = salario * 1.15;
		JOptionPane.showMessageDialog(null, "O novo sal�rio �: R$" + salarioNovo);
	}
}