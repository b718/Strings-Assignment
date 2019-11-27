
public class PigLatin{
    
    
    public static void main(String[] args){

        piglatin("love");

    }

    public static void piglatin(String str){
        String answer = "";
        str = str.toLowerCase();
        //System.out.println(rest);
        int space = 0;

        for(int i = 0; i < str.length(); i++){
            System.out.println(i);
            if(str.substring(i,i+1).equals(" ")){

                String end = str.substring(0,1);
                String rest = str.substring(1,i);
                //space = space + 1;
                if(i > 2){
                    answer = answer + rest + end + "ay" + " ";
                    str = str.substring(i+1);
                    i = 0;
                } else {
                    answer = answer + end + rest + " ";
                    str = str.substring(i+1);
                    i = 0;
                }
            }

            //if(space >= 1)
            //  answer = rest + end + "ay";

        }
        String end = str.substring(0,1);
        String rest = str.substring(1);
        //space = space + 1;
        if(str.length() > 2){
            answer = answer + rest + end + "ay" + " ";
        } else {
            answer = answer + end + rest + " ";
        }
        

        System.out.print(answer);
    }

}
