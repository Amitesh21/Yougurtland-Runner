import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstacleFence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstacleFence extends Obstacle
{
    /**
     * Act - do whatever the ObstacleFence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int x;
    ObstacleFence(){
        x=2;
    }

    public void updateSpeed(int speed)
    {
        this.speed  = -speed;
    }

    public void act() 
    {

        setLocationForObstacle();
        removeObstacle();

    } 
/*    private void setLocationForObstacle(){
        // setLocation(getX()-this.x,getY());
        setLocation(getX()-this.speed,getY());
    
    }

    private void removeObstacle(){

        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }*/
}
