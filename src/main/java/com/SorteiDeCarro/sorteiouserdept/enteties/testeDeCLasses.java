package com.SorteiDeCarro.sorteiouserdept.enteties;

public class testeDeCLasses {
	Usuario usuario = new Usuario(1, "consentimento", "01/01/2000", "Nome", "123.456.789-00", "email@example.com", "perfil", "role", "senha", "123456789", "estado", "municipio", "bairro", "logradouro", 123, "complemento");
	System.out.println(usuario);

	Sorteio sorteio = new Sorteio(1, 2024, "identificador", "Janeiro", 1000.0, "Apresentador", "Auditor", false, "Descrição", "Tipo");
	System.out.println(sorteio);

	Bilhete bilhete = new Bilhete(1, 2024, "Janeiro", 123, 456, 789);
	System.out.println(bilhete)

	Nota_Fiscal notaFiscalDoUsuario = new Nota_Fiscal(1, 123, "chave", "sequencial", "01/01/2024");
	System.out.println(notaFiscal);

}
