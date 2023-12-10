//Write a JAVA program which will generate the threads: 

//- To display 10 terms of Fibonacci series. -
//0 1 1 2 3 5 8 13 21

class Fibonacci extends Thread // declared class which extends Thread
{
    public void run() // declared method to run thread
    {
        int input = 10; // declared variables
        int sum;
        int rem;
        int a = 0, b = 1;
        a = 0;
        b = 1;
        // we already inserted value of a and b thatswhy we print them first
        System.out.println(a + " ");
        System.out.println(b + " ");

        // by using for loop we print fibonacci series
        // in this logic we use swapping method

        for (int i = 3; i <= input; i++) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
        }

    }
}

// To display 1 to 10 order in reverse

class reverse extends Thread {
    public void run() {

        // The question is we should dispay 1 to 10 in reverse order
        // by using for loop we can easily reverse

        // we put i=10 and its i is greater than or equal to 1 so its condition becomes
        // true and the loop goes to 10 to 1 order
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }
}

public class FibonacciThreads {
    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();
        System.out.println("Fibonacci Series");
        try { // we using join method to display fiboncacci series first then reverse order
            obj.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        reverse rev = new reverse();
        System.out.println("Reverse order");
        obj.start(); // by using start() we run the thread
        rev.start();

    }
}