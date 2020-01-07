package Composite;

public class Leaf implements Component{
    private int data;

    Leaf(int data){
        this.data = data;
    }

    @Override
    public void execute() {
        System.out.println(data);
    }
}
