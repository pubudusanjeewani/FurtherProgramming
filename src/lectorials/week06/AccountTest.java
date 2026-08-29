package lectorials.week06;

import lectorials.week01.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account testAccount;

    @Before
    public void setUp(){
        this.testAccount = new Account("s123","Amy", 100);
    }

    @Test
    public void withdraw_With_Sufficient_Balance(){
        //this.testAccount = new Account("s123","Amy", 100);
        this.testAccount.withdraw(10);
        assertEquals(this.testAccount.getBalance(), 90.0, 0.0);
        //this.testAccount = null;
    }

    @Test
    public void withdraw_With_Insufficient_Balance(){
       // this.testAccount = new Account("s123","Amy", 100);
        this.testAccount.withdraw(200);
        assertEquals(this.testAccount.getBalance(), 100.0, 1e-10);
        //this.testAccount = null;
    }

    @Test (expected = IllegalArgumentException.class)
    public void addInterest_With_Negative_Rate(){
        //this.testAccount = new Account("s123","Amy", 100);
        this.testAccount.addInterest(-1.0);
        //this.testAccount = null;
    }

    @After
    public void tearDown(){
        this.testAccount = null;
    }

}
