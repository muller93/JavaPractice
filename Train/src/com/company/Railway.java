package com.company;

import com.company.Vehicle.CompareTrain;
import com.company.Vehicle.GoodsTrain;
import com.company.Vehicle.PassengerTrain;
import com.company.Vehicle.Train;

import java.util.ArrayList;
import java.util.Collections;

public class Railway {

    public static void main(String[] args) {
        Railway railway = new Railway(); //statikusság elkerülése érdekében

        ArrayList trainList;
        trainList = railway.getTrain(args);
        Collections.sort(trainList, new CompareTrain());
        System.out.println(trainList.get(0));
    }

    public ArrayList getTrain(String[] args) {
        ArrayList<Train> trainList = new ArrayList<>();
        for (int i = 0; i < args.length; i++){
                if (args[i].equals("passenger")){
                    PassengerTrain steamer = new PassengerTrain(args[i+1], args[i+2], Integer.parseInt(args[i+3]),Integer.parseInt(args[i+4]),Integer.parseInt(args[i+5]));
                    i += 5;
                    trainList.add(steamer);
                }else if (args[i].equals("goods")){
                    GoodsTrain sihuhu = new GoodsTrain(args[i+1], args[i+2], Integer.parseInt(args[i+3]), Integer.parseInt(args[i+4]), args[i+5], Integer.parseInt(args[i+6]));
                    trainList.add(sihuhu);
                    i += 6;
                }
            }
        return trainList;
    }
}
