// AVERAGE OF 3 NUMBERS
import java.util.*;
public class variableandDTques {
   public static void main(String[]args){
       /*  Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       int average = (A+B+C)/3;

       System.out.println(average);*/ 



    // AREA OF SQUARE 
      /*Scanner sc = new Scanner(System.in);
      int side = sc.nextInt();
      int area = side * side ;

      System.out.println("area of circle is ="+ area);*/


      // TOTAL BILL QUESTION
      Scanner sc = new Scanner(System.in);
      float pencil = sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser = sc.nextFloat();
      float  cost = pencil+pen+eraser;
      float gst = (pencil+pen+eraser)*18/100;
      float total = (cost+gst);

      System.out.println("TOTAL BILL+ 18% GST =" + total);

    }
    
}
