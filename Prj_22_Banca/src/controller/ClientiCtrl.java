package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Cliente;

public class ClientiCtrl {

	private static List<Cliente> clienti;
	
	public ClientiCtrl() {
		clienti = new LinkedList<>();
	}
	
	public ClientiCtrl(ArrayList<Cliente> clienti) {
		this.clienti = clienti;
	}

	public void addCliente(String s) {
		this.clienti.add(new Cliente(s));
	}
	
	public static List<Cliente> getClienti() {
		return clienti;
	}

	public Cliente cercaPerNome(String nomeCorrentista) {
		for (Cliente cliente : clienti) {
			if (cliente.getNome().equals(nomeCorrentista))
				return cliente;
		}

		return null;
	}
	
}
