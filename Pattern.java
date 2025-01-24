
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=5;r>=1;r--) {
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
		
		
		

	}

}
