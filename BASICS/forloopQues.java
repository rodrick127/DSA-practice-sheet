public class forloopQues {
    public static void main(String[]args){

        /*  for(int i=1;i<=11;i++){
          System.out.println("Rafel Brown");
        }*/

          // PATTERN QUESTION
           /*or( int line = 1;line<=4;line++ ){
            System.out.println("****");
           }*/


            // PRINT REVERSE OF NUMBER 
             
            int n = 10899;
            while(n>0){
                int lastDigit = n % 10;
                System.out.println(lastDigit);
                n = n/10;
            }
            System.out.println();
    }
    
}
