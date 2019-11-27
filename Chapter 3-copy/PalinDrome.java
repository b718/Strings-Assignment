import java.util.Scanner;

public class PalinDrome
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String forward = "";
        String backward = "";
        String symbol = ";";
        ans = ans.toLowerCase();

        System.out.println("Is this word a palindrome?");
        ans = sc.next();

        //String forward = ans.substring(0,ans.length()+1);
        //String backward = ans.substring(ans.length(), 0);

        for(int i = 0; i < ans.length(); i++){
            forward =  ans.substring(i,i+1);
            forward = ans.toLowerCase();
            forward = forward.replace(" ", "");
            forward = forward.replace(symbol, "");

         
        }
        for(int b = ans.length(); b > 0; b--){
            backward = ans.substring(b-1, b);
            backward = ans.toLowerCase();
            backward = forward.replace(" ", "");
            backward = forward.replace(symbol, "");

        }
        //System.out.println("backward = " + backward + ".");
        if(backward.equals(forward)){
            System.out.println("This is a palindrome");

        }else if(!backward.equals(forward)){
            System.out.println("Uh Oh");
        }
    }

}
