public class BankAccount{
	private int accId;
	private double balance;
		
	public void setAccId(int id){
		accId=id;
	}
	
	public void setBalance(double bal){
		balance=bal;
	}
	
	public int getAccId(){
		return accId;
	}
	
	public double getBalance(){
		return balance;
	}
	
		
	public void deposit(double amount){
		balance=balance+amount;
	}
	
	public void withdraw(double amount){
		if(amount<=balance)
			balance=balance-amount;
		else
			System.out.println("Your withdraw amount is greater than your current balance!?!?!");
	}
	
	public String toString(){
		return "Account Id = "+ accId +"\nBalance = " +balance;
	}
	
	public boolean equals(Object o){
		
		if(o !=null && o instanceof BankAccount){
			BankAccount tmp=(BankAccount)o;
			if(accId==tmp.getAccId())
				return true;
		}
		return false;
	}
	
	
	
}