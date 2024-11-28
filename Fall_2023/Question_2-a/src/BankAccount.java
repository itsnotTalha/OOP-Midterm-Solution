public class BankAccount {
    public String name;
    private String account_id;
    private double balance;

   public BankAccount(String name, double balance, String gender) {
        this.name = name;
        this.balance = balance;
        this.account_id = gender + "-" + name;
    }

    public String getAccount_id() {
        return account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
       if(balance<0){
           System.out.println("Balance cannot be less than 0");
       }else
        this.balance = balance;
    }
}

class Test {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Mr.Rahman", 1000, "M");
        System.out.println("Account id:"+b.getAccount_id());
        System.out.println("balance before:"+b.getBalance());
        b.setBalance(b.getBalance()-2000);
    }
}