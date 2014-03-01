import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    
    public RandomPicker()
    {
        GreenfootImage image = getImage();  
        image.scale(image.getWidth() - 40, image.getHeight() - 10);  
        setImage(image);
    }
    
    public void giveGumball(int pickr) 
    {
        switch(pickr)
        {
            case 0 :                            
                Actor img1 = new Gumball();
                getWorld().addObject(img1, 550, 110);                 
                Greenfoot.delay(290);                
                getWorld().removeObject(img1); 
                getWorld().removeObjects(getWorld().getObjects(Message.class));
                break;

            case 1 :            
                Actor img2 = new Gumball("blue-gumball.png");
                getWorld().addObject(img2, 550, 110);                 
                Greenfoot.delay(290);                
                getWorld().removeObject(img2); 
                getWorld().removeObjects(getWorld().getObjects(Message.class));
                break;

            case 2 :            
                Actor img3 = new Gumball("red-gumball.png");
                getWorld().addObject(img3, 550, 110); 
                Greenfoot.delay(290);                                
                getWorld().removeObject(img3); 
                getWorld().removeObjects(getWorld().getObjects(Message.class));
                break;
                
            }                
                
    }
            
}
