 //  QUESTION 1 TELLING NUMBER IS POSITIVE OR NEGATIVE 
/*import java.util.*;
public class DAY2{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();
        if (num>=0){
            System.out.println("positive number");
        }
        else{
             System.out.println("negative number"); 
       }
    }
}*/


// QUESTION 2 FEVER OR NOT

/*public class DAY2{
    public static void main(String[]args){
        double temp = 103.5 ;
        if(temp>100){
            System.out.println("FEVER");
        }
        else{
            System.out.println("NO FEVER");
        }
    }
}*/


// QUESTION 3 USING SWITCH CASE PRINT THE NAME OF THE DAYS IN A WEEK 

import java.util.*;
public class DAY2{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER");
        int days = sc.nextInt();
        switch(days){
        case 1: 
        System.out.println("SUNDAY");
        break;
        case 2 :
        System.out.println("MONDAY");
        break;
        case 3 :System.out.println("TUESDAY");
        break;
        case 4 :System.out.println("WEDNESDAY");
        break;
        case 5 :System.out.println("THURSDAY");
        break;
        case 6 :System.out.println("FRIDAY");
        break;
        case 7 :System.out.println("SATURDAY");
        break;
        default : System.out.println("U DON'T KNOW ANYTHING");
        break;
        }
    }
}
