package org.ua.mk.vovk.clistore.authitentication;

/**
 * Created by vasyl on 12/25/15.
 */
public class User {
    private String userName;
    private String userSername;
    private String userPhoneNum;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserSername(String userSername) {
        this.userSername = userSername;
    }

    public String getUserSername() {
        return this.userSername;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public String getPhoneNum() {
        return this.userPhoneNum;
    }
}
