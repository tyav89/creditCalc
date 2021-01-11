import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCreditCalc {
    private CreditCalc creditCalc;
    private final int loanAmount = 100000;
    int loanPeriod = 12;
    double interestRate = (9.5 / 100) / 12;
    int payment = 8768;
    int sum = 105220;
    int overpayment = sum - loanAmount;

    @Before
    public void createNewCreditCalc() {
        creditCalc = new CreditCalc();
    }

    @Test
    public void testMonthlyPayment() {
        int monthlyPayment = creditCalc.monthlyPayment(loanAmount, interestRate, loanPeriod);
        Assert.assertTrue(monthlyPayment == payment);
    }

    @Test
    public void testCalcOfTheTotalAmountToBeReturned() {
        int total = creditCalc.totalAmount(loanAmount, interestRate, loanPeriod);
        Assert.assertTrue(total == sum);
    }

    @Test
    public void testOverpaymentCalc() {
        int opayment = creditCalc.overpaymentCalc(loanAmount, interestRate, loanPeriod);
        Assert.assertTrue(opayment == overpayment);
    }
}
