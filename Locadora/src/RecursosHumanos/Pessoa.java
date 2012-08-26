package RecursosHumanos;
import java.util.Date;

public abstract class Pessoa {

	private String nome;
	private String rua;
	private String bairro;
	private int numero;
	private String cidade;
	private int telefone;
	private String email;
	private Date nascimento;

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public void setTelefone(int telefone){
		this.telefone = telefone;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
    public String qualseunome(){
    	return this.nome;
    }
	
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}
