package elementos;

import org.openqa.selenium.By;

public class ElementoCompraTabletPopularOffer {
	
	private By btColorTabletBlue = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[1]/span[1]");
	
	private By btColorTabletGray = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[1]/span[2]");
	
	private By btAddMore = By.cssSelector("#productProperties > div.smoolMargin > e-sec-plus-minus > div > div.plus");
	
	private By btAddCart = By.name("save_to_cart");
	
	private By cpCheckout = By.id("checkOutPopUp");
	
	private By cpHome = By.cssSelector("body > div.uiview.ng-scope > nav > a.ng-scope");

	public By getBtColorTabletBlue() {
		return btColorTabletBlue;
	}

	public By getBtColorTabletGray() {
		return btColorTabletGray;
	}

	public By getBtAddMore() {
		return btAddMore;
	}

	public By getBtAddCart() {
		return btAddCart;
	}
	public By getcpCheckout() {
		return cpCheckout;
	}

	public By getCpHome() {
		return cpHome;
	}
	
	
	

}
