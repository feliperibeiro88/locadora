
package RecursosHumanos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String nome;
	private double cpf;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String email;
	private double codigoCliente;
	private Date dataNascimento;
	private static double quantidadeClientes;
	
	
	
	@SuppressWarnings("static-access")
	public Cliente(String nome, double cpf, String rua, int numero,
			String bairro, String cidade, String email, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.quantidadeClientes = this.quantidadeClientes +1;
		this.codigoCliente = this.quantidadeClientes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(double codigoCliente){
		this.codigoCliente = codigoCliente;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public String getDataNascimentoFormatada() {
		SimpleDateFormat FormatDate = new SimpleDateFormat("dd/MM/yyyy");
		return FormatDate.format(dataNascimento);
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}

