package com.company.Fields;

import com.company.Player;

import java.util.Scanner;

public class Bank {
    Player player = new Player();
    private boolean bankError = false;
    private int maxLoan = 15000;
    private int canLoan = maxLoan - player.getHowManyDebit();
    private int scan;

    public void takeUpLoan(){
        System.out.println("Your currently debit is " + player.getHowManyDebit());
        System.out.println("Welcome to our bank. What do you want? Please select a number.");
        System.out.println("1. I want take a loan");
        System.out.println("2. I want pay back some money.");
        System.out.println("3. Nothing");

        do {
            try {
                Scanner sc = new Scanner(System.in);
                int scan;
                scan = sc.nextInt();
                sc.close();
                if (scan > 0 && scan < 3) {
                    sw();
                } else
                    System.out.println("Please give 1, 2 or 3.");
                bankError = false;
            }catch(Exception ex){
                bankError = true;
                System.out.println("Wrong input. Please give a number. 1, 2 or 3.");
            }
        } while (bankError);
    }

    public void sw() {
        switch (scan) {
            case 1:
                if (player.getHowManyDebit() < maxLoan) {
                    System.out.println("Please give how much money want you. '\n' " +
                            "The maximum value is " + canLoan);


                }
                break;
            case 2:
                break;
            case 3:
                System.out.println("Ok.");
                break;
        }
    }

}

/*OTP. Itt vehetsz fel hitelt, vagy törlesztheted a meglévő tartozásodat.*/