/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evdanc;

import java.util.ArrayList;

/**
 *
 * @author B-6
 */
public class NewClass {

    public static void main(String[] args) {
       
        System.out.println("find ten unique Random number ");

        System.out.println("--------------------");
        ArrayList<Integer> arr = new ArrayList<>();
        for (; ;) {
            int randomnumber = (int) (Math.random() * 100);
            if (arr.contains(randomnumber) == false) {
                arr.add(randomnumber);
            }
            if(arr.size()==10){
            break;
            }
        }
        System.out.println(arr);

    }
}
