/* 16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o n�mero de descendentes. Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora.
 Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto). A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. Exiba o sal�rio a receber.
 ****************************************
 Objetivo: D�cimo sexto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 13/02/2019 
 ****************************************
 */

package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstSeqEx16 {
	public static void main (String args[]) {
		double horasTrab, valorPH, percentualDesconto, salarioB, salarioL, salarioFinal;
		int descendentes;
		
		horasTrab = Double.parseDouble(JOptionPane.showInputDialog("Insira as horas trabalhadas:"));
		valorPH =  Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora:"));
		percentualDesconto =  Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto:"));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de descendente"));

		percentualDesconto = percentualDesconto/100;
		
		salarioB = horasTrab * valorPH;
		salarioL = salarioB * (1-percentualDesconto); 
		
		salarioFinal = salarioL + descendentes*100;
		
		JOptionPane.showMessageDialog(null, "O salario final �: " + salarioFinal);
	}
}