/**
 •	Should contain a class attribute interestRate (double) that holds the interest rate defined. (note that 3% is equivalent to 0.03)
 •	Contains a changeInterest method that can be used to adjust the interest rate.
 •	Contains an addInterest method that adds the interest, as specified, to the account balance
 . To calculate the interest for the amount in the account you can use this formula:
   interestAmt = balance * interestRate / 100.0

 */
/**
 * specialized version of a bank account
 *
 * @author mohamed
 */
public class SavingAccount extends BankAccount{
    private double interestRate = 0.03;

    public SavingAccount() {
    }

    public void adjustInterestRate(double newRate) {
        this.interestRate = newRate;

    }

    /**
     *
     * @param addInterest to saving account
     * @return saving account balance after ass interest rate
     */
    public double addInterest(double addInterest){

        return getBalance()*addInterest/100.0;
    }
//    public double transfer(double transferAmount){
//        return getBalance()-transferAmount ;
//
//    }

}
