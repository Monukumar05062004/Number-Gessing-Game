package game_pack;

import java.util.Locale;import java.util.Scanner;import java.util.Random;
public class number_guessing_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String play="yes";
        int gate_value;
        int guess=-1;
        int tries=0;
        System.out.println("welcome you in my guess game");
        // This while maintain your turn (outer while loop)
        while(play.equals("yes")){
            Random rand=new Random();
            gate_value=rand.nextInt(100);
            System.out.println("Enter a number in range of 0 to 100");
        // this while loop maintain or check your guess
        while(gate_value!=guess){
            guess=sc.nextInt();
            tries++;
            if(guess==gate_value){
                System.out.println("No of tries is"+tries);
                System.out.println("Guess value is "+guess);
                System.out.println("you want to play again yes or no");
                play=sc.next().toLowerCase(Locale.ROOT);
            }
            else if(guess>gate_value) {
                System.out.println("Enter low value or guess is high" + guess);
            }
            else {
                System.out.println("Enter high value or guess is low" + guess);
            }
          }}    sc.close();
    }}