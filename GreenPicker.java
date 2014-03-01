import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    
    
    public GreenPicker()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() , image.getHeight() );
        setImage(image);
    }
    
    public void giveGumball() 
    {
        /*GreenfootImage image1 = new GreenfootImage("green-bumball.png");
        image1.scale(image1.getWidth() - 100, image1.getHeight() - 100);
        getWorld().getBackground().drawImage(image1,550,430);
        Greenfoot.delay(100);*/
        Actor img5 = new Gumball();
        getWorld().addObject(img5, 590, 130);                 
        Greenfoot.delay(290);                
        getWorld().removeObject(img5); 
        getWorld().removeObjects(getWorld().getObjects(Message.class));
    }    
}
