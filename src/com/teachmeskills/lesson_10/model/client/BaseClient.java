package com.teachmeskills.lesson_10.model.client;

import com.teachmeskills.lesson_10.model.account.Account;
import com.teachmeskills.lesson_10.model.card.BaseCard;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseClient {

    String name;
    Account[] accounts;
    List<BaseCard> cards = new ArrayList<>();

    public BaseClient(String name) {
        this.name = name;
    }

    public void addCard(BaseCard card) {
        cards.add(card);
    }

    public void showCardInfo() {
        int count = 0;
        for (int i = 0; i < cards.size()-1; i += 1) {
            for (int j = i + 1; j < cards.size(); j += 1) {
                if (cards.get(i).equals(cards.get(j))) {
                    count += 1;
                }
            }
        }
        if ((count > 0)) {
            System.out.println(name + " has " + count + " equals cards");
        } else {
            System.out.println(name + " has no equals cards");
        }
    }

}
