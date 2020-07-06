package DesignPatterns.intro.designPuzzle;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attack with a knife!");
    }
}
