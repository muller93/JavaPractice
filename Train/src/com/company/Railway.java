package com.company;

import com.company.Vehicle.GoodsTrain;
import com.company.Vehicle.PassengerTrain;
import com.company.Vehicle.Train;

public class Railway {

    public static void main(String[] args) {
        Railway railway = new Railway(); //statikusság elkerülése érdekében
        Train[] train = railway.getTrain(args); // szintén (példányosítással)
        System.out.println(fastestTrain(train));
    }

    public void writeP(PassengerTrain passenger){
        System.out.println(passenger);
    }

    public void writeG(GoodsTrain goods){
        System.out.println(goods);
    }

    public Train[] getTrain(String[] args) {
        Train[] trains = new Train[3]; //javítani, for ciklussal passengert vagy goodsot keresni
        int counter = 0;
        for (int i = 0; i < args.length; i++){
                if (args[i].equals("passenger")){
                    PassengerTrain steamer = new PassengerTrain(args[i+1], args[i+2], Integer.parseInt(args[i+3]),Integer.parseInt(args[i+4]),Integer.parseInt(args[i+5]));
                    i += 5;
                    trains[counter]=steamer;
                    counter++; //azért, hogy ne írják egymást felül, hanem a következő indexre kerüljön az elem
                }else if (args[i].equals("goods")){
                    GoodsTrain sihuhu = new GoodsTrain(args[i+1], args[i+2], Integer.parseInt(args[i+3]), Integer.parseInt(args[i+4]), args[i+5], Integer.parseInt(args[i+6]));
                    trains[counter]=sihuhu;
                    counter++;
                    i += 6;
                }
            }
        return trains;
    }
    public static Train fastestTrain(Train[] trains){
        Train fastestTrain = trains[0];
        for (int i = 0; i < trains.length; i++){
            if (trains[i].asSoonAs() < fastestTrain.asSoonAs()){
                fastestTrain = trains[i];
            }
        }
        return fastestTrain;
    }
}
