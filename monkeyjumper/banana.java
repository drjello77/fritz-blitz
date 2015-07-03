import greenfoot.*;

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends fruit
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long lastTime = System.currentTimeMillis();
    int moveSwitch = 1;
    public void act() 
    {
        animate();
    }

    public void animate()
    {
        long curTime = System.currentTimeMillis();
        if(curTime >= lastTime+500)
        {
            if(moveSwitch == 1)
            {
                setLocation (getX(), getY()-10);
            }
            if (moveSwitch == -1)
            {
                setLocation (getX(), getY()+10);
            }
            moveSwitch = moveSwitch *-1;
            lastTime = curTime;
        }    
    }

}
