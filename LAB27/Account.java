package LAB27;

public class Account {
    private String accoutNo;
    private double balance;
    private double rate;
    Customer cus;

    Account() {
        cus = new Customer();
    }

    Account(String firstname, String lastname, String id, String accoutNo, double balance, double rate) {
        if (balance >= 1000) {
            cus = new Customer(firstname, lastname, id);
            this.accoutNo = accoutNo;
            this.balance = balance;
            this.rate = rate;
        } else {
            cus = new Customer();
        }
    }

    public String getAccountNo() {
        return accoutNo;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public void setAccountNo(String accoutNo) {
        this.accoutNo = accoutNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setFirstname(String firstname) {
        cus.setFirstname(firstname);
    }

    public void setLastname(String lastname) {
        cus.setLastname(lastname);
    }

    public void setId(String id) {
        cus.setId(id);
    }

    public void balance(double balance) {
        this.balance = balance;
    }

    public void showAccount() {
        //System.out.println("============================================");
        System.out.println("Accout No:\t " + getAccountNo());
        System.out.println("Balance:\t " + getBalance());
        //System.out.println("============================================");
    }

    public void ShowCustomer() {
        System.out.println("============================================");
        cus.ShowCustomer();
        System.out.println("============================================");
    }

    public void ShowAll() {
        System.out.println("============================================");
        cus.ShowCustomer();
        System.out.println("Accout No:\t " + getAccountNo());
        System.out.println("Balance:\t " + getBalance());
        System.out.println("============================================");
    }

}
