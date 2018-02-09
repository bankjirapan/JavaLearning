public class TestBankAccount{
	public static void main(String args[]){
		BankAccount somchai=new BankAccount();
		somchai.setAccId(123456);
		somchai.deposit(500);
		somchai.withdraw(100);
		somchai.getBalance();
		System.out.println(somchai);
		
		BankAccount somsri=new BankAccount();
		somsri.setAccId(1234561);
		System.out.println(somsri.equals(somchai));
		
	}
}