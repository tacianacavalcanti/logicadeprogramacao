package exercicios_lote01;
import javax.swing.JOptionPane;

public class Lt01_EstDecEx21_Modular {
	public static void main(String args[]) {
		double n1, n2, n3, n4, m�dia;
		
		JOptionPane.showMessageDialog(null,"Digite as suas notas");
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1."));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2."));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3."));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4."));
	
		m�dia = (n1+n2+n3+n4)/4;
		
		if(m�dia >= 6) {
			JOptionPane.showMessageDialog(null,"Situa��o - Aprovado com m�dia "+ m�dia);
		}
		
		else {
	
			if(m�dia < 3){
			JOptionPane.showMessageDialog(null,"Situa��o - Retido com m�dia "+ m�dia);
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Situa��o - EXAME com m�dia " + m�dia);
			}
		}
	}

}
