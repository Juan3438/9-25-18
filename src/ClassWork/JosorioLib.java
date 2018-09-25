package ClassWork;

import java.util.Scanner;
import java.util.Random;

public class JosorioLib {
    public static void main(int[] arg){
        int limit = 16;
        int ans = getNum(16);
        Scanner guess = new Scanner (System.in);
        System.out.println("Hello! Guess my number! its between 1 and "+limit+".");
        int guessMade = guess.nextInt();
        if(guessMade == ans){
            System.out.println("Ayy you got it right!");
        }
        if(guessMade < ans)
            System.out.println("Too low! My guess is higher!");
        else
            System.out.println("Too high! My guess is lower!");
    }
    public static int getNum(int limit){
        Random rand = new Random();
        int num = rand.nextInt(limit)+1;
        return num;
    }
}
