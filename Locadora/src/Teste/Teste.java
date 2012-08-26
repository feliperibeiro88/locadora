/*package Teste;

import java.util.ArrayList;

import Banco.*;
import Locavel.Midia;

public class Teste {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Midia midia1 = new Midia("1", "Midia 1");
		Midia midia2 = new Midia("2", "Midia 2");
		Midia midia3 = new Midia("3", "Midia 3");
		Midia midia4 = new Midia("3", "Midia 4");
		Midia midia5 = new Midia("2", "Midia 5");
		Midia midia = null;
		
		System.out.println("(0) inicio");

		try {
			banco.Insere(midia1);
			banco.Insere(midia2);
			banco.Insere(midia3);
		} catch (RegistroJaExiste e) {
			System.out.println("(1) N�o deve passar aqui.");
		}
		
		System.out.println("(2) inicio");

		try {
			banco.Insere(midia5);
		} catch (RegistroJaExiste e) {
			System.out.println("(3) Duplicidade.");
		}
		
		System.out.println("(4)  Show Midia.");
		
		banco.showMidia();

		System.out.println("(4.1) Exclui");

		try {
			banco.Exclui(midia4);
		} catch (RegistroInexistente e) {
			System.out.println("(5)  N�o deve passar aqui.");
		}

		System.out.println("(6) Show Midia.");
		
		banco.showMidia();

		System.out.println("(7) Altera");
		
		try {
			banco.Altera(midia5);
		} catch (RegistroInexistente e) {
			System.out.println("(8)  N�o deve passar aqui.");
		}
		
		System.out.println("(9) Show Midia.");
		
		banco.showMidia();

		System.out.println("(10) Consulta.");
		
		try {
			midia = banco.ConsultaMidia("2");
		} catch (RegistroInexistente e) {
			e.printStackTrace();
		}
		
		System.out.println("(11) Mostra.");
		
		System.out.println(midia.getDescricao());
		
		System.out.println("(100) FIM");
		
	}
	
}
*/