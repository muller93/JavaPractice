package com.company.Machine;

public class Crampon extends Machinery{
    private int spoonSize;
    private int time;

    public Crampon( String type, int weight, int spoonSize) {
        super(weight, type);
        this.spoonSize = spoonSize;
    }

    public double putOver(int sand, int distance, Truck truck) {
        while (sand > spoonSize) {
            while (truck.getLoaded() < truck.getCarryingCapacity() && sand > 0) {
                truck.setLoaded(truck.getLoaded() + (sand - spoonSize));
                if (truck instanceof Truck){
                    try {
                        time += 5 + (truck.transport(distance) * 2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else {
                    try {
                        time += 6 + (truck.transport(distance) * 2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                truck.transport(distance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return time;
    }

    @Override
    public String toString() {
        return "Crampon{" +
                "spoonSize=" + spoonSize +
                ", time=" + time +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
/*Hozd létre a Markolo osztályt, ami a Munkagep osztályból származik és helyezd a gep csomagba.
 Az osztálynak legyen egy kanalmeret (egész) privát attribútuma, ezt a konstruktor paramétere
 alapján inicializálja. Írd meg az osztálynak az atrakod() metódust, ami double visszatérési
  típussal rendelkezik, és 3 paramétert vár: az első int típusút megmondja, hogy mennyi homokot
   kell átrakodni, a második szintén int típusú, megmondja, hogy milyen távolságra kell
    elszállítani, illetve a harmadik egy Teherauto objektum, ami segítségével megtörténik
    a szállítás. A átrakodás úgy történik, hogy minden egyes lépésben kanalmeret-nyit átrakodunk
     a Teherauto-ra (levonva a kanálmértet az átrakodandó homokból és hozzáadva azt a Teherauto
      megrakodtságához), majd miután megtelt a Teherauto (vagyis a megrakodtsága elérte a
       teherbírását) a Teherauto szallit() metódusával elszállítatjuk a rakományt a második
        paraméterben kapott távolságra. Ez addig folytatódik ciklikusan, amíg el nem
        szállítottuk az első paraméterben magadott mennyiségű homokot.
        A metódus visszatérési értéke az egész átrakodás időtartama, ami a szállítások
        időtartamának összege valamint kanalazásonként 5 időegység, ha a tipus megegyezik
        a harmadik paraméterben kapott Teherauto tipusával, egyébként 6 időegység.
        Legyen az osztály String-gé alakítható. Definiáld felül az osztály hashCode valamint
         equals metodusait!*/