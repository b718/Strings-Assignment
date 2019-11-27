
public class Binary
{
    public static void main(){

        bin(56);
        
    }

    public static void bin(int i){

        String number = "";
         
        while ( i > 0 ){

            if(i % 2 == 1){
               

                number = 1 + number;
            } else {
                number = 0 + number;
            }

             i = i/2;
            
            
        }
        
        System.out.print(number);

        
    }
}
