package org.game;

import org.game.biomes.Biome;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String action;
        Biome biome= new Biome();
        /*while (true){
            action=in.nextLine().toLowerCase();
            switch (action){
                case "w":
                case "a":
                case "s":
                case "d":
                case "exit":
            }
        }*/
        System.out.println(biome);
    }
}
