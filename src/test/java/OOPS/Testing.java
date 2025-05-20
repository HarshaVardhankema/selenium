package OOPS;
class Testing {
    int a = 10;
    int b = 20;

    public void m1() {
        System.out.println("Testing m1");

}

}
// Child class inheriting from Testing
class Testing2 extends Testing {
    int x = 5;
    int y = 15;

    public void m2() {
        System.out.println("Testing2.m2");
        System.out.println("a + b = " + (a + b)); // Accessing inherited variables
    }
}

// Grandchild class inheriting from Testing2 (Multilevel Inheritance)
class Testing3 extends Testing2 {
    public void m3() {
        System.out.println("Testing3.m3");
        System.out.println("a + b = " + (a + b)); // Accessing inherited variables
        System.out.println("x + y = " + (x + y)); // Corrected summation
    }
}








