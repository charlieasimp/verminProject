//Charlie Simpson
//10/7/2026
import java.util.Scanner;
//this program will output a perfect pet for the user
//according to their favorite color, season, or depending
//on the contents/letters in their name
public class Pet{

 public static void main(String[] args) {
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
        userColor = input.nextLine().toLowerCase();
        if (userColor.equals("blue") || userColor.equals("green") || userColor.equals("red"));
{
    System.out.println("cool color, " + userColor + ", now type your name.");
}
    }

String userName = input.nextLine().toLowerCase();
    if("abcdefghijklmnopqrstuvwxyz".indexOf(userName.substring(0, 1))> 0)
{
    System.out.println("nice name, " + userName + ", now type your favorite season to find your animal(summer, winter, fall, spring).");
}
    else 
{
        System.out.println("please type your actual name.");
        return; //stop program
}
String userSeason = input.nextLine().toLowerCase();
    if (userSeason.equals("summer") || userSeason.equals("winter") || userSeason.equals("fall") || userSeason.equals("spring"))
 {
    System.out.println("code goes HERE");
 }
    else 
    {
        System.out.println("please type a valid season, (summer, winter, fall, or spring).");
        return; //exit program
    }



}
}           



