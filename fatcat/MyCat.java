import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act(){
        eat();
        dance();
        sleep(2);
        
        shoutHooray();
        walkLeft(4);
        if (isSleepy() == true){
        sleep(3);
        } else {
            wait(4);
        }
        if (isBored() == true){
        dance();
        } else {
            wait(4);
        }
        if (isHungry() == true){
        eat();
        } else {
            wait(4);
        }
        if (isSleepy() == true){
        sleep(3);
        shoutHooray();
        } else {
            shoutHooray();
        }
        if (isAlone() == true){
        sleep(3);
        } else {
            shoutHooray();
        }
        
    }    
}
