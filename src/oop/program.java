package oop;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("How many rooms to be rented ?");
		int n = scan.nextInt();

		for (int a = 1; a <= n; a++) {
			
			System.out.println("Name: ");
			String name = scan.nextLine();
			System.out.println("E-mail: ");
			String email = scan.nextLine();
			System.out.println("Room: ");
			System.out.println("Jogo preferido :");
			String jogo = scan.next();
			int room = scan.nextInt();
			vect[room] = new Rent(name, email, jogo); 
			/*Como � o funcionamento deste vetor ? 
			 * Basicamente este � um vetor para o room e ele ir� receber os valores digitados pelo usu�rio atrav�s de um construtor instanciado na classe dele.     */
		}

	}

}
