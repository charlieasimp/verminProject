
//Charlie Simpson
//10/7/2026
import java.util.Scanner;

//this program will output a perfect pet for the user
//according to their favorite color, season, or depending
//on the contents/letters in their name
public class Pet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("type your favorite color (red, blue, or green)");

        String userColor = input.nextLine().toLowerCase();
        if (userColor.equals("blue") || userColor.equals("green") || userColor.equals("red")) {
            System.out.println("cool color, " + userColor + ", now type your name.");
        } else {
            System.out.println("please type a valid color. (red, blue, or green).");
            userColor = input.nextLine().toLowerCase();
            if (userColor.equals("blue") || userColor.equals("green") || userColor.equals("red"))
                ;
            {
                System.out.println("cool color, " + userColor + ", now type your name.");
            }
        }

        String userName = input.nextLine().toLowerCase();
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(userName.substring(0, 1)) > -1) {
            System.out.println("nice name, " + userName
                    + ", now type your favorite season to find your animal(summer, winter, fall, spring).");
        } else {
            System.out.println("please type your actual name.");
            return; // stop program
        }
        String userSeason = input.nextLine().toLowerCase();
        if (userSeason.equals("summer") || userSeason.equals("winter") || userSeason.equals("fall")
                || userSeason.equals("spring")) {
            getAnAnimal(userColor, userSeason, userName);
        } else {
            System.out.println("please type a valid season, (summer, winter, fall, or spring).");
            return; // exit program
        }

    }


     public static void getAnAnimal(String userColor, String userSeason, String userName){
      if (userColor.equals("blue") && userSeason.equals("fall"))
      {
        System.out.println("Your pet is an alligator!");
      }
      else if (userColor.equals("blue") && userSeason.equals("spring"))
      {
        System.out.println("Your pet is an ostrich!");
      }
      else if (userColor.equals("blue") && "aieou".indexOf(userName.substring(0,1))>0 && (userSeason.equals("winter")) || (userSeason.equals("spring")))
      {
        System.out.println("Your pet is an axolotl!");
      }
      else if ("aieou".indexOf(userName.substring(0,1))< 0 && userColor.equals("green") && userSeason.equals("winter"))
      {       
        System.out.println("Your pet is a giraffe!");
      }
      else if (userColor.equals("green") && !userSeason.equals("fall"))
      {
        System.out.println("Your pet is a dog!");
      }
      else if (userColor.equals("red"))
      {
        System.out.println("Your pet is a panda!");
      }
      else if (userColor.equals("red") && "aieou".indexOf(userName.substring(0,1))>0)
      {
        System.out.println("Your pet is a porcupine!");
      }
      
}





}
