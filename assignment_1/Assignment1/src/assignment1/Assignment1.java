/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Inspiron
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        char letter = ' ';
        String name = "Daniel";
        int size = name.length();
        for (int i = 0; i < size; i++) {
            letter = name.charAt(i);
            sum = letter;
            System.out.println(sum);
        }
        
    }
    
}
