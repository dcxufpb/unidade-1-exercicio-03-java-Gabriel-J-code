package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	public static void main(final String[] args) {
		System.out.print(PrintInvoice());
	}

	public static String PrintInvoice(){
		if (NOME_LOJA == "") {
			return "O campo nome da loja é obrigatório";			
		  }
		if (LOGRADOURO == ""){
			return "O campo logradouro do endereço é obrigatório";
		}		
		if (MUNICIPIO == ""){
			return "O campo município do endereço é obrigatório";
		}
		if (ESTADO == ""){
			return "O campo estado do endereço é obrigatório";
		} 
		if (CNPJ == ""){
			return "O campo CNPJ da loja é obrigatório";
		} 
		if (INSCRICAO_ESTADUAL == ""){
			return "O campo inscrição estadual da loja é obrigatório";
		}

		String _NUMERO = "s/n";
		if (NUMERO > 0){
			_NUMERO = Integer.toString(NUMERO);
		}
		
		String _COMPLEMENTO = "";
		if (COMPLEMENTO != ""){
			_COMPLEMENTO = " " + COMPLEMENTO;
		}
	
		String _BAIRRO = "";
		if(BAIRRO != ""){
			_BAIRRO = BAIRRO + " - " ;
		}
	
		String _CEP = "";
		if(CEP != ""){
			_CEP = "CEP:" + CEP;
		}
		
		String _TELEFONE = "";
		if(TELEFONE != ""){
			_TELEFONE = "Tel " + TELEFONE;

			if(CEP != ""){
				_TELEFONE = " " + _TELEFONE;
			}
		}		
	
		String _OBSERVACAO = "";
		if (OBSERVACAO != ""){
			_OBSERVACAO = OBSERVACAO;
		}

		String BREAK = System.lineSeparator();

		String nota = String.format("%s",NOME_LOJA) + BREAK;
		nota += String.format("%s, %s%s",LOGRADOURO,_NUMERO,_COMPLEMENTO) + BREAK;
		nota += String.format("%s%s - %s",_BAIRRO,MUNICIPIO,ESTADO) + BREAK;
		nota += String.format("%s%s",_CEP,_TELEFONE) + BREAK;
		nota += String.format("%s",_OBSERVACAO) + BREAK;
		nota += String.format("CNPJ: %s",CNPJ) + BREAK;
		nota += String.format("IE: %s",INSCRICAO_ESTADUAL) + BREAK;
	
		return nota;
	}

}
