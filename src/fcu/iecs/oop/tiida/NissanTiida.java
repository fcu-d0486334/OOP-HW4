package fcu.iecs.oop.tiida;

public class NissanTiida {
	public int i;
	public int j;
	public int call;
	
	public void tiida(int r){
		call=r;
		for(i=1;i<=call;i++){
			for(j=1;j<=call;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
