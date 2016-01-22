import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Space extends Actor
{
    private int scale;
    private int transparency;
    private GreenfootImage spaceImage;
    
    public Space()
    {
        scale = 130;
        transparency = 255;
        spaceImage = new GreenfootImage("./images/space.png");
        spaceImage.scale(scale,scale);
    }
    
    public void act() 
    {
        if(transparency == 1)
        {
            getWorld().removeObject(this);
        }
        spaceImage.setTransparency(transparency);
        this.setImage(spaceImage);
        transparency -=1;
    }    
}
