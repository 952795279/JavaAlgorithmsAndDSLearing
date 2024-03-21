public class Main {
    public static void main(String[] args) {
//        Iterate iterate = new Iterate();
//        System.out.println("for result: " + iterate.forLoop(10));
//        System.out.println();
//
//        System.out.println("while result: " + iterate.whileLoop(10));
//        System.out.println();
//
//        System.out.println("nested result: " + iterate.nestedLoop(10));
//        System.out.println();

        Recursion recursion = new Recursion();
        // 0 1 1 2 3 5 8
        System.out.println("fib: " + recursion.fib(7));
    }
}