/* 27.	Receba o n�mero de voltas, a extens�o do circuito (em metros)
  		e o tempo de dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.

 ****************************************
 Objetivo: Vig�simo s�timo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx27 {
	public static void main(String args[]) {
		int nV, eC, t, vM;
		
		nV = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do n�mero de voltas."));
		eC = Integer.parseInt(JOptionPane.showInputDialog("Digite a extens�o do circuito. (metros"));
		t  = Integer.parseInt(JOptionPane.showInputDialog("Digite a dura"));
		
		vM = (nV * eC) / t;
		vM = (vM * 60) / 1000;
		
		JOptionPane.showMessageDialog(null, "A velocidade m�dia � de " + vM);
	}
}
