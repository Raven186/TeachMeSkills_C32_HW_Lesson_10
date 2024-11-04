package com.teachmeskills.lesson_10.transfer.impl;

import com.teachmeskills.lesson_10.model.card.BaseCard;
import com.teachmeskills.lesson_10.model.document.Check;
import com.teachmeskills.lesson_10.transfer.CardTransferService;

import java.util.Date;

public class VisaCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer)) {
            return new Check(sumOfTransfer, new Date(), cardFrom);
        } else {
            Check errorCheck = new Check(sumOfTransfer, new Date(), cardFrom);
            errorCheck.setComment("Error of operation");
            return errorCheck;
        }
    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer)) {
            return new Check(sumOfTransfer, new Date(), cardFrom);
        } else {
            Check errorCheck = new Check(sumOfTransfer, new Date(), cardFrom);
            errorCheck.setComment("Error of operation");
            return errorCheck;
        }
    }

}