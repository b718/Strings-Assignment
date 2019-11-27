import java.util.Scanner;

public class PPAP
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ans = "yes";

        while(ans.equals("yes")){
            System.out.println("Whats the first word?");
            String first = sc.next();

            System.out.println("Whats the second word?");
            String second = sc.next();

            System.out.println("I have a " + first);
            System.out.println("I have a " + second);
            System.out.println ("Uh! " + first + second);

            System.out.println("Play again? Yes or No");
            ans = sc.next();

        }  

    }
}
