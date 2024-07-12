package innerclassexample;

// Outer class
class OuterClass {
    
    private int outerData = 10;

    // Local inner class
    void localInnerClassExample() {
        // Local variable in the method
        int localVar = 5;

        // Local inner class inside the method
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class: outerData = " + outerData + ", localVar = " + localVar);
            }
        }

        // Creating an instance of the local inner class
        LocalInner localInnerObj = new LocalInner();
        localInnerObj.display();
    }

    // Anonymous inner class
    void anonymousInnerClassExample() {
        // Creating an instance of an anonymous inner class
        Runnable anonymousInner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class: outerData = " + outerData);
            }
        };

        // Using the anonymous inner class
        Thread thread = new Thread(anonymousInner);
        thread.start();
    }
}

public class InnerClassExample {

    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObj = new OuterClass();

        // Invoking the local inner class example
        outerObj.localInnerClassExample();

        // Invoking the anonymous inner class example
        outerObj.anonymousInnerClassExample();
    }
}
