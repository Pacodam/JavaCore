package DesignPatterns.intro.designPuzzle;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attack with a sword!");
    }
}
