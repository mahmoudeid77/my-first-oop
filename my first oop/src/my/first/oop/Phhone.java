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
public class Phhone {
    private String manufact;
    private String model;
    private double price;
    public void setmanufact(String m)
    {
        manufact=m;
    }
     public void setmodel(String d)
    {
        model=d;
    }
      public void setprice(double p)
    {
        price=p;
    }
     public String getmanufact()
    {
        return manufact;
    }
      public String getmodel()
    {
        return model;
    }
       public double getprice()
    {
        return price;
    }
}
