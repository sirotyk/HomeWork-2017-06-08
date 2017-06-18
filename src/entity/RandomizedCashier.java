package entity;

import java.security.SecureRandom;
import java.util.Random;


public class RandomizedCashier extends RandomizedAction implements Cashier {

    @Override
    public int buySellOperation () {
        return randomAction();

    }

}
