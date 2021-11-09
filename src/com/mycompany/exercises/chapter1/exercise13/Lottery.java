package com.mycompany.exercises.chapter1.exercise13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        int[] lotteryNumbers = new int[6];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            list.add(i);
        }
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < 6; i++) {
            int lotteryNumber = rand.nextInt(49 - i);
            lotteryNumbers[i] = list.get(lotteryNumber);
            list.remove(lotteryNumber);
        }
        Arrays.sort(lotteryNumbers);
        System.out.println("Lottery numbers are: " + Arrays.toString(lotteryNumbers));
    }

}
