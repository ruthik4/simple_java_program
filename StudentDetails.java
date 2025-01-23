import java.util.Scanner;
public class StudentDetails {
static void Details() {
	System.out.println("varma");
	System.out.println("pranay");
	System.out.println("prashanth");
	System.out.println("ruthik");
	
}
public static void main(String[] args) {
	String pass="msi";
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter password to see the details:");
	String check=sc.nextLine();
	if(check.equals(pass)) {
	    System.out.println("student details are:");
	    Details();
	}
	else
	{
		System.out.println("wrong password! try again");
		}
	sc.close();
}

}
