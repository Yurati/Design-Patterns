package Facade;

public class Facade {

    Facade(){

    }
    public void doSomething(){
        MagicTrick magicTrick = new MagicTrick();
        magicTrick.magic();

        Combine combine = new Combination();
        DoAnother doAnother = new DoAnother();

        combine.combination();
        doAnother.doThis();

        System.out.println("Facade");
    }

    public void doAnother(){
        MagicTrick magicTrick = new MagicTrick();
        magicTrick.magic();

        Combine combine = new Combination();
        DoAnother doAnother = new DoAnother();

        combine.combination();
        doAnother.doThis();

        System.out.println("Facade");
    }
}
