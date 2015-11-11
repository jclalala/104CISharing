package complexUT;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardMachineRevisedTest {

	@Test
	public void test() {
		VisaChecker visaCheckerMock = new VisaChecker() {
			@Override
			public boolean checkOk() {
				return true;
			}
		};

		ChinaTrustCCAuthorization chinaTrustCCAuthorizationMock = new ChinaTrustCCAuthorization() {
			@Override
			public void authorize() {
				// do nothing
			}
		};

		CreditCardMachineRevised ccMachine = new CreditCardMachineRevised();

		Assert.assertEquals(1, ccMachine.swipeCreditCard("testStr", 1, 2016, "123", "testMerchantBankAcct",
				visaCheckerMock, chinaTrustCCAuthorizationMock));
	}

}
