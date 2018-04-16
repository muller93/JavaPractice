package com.company.Fields;

import com.company.Player;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Insurer {
    Player player = new Player();

    public void insure() throws InputMismatchException {
        if (player.isInsure()) {
            System.out.println("You already have insure.");
        } else {
            System.out.print("Do you want insurance? The price is 500Ft. Plese type: yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes") || s.equals("Yes") || s.equals("no") || s.equals("No")) {
                if (s.equals("yes")) {
                    System.out.println("Ok. You have an insure from now.");
                    player.setMoney(player.getMoney() - 500);
                } else if (s.equals("no")) {
                    System.out.println("Ok.");
                }
                }
            else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
            }
        }
    }
}



/*- Biztosító: itt köthetsz biztosítást (ha még nincs).*/