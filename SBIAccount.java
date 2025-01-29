
public class SBIAccount {
String name;
int accNo;
String mobile;
int balance;
public SBIAccount(String name, String mobile, int balance) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.balance = balance;
	this.accNo = generateAccNo();

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
int generateAccNo() {
	int max=5000;
	int min=500;
	int range=max-min+1;
	int randNo=(int)(Math.random()*range)+1;
	return randNo;
}
@Override
public String toString() {
	return "SBIAccount [name=" + name + ", accNo=" + accNo + ", mobile=" + mobile + ", balance=" + balance + "]";
}
void deposit(int amt){
	this.balance = this.balance + amt;
	System.out.println("successfully deposited..."+amt);
}

void checkBalance() {
	System.out.println("avl balance----->"+this.balance);
}
void withDraw(int amt) {

	if( this.balance > amt) {
		this.balance = this.balance - amt;
		System.out.println("successfully withDrawn..."+amt);
	}
	else {
		System.out.println("InSufficient Balance.....");
	}
}


}
