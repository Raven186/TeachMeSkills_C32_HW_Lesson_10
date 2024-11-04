package com.teachmeskills.lesson_10;

import com.teachmeskills.lesson_10.fabric.ParserFabric;
import com.teachmeskills.lesson_10.model.account.Account;
import com.teachmeskills.lesson_10.model.card.MasterCard;
import com.teachmeskills.lesson_10.model.card.VisaCard;
import com.teachmeskills.lesson_10.model.client.IndividualClient;
import com.teachmeskills.lesson_10.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_10.transfer.impl.VisaCardTransferService;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {
        IndividualClient client1 = new IndividualClient("Oleg Tinkoff", "1234 123456");
        IndividualClient client2 = new IndividualClient("German Gref", "9876 987654");

        MasterCard masterCard1 = new MasterCard("1234 123456", 123, new Date(), client1, "USD", "Russia");
        MasterCard masterCard2 = new MasterCard("1234 123456", 123, new Date(), client1, "USD", "Russia");
        MasterCard masterCard3 = new MasterCard("1234 123456", 123, new Date(), client1, "USD", "Russia");
        MasterCard masterCard4 = new MasterCard("3456 123456", 321, new Date(), client1, "USD", "Russia");

        VisaCard visaCard1 = new VisaCard("1234 123456", 123, new Date(), client2, "USD", 2);
        VisaCard visaCard2 = new VisaCard("3456 123456", 321, new Date(), client2, "USD", 2);

        client1.showCardInfo();
        client2.showCardInfo();
    }

}
