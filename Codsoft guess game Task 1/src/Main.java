import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int n=r.nextInt(0,100 +1);
        int Attempts=0;
        int guess;
        int score=0;
        boolean desire=false;
        System.out.println("Guess a number between 1 and 100");
        System.out.println("you have 7 attempts!");
        while(!desire){
            for(int i=1;i<=7;i++) {

                guess = sc.nextInt();
                Attempts++;
                if (guess == n) {
                    System.out.println("you guessed the correct number");
                    score++;
                    System.out.println("your score: " + score);
                    System.out.println("No of attempts: " + Attempts);

                    desire=true;
                    sc.close();
                    break;
                } else if (guess > n) {
                    System.out.println("Your guess is too high");
                } else if (guess < n) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("invalid");
                }
            }
            if(!desire){
                System.out.println("All the attempts are over");
                System.out.println("The number is "+n);
            }
        }



    }
}