package Adapter;

public class Example {

    public static void main(String[] args) {
        ObjAdapter objAdapter = new ObjAdapter();
        objAdapter.method();

        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.adapterMethod();
    }
}
