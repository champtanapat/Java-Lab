package LAB27;

public class Bank {
    // ฝากเงิน
    public static void deposit(Account acc, double money) {
        double balance;
        if (acc.getAccountNo() != null) {
            System.out.println("===============Deposit=========================");
            System.out.println("Accout No:\t " + acc.getAccountNo());
            System.out.println("Balance:\t " + acc.getBalance());
            System.out.println("Deposit:\t " + money);
            balance = acc.getBalance() + money;
            acc.setBalance(balance);
            System.out.println("Balance Now:\t " + acc.getBalance());
            System.out.println("============================================");
        } else {
            System.out.println("You have not opened an account");
        }
    }

    // ถอนเงิน
    public static void withdraw(Account acc, double money) {
        double balance;
        if (acc.getAccountNo() != null) {
            if (acc.getBalance() >= money) {
                balance = acc.getBalance() - money;
                if (balance >= 1000) {
                    System.out.println("==================Withdraw======================");
                    System.out.println("Accout No:\t " + acc.getAccountNo());
                    System.out.println("Balance:\t " + acc.getBalance());
                    System.out.println("Withdraw:\t " + money);
                    acc.setBalance(balance);
                    System.out.println("Balance Now:\t " + acc.getBalance());
                    System.out.println("============================================");
                } else {
                    System.out.println("Cannot Withdraw " + money + "The balance greater than equal 1,000");
                }
            } else {
                System.out.println("Cannot Withdraw " + money + " The balance is not enough ");
            }
        } else {
            System.out.println("You have not opened an account");
        }
        ;
    }

    // คำนวณดอกเบี้ย
    public static double calRate(Account acc, int day) {
        double balance, rate;
        balance = acc.getBalance();
        rate = acc.getRate() / 100;
        return ((balance * rate * day) / 365);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Tanapat", "Permpoon", "x01", "001", 2000, 1);
        acc1.ShowAll();
        System.out.println("Cal Rate:" + calRate(acc1, 180));
        deposit(acc1, 500);
        //acc1.showAccount();
        withdraw(acc1, 1500);
        //acc1.showAccount();
        acc1.setFirstname("Champ");
        acc1.setLastname("Permpool");
        acc1.ShowAll();

        System.out.println("*************************************************************");
        Account acc2 = new Account("A", "AA", "x02", "002", 10000, 10);
        acc2.ShowCustomer();
        acc2.showAccount();
        System.out.println("Cal Rate:" + calRate(acc1, 365));
        deposit(acc2, 100);
        withdraw(acc2, 60);
        acc2.setFirstname("B");
        acc2.setFirstname("BB");
        System.out.println("*************************************************************");

        //acc2.ShowAll();
    }
}
