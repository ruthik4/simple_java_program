import java.util.Scanner;
public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any chatecter to check: ");
		char a=sc.next().charAt(0);
		if(a>='a' && a<='z') {
			System.out.println("you have entered  a small alphabet");
		}
		else if(a>='A' && a<='Z') {
			System.out.println("you have entered  a capital alphabet");
		}
		else if(a>='0' && a<='9') {
			System.out.println("you have entered a number!");
		}
		else {
			System.out.println("You have entered a symbol!");
		}
         sc.close();
	}

}
