package com.voya.overriding;

public class OverrideMain {

    public static void main(String[] args) {
        Sports sports = null;
        String choice = "outdsdoor";

        if(choice.equalsIgnoreCase("indoor"))
            sports = new Indoor();
        else if(choice.equalsIgnoreCase("outdoor"))
            sports = new Outdoor();
        else
            sports = new Sports();

        String[] games = sports.showTypes();

        if(games!=null)
        {
            for(String sport: games) {
                System.out.print(sport + " ");
            }
        }


    }

}
