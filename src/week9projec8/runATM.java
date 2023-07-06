package week9projec8;

import week9projec8.Account;
import week9projec8.Login;

import java.util.Scanner;

public class runATM {


    public void run() {

        boolean messi = true;
        while (messi==true) {
            Scanner in = new Scanner(System.in);

            Account a1 = new Account("Ali", 123456, 10000);
            System.out.println("ENTER [0] TO LOGİN");
            String choice = in.next();


            if (choice.equals("0")) {
                boolean ronaldo = true;
                for (int i = 0; i < 3; i++) {
                    System.out.println("PLEASE ENTER YOUR USERNAME");
                    String userName = in.next();
                    System.out.println("PLEASE ENTER YOUR PASSWORD");
                    int passWord = in.nextInt();
                    Login l1 = new Login(userName, passWord);


                    if (userName.equals(a1.getUserName()) && passWord == a1.getPassWord()) {
                        i = i + 111;
                    }
                    if(i==2) {
                        System.out.println("you tried 3 times and please press q to exit");
                        ronaldo = false;

                    }

                }
                if(ronaldo==false) {
                    String pressq = in.next();
                    if (pressq.equals("q")) {
                        System.out.println("THANK YOU BYE BYE");

                    }
                }
                while (ronaldo == true) {

                    System.out.println("ENTER [1] TO WİTHDRAW MONEY");
                    System.out.println("ENTER [2] TO DEPOSİT MONEY");
                    System.out.println("ENTER q TO EXİT");
                    choice = in.next();
                    if (choice.equals("1")) {
                        System.out.println("PLEASE ENTER AMOUNT");
                        double amount = in.nextInt();
                        a1.withdrawMoney(amount);
                        System.out.println(" DO YOU WANT TO CONTİNUE ? ");
                        a1.setBalance(a1.getBalance());
                        System.out.println("IF YOU WANT TO CONTİNUE PRESS 1 ELSE PRESS q");
                        String neymar = in.next();
                        if(neymar.equals("q")){
                            ronaldo =false;
                        }

                    } else if (choice.equals("2")) {
                        System.out.println("PLEASE INSERT YOUR MONEY");

                        double amount = in.nextInt();
                        a1.depositMoney(amount);
                        System.out.println("YOUR BALANCE İS " + a1.getBalance());
                        System.out.println("İF YOU WANT TO CONTİNUE PRESS 1 ELSE PRESS q");
                        a1.setBalance(a1.getBalance());
                        String haaland = in.next();
                        if(haaland.equals("q")){
                            ronaldo = false;
                        }

                    } else if (choice.equals("q")) {
                        System.out.println("THANK YOU! BYE BYE");
                        ronaldo = false;
                    }

                }


            }




        }

    }
}
