package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
	
		Product product = new Product(name, price);
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		product.AddProducts(sc.nextInt());
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		product.RemoveProducts(sc.nextInt());
		
		System.out.println("\nProduct data: " + product);
		
		System.out.println(product.price);
		
		sc.close();

	}
}
