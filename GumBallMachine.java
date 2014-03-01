import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class GumBallMachine extends Actor
{
    static public String checkifplacd ;    
    static public String checkcoin ;    
    
    public GumBallMachine()
    {
        GreenfootImage image = getImage();  
        image.scale(image.getWidth() - 90, image.getHeight() - 90);  
        setImage(image);
    }
    
    public void takecoin(Coin c)
    {        
        checkcoin = c.toString();
        checkcoin = checkcoin.substring(0, checkcoin.indexOf("@")); 
        //System.out.println(validateCoin);
    }    
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            int mouseX,mouseY;
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseX=mouse.getX();
            mouseY=mouse.getY();
            
            if((mouseX >= 300 && mouseX <= 420) && (mouseY >= 250 && mouseY <= 400))
            {
                getWorld().removeObjects(getWorld().getObjects(Message.class));
                Message msgfrst = new Message("Coin being inspected");     
                getWorld().addObject(msgfrst, 365, 100);     
                
                if(checkcoin==null)
                {
                    checkifplacd = "nocoin";
                    checkcoin = "nocoin";
                }
                checkifplacd = checkcoin;
                checkcoin = "nocoin";
                
                Greenfoot.delay(150);
                
                Inspector inspctr = new Inspector();                
                ((Inspector)getWorld().getObjects(Inspector.class).get(0)).inspectcoin(checkifplacd);
            }
        }
    }
    
}
