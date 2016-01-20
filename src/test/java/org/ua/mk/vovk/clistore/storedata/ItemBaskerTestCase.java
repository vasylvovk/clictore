package org.ua.mk.vovk.clistore.storedata;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by vasyl on 12/25/15.
 */
public class ItemBaskerTestCase {
	
	ItemBasket itemBasket;
	Item item, item1;
	
	Date testDate = new Date();
	
	@Before
	public void setUp() {
		itemBasket = new ItemBasket();
		item = new Item();
		item.setItemName("good_one");
		item.setProduserName("producer_one");
		item.setExpirationDate(testDate);
		item.setPrice(100);
	}
	
	@Test
	public void testAddItem() {
		Assert.assertTrue(itemBasket.addItem(item));
	}
	
	@Test
	public void testRemoeItem() {
		Assert.assertTrue(itemBasket.addItem(item));
		Assert.assertTrue(itemBasket.removeItem(item));
	}
	
	@Test
	public void testSummarize() {
		Assert.assertTrue(itemBasket.addItem(item));
		Assert.assertTrue(itemBasket.addItem(item));
		Assert.assertEquals(200, itemBasket.sumarize());
	}
}
