package elementos;

import org.openqa.selenium.By;

public class ElementosOrderPayment {
	
	private By detailsBtNext = By.id("next_btn");
	
	private By btChoosePaymentSafepay = By.name("safepay");
	
	private By btChoosePaymentMasterCredit = By.name("masterCredit");
	
	private By cpSafepayUser = By.name("safepay_username");
	
	private By cpSafepayPassword = By.name("safepay_password");
	
	private By cpMasterCardNumber = By.id("creditCard");
	
	private By cpMasterCvvNumber = By.name("cvv_number");
	
	private By btExpirationDateMonth1 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[2]");
	
	private By btExpirationDateMonth2 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[3]");
	
	private By btExpirationDateMonth3 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[4]");
	
	private By btExpirationDateMonth4 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[5]");
	
	private By btExpirationDateMonth5 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[6]");
	
	private By btExpirationDateMonth6 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[7]");
	
	private By btExpirationDateMonth7 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[8]");
	
	private By btExpirationDateMonth8 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[9]");

	private By btExpirationDateMonth9 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[10]");
	
	private By btExpirationDateMonth10 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[11]");
	
	private By btExpirationDateMonth11 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[12]");
	
	private By btExpirationDateMonth12 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select/option[13]");
	
	private By btExpirationDateYear2021 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[2]");
	
	private By btExpirationDateYear2022 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[3]");
	
	private By btExpirationDateYear2023 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[4]");
	
	private By btExpirationDateYear2024 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[5]");
	
	private By btExpirationDateYear2025 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[6]");
	
	private By btExpirationDateYear2026 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[7]");
	
	private By btExpirationDateYear2027 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[8]");
	
	private By btExpirationDateYear2028 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[9]");
	
	private By btExpirationDateYear2029 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[10]");
	
	private By btExpirationDateYear2030 = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select/option[11]");
	
	private By cpCardholderName = By.name("cardholder_name");
	
	private By btPayNow = By.id("pay_now_btn_ManualPayment");

	public By getDetailsBtNext() {
		return detailsBtNext;
	}

	public By getBtChoosePaymentSafepay() {
		return btChoosePaymentSafepay;
	}

	public By getBtChoosePaymentMasterCredit() {
		return btChoosePaymentMasterCredit;
	}

	public By getCpSafepayUser() {
		return cpSafepayUser;
	}

	public By getCpSafepayPassword() {
		return cpSafepayPassword;
	}

	public By getCpMasterCardNumber() {
		return cpMasterCardNumber;
	}

	public By getCpMasterCvvNumber() {
		return cpMasterCvvNumber;
	}

	public By getBtExpirationDateMonth1() {
		return btExpirationDateMonth1;
	}

	public By getBtExpirationDateMonth2() {
		return btExpirationDateMonth2;
	}

	public By getBtExpirationDateMonth3() {
		return btExpirationDateMonth3;
	}

	public By getBtExpirationDateMonth4() {
		return btExpirationDateMonth4;
	}

	public By getBtExpirationDateMonth5() {
		return btExpirationDateMonth5;
	}

	public By getBtExpirationDateMonth6() {
		return btExpirationDateMonth6;
	}

	public By getBtExpirationDateMonth7() {
		return btExpirationDateMonth7;
	}

	public By getBtExpirationDateMonth8() {
		return btExpirationDateMonth8;
	}

	public By getBtExpirationDateMonth9() {
		return btExpirationDateMonth9;
	}

	public By getBtExpirationDateMonth10() {
		return btExpirationDateMonth10;
	}

	public By getBtExpirationDateMonth11() {
		return btExpirationDateMonth11;
	}

	public By getBtExpirationDateMonth12() {
		return btExpirationDateMonth12;
	}

	public By getBtExpirationDateYear2021() {
		return btExpirationDateYear2021;
	}

	public By getBtExpirationDateYear2022() {
		return btExpirationDateYear2022;
	}

	public By getBtExpirationDateYear2023() {
		return btExpirationDateYear2023;
	}

	public By getBtExpirationDateYear2024() {
		return btExpirationDateYear2024;
	}

	public By getBtExpirationDateYear2025() {
		return btExpirationDateYear2025;
	}

	public By getBtExpirationDateYear2026() {
		return btExpirationDateYear2026;
	}

	public By getBtExpirationDateYear2027() {
		return btExpirationDateYear2027;
	}

	public By getBtExpirationDateYear2028() {
		return btExpirationDateYear2028;
	}

	public By getBtExpirationDateYear2029() {
		return btExpirationDateYear2029;
	}

	public By getBtExpirationDateYear2030() {
		return btExpirationDateYear2030;
	}

	public By getCpCardholderName() {
		return cpCardholderName;
	}

	public By getBtPayNow() {
		return btPayNow;
	}
	
	


}
