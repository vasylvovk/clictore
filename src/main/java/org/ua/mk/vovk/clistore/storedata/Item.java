package org.ua.mk.vovk.clistore.storedata;

import java.util.Date;

/**
 * Created by vasyl on 12/25/15.
 */
public class Item {

    private String itemName;
    private String produserName;
    private Date expirationDate;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setProduserName(String produserName) {
        this.produserName = produserName;
    }

    public String getProduserName() {
        return this.produserName;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }
}
