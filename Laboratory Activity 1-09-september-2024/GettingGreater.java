import java.util.Scanner;

public class GettingGreater 
{
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char firstchar = value.next().charAt(0);

        System.out.print("Enter second character: ");
        char secondchar = value.next().charAt(0);

        char maxChar = (char) Math.max(firstchar, secondchar);

        System.out.println("---------------------------------------");
        System.out.println("The character with greater value is: " + maxChar);
        System.out.println("---------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(firstchar + " : " + (int)firstchar);
        System.out.println(secondchar + " : " +  (int)secondchar);

        value.close();
    }
}