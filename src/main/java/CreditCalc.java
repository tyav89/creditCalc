public class CreditCalc {
    public int monthlyPayment(int loanAmount, double interestRate, int loanPeriod){
        return (int) Math.round (loanAmount * (interestRate + ( interestRate/ (Math.pow((1 + interestRate), loanPeriod) - 1))));
    }

    public int totalAmount(int loanAmount, double interestRate, int loanPeriod){
        return monthlyPayment(loanAmount, interestRate, loanPeriod) * loanPeriod;
    }

    public int overpaymentCalc(int loanAmount, double interestRate, int loanPeriod){
        return totalAmount(loanAmount, interestRate, loanPeriod) - loanAmount;
    }
}
