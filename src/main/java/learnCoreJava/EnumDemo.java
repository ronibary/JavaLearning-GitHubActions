package learnCoreJava;


import java.util.Scanner;

// Enum class
//
// enum translate to constants
// example: Enum with constructor ,and how to pass value to constructor of Enum
enum Choice {
    YES("Awesome"),NO("Sad"),MAYBE("Netural");    // each constant pass the value to the constructor

    private String feeling;

    Choice(String feel){
        feeling = feel;
    }
    void howUserFeels(){
        System.out.println(feeling);
    }
 }


public class EnumDemo {
    public static void main(String[] args) {

        Choice userChoice = Choice.valueOf("YES");

       // Choice userChoice = Choice.YES;
        Choice secondChoice = Choice.NO;

        System.out.println(userChoice);
        System.out.println(secondChoice);

        secondChoice.howUserFeels();



        var sc = new Scanner(System.in);
        System.out.println("was it nice enter the following (YES) (NO) (MAYBE)");
        var userInput = sc.nextLine();

        var choice = Choice.valueOf(userInput.toUpperCase());

        var position = choice.ordinal();
        System.out.println(position);


        switch(choice) {

            case YES:
                System.out.println("Glad you are happy ...");
                break;
            case NO:
                System.out.println("How could we help? ...");
                break;
            case MAYBE:
                System.out.println("Hmmmm... need more info ...");
                break;
            default :
                break;
        }

    }
}
