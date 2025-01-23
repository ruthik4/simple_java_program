import java.util.Scanner;
public class Primefun {
	public static int fun(int num1) {
		int count=0;
		for(int i=1;i<=num1;i++) {
			if(num1 % i ==0) {
				count++;
				
			}
			
		}
		System.out.println("edited program");
		System.out.println("edited program");
		System.out.println("edited program");
		
		return count;
		
	}

	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a=sc.nextInt();
		if (fun(a)==2) System.out.println("yes");
		else System.out.println("no");
		sc.close();
	}
}
