/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.business;

/**
 *
 * @author alumnog
 */
public class Palindromo {
    
     public static boolean isPalindrome(String value){
         String text = value.replaceAll("\\ ", "").toLowerCase();
         char[] letras = text.toCharArray();
         int count = letras.length;
         for(char l : letras){   
            if(l != letras [count - 1]){   
                return false;
           }else{
                count -= 1;
                if (count == 0)
                return true;}
         } 
     
         
         
     return true;   
     }
        
}
