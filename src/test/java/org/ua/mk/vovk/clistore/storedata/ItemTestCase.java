package org.ua.mk.vovk.clistore.storedata;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by vasyl on 12/25/15.
 */
public class ItemTestCase {
    Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item();
    }

    @Test
    public void testSetGetItemName() {
        String testStr = "ItemName";
        item.setItemName(testStr);
        Assert.assertEquals(testStr, item.getItemName());
    }

    @Test
    public void testSetGetProduserName() {
        String testStr = "ProduserName";
        item.setProduserName(testStr);
        Assert.assertEquals(testStr, item.getProduserName());
    }

    @Test
    public void testSetGetExpirationDate() {
        Date testDate = new Date();
        item.setExpirationDate(testDate);
        Assert.assertEquals(testDate, item.getExpirationDate());
    }

    @After
    public void tearDown() throws Exception {

    }

}
