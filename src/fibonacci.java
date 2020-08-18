
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		
		
		Scanner numero = new Scanner(System.in);
		System.out.println(" Ingrese un numero: ");
		long limite = numero.nextLong();
		
		System.out.println(limite);
		fibonacci(limite,0,1);

	}
	
	public static void fibonacci(long limite, long anterior, long actual) {
		if(limite >0)
		{
			System.out.println(" " + actual);
			fibonacci(limite-1 , actual , anterior + actual);
		}
	}

}
