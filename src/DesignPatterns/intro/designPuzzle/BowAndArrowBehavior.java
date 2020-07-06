package DesignPatterns.intro.designPuzzle;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Attack with a bow and arrow!");
    }
}
