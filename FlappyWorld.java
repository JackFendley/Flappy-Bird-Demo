import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
<<<<<<< HEAD
=======
    
>>>>>>> origin/master
    private int pipeCounter;
    private int flappyCounter;
    
    private String playerName;
    
    private boolean gameStart = false;
    
    private Score scoreBoard;
    
    private String[] leaderNames;
    private int[] leaderScores;
    
    /**
     * FlappyWorld is the constructor for objects of type FlappyWorld
     * 
     * @param There are no parameters
     * @return An instance of type FlappyWorld
     */
    public FlappyWorld()
    {
        
        super(600, 400, 1);
        
<<<<<<< HEAD
        setPaintOrder( Score.class, GameOver.class, BottomPipe.class, TopPipe.class, FlappersBert.class);
=======
        setPaintOrder( Score.class, GameOver.class, BottomPipe.class, TopPipe.class, FlappyBird.class);
>>>>>>> origin/master
        
        populateWorld();
        
        gameStart = false;
        
        leaderNames = new String[10];
        leaderScores = new int[10];
        
        for( int i = 0; i < leaderScores.length; i++ )
        {
<<<<<<< HEAD
=======
            
>>>>>>> origin/master
            leaderScores[i] = -1;
        }
        
        //This starts your scenario when a new FlappyWorld is created
        Greenfoot.start();
    }
    
    /**
     * populateWorld is going to add objects to our world to prepare the game
     * 
<<<<<<< HEAD
     * @param There are no parameters
=======
     * @param No parameters
>>>>>>> origin/master
     * @return Nothing is returned
     */
    private void populateWorld()
    {
        scoreBoard = new Score();
        
<<<<<<< HEAD
        addObject( new FlappersBert(), 50, getHeight()/2);
        addObject( new Ground(), getWidth()/2, 375 );
        addObject( scoreBoard, getWidth()/2, getHeight() -20);
        //addObject( new Ground(), 300, getHeight()/1);
=======
        addObject( new FlappyBird(), 50, getHeight()/2 );
        addObject( new Ground(), getWidth()/2, 375 );
        addObject( scoreBoard, getWidth()/2, getHeight() - 20 );
>>>>>>> origin/master
        
        pipeCounter = -100;
        flappyCounter = -10;
    }
    
    /**
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        final int FIRST_PIPE = 290;
        
        if( gameStart == false )
        {
            playerName = JOptionPane.showInputDialog( null, "Please enter your name:", "Player Name", JOptionPane.QUESTION_MESSAGE );
<<<<<<< HEAD
            scoreBoard.setPlayerName( playerName);
            
            gameStart = true;
            
            showText( "Buckle your seatbelts, we're gonna fly!\nUse the Space Bar to Control Mr. Flappy!", getWidth()/2, getHeight()/2 );
=======
            scoreBoard.setPlayerName( playerName );
            
            gameStart = true;
            
            showText( "Get Ready To Play!\nUse the Space Bar to Control Flappy Bird!", getWidth()/2, getHeight()/2 );
>>>>>>> origin/master
            Greenfoot.delay(100);
            showText( "3", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "2", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "1", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
<<<<<<< HEAD
            showText( "GOOOOO!", getWidth()/2, getHeight()/2 );
=======
            showText( "Go!", getWidth()/2, getHeight()/2 );
>>>>>>> origin/master
            Greenfoot.delay(30);
            showText( "", getWidth()/2, getHeight()/2 );
        }
        else
        {
<<<<<<< HEAD
            if( getObjects( FlappersBert.class ) .size() > 0)
=======
            if( getObjects( FlappyBird.class ).size() > 0 )
>>>>>>> origin/master
            {
                pipeCounter++;
                
                if( pipeCounter % 100 == 0 )
                {
                    createPipes();
                }
                
                if( pipeCounter >= FIRST_PIPE )
                {
<<<<<<< HEAD
                   if( flappyCounter % 100 == 0 )
                   {
                       scoreBoard.countScore();
                   }
                        
                   flappyCounter++; 
=======
                    if( flappyCounter % 100 == 0 )
                    {
                        scoreBoard.countScore();
                    }
                    
                    flappyCounter++;
>>>>>>> origin/master
                }
            }
            else
            {
<<<<<<< HEAD
                showText( "Press enter for a new game or \n press L for the leaderboard", getWidth()/2, 25);
=======
                showText( "Press enter for a new game or \n press L for the leaderboard.", getWidth()/2, 25 );
>>>>>>> origin/master
                checkKeyPress();
            }
        }
    }
    
    /**
<<<<<<< HEAD
     * createPipes adds pipes at the end of the world and randomizes their height
=======
     * createPipes adds pipes at the edge of the world and randomizes their height
>>>>>>> origin/master
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void createPipes()
    {
<<<<<<< HEAD
        int topPipeHeight = Greenfoot.getRandomNumber( getHeight() /2 );
=======
        int topPipeHeight = Greenfoot.getRandomNumber( getHeight() / 2 );
>>>>>>> origin/master
        
        TopPipe newTop = new TopPipe();
        BottomPipe newBottom = new BottomPipe();
        
        newTop.getImage().scale( newTop.getImage().getWidth(), topPipeHeight );
<<<<<<< HEAD
        newBottom.getImage().scale( newBottom.getImage().getWidth(), topPipeHeight + 200 );
        
        addObject( newTop, getWidth(), 0 );
        addObject( newBottom, getWidth(), getHeight() );
        
        
    }
    
    /**
     * checkKeyPress checks whether the user wants to start a new game or display the leaderboard
=======
        newBottom.getImage().scale( newBottom.getImage().getWidth(), topPipeHeight + 200);
        
        addObject( newTop, getWidth(), 0 );
        addObject( newBottom, getWidth(), getHeight() );
    }
    
    /**
     * checkKeyPress checks whether the user wants to start a new game
     * or display the leaderboard
>>>>>>> origin/master
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
<<<<<<< HEAD
        if( Greenfoot.isKeyDown("enter" ) )
=======
        if( Greenfoot.isKeyDown( "enter" ) )
>>>>>>> origin/master
        {
            reset();
        }
        
<<<<<<< HEAD
        if( Greenfoot.isKeyDown("l" ) )
=======
        if( Greenfoot.isKeyDown( "l" ) )
>>>>>>> origin/master
        {
            displayLeaderBoard();
        }
    }
    
    /**
     * reset resets the game and allows the user to play a new game
     * 
     * @param There are no parameters
     * @return Nothing is returned
<<<<<<< HEAD
     * 
=======
>>>>>>> origin/master
     */
    private void reset()
    {
        List allObjects = getObjects( null );
        
        removeObjects( allObjects );
        
        populateWorld();
        
        gameStart = false;
        
<<<<<<< HEAD
        showText( "", getWidth() /2 - 25, getHeight() /2 + 25);
        
        showText( "", getWidth() /2, 25);
    }
    
    /**
     * displayLeaderBoard displays the leaderboard of the game in a nicely formatted way
     * 
     * @param There are no parameters
     * @return Nothing is returned
     * 
=======
        showText( "", getWidth() / 2 - 25, getHeight() / 2 + 25 );
        
        showText( "", getWidth() / 2, 25 );
    }
    
    /**
     * displayLeaderBoard displays the leaderboard of the game in a
     * nicely formatted way
     * 
     * @param There are no parameters
     * @return Nothing is returned
>>>>>>> origin/master
     */
    private void displayLeaderBoard()
    {
        List allObjects = getObjects( null );
        
        String leaderBoard = String.format( "%15s %5s %5s\n", "Name", "", "Score" );
        
        removeObjects( allObjects );
        
        for( int i = 0; i < leaderScores.length; i++ )
        {
            leaderBoard += String.format( "\n%15s %5s %5s", leaderNames[i], "", leaderScores[i] );
        }
        
<<<<<<< HEAD
        showText( leaderBoard, getWidth() /2 -25, getHeight() /2 + 25 );
    }
    
    /**
     * updateLeaderBoard updates the leader board
     * 
     * @param There are no parameters
     * @return Nothing is returned
     * 
=======
        showText( leaderBoard, getWidth() / 2 - 25, getHeight() / 2 + 25 );
    }
    
    /**
     * updateLeaderBoard updates the leaderboard
     * 
     * @param There are no parameters
     * @return Nothing is returned
>>>>>>> origin/master
     */
    public void updateLeaderBoard()
    {
        int currentScore = scoreBoard.getScore();
<<<<<<< HEAD
        int indexToPlace = -1;
=======
        int indexToPlace = - 1;
>>>>>>> origin/master
        
        for( int i = leaderScores.length - 1; i >= 0 && currentScore > leaderScores[i]; i-- )
        {
            indexToPlace = i;
        }
        
        if( indexToPlace != -1 )
        {
            for( int i = leaderScores.length - 2; i >= indexToPlace; i-- )
            {
                leaderNames[i+1] = leaderNames[i];
                leaderScores[i+1] = leaderScores[i];
            }
            
            leaderNames[indexToPlace] = playerName;
            leaderScores[indexToPlace] = currentScore;
        }
<<<<<<< HEAD
    }
}
=======
        
    }
    
}
>>>>>>> origin/master
