package encapsulation;

public class Account {
	
	private int accountNumber;
	private String customerName;
	private int accountBalance;
	private int withdrawAmount;
	
	public int getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) throws Exception {
		
		if(this.accountBalance > withdrawAmount) {
			this.withdrawAmount = withdrawAmount;
		}
		else {
			throw new Exception("Account balance is less than your withdrwal amount");
		}
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance + ", withdrawAmount=" + withdrawAmount + "]";
	}

	


}
