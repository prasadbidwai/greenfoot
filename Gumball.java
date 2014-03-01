import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage gfimg = new GreenfootImage("green-bumball.png");
        gfimg.scale(gfimg.getWidth() - 90, gfimg.getHeight() -90);  
        setImage(gfimg);
    }

    
    
       public Gumball(String gumBallImage)
    {
        GreenfootImage gfimg1 = new GreenfootImage(gumBallImage);
        gfimg1.scale(gfimg1.getWidth() - 60, gfimg1.getHeight() - 60);  
        setImage(gfimg1);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

    

 
    
 
