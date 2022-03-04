package elementos;

import org.openqa.selenium.By;

public class ElementosFinalizarCompra {

	private By cpCart = By.cssSelector("#menuCart > path");
	
	private By btCheckout = By.id("checkOutPopUp");

	public By getCpCart() {
		return cpCart;
	}

	public By getBtCheckout() {
		return btCheckout;
	}	
	
	
	
}
