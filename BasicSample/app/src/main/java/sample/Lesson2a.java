package sample;

import io.TextIO;

public class Lesson2a {

    public static void main(String[] args) {
        while(true){
            System.out.print("Enter Your score: ");
            int score=TextIO.getlnInt();
            if(score>70 && score <=100){
                System.out.println("You scored an A");
            }
            else if(score>60 && score <=69){
                System.out.println("You scored a B!");
            }else if(score>50 && score <=59){
                System.out.println("You scored a C!");
            }else{
                break;
            }
        }
        System.out.println(String.format("Bye!"));
    }


}

/*
 OUTPUT of the above given Java Interface example would be :
 Hello Visitor !
 */
