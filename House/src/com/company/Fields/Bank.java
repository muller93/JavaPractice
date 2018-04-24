package com.company.Fields;

import com.company.Player.Player;

import java.util.Scanner;

public class Bank {
    Player player = new Player();
    private boolean bankError = false;
    private int maxLoan = 15000;
    private int canLoan = maxLoan - player.getHowManyDebit();
    private int scan;

    public void takeUpLoan(){
        System.out.println("Your currently debit is " + player.getHowManyDebit() + "You can take up " + canLoan);
        System.out.println("Welcome to our bank. What do you want? Please select a number.");
        System.out.println("1. I want take up 5000");
        System.out.println("2. I want take up 10000");
        System.out.println("3. I want take up 15000");
        System.out.println("4. I want pay back the money.");
        System.out.println("5. Nothing");
        bankError = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                int scan;
                scan = sc.nextInt();
                sc.close();
                sw(scan);
            }catch(Exception ex){
                bankError = true;
                System.out.println("Wrong input. Please give a number between 1-6.");
            }
        } while (bankError);
    }

    public void sw(int scan) {
        bankError = false;
        //System.out.println(player.getMoney());
        switch (scan) {
            case 1:
                if (player.getHowManyDebit() + 5000 < maxLoan) {
                    System.out.println("You get 5000Ft");
                    player.setMoney(player.getMoney() + 5000);
                    player.setHowManyDebit(player.getMoney() + 5000);
                    System.out.println(player.getMoney());
                } else {
                    System.out.println("You can't take up the debit. You reach the credit limit.");
                }
                break;

            case 2:
                if (player.getHowManyDebit() + 10000 < maxLoan) {
                    System.out.println("You get 10000Ft");
                    player.setMoney(player.getMoney() + 10000);
                    player.setHowManyDebit(player.getMoney() + 10000);
                    System.out.println(player.getMoney());
                } else {
                    System.out.println("You can't take up the debit. You reach the credit limit.");
                }
                break;
            case 3:
                if (player.getHowManyDebit() + 15000 < maxLoan) {
                    System.out.println("You get 15000Ft");
                    player.setMoney(player.getMoney() + 15000);
                    player.setHowManyDebit(player.getMoney() + 15000);
                    System.out.println(player.getMoney());
                } else {
                    System.out.println("You can't take up the debit. You reach the credit limit.");
                }
                break;
            case 4:
                if (player.getHowManyDebit() < player.getMoney()) {
                    System.out.println("You pay back your debit");
                    player.setMoney(player.getMoney() - player.getHowManyDebit());
                    player.setHowManyDebit(0);
                    System.out.println("Your money " + player.getMoney());
                } else {
                    System.out.println("You don't have enough money. You can't pay back your debit.");
                }
                break;

            case 5:
                System.out.println("Ok.");
                break;
        }
    }

}

/*OTP. Itt vehetsz fel hitelt, vagy törlesztheted a meglévő tartozásodat.*/