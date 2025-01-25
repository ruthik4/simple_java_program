

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1;r<=5;r++) {
			for(int c=5;c>=r;c--) {
				 System.out.print(c+" ");
			}
			System.out.println("\n");
		}
		
		
		
		//star pattern
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
System.out.println("fshgfsajdgf");		
		
//printing hallow rectangle

		for(int i=1;i<=3;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1 || i==3 || j==1 || j==7) System.out.print("*");
				else System.out.print(" ");
				
			}
			System.out.println();
		}
		
		

	}

}
