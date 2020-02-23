package corejava.onlinewallet.OnlinePaymentWallet;



//import junit.framework.*;
import java.util.HashMap;
import com.capgemini.corejava.wallet.dao.AccountDaoImp1;
import com.capgemini.corejava.wallet.model.Model;

import junit.framework.TestCase;

	

	public class Test extends TestCase {
		AccountDaoImp1 t1=new AccountDaoImp1() ;
		HashMap<Integer, Model> hmap = new HashMap<Integer, Model>();	
		

	
		public void test() {
			assertEquals(600,t1.rechargeAccount(10131, 400.0));
		}
	
	public void test1() {
			
			assertEquals(200.0,t1.showBalance(10131));
			
		}

	}

	


