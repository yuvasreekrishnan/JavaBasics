package BasicPractice;

public class MainMethodForAbstraction {

    public static void main(String[] args) {

        // Using implementation class directly
        sampleAbstractImp obj = new sampleAbstractImp();
        obj.createObject();
        obj.printFunction();

        System.out.println("------------------");

        // Using interface reference (Polymorphism)
        sampleInterface impl = new sampleAbstractImp();
        impl.createObject();
        impl.printFunction();
    }
}

