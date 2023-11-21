

package evdanc;

import java.util.ArrayList;


public class ArrayListNewClass {
    public static void main(String[] args) {
        ArrayList<String>intArr=new ArrayList<>();
        
        intArr.add("abc@gmail.com");
        intArr.add("abcgmail.com");
        intArr.add("aaa@gmail.co");
        intArr.add("fd@gmail.com");
        intArr.add("fgdfgh@gmail.com");
        intArr.add("abc@dfdf.com");
        intArr.add("dfgvxd@cvcvco");
        
        
        intArr.get(0);
        
//        for(int i=0; i<intArr.size();i++){
//            
//            if(intArr.get(i).contains("@")&&intArr.get(i).contains(".")){
//            
//            System.out.println("True: "+intArr.get(i));
//            
//            }else{
//            
//            
//            System.out.println("False: "+intArr.get(i));
//            
//            }
//            
//            }
            
         //        foreach-----------------------------------------------------
         
         
         
         for(String string:intArr){
            
            if(string.contains("@")&&string.contains(".")){
            
            System.out.println("True: "+string);
            
            }else{
            
            
            System.out.println("False: "+string);
            
            }
            
            }
         
  //       Or-------------------------------------------------
         
         
         
         
         
         
         
         
         
         
                
    }
    
   
    
    
    
    
}
