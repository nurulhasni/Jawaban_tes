/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jawaban;

/**
 *
 * @author pokerdie
 */
public class dua {
   public static void main(String[]arg){
                Integer array[] = {22, 29, 32, 35, 40};
                Integer max = array[0];
                Integer min = array[0];
                 for(int i=0;i<array.length;i++){
                         if(max < array[i]){
                                max = array[i];
                        }
                         if(min > array[i]){
                                min = array[i];
                        }
                }
               System.out.println(min +","+max);
                
        }   
}
