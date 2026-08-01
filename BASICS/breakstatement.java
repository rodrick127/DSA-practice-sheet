/*public class breakcondition {
    public static void main(String[]args){
        for(int i = 1; i<=5;i++){
            if(i==3){
                break;
               
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
    
}*/



//QUESTION 

import java.util.*;
public class breakstatement{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ENTER YOUR NUMBER =");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
