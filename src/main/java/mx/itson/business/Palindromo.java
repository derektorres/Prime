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

    /**
     * @return the derechaIzquierda
     */
    public String getDerechaIzquierda() {
        return derechaIzquierda;
    }

    /**
     * @param derechaIzquierda the derechaIzquierda to set
     */
    public void setDerechaIzquierda(String derechaIzquierda) {
        this.derechaIzquierda = derechaIzquierda;
    }

    /**
     * @return the izquierdaDerecha
     */
    public String getIzquierdaDerecha() {
        return izquierdaDerecha;
    }

    /**
     * @param izquierdaDerecha the izquierdaDerecha to set
     */
    public void setIzquierdaDerecha(String izquierdaDerecha) {
        this.izquierdaDerecha = izquierdaDerecha;
    }

    /**
     * @return the result
     */
    public boolean isResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(boolean result) {
        this.result = result;
    }
    
    private String derechaIzquierda;
    private String izquierdaDerecha;
    private boolean result;
    
    
    
     public static Palindromo isPalindrome(String value){  
         Palindromo p = new Palindromo();
         
         String text = value.replaceAll("\\ ", "").toLowerCase();
         char[] letras = text.toCharArray();
         int count = letras.length;
         p.setIzquierdaDerecha(text);            
         p.setDerechaIzquierda(new StringBuilder(text).reverse().toString());
         if (p.getIzquierdaDerecha().equals(p.getDerechaIzquierda())){
         p.setResult(true);
         }else{
         p.setResult(false);
         }
         
     
         return p;
         
       
     }
        
}
