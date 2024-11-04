package com.teachmeskills.lesson_10.transfer;

import com.teachmeskills.lesson_10.model.card.BaseCard;
import com.teachmeskills.lesson_10.model.document.Check;

public interface CardTransferService {
    Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

    Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

}
