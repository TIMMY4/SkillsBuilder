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
        Random rand = new Random();
       /*part 23
       double sum=0;
       double avg=0;
       List<Integer> randList=new ArrayList();
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
       // part 24
        List<Integer> list = new ArrayList();
        for(int i=0; i<10;i++){
            list.add(rand.nextInt(10));
            System.out.println(list.get(i));
        }
        //25
        int c;
      for(int i=0; i<10; i++){
          do{
              c= rand.nextInt(10);
          }while(list.contains(c));
          list.add(c);
          System.out.println(list.get(i));
      }
    }
    
    
}
