package Junit;

import Assignment4.InsufficientBalanceException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccTest {

    @Test(expected = InsufficientBalanceException.class)
    public void withdrawAmountGreaterThanBalance() throws InsufficientBalanceException {

        BankAcc bankAcc = new BankAcc();
        bankAcc.withdrawFunctionality(20000);


    }
}