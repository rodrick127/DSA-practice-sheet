/*public class continuestatement {
    public static void main(String[]args){
        for( int i = 1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}*/

// QUESTION 

import java.util.*;
public class continuestatement{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ENTER YOUR NUMBER =");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);

    }
}
