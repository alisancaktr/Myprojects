package week9projec8;

public class Account {

    private String userName;
    private int passWord;
    private double balance;


    public Account(String userName, int passWord, double balance) {
        this.userName = userName;
        this.passWord = passWord;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double amount) {
        if (amount <= 0) {
            System.out.println("please enter a valid amount");
        } else {
            balance = balance + amount;

        }

    }


    public void withdrawMoney(double amount) {
        if (amount < 0) {
            System.out.println("you can not withdraw any money");
        } else if (amount > balance) {
            System.out.println("you can not withdraw any money");
        } else {
            balance = balance - amount;
            System.out.println("YOUR BALANCE İS " + balance);
        }


    }


}