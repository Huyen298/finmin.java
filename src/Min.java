import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
       int array[]= new int[]{3,5,4,2,7};
       int min=array[0];
       for (int i = 0; i < array.length; i++) {
          if (array[i]<min){
             min=array[i];
          }
       }
       System.out.println(min);
    }
}