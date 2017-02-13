package com.novauc;

import java.util.ArrayList;

/**
 * Created by vtcurry on 2/8/17.
 */
public class Player {

    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    public void findItem(String item) {
        System.out.println("You found a " + item + "! Pick it up ? [y/n]");

        String answer = Game.nextLine();

        if (answer.equalsIgnoreCase(("y"))){
            items.add(item);
            System.out.println ("You picked up an item!");
        }
    }

    public void choosename (){
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.println ("Welcome, " + name);
    }

    public void chooseweapon() throws Exception{
        System.out.println("Choose your weapon [Sword/Mace]");
        weapon = Game.nextLine();

        if (weapon. equalsIgnoreCase("Sword")) {
            System.out.println("Sword is a fine choice!");
        } else if (weapon.equalsIgnoreCase("mace")){
            System.out.println ("A mace is a fine choice!");
        }
        else {
            throw new Exception("Invalid weapon.");
        }

    }
    public void chooseyourlocation () throws Exception {
        System.out.println("Choose your location [forrest/tunnel]");
        location = Game.nextLine();

        if (location.equalsIgnoreCase("forest")){
            System.out.println("Enter forest...");
        } else if (location.equalsIgnoreCase("tunnel")){
            System.out.println("Entering tunnel...");
        }
        else {
            throw new Exception("Invalid location.");
        }
    }



}
