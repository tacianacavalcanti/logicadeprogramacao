import javax.swing.JOptionPane;

public class Principal {
	/*
 
	----------------------------------------------------------------
	|	MENU ESTAT�STICA											|
	| Estat�sticas_de_acidentes_em_2015								|
	| 1 - Cadastro_Estat�stica										|
	| 2 - Consulta_por_tipo_de_ve�culo								|
	| 3 - Consulta_por_quantidade_de_acidentes						|
	| 4 - Consulta_todos as_cidades                                	|
	| 5 - Consulta_maior menor_m�dia de_acidentes					|
	| 9 - _Finaliza.												|
	----------------------------------------------------------------
 
	 * */
	
	public static void main(String args[]) {
		int opcao = 0;
		Estatistica2015[] estatistica2015 = new Estatistica2015[15];
		
		while (opcao != 9) {	
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "	| Estat�sticas de acidentes em 2015					|\r\n" + 
					"	| 1 - Cadastro Estat�stica							|\r\n" + 
					"	| 2 - Consulta por tipo de ve�culo					|\r\n" + 
					"	| 3 - Consulta por quantidade de acidentes			|\r\n" + 
					"	| 4 - Consulta todos as cidades                   	|\r\n" + 
					"	| 5 - Consulta maior menor m�dia de acidentes		|\r\n" + 
					"	| 9 - Finaliza 										|\r\n"));
			switch (opcao) {
			
			case 1:
				estatistica2015 = fCadastraEstatistica(estatistica2015);
				break;
			case 2:	
				fTipo(Integer.parseInt(JOptionPane.showInputDialog("Tipo do veiculo que deseja consultar")), estatistica2015);
				break;
			case 3:	
				pQtAcidentes(estatistica2015);
				break;
			case 4:	
				pConsultaAcientes(estatistica2015);
				break;
			case 5:
				consultaMaiorMenorMediaAcidentes(estatistica2015);
				break;
			case 9: 
				System.exit(0);
				break;
			default: JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			
			}
			
		} 
		
	
	}
	
	public static Estatistica2015[]  fCadastraEstatistica(Estatistica2015[] estatistica2015) {
		for (int i =0; i < estatistica2015.length; i++) {
			
			estatistica2015[i] = new Estatistica2015();
			
			estatistica2015[i].setCodCidade(Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo da cidade")));
			estatistica2015[i].setCidade(JOptionPane.showInputDialog("Insira o nome da cidade"));
			estatistica2015[i].setQtdAcidentes(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes")));
			estatistica2015[i].setTipoVeiculo(Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de veiculo")));
			
		}
		
		return estatistica2015;
	}

	public static void fTipo(int tipoVeiculo, Estatistica2015 estatistica2015[]) {
		int qtdAcidentes = 0;
		
		for (int i=0; i< estatistica2015.length; i++) {			
			if (estatistica2015[i].getTipoVeiculo() == tipoVeiculo){

				qtdAcidentes = qtdAcidentes + estatistica2015[i].getQtdAcidentes();
				
			}
		}
		JOptionPane.showMessageDialog(null, "Aconteceram " + qtdAcidentes + " envolvendo este tipo de ve�culo");
	}

	public static void pQtAcidentes(Estatistica2015 estatistica2015[]) {
		String cidades = "";
		for(int i=0; i<estatistica2015.length; i++) {
			if(estatistica2015[i].getQtdAcidentes() > 100 && estatistica2015[i].getQtdAcidentes() < 500 ) {
				cidades = cidades + "A cidade " + estatistica2015[i].getCidade() + " possu� " + estatistica2015[i].getQtdAcidentes() + " acidentes.\n";
			}
		}
		if (cidades == "") {
			JOptionPane.showMessageDialog(null, "N�o h� cidades com quantidade de acidentes entre 100 e 500");
		} else {
			JOptionPane.showMessageDialog(null, cidades);
		}
	}

	public static void pConsultaAcientes(Estatistica2015 estatistica2015[]) {
		String texto = "";
		for(int i=0; i<estatistica2015.length; i++) {
			texto = texto +
					"Cod: " + estatistica2015[i].getCodCidade() +
					" |Nome: " + estatistica2015[i].getCidade() + 
					" |Quantidade: " + estatistica2015[i].getQtdAcidentes() + 
					"\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
		
	public static void consultaMaiorMenorMediaAcidentes(Estatistica2015 estatistica2015[]) {
		int menorAcidentes = estatistica2015[0].getQtdAcidentes(), maiorAcidentes = estatistica2015[0].getQtdAcidentes(), media = 0;
		String cidadeMenor = estatistica2015[0].getCidade(), cidadeMaior = estatistica2015[0].getCidade(), cidadesAcimaMedia = "";
		
		for(int i=0; i<estatistica2015.length; i++) {
			if (estatistica2015[i].getQtdAcidentes() < menorAcidentes){
				menorAcidentes = estatistica2015[i].getQtdAcidentes();	
				cidadeMenor = estatistica2015[i].getCidade();
				
			} else if (estatistica2015[i].getQtdAcidentes() > maiorAcidentes) {
				maiorAcidentes = estatistica2015[i].getQtdAcidentes();
				cidadeMaior =  estatistica2015[i].getCidade();
			}	
			media = media + estatistica2015[i].getQtdAcidentes();
		
		}
		media = media/estatistica2015.length;
		
		for(int i=0; i<estatistica2015.length; i++) {
			if(estatistica2015[i].getQtdAcidentes() > media) {
				if (cidadesAcimaMedia == "") {
					cidadesAcimaMedia = estatistica2015[i].getCidade();
				
				} else {
					cidadesAcimaMedia = cidadesAcimaMedia + ", " + estatistica2015[i].getCidade();
				
				}
			}
		}
		
		if(cidadesAcimaMedia == "") {
			JOptionPane.showMessageDialog(null, "O maior n�mero de acidentes foi: \n " +
					cidadeMaior + ": " + maiorAcidentes +
				"\n \n Enquanto a menor quantidade foi: \n" +
					cidadeMenor + ": " + menorAcidentes +
				"\n \n E n�o possu� cidades acima da m�dia.");
			
		} else {
			cidadesAcimaMedia = cidadesAcimaMedia + ".";
			JOptionPane.showMessageDialog(null, "O maior n�mero de acidentes foi: \n " +
					cidadeMaior + ": " + maiorAcidentes +
				"\n Enquanto a menor quantidade foi: \n" +
					cidadeMenor + ": " + menorAcidentes +
				"\n E as cidades acima da m�dia s�o: \n " +
					cidadesAcimaMedia);
			
		}
	}
}
