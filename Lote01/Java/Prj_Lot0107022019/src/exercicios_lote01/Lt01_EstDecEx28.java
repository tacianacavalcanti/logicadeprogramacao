/* 28 . Receba a m�dia mensal e o pre�o atual de um produto. 
 		Calcule e mostre o novo pre�o sabendo que:

	Venda Mensal    | 	Pre�o Atual	 |   Pre�o Novo
	< 500           |	  < 30       |	+10%
	>= 500 e < 1000 |  >= 30 e < 80  |  +15%
	>= 1000      	|     >= 80      |  -5%

Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.

 ****************************************
 Objetivo: Vig�simo oitavo exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 07/03/2019
 ****************************************
 */



package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx28 {
	public static void main(String args[]) {
		double precoA, mediaM, precoN;
		
		mediaM = Double.parseDouble(JOptionPane.showInputDialog("Digite a m�dia mensal do produto."));
		precoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do produto atual."));
		
		if (mediaM < 500 && precoA < 30) {
			precoN = precoA * 1.10;
		}
		
		else if (mediaM >= 500 && mediaM < 1000 && precoA >= 30 && precoA < 80){
			precoN = precoA * 0.95;
		}
		
		else{
			precoN = precoA;
		}
		
		JOptionPane.showMessageDialog(null,"O novo pre�o do produto � de " + precoN);		
	}
}
