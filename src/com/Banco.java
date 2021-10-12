package com;

import java.util.ArrayList;

public class Banco {

	private String nome;
	//Cria e instancia uma coleção de clientes
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	//Adiciona um cliente ao Arraylist de objetos
	public void addCliente(Cliente cliente) {
		
		clientes.add(cliente);
	}
	
	
	public static void main(String[] args) {
		
		//Cria um banco, 3 clientes e realiza as operações de saque e depósito com os clientes
		Banco banco = new Banco("Santander");
		
		banco.addCliente(new Cliente("Jonas", 154386));
		banco.addCliente(new Cliente("Marcelo", 284689));
		banco.addCliente(new Cliente("Roberto", 5437681));
		
		for(int i = 0; i < clientes.size(); i++) {
			clientes.get(i).opera();
		}
		
		for(int i = 0; i < clientes.size(); i++) {
			clientes.get(i).getConta().imprimeConta();
		}
		
		
		
		
	}
}
