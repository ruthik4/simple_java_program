
public class SBIAccountCall {

	public static void main(String[] args) {
		SBIAccount a=new SBIAccount("Ruthik","12341234",500);
		System.out.println(a);
		a.deposit(500);
		a.checkBalance();
		a.withDraw(100);
		a.checkBalance();

	}

}
