/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillsbuliding;
import java.util.*;
/**
 *
 * @author Ryan.Wanner
 */
public class SkillsBuliding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter words");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String inputArray[];
        inputArray = input.split("");
        System.out.println("length" +inputArray.length);   
        for(int i=0; i<input.length();i++){
            System.out.println(input.substring(i,i+1));
            
            /* Part 20*/
            
           
        }

    }
    
}
