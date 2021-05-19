package dreptunghi;

import java.util.Scanner;

import iowithplugins.IShape;

public class Dreptunghi implements IShape {

	private double lungime;
	private double latime;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void showDetails() {
		System.out.println("Dreptunghi\t[lungime=" + lungime + ", latime=" + latime + "]");
	}

	@Override
	public void readDetails() {
		System.out.println("Introduceti datele dreptunghiului: ");
		System.out.println("\nlungime = ");
		lungime = sc.nextInt();
		System.out.println("\nlatime = ");
		latime = sc.nextInt();
	}

}
