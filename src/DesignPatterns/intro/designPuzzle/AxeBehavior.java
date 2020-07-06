package DesignPatterns.intro.designPuzzle;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attack with an axe!");
    }
}
