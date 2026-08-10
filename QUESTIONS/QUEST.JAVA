 // QUESTION 1 {AVERAGE OF THE NUMBER}
 /*import java.util.*;
    public class QUEST{
        public static void main(String[]args){
            Scanner sc = new Scanner (System.in);
            System.out.println(" ENTER THE 1ST NUMBER");
            int A = sc.nextInt();
            System.out.println(" ENTER THE 2ND NUMBER");
            int B = sc.nextInt();
            System.out.println(" ENTER THE 3RD NUMBER");
            int C = sc.nextInt();
            System.out.println(" AVERAGE IS =");
            int Average = (A+B+C)/3;
            System.out.println(Average);       
    }
 }*/


//QUESTION 2 { AREA OF SQUARE}
/*import java.util.*;
public class QUEST{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("SIDES =");
        int Side = sc.nextInt();
        int Area = Side * Side ;
        System.out.println("AREA OF SQUARE =" + Area);
    }
}*/


// QUESTION 3 { MAKING A BILL }
import java.util.*;
public class QUEST{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("item1");
        float pencil = sc.nextFloat();
        System.out.println("item2");
        float pen = sc.nextFloat();
        System.out.println("item3");
        float eraser= sc.nextFloat();
         float total = pencil+pen+eraser;
         System.out.println( "TOTAL BILL = "+total);
         float gst = 18*(pencil+pen+eraser)/100;
         System.out.println(" 18% GST = "+gst);
         float totalbill = (total + gst);
         System.out.println("TOTAL BILL  ="+ totalbill );
         
        
        
    }
}