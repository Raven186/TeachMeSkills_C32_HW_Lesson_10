package com.teachmeskills.lesson_10.model.client;

import com.teachmeskills.lesson_10.model.account.Account;
import com.teachmeskills.lesson_10.model.card.BaseCard;

public class IndividualClient extends BaseClient {

    String passportNumber;

    public IndividualClient(String name, String passportNumber) {
        super(name);
        this.passportNumber = passportNumber;
    }
}
