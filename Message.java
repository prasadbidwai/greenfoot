import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  
import java.awt.Color;  
  
  
public class Message extends Actor  
{    
    public Message(String text)  
    { 
        GreenfootImage currentmesage = new GreenfootImage(text,25,Color.white,Color.black);  
        setImage(currentmesage);          
    }  
}  