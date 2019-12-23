package sample;

import java.util.Random;

public class Dice {
    int[] face = new int[6];
    Dice(){}
    int roll(){
        Random random = new Random();
        return random.nextInt(face.length) + 1;
    }
}
