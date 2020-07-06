package DesignPatterns.intro;

public class FlyWithWings implements FlyBehavior {


    @Override
    public void fly() {
        //implements duck flying
        System.out.println("I'm flying");
    }
}
