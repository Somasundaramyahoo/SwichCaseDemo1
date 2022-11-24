package encapsulation;

public class UseBankAccount {
public static void main(String[] args) {
	BankAccount ba=new BankAccount();
	BankAccount ba2=new BankAccount();
	BankAccount ba3=new BankAccount();
	
	ba.setAccountNumber(12345678);
	ba.setName("somu");
	ba.setIfsc("SBI000862");
	ba.setIsSavingAccount(true);
	ba2.setAccountNumber(98765432);
	ba2.setIfsc("ICC00765");
	ba2.setName("sundaram");
	ba2.setIsSavingAccount(false);
	ba3.setAccountNumber(486587873);
	ba3.setIfsc("IDB00736");
	ba3.setIsSavingAccount(true);
	ba3.setName("vikram");
	BankAccount[] banks={ba,ba2,ba3};
	for(BankAccount b:banks){
		System.out.println();
System.out.println(b.getAccountNumber()+", "+b.getName()+",  "+b.getIfsac()+",  "+b.getIsSavingAccount());	
}
}
}