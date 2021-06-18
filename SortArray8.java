/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dell
 */
public class SortArray8 {
    
    public static void main(String[] args) {
        int intArray[] = {55,10,15,20,25,70,35,40,45,50,55,60,65,30,75,80,85,90,95,100}; 
        int sum=0;
        sum=Arrays.stream(intArray).sum();
        System.out.println("Sum Is\t"+sum);
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<intArray.length;i++)
        {
            list.add(intArray[i]);
        }
        System.out.println(list);
        list.stream().sorted().collect(Collectors.toList()).forEach(p->System.out.print(p+" "));
        System.out.println("");
    }
}
