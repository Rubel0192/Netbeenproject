
package evdanc;

import java.util.Scanner;


public class ConSum_Array {
    public static void main(String[] args) {
        
        Scanner num= new Scanner(System.in);
        
        int sum =0;
        System.out.println("Enter number");
        
        while(true){
        int input = num.nextInt();
        
        if(input==-1){
        break;
        
        }
        
        sum+=input;
        
        }
        
        System.out.println("Conditional sum: "+sum);
        
    }
}
