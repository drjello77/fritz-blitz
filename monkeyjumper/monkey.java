import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monkey extends Actor
{
    /**
     * Act - do whatever the monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public int gravity = 0;
    public int accelleration = 1;
    int jumpReset=1;
    int jump = 300;

    public boolean onGround()
    {
        Actor myBranch = new branch();
        myBranch = getOneObjectAtOffset(0, getImage().getHeight()/2, branch.class);
        return myBranch!=null;
    }

    public void act() 
    {
        move();
        fallCheck();
        if(onGround())
        {
            jumpReset = 1;
        }
        /*branch hitBranch = (branch) getOneIntersectingObject(branch.class);
        if(hitBranch != null)
        {
        gravity = 0;
        jumpReset++;
        }*/
        /*branch hitBranch = (branch) getOneIntersectingObject(branch.class);
        if(hitBranch != null && !"space".equals(Greenfoot.getKey())&& ySpeed > 0)
        {
        ySpeed = -2;
        int groundLevel = branch.getHeight();
        }

        //int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        if (!onGround) // in middle of jump
        {
        ySpeed++; // adds gravity effect
        setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
        if (getY()>=groundLevel) // has landed (reached ground level)
        {
        setLocation(getX(), groundLevel); // set on ground
        Greenfoot.getKey(); // clears any key pressed during jump
        }
        }
        else // on ground
        {
        if ("space".equals(Greenfoot.getKey())) // jump key detected
        {
        ySpeed = -20; // add jump speed
        setLocation(getX(), getY()+ySpeed); // leave ground

        }
        }*/

        /*if (facingleft)
         * 
        {
        getImage().mirrorHorizontally();
        }*/

    }    

    public void fallCheck()
    {
        if(onGround()&& !Greenfoot.isKeyDown("space") )
        {
            gravity = 0;
        }
        else
        {
            fall();
        }
    }

    public void move()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(7);

        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-7);

        }
        if("space".equals(Greenfoot.getKey())&& onGround())
        {
            gravity = -23;
            Greenfoot.playSound("Cartoon Jump Sound Effect.mp3");
            jumpReset--;
        }
    }

    public void fall()
    {
        setLocation( getX(), getY() + gravity);
        gravity = gravity+accelleration;

        if((onGround())== false)setImage("jumping monkey.png");
        else setImage("monkey.png");
    }

}
