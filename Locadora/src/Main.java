

import java.text.ParseException;
import java.text.SimpleDateFormat;
import Locavel.*;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat FormatDate = new SimpleDateFormat("dd/MM/yyyy");
		
		Genero aventura = new Genero("Aventura","Filmes que contem cenas de adrenalina, batalhas e conquistas.");
		Filme oSenhorDosAneisI = new Filme("O Senhor dos Aneis I",04.50, 0,FormatDate.parse("01/05/2001"),12,"Obra baseada no livro do Tolkien - O Senhor dos Aneis I",aventura,0,0,false);
		Filme oSenhorDosAneisII = new Filme("O Senhor dos Aneis II",04.50, 0,FormatDate.parse("01/05/2004"),12,"Obra baseada no livro do Tolkien - O Senhor dos Aneis II",aventura,0,0,false);
		Filme oSenhorDosAneisIII = new Filme("O Senhor dos Aneis III",04.50, 0,FormatDate.parse("01/05/2006"),12,"Obra baseada no livro do Tolkien - O Senhor dos Aneis III",aventura,0,0,false);
		aventura.addFilme(oSenhorDosAneisI);
		aventura.addFilme(oSenhorDosAneisII);
		aventura.addFilme(oSenhorDosAneisIII);
		System.out.println(aventura.listFilme());

	}
	
}
