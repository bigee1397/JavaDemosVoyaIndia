package com.voya.inheritance;

public class InMain {
    public static void main(String[] args) {
        InEmployee employee = new InEmployee("Nidhi", 31);
        employee.getDetails();

        InManager manager = new InManager("swaroopa", 40, 30000);
        manager.getDetails();
        manager.printBonus(25000);
    }

}
