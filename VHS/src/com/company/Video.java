package com.company;

public class Video implements Loan{
    private String filmTitle;
    private boolean canLoan = true;
    private String howLongLoan; //lehetséges értékei: „egynapos”, „kétnapos”, „korlátlan”),
    private int ageLimit; //(értéke 0, 12, 16 vagy 18 lehet)

    public Video(String filmTitle, String howLongLoan, int ageLimit) {
        this.filmTitle = filmTitle;

        if (ageLimit == 0 || ageLimit == 12 || ageLimit == 16 || ageLimit == 18){
        this.ageLimit = ageLimit;
        } else {
            System.out.println("Wrong age limit value");
        }

        if (howLongLoan.equals("egynapos") || howLongLoan.equals("kétnapos") || howLongLoan.equals("korlátlan")){
            this.howLongLoan = howLongLoan;
        } else {
            System.out.println("You rentable value.");
        }

    }


    @Override
    public boolean rent(int age, int renting) throws ErrorLoan {
        if (renting > 0){
            int rentToInt = 0;
            switch (howLongLoan){
                case "one-day":
                    renting = 1;
                    break;
                case "two-day":
                    renting = 2;
                    break;
                case "unlimited":
                    renting = renting;
                    break;
            }
            if ((age >= ageLimit) && ())
        }
    }

    @Override
    public boolean bringBack() {
        return false;
    }
    /*f
            }
            if((renterAge >= rating) && (numberOFDaysToRent <= rentableForInt && !isRented)) {
                isRented = true;
                return true;
            } else if (isRented) {
                return false;
            } else {
                throw new RentingErrorException("You are either underage, the video is already rented or cannot be rented for the given interval.");
            }
        } else {
            throw new RentingErrorException("Renting time cannot be 0 or negative.");
        }

}*/
}
/*Írj egy Video osztályt, mely implementálja a Kolcsonozheto interfészt!
Az osztály a következő adattagokkal rendelkezzen: film címe (szöveges),
ki van-e kölcsönözve (logikai), mennyi időre kölcsönözhető (szöveges,
 lehetséges értékei: „egynapos”, „kétnapos”, „korlátlan”), milyen korhatáros
 (értéke 0, 12, 16 vagy 18 lehet). Az osztályhoz 3 paramétert váró konstruktor tartozik,
 melynek segítségével inicializálható, a kölcsönözhető adattag minden új példány
 esetén igaz értéket kap. A kikolcsonoz metódus implementációja paraméterként kapja,
  hogy hány éves a kölcsönző személy és mennyi időre vinné el a videót (napokban),
  ez alapján megvizsgálja, hogy az adott videó kiadható-e. Ez azt jelenti, hogy meg kell vizsgálni,
   korhatárban megfelel-e a kölcsönző életkorának és kölcsönözhető-e a megadott időtartamra
    – amennyiben valamelyik feltétel nem teljesül, HibasKolcsonzesException hibát kell dobni.
     Amennyiben a videó éppen ki van kölcsönözve, akkor hamissal térjen vissza.
     A visszahoz metódus implementációja a ki van-e kölcsönözve adattagot hamisra állítja.
 Az osztályhoz tartoznak getterek, setterek és toString metódus.*/