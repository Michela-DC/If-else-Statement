// Define a variable called myName and assign your name to it
// Using the if-else statement, print if the number of letters in your name is even or odd

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myName = "Michela";
        int nameLength = myName.length();

        if(nameLength % 2 == 0){
            System.out.println("The length of the name " + myName + " is even");
        } else {
            System.out.println("The length of the name " + myName + " is odd");
        }
    }
}