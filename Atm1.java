import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;

class Credentials {
    void userCredentials() {
        System.out.println("please enter your username ");
        Scanner user = new Scanner(System.in);
        int username = user.nextInt();
        System.out.println("please enter your passcode ");
        int passcode = user.nextInt();
    }
    void menu(){
        System.out.println("enter numbers accordingly to access the features");
        System.out.println("enter 1; for MINI STATEMENT ");
        System.out.println("enter 2; for  WITHDRAWL");
        System.out.println("enter 3; for DEPOSITE ");
        System.out.println("enter 4; for TRANSFER ");
        System.out.println("enter 5; for QUIT");
    }
}
public class Atm1 {
    public static void main(String ...args){
        LocalDate dat = LocalDate.now();
        LocalTime tim = LocalTime.now();
        System.out.println(tim);
        System.out.println(dat);
        System.out.println("welcome");
Credentials c = new Credentials();
c.userCredentials();
c.menu();
int Amount = 1000;
Scanner user = new Scanner(System.in);
int a = user.nextInt();
if (a> 5){
    System.out.println("invalid input");
}else {
    switch (a) {
        case 1:
            System.out.println("no previous history present here  " + "total Balance " + Amount);
            break;
        case 2:
            System.out.println("enter amount to withdrawl");
            int withdrawlAmount = user.nextInt();
            System.out.println("wait transaction is being proceed");
            if (withdrawlAmount > Amount)
            {
                System.out.println("insufficient balance");
                System.out.println("remaining balance ");
                System.out.println(Amount );
            }
            else
            {
                System.out.println("remaining balance ");
                System.out.println(Amount - withdrawlAmount);
            }
            break;
        case 3:
            System.out.println("enter amount you wanna deposite");
            int depositeAmount = user.nextInt();
            System.out.println("wait transaction is being proceed ");
            System.out.println("new balance "  );
            System.out.println( depositeAmount + Amount);
            break;
        case 4:
            System.out.println("enter receviers account details ");
            System.out.println("account no. ");
            int d = user.nextInt();
            System.out.println("ifsc: ");
            int e = user.nextInt();
            System.out.println("enter amount you wanna transfer ");
            int transferAmonunt = user.nextInt();
            System.out.println("transaction is being processed");
            if (transferAmonunt>Amount)
            {
                System.out.println("INSUFFICIENT AMOUNT! TRANSACTION COULD NOT PROCEED");
            }
            else
            {
                System.out.println("remaing balance: ");
                System.out.println(Amount - transferAmonunt);
            }

            break;
        case 5:
            System.out.println("☺");
            break;

    }
}
        System.out.println("be back soon");
    }
}
