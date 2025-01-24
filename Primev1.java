
public class Primev1 {

	public static void main(String[] args) {
		int num=97,counter=0;
		for(int p=num;p>=1;p--) {
			if(num%p==0) {
				counter++;
			}
			}
			if(counter==2) System.out.println("yes");
			else System.out.println("no");
			
		}
		

	}


