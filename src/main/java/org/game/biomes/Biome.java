package org.game.biomes;

import java.util.Arrays;
import java.util.Random;

public class Biome {
    private float rarity;
    //private boolean sequence;
    private int[][] map;
    private String modifier;

    public Biome() {
        generateMap();
    }

    protected void generateMap(){
        Random random= new Random();
        this.map=new int[random.nextInt(10)][random.nextInt(10)];
        for (int[] m: this.map)
            Arrays.fill(m,1);
        //return map;
    }

    @Override
    public String toString() {
        return "Biome{" +
                "rarity=" + rarity +
                ", modifier='" + modifier  +
                "} \n"+ printArray();
    }

    String printArray(){

        StringBuilder stringBuilder= new StringBuilder();

        for (int[] x : this.map){
            for (int y:x){
                stringBuilder.append("[ " +y + " ]");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
