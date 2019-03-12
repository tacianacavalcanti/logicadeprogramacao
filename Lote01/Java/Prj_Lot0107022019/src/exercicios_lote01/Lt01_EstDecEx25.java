/* 25.	Receba a hora de in�cio e de final de um jogo (HH,MM), 
        calcular o tempo do jogo em horas e minutos, sabendo que
        o tempo m�ximo � menor que 24 horas e pode come�ar
		dia e terminar noutro.
 ****************************************
 Objetivo: Vig�simo quinto exerc�cio em java
 Programador: Bruno Pallin, William V. Carvalho, Daniel Mota
 Data da Cria��o: 06/02/2019
 ****************************************
 */


package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx25 {
	public static void main(String args[]) {
		int horaInicio, minutosInicio, horaFim, minutosFim, horas, minutos;
		
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de in�cio:"));
		minutosInicio = Integer.parseInt(JOptionPane.showInputDialog("Agora os minutos de in�cio:"));
		horaFim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de termino:"));
		minutosFim = Integer.parseInt(JOptionPane.showInputDialog("Agora os minutos de termino:"));

		horas = horaFim - horaInicio;
		
		if (horas < 0) {
			horas = 24 + horas;
		}
		
		minutos = minutosFim - minutosInicio;
		
		if (minutos < 0) {
			if (minutosFim < minutosInicio) {
				horas--;
			}
		minutos = 60 + minutos;	
		}
		
		JOptionPane.showMessageDialog(null,"A dura��o do jogo foi de: " + horas + " horas e " + minutos +" minutos.");
	}
}