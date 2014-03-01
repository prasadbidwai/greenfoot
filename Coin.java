import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{

    public void act() 
    {
        int mouseX, mouseY ;
        
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY); 
            

  if((mouseX >= 300 && mouseX <= 417) && (mouseY >= 238 && mouseY <= 254))
            {
                World wrld;
                wrld = getWorld();
                wrld.removeObject(this);

                
                Actor msg1 = new Message("Coin has been inserted");  
                wrld.addObject(msg1, 365, 100);
                
                GumBallMachine gbmachine = new GumBallMachine();                
                gbmachine.takecoin(this);  
          }                 
                
            }
    }    
        
}
