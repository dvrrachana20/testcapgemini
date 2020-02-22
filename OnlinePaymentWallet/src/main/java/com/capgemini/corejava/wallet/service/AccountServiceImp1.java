package com.capgemini.corejava.wallet.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.capgemini.corejava.wallet.accountdao.imp1.AccountDaoImp1;
import com.capgemini.corejava.wallet.exception.WalletNoException;
import com.capgemini.corejava.wallet.model.Model;

public class AccountServiceImp1 implements AccountService {
	com.capgemini.corejava.wallet.dao.AccountDaoImp1 adi = new com.capgemini.corejava.wallet.dao.AccountDaoImp1();

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
	public boolean isValidName(int userid) {
		try{
		if(userid!=0) {
			return true;
		}
		else
			throw new WalletNoException("invalid userid ");	
		}
		catch(Exception e) {
			System.out.println("userid cannot be zero");
				return false;
			}
		}

       public boolean isValidPassword(String password) {
    	   try {
    		   Pattern p=Pattern.compile("[a-zA-Z]+");
    		   Matcher m=p.matcher(password);
    		   if(password.length()<=10&& m.matches()) {
    			   return true;
    		   }
    			   else 
    				   throw new WalletNoException("invalid");
    			   
    				  
    			   }
    	   catch(Exception e) {
    		   System.out.println("password should contain only alphabets");
    		   return false;
    		   }
    	   }
       }

