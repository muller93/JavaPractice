package com.company;

import com.company.Members.Developer;
import com.company.Members.Employee;
import com.company.Members.Manager;

public class Comp {

    public static void main(String[] args) {
        Employee emp1=new Developer("Bob", 10000);
        Employee emp2=new Developer("Frank", 15000);
        Employee manager1=new Manager("Wayne",25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3=new Developer("Archie", 20000);
        Manager generalManager=new Manager("Andrew", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
