package cerc;

import java.util.Scanner;

import iowithplugins.IShape;

public class Cerc implements IShape {

	private double ox;
	private double oy;
	private double raza;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void showDetails() {
		System.out.println("Cerc\t[ox=" + ox + ", oy=" + oy + ", raza=" + raza +"]");
	}

	@Override
	public void readDetails() {
		System.out.println("Introduceti datele cercului: ");
		System.out.println("\nox = ");
		ox = sc.nextInt();
		System.out.println("\noy = ");
		oy = sc.nextInt();
		System.out.println("\nraza = ");
		raza = sc.nextInt();
	}

}
