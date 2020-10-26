package sample;

import io.TextIO;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Let's play the guessing game!");
        System.out.print("How many times will you play: ");
        int rounds=TextIO.getlnInt();
        System.out.println(String.format("You will be playing %d times",rounds));
        int[] round=new int[rounds];
        for(int i=0;i<rounds;i++){
            //call rand decimal no between 0 and 1 multiply by 100 and round result
            long num=Math.round(Math.random()*100);
            System.out.println(String.format("Round %d of %d",i+1,rounds));
            boolean right=false;
            while(!right){
                System.out.print("Guess me between 0 and 100 or -1 to exit: ");
                int guess=TextIO.getlnInt();
                round[i]++; //same as round[i]=round[i]+1;
                if(guess==-1){
                    System.out.println("Thank you for playing...Bye!");
                    return;
                }
                if(guess==num){
                    System.out.println("Bingo!");
                    right=true;
                }else if(num>guess){
                    System.out.println("The number is actually greater. Try again!");
                }else{
                    System.out.println("The number is actually less. Try again!");
                }
            }
        }
        System.out.println("==== ++++ **** GAME SUMMARY **** ++++ ====");
        float sum=0;
        for(int i=0;i<rounds;i++){
            System.out.println(String.format("In round %d you guessed it right after %d attempts",i+1,round[i]));
            sum+=round[i]; //sum=sum+round[i]
        }
        System.out.println(String.format("Average number of number of guesses per round=%3.2f",sum/rounds));
    }


}

/*
 OUTPUT of the above given Java Interface example would be :
 Hello Visitor !
 */
