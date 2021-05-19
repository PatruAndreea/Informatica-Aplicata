package patrat;

import java.util.Scanner;

import iowithplugins.IShape;

public class Patrat implements IShape {

	private double latura;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void showDetails() {
		System.out.println("Patrat\t[latura=" + latura + "]");
	}

	@Override
	public void readDetails() {
		System.out.println("Introduceti datele patratului: ");
		System.out.println("\nlatura = ");
		latura = sc.nextInt();
	}

}
