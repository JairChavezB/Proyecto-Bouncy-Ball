import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ball extends Actor
{
    
    public void act()
    {
        move(8);
        
        if(isAtEdge()){
            turn(20);
        }
    }
}
