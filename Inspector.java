import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class Inspector extends Alien
{
    
    public Inspector()
    {
        GreenfootImage image = getImage();  
        image.scale(image.getWidth() -50, image.getHeight()-20 );  
        setImage(image);
    }
    
    public void inspectcoin(String coin) 
    {
        if(coin.equals("nocoin"))
        {
            getWorld().removeObjects(getWorld().getObjects(Message.class));
            Message msgfrcoin = new Message("no coin has been inserted !!");  
            getWorld().addObject(msgfrcoin, 365, 100);
            Greenfoot.delay(150);
            
            getWorld().removeObjects(getWorld().getObjects(Message.class));            
            coin = "nocoin";
        }
        else if(coin.equals("FakeQuarter"))
        {
            getWorld().removeObjects(getWorld().getObjects(Message.class));
            Message msgfrfake = new Message("Its a fake coin !!");  
            getWorld().addObject(msgfrfake, 365, 100);   
            Greenfoot.delay(150);
            getWorld().removeObjects(getWorld().getObjects(Message.class));
            coin = "nocoin";
        }
        else if(coin.equals("Penny"))
        {
            getWorld().removeObjects(getWorld().getObjects(Message.class));
            Message msgfrpny = new Message("Its a Penny, thats not enough ");  
            getWorld().addObject(msgfrpny, 365, 100);
            Greenfoot.delay(150);
            getWorld().removeObjects(getWorld().getObjects(Message.class));
            coin = "nocoin";
        }
        
        else
        {
            getWorld().removeObjects(getWorld().getObjects(Message.class));
            Message msgfrq = new Message("thats a quarter !!");  
            getWorld().addObject(msgfrq, 365, 100);
            coin = "nocoin";            
            int no;
            no= Greenfoot.getRandomNumber(2);            
            Picker pickr = new Picker();
            ((Picker)getWorld().getObjects(Picker.class).get(0)).decide(no);            
        }
    }    
    
}
