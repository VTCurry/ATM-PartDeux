package com.novauc;

import java.util.Scanner;

public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) throws Exception {

        System.out.print("Welcome, traveller ");

        player.choosename();
        player.chooseweapon();
        player.chooseyourlocation();

        player.findItem("sheild");
        player.findItem("boots");
        player.findItem("belts");
        player.findItem("diamonds");

    }

    public static String nextLine() {
        String line = scanner.nextLine();

        while (line.startsWith("/")) {
            switch (line) {
                case "/inv":
                    for (String item : player.items) {
                        System.out.println(item);

                    }
                    break;

                case "/exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Command not found!");
                    break;


            }

            line = scanner.nextLine();

        }
        return line;

    }

}