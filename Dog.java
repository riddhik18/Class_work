import java.util.Scanner;

public class Dog {
    String breed;
    int age,hungry_time,sleep_time;
    String color;
    Scanner sc=new Scanner(System.in);

    public void barking()
    {
        System.out.println("breed:-"+breed);
        breed=sc.nextLine();

        System.out.println("age:-");
        age= sc.nextInt();

        System.out.println("color:-");
        color=sc.nextLine();
    }
    public void hungry()
    {
        System.out.println("hungry:-");
        hungry_time=sc.nextInt();
    }
    public void Sleeping()
    {
        System.out.println("sleeping time:-");
        sleep_time=sc.nextInt();
    }

    public static void main(String[] args) {
        Dog obj=new Dog();
        
    }
}