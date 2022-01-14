import java.util.Scanner;

/**
 * simple tester class
 */
public class AccountTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        SavingAccount mohamedSaving = new SavingAccount();
        ChequingAccount mahmoudChequing = new ChequingAccount(1000);
        mohamedSaving.deposit(5000);
        mohamedSaving.addInterest(0.03);

/*
        System.out.println("Chequing Account balance: "+mahmoudChequing.getBalance());
        System.out.println("Chequing account balance after withdraw 200 is : "+mahmoudChequing.withdrawAmt(200));
        System.out.println("Chequing account balance after withdraw 400 is : "+mahmoudChequing.withdrawAmt(400));
        System.out.println("Chequing account balance after withdraw 300 is : "+mahmoudChequing.withdrawAmt(300));
        System.out.println("Chequing account balance after withdraw 50  is : "+mahmoudChequing.withdrawAmt(50));
        mahmoudChequing.withdrawAmt(400);
        mahmoudChequing.withdrawAmt(300);
        mahmoudChequing.withdrawAmt(50);
        mohamedSaving.adjustInterestRate(0.05);
        System.out.println("Chequing Account fee\t: "+mahmoudChequing.transactionFee());
        System.out.println("Saving account balance  : "+mohamedSaving.getBalance());
*/

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("""
                    Main Menu:\s
                    1- Deposit to Savings.\s
                    2- Deposit to chequing. \s
                    3- Withdraw from chequing.\s
                    4- Transfer from one account to another.\s
                    5- Chequing account fee.\s
                    6-Print balances of accounts.\s""");
            System.out.print("Enter your choice: ");
            int number = input.nextInt();
            if (number == 1){
                System.out.print("Enter your deposit amount: ");
                double amount = input.nextDouble();
                mohamedSaving.deposit(amount);
                System.out.println("this amount "+amount+" has been deposited");
                System.out.println("saving account balance is:"+mohamedSaving.getBalance());}

            else if(number == 2){
                System.out.print("Enter your deposit amount: ");
                double amount = input.nextDouble();
                mahmoudChequing.deposit(amount);
                System.out.println("this amount "+amount+" has been deposited");
                System.out.println("saving account balance is:"+mahmoudChequing.getBalance());}

            else if (number == 3){
                System.out.print("Enter your withdraw amount ");
                double amount = input.nextDouble();
                mahmoudChequing.withdrawAmt(amount);
                System.out.println("this amount "+amount+" has been withdraw");
                System.out.println("Chequing account balance is:"+mahmoudChequing.getBalance());

                }
            else if(number == 4){
                System.out.println("""
                        please enter your choice account you like to transfer to\s
                        1.Chequing account.
                        2.Saving account.""");
                int to = input.nextInt();

                if (to == 1){
                    System.out.println("enter the amount you like to transfer");
                    double amount = input.nextDouble();
                    mohamedSaving.transfer(mahmoudChequing,amount);
                    System.out.println("this amount "+amount+" has been transferred to Chequing account ");
                    System.out.println("Chequing account balance is:"+mahmoudChequing.getBalance());}

                else if(to == 2){
                    System.out.println("enter the amount you like to transfer");
                    double amount = input.nextDouble();
                    mahmoudChequing.transfer(mohamedSaving,amount);
                    System.out.println("this amount "+amount+" has been transferred to Saving  account ");
                    System.out.println("Saving  account balance is: "+mohamedSaving.getBalance());}

                else {System.out.println("you entered invalid choice ");}
            } else if(number == 5){
                System.out.println("Chequing account fee : "+mahmoudChequing.transactionFee());
            }
            else if(number == 6){
                System.out.println("Account balance: "+bankAccount.getBalance());
            }
            System.out.println("do you like to do more transaction (y/n)? ");
            choice = input.next();
            }
        System.out.println("Bye!");
        }




}



