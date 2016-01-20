package org.ua.mk.vovk.clistore.storedata;

import java.util.ArrayList;

/**
 * Created by vasyl on 1/20/16.
 */
public class ItemBasket {
    ArrayList<Item> basket = new ArrayList<>();

    public boolean addItem(Item item) {
        return basket.add(item);
    }

    public boolean removeItem(Item item) {
        return basket.remove(item);
    }

    public int sumarize() {
        int res = 0;
        for (Item item: basket) {
            res += item.getPrice();
        }
        return res;
    }
}
