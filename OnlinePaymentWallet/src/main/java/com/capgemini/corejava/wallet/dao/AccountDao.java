
package com.capgemini.corejava.wallet.dao;

import com.capgemini.corejava.wallet.model.Model;

public interface AccountDao {
	int getLoginDetails(int userId);

	Model getLoginDetails(int userId, String password);

	int rechargeAccount(int userId1, double amount);

	double showBalance(int userId2);

	int transferAmount(int userId3, int userId4, double amount);
}
