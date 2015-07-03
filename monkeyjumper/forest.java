import greenfoot.*;

/**
 * Write a description of class forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class forest extends World
{

    /**
     * Constructor for objects of class forest.
     * 
     */


    public forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(3000, 750, 1);
        prepare();
        Greenfoot.playSound("Mario Kart 64 Music - DK's Jungle Parkway.mp3");

    }

    private void prepare()
    {
        monkey myMonkey = new monkey();
        addObject (myMonkey,241,375);

        Actor start = new branch();
        addObject (start, 241, 417);

        for(int i=0;i<30;i++)
        {
            int randx;
            int randy;
            int randFruit;
            randx = Greenfoot.getRandomNumber(2800)+50;
            randy = Greenfoot.getRandomNumber(700)+10;
            randFruit = Greenfoot.getRandomNumber(10);
            Actor Branches = new branch();
            addObject (Branches, randx, randy);
            if(randFruit == 1)
            {
                Actor Bananer = new banana();
                addObject (Bananer, randx, randy-45 );
            }
        }
    }


}
