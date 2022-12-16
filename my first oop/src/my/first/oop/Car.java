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
public class Car {
    private String maker; 
    private int model;
    
    public void setmaker(String m)
    {
        maker=m;
    }
    public void setyear(int y)
    {
        model=y;
    }
    public String getmaker()
    {
        return maker;
    }
    public int getyear()
    {
        return model;
    }
    
}
