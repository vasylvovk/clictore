package org.ua.mk.vovk.clistore.authitentication;

import java.util.ArrayList;

/**
 * Created by vasyl on 1/20/16.
 */
public class UserBase {
    ArrayList<User> usBase = new ArrayList<>();

    public boolean addUser(User user) {
        return usBase.add(user);
    }

    public boolean removeUser(User user) {
        return usBase.remove(user);
    }
}
