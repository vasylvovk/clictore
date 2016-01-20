package org.ua.mk.vovk.clistore.authitentication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.ua.mk.vovk.clistore.storedata.Item;
import org.ua.mk.vovk.clistore.storedata.ItemBasket;

import java.util.Date;

/**
 * Created by vasyl on 1/20/16.
 */
public class UserBaseTestCase {
    UserBase userBase;
    User user;

    Date testDate = new Date();

    @Before
    public void setUp() {
        userBase = new UserBase();
        user = new User();
        user.setUserName("name_one");
        user.setUserSername("sername_one");
        user.setUserPhoneNum("+0000000000");
    }

    @Test
    public void testAddUser() {
        Assert.assertTrue(userBase.addUser(user));
    }

    @Test
    public void testRemoeItem() {
        Assert.assertTrue(userBase.addUser(user));
        Assert.assertTrue(userBase.removeUser(user));
    }
}
