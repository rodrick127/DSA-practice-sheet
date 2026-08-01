import java.util.*;
public class conditionsQues {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       /*
        * System.out.println("enter the number =");
        * 
        * int x = sc.nextInt();
        * 
        * if(x>0){
        * System.out.println("positive number");
        * }
        * else{
        * System.out.println("negative number");
        * }
        */

       // question 2

      /*  System.out.println("Enter the Tempreture");
       double temp = sc.nextDouble();

       if (temp>100){
        System.out.println("u have fever");
       }
       else{
        System.out.println("u don't have fever");
       }*/
    
      // question 3 
      System.out.println("Enter The Week Number");
         int x = sc.nextInt();

         switch (x) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;    

         
            default:
                System.out.println(" wrong day");
                break;
         }
    }
    
}
