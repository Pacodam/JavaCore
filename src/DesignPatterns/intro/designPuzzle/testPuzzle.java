package DesignPatterns.intro.designPuzzle;

public class testPuzzle {

    public static void main(String[] args){

        Character king = new King();
        king.setWeapon(new AxeBehavior());
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
