package corejava.onlinewallet.OnlinePaymentWallet;


import java.util.HashMap;
import java.util.Scanner;

import corejava.onlinewallet.OnlinePaymentWalletBean.Model;
import corejava.onlinewallet.OnlinePaymentWalletDAO.AccountDaoImp1;
import corejava.onlinewallet.OnlinePaymentWalletException.WalletNoException;
import corejava.onlinewallet.OnlinePaymentWalletService.AccountServiceImp1;

public class MainUI {
	Scanner s = new Scanner(System.in);

	public int loginDetails() {

		System.out.print("Enter UserId:");
		int userId = s.nextInt();
		AccountServiceImp1 asi = new AccountServiceImp1();
		int a = (asi.getLoginDetails(userId));
		return a;
	}

	public Model passwordDetails(int userId) {

		System.out.print("Enter password:");
		String password = s.next();
		AccountServiceImp1 asi = new AccountServiceImp1();
		Model a1 = asi.getLoginDetails(userId, password);
		return a1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AccountDaoImp1 adi = new AccountDaoImp1();
		AccountServiceImp1 asi = new AccountServiceImp1();
		while (true) {
            System.out.println("------------PAYMENT WALLET-----------\n\n");
			System.out.println(" 1.Register\n 2.Add amount\n 3.Show balance\n 4.Transfer\n 5.Exit ");
			System.out.print("Enter Your Chioce : ");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter Id:");
				int userId = s.nextInt();
				System.out.println("enter password:");
				String password = s.next();
				System.out.println("enter name:");
				String name = s.next();
				int balance = 0;
				adi.ScannerMap(userId, password, name, balance);
				break;
			case 2:
				MainUI ui = new MainUI();
				int a = ui.loginDetails();
				try {
					if (a == 0) {
						throw new WalletNoException("Invalid Number");
					}

				} catch (WalletNoException e) {
					System.out.println("ERROR: user not found");
					break;
				}
				Model a1 = ui.passwordDetails(a);
				try {
					if (a1 == null)
						throw new WalletNoException("Invalid password");
					else {
						System.out.println("Logged in succesfully");
					}
				}

				catch (WalletNoException e) {
					System.out.println("ERROR: Password incorrect");
					break;
				}

				System.out.println("Add amount:");
				double amount = s.nextDouble();
				int i = asi.rechargeAccount(a, amount);
				System.out.println("Amount of "+amount+" Deposited Successfully");
				break;
			case 3:
				MainUI ui3 = new MainUI();
				int a2 = ui3.loginDetails();
				try {
					if (a2 == 0) {
						throw new WalletNoException("Invalid Number");
					}

				}

				catch (WalletNoException e) {
					System.out.println("ERROR: user not found");
					break;
				}
				Model a3 = ui3.passwordDetails(a2);
				try {
					if (a3 == null)
						throw new WalletNoException("Invalid password");
					else {
						System.out.println("Logged in Succesfully");
					}
				}

				catch (WalletNoException e) {
					System.out.println("ERROR: password incorrect");
					break;
				}

				double a4 = asi.showBalance(a2);
				System.out.println("Balance in Your Wallet : " +a4);
				break;
			case 4:
				MainUI ui2 = new MainUI();
				int a5 = ui2.loginDetails();
				try {
					if (a5 == 0) {
						throw new WalletNoException("Invalid Number");
					}

				}

				catch (WalletNoException e) {
					System.out.println("ERROR: user not found");
					break;
				}
				Model a6 = ui2.passwordDetails(a5);
				try {
					if (a6 == null)
						throw new WalletNoException("Invalid password");
					else {
						System.out.println("Logged in succesfully");
					}
				}

				catch (WalletNoException e) {
					System.out.println("ERROR: password incorrect");
					break;
				}

				System.out.println("\nEnter your userid:");
				int userId3 = s.nextInt();
				System.out.println("\nEnter another userid");
				int userId4 = s.nextInt();
				System.out.println("amount to be transfered");
				double amount1 = s.nextInt();
				int k = asi.transferAmount(userId3, userId4, amount1);
				if (k == 1)
					System.out.println("Transfered Successfully ");
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}
