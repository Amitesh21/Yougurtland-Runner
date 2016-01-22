import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.HashMap;

public class ScoreBoard extends Actor implements ScoreObserver
{
    private HashMap<String, ScoreCount> scoreObjects= new HashMap<String, ScoreCount>();
    
    public void act() 
    {
    }
    
    public void update(String scoreElement)
    {
        ScoreCount score = scoreObjects.get(scoreElement);
        score.incrementScore();
        score.setImage(score.getScoreImage(20));
        updateSpaceScore();
    }
    
    public void addScoreObject(String elementName, ScoreCount element)
    {
        scoreObjects.put(elementName, element);
    }
    
    public void updateSpaceScore()
    {
        ScoreCount spaceScore = scoreObjects.get("Space");
        boolean wonSpace = true;
        for(String currentKey : scoreObjects.keySet())
        {
            if(!currentKey.equals("Space"))
            {
                if(scoreObjects.get(currentKey).getScore() - spaceScore.getScore() == 0)
                {
                    wonSpace = false;
                    break;
                }
            }
        }
        
        if(wonSpace)
        {
            spaceScore.getWorld().addObject(new Space(),400,150);
            spaceScore.incrementScore();
            spaceScore.setImage(spaceScore.getScoreImage(40));
        }
    }
    
    public HashMap<String, ScoreCount> getFinalScore()
    {
        return this.scoreObjects;
    }
}
