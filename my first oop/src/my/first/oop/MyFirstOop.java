/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.first.oop;

/**
 *
 *
 */
public class MyFirstOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Phhone p1=new Phhone();
       p1.setmanufact("samsung");
       p1.setmodel("a10");
       p1.setprice(5000);
       p1.getmanufact();
       p1.getmodel();
       p1.getprice();
       System.out.println("the phone maker is: "+p1.getmanufact()+" &&& the phone model is: "+p1.getmodel()+"price : "+p1.getprice());
        
        
        // TODO code application logic here
    }
    
}
