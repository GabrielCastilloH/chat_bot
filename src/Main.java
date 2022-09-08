import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Declaring variables for user input.
        String name, age, music;
        int intAge;

//      Printing introduction and asking the user for his name.
        System.out.println("Hello! My name is Gabriel from Space! :?");
        System.out.print("\nWhat is your name?\nInput your name here: ");
        Scanner nameInput = new Scanner(System.in);
        name = nameInput.nextLine();

//      Greets user and asks for age.
        System.out.println("Hello " + name + "! I am from the year 2210 and I am 20 years old.");
        System.out.print("\nHow old are you?\nInput your age here: ");
        Scanner ageInput = new Scanner(System.in);
        age = ageInput.nextLine();

//      Adds 90 to age and then prints it.
        intAge = Integer.parseInt(age) + 90;
        System.out.println("Wow by 2210 you will be " + intAge + " years old!");

//      Asks for music and then says it is not familiar with that.
        System.out.print("\nWhat music are you into?\nInput music here: ");
        Scanner musicInput = new Scanner(System.in);
        music = musicInput.nextLine();
        System.out.println("I have not heard of " + music + ".");



    }
}
