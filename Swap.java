
public class Swap {

	public static void main(String[] args) {
		String name1="surya";
		String name2="prany";
		System.out.println("before swapping--->");
		System.out.println("name1= "+name1);
		System.out.println("name2="+name2);
		name2=name2+name1; //name2=suryapranay
		name1=name2.substring(0, name2.length()-name1.length());
		name2=name2.substring(name1.length());
		System.out.println("after swapping");
		System.out.println("name1-->"+name1);
		System.out.println("name2-->"+name2);
		

	}

}
