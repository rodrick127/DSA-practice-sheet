public class NestedLoop {
    public static void main(String[]args){
      /*
       * for(int line =1; line<=4; line++){
       * for(int star=1;star<=line;star++){
       * System.out.print("*");
       * }
       * System.out.println();
       * }
       */

      // INVERTED STAR PATTERN

    /*   for(int line =1; line<=4; line++){
        for( int star =1; star <= 4-line+1; star++){
            System.out.print("*");
        }
        System.out.println();
      }*/
    


        // HALF NUMBER PYRAMID PATTERN
        /*
         * int n=4;
         * for( int line= 1;line<=n;line++){
         * for(int number=1;number<=line;number++){
         * System.out.print(number);
         * }
         * System.out.println();
         * }
         */


        // CHARACTER PATTERN QUESTION
         int n=4;
         char ch='A';

         //outer loop 
         for(int line=1;line<=n;line++){
            for( int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++; 
            }
            System.out.println();
         }


}
}