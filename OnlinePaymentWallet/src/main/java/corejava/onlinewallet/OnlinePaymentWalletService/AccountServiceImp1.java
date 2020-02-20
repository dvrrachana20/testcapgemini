package corejava.onlinewallet.OnlinePaymentWalletService;

import corejava.onlinewallet.OnlinePaymentWalletBean.Model;
import corejava.onlinewallet.OnlinePaymentWalletDAO.AccountDaoImp1;

public class AccountServiceImp1 implements AccountService {
	AccountDaoImp1 adi = new AccountDaoImp1();

	public int getLoginDetails(int userId) {

		int a = adi.getLoginDetails(userId);
		return a;
	}

	public Model getLoginDetails(int userId, String password) {

		Model a = adi.getLoginDetails(userId, password);
		return a;
	}

	public int rechargeAccount(int userId1, double amount) {
		int a = adi.rechargeAccount(userId1, amount);
		return a;
	}

	public double showBalance(int userId2) {
		double a = adi.showBalance(userId2);
		return a;
	}

	public int transferAmount(int userId3, int userId4, double amount1) {
		int a = adi.transferAmount(userId3, userId4, amount1);
		return a;
	}
}
