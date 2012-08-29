package Run;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

import Banco.Banco;
import Banco.RegistroInexistente;
import Banco.RegistroJaExiste;

public class Main {

	public static List<RecursosHumanos.Cliente> clientes = new LinkedList<RecursosHumanos.Cliente>(); 
	
	public static Banco banco = new Banco();

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat FormatDate = new SimpleDateFormat("dd/MM/yyyy");
		
		RecursosHumanos.Cliente bruno = new RecursosHumanos.Cliente("Bruno Schionato", "1111111","Saudade",1242, "Centro", "Cosmopolis", "schionato@gmail.com", FormatDate.parse("22/09/1987"));
		RecursosHumanos.Cliente aldair = new RecursosHumanos.Cliente("Aldair Roberto", "2331111","Paulisa",2356, "Centro", "S�o Paulo", "aldair@gmail.com", FormatDate.parse("01/05/1980"));
		RecursosHumanos.Cliente juliana = new RecursosHumanos.Cliente("Juliana Aparecida", "233567","7 de Setembro",9856, "Bela Vista", "Holambra", "juliana@ms.com", FormatDate.parse("28/05/1981"));
		try {
			banco.Insere(bruno);
			banco.Insere(aldair);
			banco.Insere(juliana);
		} catch (RegistroJaExiste e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Visual.Home paginaInicial = new Visual.Home();
		
	}
	
	public static void addCliente(RecursosHumanos.Cliente cliente){
		try {
			banco.Insere(cliente);
		} catch (RegistroJaExiste e) {
			e.printStackTrace();
		}
	}
	
	public static void removerCliente(int codigoCliente){
		try {
			banco.ExcluiCliente(codigoCliente);
		} catch (RegistroInexistente e) {
			e.printStackTrace();
		}
	}
}
