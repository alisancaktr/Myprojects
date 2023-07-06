package week9projec8;

import week9projec8.Account;

public class Login {
    private String userName;
    private int passWord;

    public Login(String userName, int passWord) {
        this.userName = userName;
        this.passWord = passWord;
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

    public void checking(Account a) {
        if (a.getUserName().equals(userName) && a.getPassWord() == passWord) {
            System.out.println("LOGİN İS SUCCESSFUL");
            System.out.println("WELCOME" + userName);
            System.out.println("YOUR BALANCE = " + a.getBalance());
        }

    }

}