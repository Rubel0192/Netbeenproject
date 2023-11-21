package evdanc;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {

        Integer[] arr = {45, 64, 2, 12, 0, 98, 10};

        Arrays.sort(arr);

        System.out.println("Array ascending : " + Arrays.toString(arr));

       
        
        
        
        
        Integer[] arr2 = {45, 64, 2, 12, 0, 98, 10};
    
    
    Arrays.sort (arr, Collections.reverseOrder());
        
        
        System.out.println("Array descending : " + Arrays.toString(arr));
        
        
        
    }

    
     


}
