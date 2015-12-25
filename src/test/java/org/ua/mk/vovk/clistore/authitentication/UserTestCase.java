package org.ua.mk.vovk.clistore.authitentication;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vasyl on 12/25/15.
 */
public class UserTestCase {
    User usr;

    @Before
    public void setUp() throws Exception {
        usr = new User();
    }

    @Test
    public void testSetGetUserName() {
        String uName = "userName";

        usr.setUserName(uName);

        Assert.assertEquals(uName, usr.getUserName());
    }

    @Test
    public void testSetGetUserSername() {
        String uSername = "userSername";

        usr.setUserSername(uSername);

        Assert.assertEquals(uSername, usr.getUserSername());
    }

    @Test
    public void testSetGetUserPhoneNum() {
        String uPhoneNum = "+00000000000";

        usr.setUserPhoneNum(uPhoneNum);

        Assert.assertEquals(uPhoneNum, usr.getPhoneNum());
    }

    @After
    public void tearDown()throws Exception {

    }
}
