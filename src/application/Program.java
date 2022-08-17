package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o número de posições do seu vetor?");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		// pode ser usado vect.length para passar o tamanho do vetor
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;

		System.out.printf("Avarege price = %.2f%n", avg);
		System.out.printf("Preco total dos produtos %.2f%n", sum);

		sc.close();
	}

}
