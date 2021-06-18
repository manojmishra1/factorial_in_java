/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customarraylist;

/**
 *
 * @author dell
 */
public class Factorial_in_java {
    
     static int factorial(int n)
    {
        if(n==0||n==1)
        
            return 1;
        
        else
        
            return n*factorial(n-1);
        
    }
    public static void main(String[] args) {
       System.out.println(factorial(5));   
    }
}
