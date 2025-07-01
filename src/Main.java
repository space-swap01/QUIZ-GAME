//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){

        //array for question
        //2d array for options
        //answers
        //loop for display
        //loop user option input
        //if-else for evaluation
        //total score
        //welcome statement
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("WELCOME TO FUN QUIZ ISLAND");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");

        String[] question={"WHAT IS THE WORLD'S FASTEST ANIMAL ?",
                "WHAT IS THE WORLDS HIGHEST PEAK ?",
                "WHO WAS THE INVENTOR TELEPHONE ?",
                "WHAT IS THE WORLD'S SMALLEST BIRD ?"};

        String[][] options={{"1.ELEPHANT ","2.COW ","3.CHETTAH ","4.DOG "},
                {"1.MOUNT EVEREST ","2.KANCHANJANGA ","3.K2 ","4.HIMALAYA "},
                {"1.ALBERT EINSTEIN ","2.THOMAS ALPHA EDISON ","3.ALEXZANDER GRAMBELL ","4.MARIE CURIE "},
                {"1.HUMMING BIRD ","2.OSTRICH ","3.PENGUINE ","4.BUGGIE "}};

        int[] answer={3,1,3,1};
        int score=0;


//        for(String show:question){
//            System.out.println(show);
//            for(String[] option:options){
//                for(String display:option){
//                    System.out.println(display);
//                    System.out.println();
//                }
//                System.out.println();
//
//            }
//        }
        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<question.length;i++){
            System.out.println(question[i]);
            for(String option:options[i]){
                System.out.println(option);






            }System.out.println("ENTER YOUR CHOICE: ");
            int choice=scanner.nextInt();

            if(choice==answer[i]){
                System.out.println("%%%%%%%%");
                System.out.println("correct");
                System.out.println("%%%%%%%%");
                score++;
            }
            else{
                System.out.println("%%%%%%%%");
                System.out.println("incorrect");
                System.out.println("%%%%%%%%");
            }
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        }

        System.out.println("your score is "+score+" out of "+question.length);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");




        //for(int i=0;i<question.length;i++){
        //   System.out.println(i);
        //    }







    }
}