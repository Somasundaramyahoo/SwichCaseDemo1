package encapsulation;

public class BankAccount {
 private long accountNumber;
 private String name,ifsc;
 private boolean isSavingAccount; 		
 
 public void setAccountNumber(long accountNumber){
	 this.accountNumber=accountNumber;
 }
 public long getAccountNumber(){
	 return accountNumber;
 }
 public void setName(String name){
	 this.name=name;
 }
 public String getName(){
	 return name;
 }
 public void setIfsc(String ifsc){
	 this.ifsc=ifsc;
 }
 public String getIfsac(){
	 return ifsc;
 }
 public void setIsSavingAccount( boolean isSavingAccount){
	 this.isSavingAccount=isSavingAccount;
 }
 public boolean getIsSavingAccount(){
	 return isSavingAccount;
 }
}
