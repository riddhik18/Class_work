/* Write a Java program to create multiple thread in Java.Apply thread properties too.(priority,name) */

class A extends Thread{                        
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("I'm a superior Thread");
        }
    }   
}
class B extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("I'm a Normal Thread");
        }
    }   
}
class C extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("I'm a Weaker Thread");
        }
    }   
}

public class MultipleThread {
    public static void main(String[] args) {
        // Create instances of the thread classes
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
        
        //set thread priorities
        obj1.setPriority(Thread.MAX_PRIORITY);     // setting priority of  thread to MAX_PRIORITY 
        obj2.setPriority(Thread.NORM_PRIORITY);   // setting priority of  thread to NORM_PRIORITY 
        obj3.setPriority(Thread.MIN_PRIORITY);   // setting priority of  thread to MIN_PRIORITY 

        //start the threads
        obj1.start();
        obj2.start();
        obj3.start();
        
    }
}