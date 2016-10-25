package fcu.iecs.oop.password;

public class PassWordEncorder {
	public String Password;
	
	public String Encorder(String p){
		Password=p;
		Password=Password.replace('A', '\64');
		Password=Password.replace('a', '\64');
		Password=Password.replace('E', '\63');
		Password=Password.replace('e', '\63');
		Password=Password.replace('I', '\61');
		Password=Password.replace('i', '\61');
		Password=Password.replace('O', '\60');
		Password=Password.replace('o', '\60');
		Password=Password.replace('T', '\67');
		Password=Password.replace('t', '\67');
		
		return Password;
	}
}
