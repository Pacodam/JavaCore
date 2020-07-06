package DesignPatterns.intro;

public class FlyNoWay implements FlyBehavior {


    @Override
    public void fly() {
        //do nothing- can`t fly!
        System.out.println("I can't fly");
    }
}
