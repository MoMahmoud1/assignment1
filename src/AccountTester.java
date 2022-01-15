import java.util.Scanner;

/**
 * simple tester class
 * @author mohamed
 */
public class AccountTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        BankAccount bankAccount = new BankAccount();


        //todo repeat the condition
        String userInput = "y";
        while (userInput.equalsIgnoreCase("y")) {
            SavingAccount mohamedSaving = new SavingAccount();
            ChequingAccount mahmoudChequing = new ChequingAccount(1000);
            mohamedSaving.deposit(5000);
            mohamedSaving.addInterest(0.03);


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
            //todo userInput menu for the user
            System.out.println("""
                    Choice Menu:\s
                    1- Deposit to Savings.\s
                    2- Deposit to chequing. \s
                    3- Withdraw from chequing.\s
                    4- Transfer from one account to another.\s
                    5- Chequing account fee.\s
                    6-Print balances of accounts.\s""");
            System.out.print("Enter your choice: ");
            //todo get userInput form the user
            int userChoice = input.nextInt();
            //todo execute the userInput for the user ,deposit to saving amount
            if (userChoice == 1){
                System.out.print("Enter your deposit amount: ");
                double amount = input.nextDouble();
                mohamedSaving.deposit(amount);
                System.out.println("this amount "+amount+" has been deposited");
                System.out.println("saving account balance is:"+mohamedSaving.getBalance());}
            //todo execute the userInput for the user ,deposit to chequing amount
            else if(userChoice == 2){
                System.out.print("Enter your deposit amount: ");
                double amount = input.nextDouble();
                mahmoudChequing.deposit(amount);
                System.out.println("this amount "+amount+" has been deposited");
                System.out.println("saving account balance is:"+mahmoudChequing.getBalance());}
            //todo execute the userInput for the user ,withdraw to chequing amount
            else if (userChoice == 3){
                System.out.print("Enter your withdraw amount ");
                double amount = input.nextDouble();
                mahmoudChequing.withdrawAmt(amount);
                System.out.println("this amount "+amount+" has been withdraw");
                System.out.println("Chequing account balance is:"+mahmoudChequing.getBalance());

                }
            //todo execute the userInput for the user ,transfer amount form account to another
            else if(userChoice == 4){
                System.out.println("""
                        please enter your userInput account you like to transfer to\s
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

                else {System.out.println("you entered invalid userInput ");}
                //todo execute the userInput for the user ,show fee for chequing account transaction
            } else if(userChoice == 5){
                System.out.println("Chequing account fee : "+mahmoudChequing.transactionFee());


            }
            //todo execute the userInput for the user , show account balance
            else if(userChoice == 6){
                System.out.println("Account balance: "+(mahmoudChequing.getBalance()+mohamedSaving.getBalance()));
            }
            System.out.println("do you like to do more transaction (y/n)? ");
            userInput = input.next();
            }
        System.out.println("Bye!");
        }




}



