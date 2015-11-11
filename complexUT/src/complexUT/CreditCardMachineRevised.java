package complexUT;

public class CreditCardMachineRevised {
	public int swipeCreditCard(String cardNumber, int expMonth, int expYear, String cvv, String merchantBankAcct,
			VisaChecker vc, ChinaTrustCCAuthorization ctccas) {
		if (vc.checkOk()) {
			ctccas.authorize();
			return 1;
		}

		return 0;
	}
}
