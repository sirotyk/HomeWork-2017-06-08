package entity;

/**
 * Created by Саша on 18.06.2017.
 */
public class RandomizedRegister extends RandomizedAction implements OutOfLengthRegistersString {
    @Override
    public int buySellOperation() {
        return randomAction();
    }
}
