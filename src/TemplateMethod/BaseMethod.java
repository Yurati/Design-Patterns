package TemplateMethod;

public abstract class BaseMethod {
    private void step1(){
        System.out.println("Performing step 1");
    }

    private void step3(){
        System.out.println("Performing step 3");
    }

    protected abstract void step2ToBeDefined();

    void performOperation(){
        step1();
        step2ToBeDefined();
        step3();
    }
}
