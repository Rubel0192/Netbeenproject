
package evdanc;


public class TwoDArray {
    public static void main(String[] args) {
        
        Integer [][]arr={{9,5,6,54},{6,5,48,98},{4,5,89,55}};
        
        
        int sumTotal =0;
        for(int i=0;i<arr.length;i++){
         int sum=0;
        for(int j=0; j<arr[i].length;j++){
        
        sum+= arr[i][j];

//            System.out.print(arr[i][j]+",");

        }
        
        sumTotal+=sum;
            System.out.println("Local sum " +sum);
        
        }
        
        System.out.println("sumTotal "+sumTotal);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
