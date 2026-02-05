abstract class Animal{
    abstract void Lion();
}

abstract class Vehicle{
    abstract void Car();
}

class Test extends Animal {
    Vehicle v = new Vehicle() {
        void Car() {
            System.out.println("This is a 4x4 car");
        }
    };

    void Lion() {
        System.out.println("This is a lion");
    }

    public static void main(String[] args){
        Test t = new Test();
        t.Lion();
        t.v.Car();
    }
}