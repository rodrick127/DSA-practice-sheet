import java.util.*;
public class whileloopQues {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
        // QUESTION 1

        /*  int range = sc.nextInt();
        int counter = 1;

        while (counter <= range){
            System.out.println(counter + " ");
            counter++;
        }*/



            // OUESTION 2

            int n = sc.nextInt();
            int sum = 0 ;

            int i = 1;
            while(i<=n){
                sum += 1;
                i++;
            }
            System.out.println(sum);
    }

    
}
