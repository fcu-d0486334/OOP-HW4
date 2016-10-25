package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i=0,num;
		NissanTiida shape=new NissanTiida();
		System.out.print("Please enter a number:");
		num=scn.nextInt();
		
		for(i=1;i<=num;i++){
			shape.tiida(i);
			System.out.println();
		}
		scn.close();
	}
}
