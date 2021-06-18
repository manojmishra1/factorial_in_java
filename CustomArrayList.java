/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customarraylist;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class CustomArrayList {

    int size=6;
    class Product
    {
        int pid;
        String pname,pcity;
        double pprice;

        public Product(int pid, String pname, String pcity, double pprice) {
            this.pid = pid;
            this.pname = pname;
            this.pcity = pcity;
            this.pprice = pprice;
        }
        
        
    }
        public static void main(String[] args) {
        
            int pid[]={1,2,3,4,5,6};
            String pname[]={"A","B","C","D","E","F"};
            String pcity[]={"Delhi","Bihar","Mumbai","Kolkota","Bangluru","Greater Noida"};
            double pprice[]={90.00,43.00,56.00,25.50,15.95,105.5};
            CustomArrayList ca=new CustomArrayList();
            
            ca.addElement(pid, pname, pcity, pprice); 
            
            
    }
    void addElement(int pid[],String pname[],String pcity[],double pprice[])
    {
        ArrayList<Product> products=new ArrayList<>();
       for(int i=0;i<size;i++)
       {
            products.add(new Product(pid[i],pname[i],pcity[i],pprice[i]));
       }
        displayElement(products); 
    }
    public void displayElement(ArrayList<Product> arrayList)
    {
        for(int i=0;i<size;i++)
        {
            Product p=arrayList.get(i);
            System.out.println(p.pid+"\t"+p.pname+"\t"+p.pcity+"\t"+p.pprice);
        }
    }
}
