package board;

import java.util.ArrayList;
import java.util.Scanner;

import iowithplugins.IShape;

public class Board {
	private  ArrayList<IShape> shapes = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	
	public void addShape(IShape shape)
	{
		shape.readDetails();
		shapes.add(shape);
		System.out.print("\n**********************************\n");
		System.out.println("Forma adaugata:");
		shape.showDetails();
	}
	
	public void removeShape()
	{
        if(shapes.isEmpty()){
            System.out.print("*****************\n");
            System.out.print("Plansa este goala\n");
            System.out.print("*****************\n");
        }
        else{
            int index;
            this.printShapes();
            System.out.println("Introduceti index-ul figurii geometrice pe care doriti sa o stergeti: ");
            System.out.print("Index= "); index= in.nextInt();
            shapes.remove(index);
        }
    }
	
	 public void printShapes()
	 {
	        if(shapes.isEmpty()){
	            System.out.print("*****************\n");
	            System.out.print("Plansa este goala\n");
	            System.out.print("*****************\n");
	        }
	        else{
	            String textIndex="Index ";
	            int index=0;
	            for(var shape: shapes){
	                System.out.print("\n"+textIndex + index++ + "\n");
	                shape.showDetails();
	            }
	        }
	    }
	 
	 public void editShape()
	 {
	        if(!shapes.isEmpty()){
	            int index;
	            this.printShapes();
	            System.out.print("Introduceti index-ul figurii geometrice pe care doriti sa o modificati: ");
	            System.out.print("Index= ");  index= in.nextInt();
	            shapes.get(index).readDetails();
	        }
	    }
}
