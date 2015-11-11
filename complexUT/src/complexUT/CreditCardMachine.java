package complexUT;

public class CreditCardMachine {

	/**
	 * Swipes customer credit card and authorizes credit
	 * 
	 * @param cardNumber
	 * @param expMonth
	 * @param expYear
	 * @param cvv
	 * @param merchantBankAcct
	 * @return 1 if card successfully authorized, 0 if failure
	 */
	public int swipeCreditCard(String cardNumber, int expMonth, int expYear, String cvv, String merchantBankAcct) {
		// check with visa cardNumber is valid
		VisaChecker vc = new VisaCheckerService(cardNumber, expMonth, expYear, cvv);

		if (vc.checkOk()) {
			// request authorization from merchantBankAcct
			ChinaTrustCCAuthorization ctccas = new ChinaTrustCCAuthorizationService(cardNumber, expMonth, expYear, cvv,
					merchantBankAcct);
			ctccas.authorize();
			return 1;
		}

		return 0;
	}

}
