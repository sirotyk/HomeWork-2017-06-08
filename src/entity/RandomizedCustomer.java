package entity;

import java.security.SecureRandom;
import java.util.Random;

public class RandomizedCustomer extends RandomizedAction implements Customer {

    @Override
    public int buySellOperation () {
        return randomAction();
    }
}
