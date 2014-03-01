import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
    public void decide(int selectPicker)
    {
        if( selectPicker == 0 )
        {
            RandomPicker pic = new RandomPicker();
            int color = Greenfoot.getRandomNumber(3);    
            ((RandomPicker)getWorld().getObjects(RandomPicker.class).get(0)).giveGumball(color);
            
        }
        else 
        {
            GreenPicker pic = new GreenPicker();            
           
            ((GreenPicker)getWorld().getObjects(GreenPicker.class).get(0)).giveGumball();                        
        } 
    }
}
