package RecursosHumanos;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Cliente extends Pessoa{

	public Cliente(String nome, String cidade, int telefone, String email, String nascimento) throws ParseException {
		this.setNome(nome);
		this.setCidade(cidade);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setNascimento(convert_data(nascimento));
	}


	private Date convert_data(String nascimento) throws ParseException{
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		Date teste = sd.parse(nascimento);
		return teste;
	}
}
