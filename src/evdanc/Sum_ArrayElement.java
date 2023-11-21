
package evdanc;

import java.util.Arrays;


public class Sum_ArrayElement {
    public static void main(String[] args) {
        
        int[]arr ={2,3,8,9,45};
        
        int sum=0;
        System.out.println("The Array: "+Arrays.toString(arr));
        
        for(int n:arr){
        sum+=n;
        }
        
        System.out.println("Sum:" + sum);
        
        
    }
}
