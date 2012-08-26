package Banco;

import java.util.ArrayList;
import Locavel.Midia;
import RecursosHumanos.Cliente;

public class Banco {
	
	ArrayList<Midia> midia;
	ArrayList<Cliente> cliente;
	
	public Banco() {
		this.midia = new ArrayList<Midia>();
		this.cliente = new ArrayList<Cliente>();
	}
	
	private int retornaIndice ( ArrayList<Tabulavel> lista, String valorChave ) {
		
		int retorno = -1;
		Tabulavel registro;
		
		for (int i = 0; i < lista.size(); i++) {
			
			registro = lista.get(i);
			
			if ( registro.comparaCampo(valorChave) ) {
				retorno = i;
			}
		}
		
		return retorno;
		
	}
	
	private void insereNaLista ( ArrayList<Tabulavel> lista, Tabulavel registro ) throws RegistroJaExiste {
			
		String indice = registro.retornaValorChave();
		int tamanho = lista.size();

		if ( retornaIndice(lista, indice) == -1 ) {
			lista.add(tamanho,registro);
		}
		else {
			throw new RegistroJaExiste(registro.retornaValorChave());
		}
	}
		
	private void alteraNaLista ( ArrayList<Tabulavel> lista, Tabulavel registro ) throws RegistroInexistente {
		
		int indice = retornaIndice(lista, registro.retornaValorChave());
		
		if ( indice == -1 ) {
			throw new RegistroInexistente(registro.retornaValorChave());
		}
		else {
			lista.remove(indice);
			lista.add(registro);
		}
	}
	
	private void removeDaLista ( ArrayList<Tabulavel> lista, Tabulavel registro ) throws RegistroInexistente {
		
		int indice = retornaIndice(lista, registro.retornaValorChave());
		
		if ( indice == -1 ) {
			throw new RegistroInexistente(registro.retornaValorChave());
		}
		else {
			
			lista.remove(indice);
		}
	}

	private Tabulavel consultaDaLista ( ArrayList<Tabulavel> lista, String chave ) throws RegistroInexistente {
		
		int indice = retornaIndice(lista, chave);
		
		if ( indice == -1 ) {
			throw new RegistroInexistente(chave);
		}
		else {
			return lista.get(indice);
		}
	}

	public void Insere ( Midia midia ) throws RegistroJaExiste{
		insereNaLista( (ArrayList) this.midia, (Tabulavel) midia);
	}
	
	public void Insere ( Cliente cliente ) throws RegistroJaExiste{
		insereNaLista( (ArrayList) this.cliente, (Tabulavel) cliente);
	}
		
	
	public void Exclui ( Midia midia ) throws RegistroInexistente{
		removeDaLista( (ArrayList) this.midia, (Tabulavel) midia);
	}
	
	public void Exclui ( Cliente cliente ) throws RegistroInexistente{
		removeDaLista( (ArrayList) this.cliente, (Tabulavel) cliente);
	}
	public void Altera ( Midia midia) throws RegistroInexistente{
		alteraNaLista( (ArrayList) this.midia, (Tabulavel) midia);
	}
	
	public void Altera ( Cliente clinte) throws RegistroInexistente{
		alteraNaLista( (ArrayList) this.cliente, (Tabulavel) cliente);
	}
	
	public Midia ConsultaMidia ( String chave ) throws RegistroInexistente{
		return (Midia) consultaDaLista( (ArrayList) this.midia, chave);
	}
	
	public void showMidia ( ) {
		
		Midia registro;
		
		for (int i = 0; i < midia.size(); i++) {
			
			registro = midia.get(i);
			
			System.out.println( "M�dia c�digo " + registro.getCodigo() + " e descri��o " + registro.getDescricao() + ".");
		}
		
	}
	
}
