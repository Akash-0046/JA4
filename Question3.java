package exception;

public class Question3 {
	
	long id;
	double balance;
	
	public Question3(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	double withdraw(double amount) throws InsufficientAccountBalance, IllegalBankTransactionException{
		
		if(amount>balance || balance==0)
			throw new InsufficientAccountBalance("Account doesn't have enough baalance");
		
		if(amount<0)
			throw new IllegalBankTransactionException("You are trying Invalid Transaction");
		balance-=amount;
		return amount;
		
	}
	
	double deposit(double amount){
		
		balance+=amount;
		return balance;
		
	}
	
	public static void main(String[] args) throws InsufficientAccountBalance, IllegalBankTransactionException {
		
		Question3 user1=new Question3(1, 0.0);
		
		double bal1=user1.deposit(5000.00);
		
		System.out.println("Available Balance: "+bal1);
		
		System.out.println("==================================================");
		
		double wd = user1.withdraw(-1000.00);
		
		System.out.println("Amount Withdrawn: "+wd);
		
		
	}
	
	

}
