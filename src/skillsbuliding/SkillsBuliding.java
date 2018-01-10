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
        //30
        System.out.println("Input words");
        Scanner s= new Scanner(System.in);
        String input;
        input= s.nextLine();
        List <Integer> inputList= new ArrayList();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)+10 > 126){
                inputList.add(input.charAt(i)-85);
            }else{
                 inputList.add(input.charAt(i)+10);
            }
            System.out.print((char)(int) inputList.get(i));
        }
        System.out.println();
        for(int i=0; i< input.length(); i++){
            if(inputList.get(i)<127){
                inputList.set(i, inputList.get(i)-10);
            }else{
                inputList.set(i, inputList.get(i)+85);
            }
            System.out.print((char)(int)inputList.get(i));
        }
        System.out.println();
        
        /*for(int i= 0; i<length; i++){
            do{
            r= rand.nextInt(65000);
            }while(list.contains(r));
            list.add(r);
            System.out.println((char)(int) list.get(i));
        }*/
      
    }

}
