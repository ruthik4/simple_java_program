
import java.util.Scanner;
public class Factorial {
	public static void fac(int num1) {
		int f=1,i;
		for(i=1;i<=num1;i++) {
			f=f*i;
		}
		System.out.println(f);
		
		
	}

	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to find its factorial: ");
		int a=sc.nextInt();
		if(a<0) System.out.println("factorial doesnt exist for -ve numbers");
		else fac(a);
		sc.close();
	}
}
