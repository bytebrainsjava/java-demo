package encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {

		
		Account account = new Account();
		
		Scanner scanner = new Scanner(System.in);
		
		account.setCustomerName("Rajiv Kumar");
		account.setAccountNumber(12345678);
		
		System.out.println("Enter Account Balance ");
		int accountBalance = scanner.nextInt();
		
		account.setAccountBalance(accountBalance);
		
		System.out.println("Before Withdrawal: " +account);

		System.out.println("Enter Withdrawal amount ");
		int withdrawalAmount = scanner.nextInt();
		
		//account.withdrawAmount = withdrawalAmount;
		try {
			
			account.setWithdrawAmount(withdrawalAmount);
			updateAccountBalance(account, accountBalance, withdrawalAmount);
			System.out.println("After Withdrawal: " +account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

	private static void updateAccountBalance(Account account, int accountBalance, int withdrawAmount) {
				account.setAccountBalance(accountBalance - withdrawAmount);
		
	}

}
