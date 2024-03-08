package com.voya.overriding.hotel;

public class Chinese extends Menu {

    @Override
    void showItems(String types) {
        String[] fastFoods = {"Noodles", "Manchurian"};
        String[] lunches = {"Chow mein", "Broth"};
        String[] desserts = {"Pork Bun"};

        if(types.equalsIgnoreCase("fast food")){
            for (String fastFood : fastFoods ) {
                System.out.println(fastFood);
            }
        }
        else if(types.equalsIgnoreCase("lunch")){
            for (String lunch : lunches ) {
                System.out.println(lunch);
            }
        }
        else  {
            for (String dessert : desserts ) {
                System.out.println(dessert);
            }
        }
    }

    void printGames() {
        System.out.println("games");
    }

}
