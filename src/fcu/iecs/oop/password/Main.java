package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		boolean b=true;
		String PassWord,NewPassword;
		PassWordEncorder Encoder=new PassWordEncorder();
		while(b){
		System.out.print("Please enter a password:");
		PassWord=scn.next();
		if(PassWord.equalsIgnoreCase("exit")==true){
			break;
		}
		NewPassword=Encoder.Encorder(PassWord);
		System.out.println(NewPassword);
		}
		scn.close();
	}
}
