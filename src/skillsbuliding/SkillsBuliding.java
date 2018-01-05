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
       // System.out.println("Enter words");
       // Scanner s = new Scanner(System.in);
        Random rand = new Random();
       // String input = s.next();
        //String inputArray[];
       // inputArray = input.split("");
       // System.out.println("length" + inputArray.length);
        /*part 18 &19
        for(int i=0; i<input.length();i++){
           System.out.println(input.substring(i,i+1));
        }*/
        /* Part 20*/
       /* for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        } */
       /*Part 21
        for(int i =0; i<input.length();i++){
            if(i%2==0){
                System.out.println(inputArray[i].toUpperCase());
            }else{
                System.out.println(inputArray[i].toLowerCase());
            }
        }*/
       /* part 22
       for(int i=0; i<inputArray.length;i++){
          if(rand.nextBoolean()==true){
              System.out.println(inputArray[i].toUpperCase());
          }else{
              System.out.println(inputArray[i].toLowerCase());
          }
       }*/
       /*part 23
       double sum=0;
       double avg=0;
       List<Integer> randList=new ArrayList<Integer>();
       for(int i=0; i<10000; i++){
           randList.add(rand.nextInt(100000));
           sum+= randList.get(i);
       }
       avg=sum/randList.size();
       if(randList.contains(25365)){
           System.out.println("25365 is in the list");
       }
       System.out.println("sum "+sum+ " avg "+avg);
        */
       
    }
    
    
}
