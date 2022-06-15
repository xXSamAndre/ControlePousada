package Model;

import java.util.Scanner;

import entities.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//double[] aluguel = new double[10];
		
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.println("Quantos quartos serão alugados?s  ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Aluguel #" +i+ ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email:  ");
			String email = sc.nextLine();
			System.out.print("Quarto:");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome,email);
		}
		
		System.out.println("Quartos ocupados:  ");
		for(int i=0; i<n; i++) {
			if (vetor[i] != null) {
				System.out.println(i+":  "+vetor[i]);
			}
		}

	}

}
