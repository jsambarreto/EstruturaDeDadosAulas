package Aula5_1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//Pilha de atividades para desenvolver 
		Stack<String> pilha = new Stack<>();
		
		Stack<String> pilhaI = new Stack<>();
		
		pilha.push("Ler projeto");
		pilha.push("Pesquisar padr�es");
		pilha.push("Codificar");
		pilha.push("Testar");
		
		System.out.println(pilha);
		
		
		String obj = pilha.pop();
		
		pilhaI.push(obj);
		
		
		
		
		pilhaI.push(pilha.pop());
		pilhaI.push(pilha.pop());
		pilhaI.push(pilha.pop());
		pilhaI.push(pilha.pop());
		
		//System.out.println(pilha);
		System.out.println(pilhaI);
		

	}

}
