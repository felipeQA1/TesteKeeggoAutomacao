package elementos;

import org.openqa.selenium.By;

public class ElementoCompraNoteEsOffer {
	
	private By btColorNoteBlue = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[1]");
	
	private By btColorNoteBlack = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[2]");
	
	private By btColorNoteGray = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[3]");
	
	private By btColorNotePurple = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[4]");
	
	private By btColorNoteRed = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[5]");
	
	private By btColorNoteYellow = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[6]");
	
	private By btAddMore = By.className("plus");
	
	private By btAddCart = By.name("save_to_cart");
	
	private By cpCheckout = By.id("checkOutPopUp");
	
	private By cpHome = By.cssSelector("body > div.uiview.ng-scope > nav > a.ng-scope");

	public By getBtColorNoteBlue() {
		return btColorNoteBlue;
	}

	public By getBtColorNoteBlack() {
		return btColorNoteBlack;
	}

	public By getBtColorNoteGray() {
		return btColorNoteGray;
	}

	public By getBtColorNotePurple() {
		return btColorNotePurple;
	}

	public By getBtColorNoteRed() {
		return btColorNoteRed;
	}

	public By getBtColorNoteYellow() {
		return btColorNoteYellow;
	}

	public By getBtAddMore() {
		return btAddMore;
	}

	public By getBtAddCart() {
		return btAddCart;
	}

	public By getCpHome() {
		return cpHome;
	}

	public By getCpCheckout() {
		return cpCheckout;
	}

	

}
