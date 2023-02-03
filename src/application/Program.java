package application;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entities.Produto;

public class Program {
	public static void main(String[] args) {

		
		
		Produto p1 = new Produto();
		
		String name = JOptionPane.showInputDialog("What´s the product name?");
		p1.setName(name);

		double price = Double.parseDouble(JOptionPane.showInputDialog("What´s the product price?"));
		p1.setPrice(price);
		
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("What´s the product quantity?"));
		p1.setQuantity(quantity);
		
		
		System.out.println(p1);
		
		p1.TotalValueInStock();
		System.out.println("Product data: " + p1);
		
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Update the product quantity"));
		p1.AddProducts(quantity);
		System.out.println("Upadate data: " + p1.getName() + ", $" + p1.getPrice() + ", " + p1.getQuantity() + " units, Total: $" + p1.TotalValueInStock());
		
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Remove the product quantity"));
		p1.RemoveProducts(quantity);
		System.out.println("Remove data: " + p1.getName() + ", $" + p1.getPrice() + ", " + p1.getQuantity() + " units, Total: $" + p1.TotalValueInStock());
		
	}

}