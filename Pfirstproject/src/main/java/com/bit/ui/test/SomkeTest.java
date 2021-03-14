package com.bit.ui.test;

import org.junit.Test;

import DB.TestData;
import pages.HomePage;
import pages.JeanPage;
import pages.MenPage;
import pages.ProductDetailsPage;
import pages.ShirtPage;

public class SmokeTest extends BaseTest{
int x=7;
	HomePage homePage;
	MenPage menPage;
	JeanPage jeanPage;
	ProductDetailsPage pdp;
	ShirtPage sp;
	
	
	@Test
	public void buyAJeansPant() {
		System.out.println("test started");
		homePage=new HomePage(driver);
		menPage=homePage.clickMenMenuLink();
		jeanPage=menPage.clickOnJeans();
		pdp=jeanPage.clickOnJeansPant();
	}
	@Test
	public void buyAShirt() {
		System.out.println("test started");
		homePage=new HomePage(driver);
		menPage=homePage.clickMenMenuLink().get();
		sp=menPage.clickOnShirt();
		pdp=sp.clickOnShrtProduct();
		pdp.verifyDiscountPriceOfShirt();
		pdp.selectSized(TestData.Size[0]);
		pdp.selectShirtColor("title", TestData.colors[0]);
	}
	@Test
	public void buyASmallShirt() {
		System.out.println("test started");
		homePage=new HomePage(driver);
		menPage=homePage.clickMenMenuLink();
		sp=menPage.clickOnShirt();
		pdp=sp.clickOnShrtProduct();
		pdp.verifyDiscountPriceOfShirt();
		pdp.selectSized(TestData.Size[1]);
		pdp.selectShirtColor("title", TestData.colors[1]);
	}
}x`
