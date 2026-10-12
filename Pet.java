//Charlie Simpson
//10/7/2026
import java.util.Scanner;
//this program will output a perfect pet for the user
//according to their favorite color, season, or depending
//on the contents/letters in their name
public class Pet{

 public static void Pet(String[] args) {
    Scanner input = new Scanner(System.in);


System.out.println("type your favorite color (red, blue, or green)");

String userColor = input.nextLine().toLowerCase();
    if (userColor.equals("blue") || userColor.equals("green") || userColor.equals("red"))
{  
    System.out.println("cool color, " + userColor + ", now type your name.");
}
    else
{
        System.out.println("please type a valid color. (red, blue, or green).");
        return; //stop program
}



 }
}           



