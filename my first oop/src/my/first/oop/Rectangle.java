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
public class Rectangle {
    private double length;
    private double width;
    public void setlength(double l)
    {
        length=l;
    }
    public void setwidth(double w)
    {
        width=w;
    }
    public double getlength()
    {
        return length ;
    }
     public double getwidth()
    {
        return width ;
    }
      public double getarea()
    {
        return length*width ;
    }
}
